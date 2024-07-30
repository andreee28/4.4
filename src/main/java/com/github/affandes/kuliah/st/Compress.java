package com.github.affandes.kuliah.st;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Compress {

    public static void compress(String inputFilePath, String outputFilePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
        FileWriter writer = new FileWriter(outputFilePath);

        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(runLengthEncode(line));
            writer.write(System.lineSeparator());
        }

        reader.close();
        writer.close();
    }

    private static String runLengthEncode(String input) {
        StringBuilder encoded = new StringBuilder();

        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                encoded.append(input.charAt(i - 1));
                encoded.append(count);
                count = 1;
            }
        }

        encoded.append(input.charAt(input.length() - 1));
        encoded.append(count);

        return encoded.toString();
    }
}

