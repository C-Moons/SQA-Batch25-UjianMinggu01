#!/bin/bash

# Pastikan Anda menjalankan skrip ini dari direktori root proyek (java-labs)

echo "================================================="
echo "  MEMBANGUN PROYEK MAVEN (BUILD) - java-labs"
echo "================================================="

# Menjalankan goal clean dan package Maven
mvn clean package

# Memeriksa status exit dari perintah mvn
if [ $? -ne 0 ]; then
    echo ""
    echo "!!! GAGAL MEMBANGUN PROYEK. PERIKSA ERROR DI ATAS. !!!"
    exit 1
fi

echo ""
echo "================================================="
echo "  OUTPUTNYA DISINI NIH :"
echo "================================================="

# --- PENTING: SESUAIKAN VARIABEL INI ---

# 1. Tentukan Nama File JAR
# Nama ini biasanya [artifactId]-[version].jar
# Cek di pom.xml Anda untuk mendapatkan nama yang akurat.
JAR_ARTIFACT_ID="ujian-minggu01"
JAR_VERSION="1.0-SNAPSHOT" # Ganti jika versi Anda berbeda
# JAR_VERSION="y"
JAR_FILE="target/$JAR_ARTIFACT_ID-$JAR_VERSION.jar"

# Cek apakah file JAR ada
if [ ! -f "$JAR_FILE" ]; then
    echo "!!! File JAR tidak ditemukan: $JAR_FILE !!!"
    echo "Pastikan ArtifactId dan Version di skrip ini sesuai dengan pom.xml."
    exit 1
fi

# 2. Menjalankan JAR (Eksekusi)
java -jar "$JAR_FILE"
# /usr/bin/java -jar $JAR_FILE
echo ""
echo "================================================="
echo "  DONE!!!!"
echo "================================================="