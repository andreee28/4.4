# File Compressor
Ini adalah project file compressor berbasis Java untuk mata kuliah Software Testing.

## Objective
Mahasiswa diharapkan untuk membuat unit test untuk project ini.

## Info
Project ini menggunakan Java, JUnit, Gradle. Unit test dapat dibuat langsung menggunakan JUnit tanpa perlu instalasi JUnit terlebih dahulu.

## How to start
Tuliskan unit test pada file dengan nama `CompressTest.java` atau `DecompressTest.java`, kemudian jalankan pengujian dengan perintah pada command-line:
```shell
$> ./gradlew test
```

## How to Run app
Jalankan program Zeep dengan perintah berukut:
```shell
$> ./gradlew run --args="-c plain.txt chip.txt"
```

atau,
```shell
$> ./gradlew run --args="-d chip.txt decode.txt"
```