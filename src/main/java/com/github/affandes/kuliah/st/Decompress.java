package com.github.affandes.kuliah.st;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Decompress {

    public static void decompress(String inputFilePath, String outputFilePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
        FileWriter writer = new FileWriter(outputFilePath);

        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(runLengthDecode(line));
            writer.write(System.lineSeparator());
        }

        reader.close();
        writer.close();
    }

    private static String runLengthDecode(String input) {
        StringBuilder decoded = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            i++;
            int count = Character.getNumericValue(input.charAt(i));
            for (int j = 0; j < count; j++) {
                decoded.append(character);
            }
        }

        return decoded.toString();
    }
}
