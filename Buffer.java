package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer {
    public static void main(String[] args) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Welcome!!!");
            writer.close();
        } catch(IOException e){
            e.printStackTrace();
        }

    }
}