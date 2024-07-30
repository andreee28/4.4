package com.github.affandes.kuliah.st;
import java.io.IOException;

public class Zeep {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Zeep <mode> <inputFilePath> <outputFilePath>");
            System.out.println("Mode: -c --compress | -d --decompress");
            return;
        }

        String mode = args[0];
        String inputFilePath = args[1];
        String outputFilePath = args[2];

        try {
            if (mode.equalsIgnoreCase("-c") || mode.equalsIgnoreCase("--compress")) {
                Compress.compress(inputFilePath, outputFilePath);
                System.out.println("File compressed successfully.");
            } else if (mode.equalsIgnoreCase("-d") || mode.equalsIgnoreCase("--decompress")) {
                Decompress.decompress(inputFilePath, outputFilePath);
                System.out.println("File decompressed successfully.");
            } else {
                System.out.println("Invalid mode. Use '-c' or '-d'.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
