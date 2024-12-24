package com.github.affandes.kuliah.st;

import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

public class CompressTest {

    @Test
    void testCompress() throws IOException {
        try (FileWriter writer = new FileWriter("input.txt")) { writer.write("aandddrreeeee\n"); }
        Compress.compress("input.txt", "output.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            assertEquals("a2n1d3r2e5", reader.readLine());
        }
    }
}
