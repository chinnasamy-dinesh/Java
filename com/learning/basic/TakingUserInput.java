package com.learning.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakingUserInput {

    public static void main(String[] args) throws IOException {

        // Java brings various Streams with its I/O package that helps the user perform all the Java input-output operations.
        // These streams support all types of objects, data types, characters, files, etc. to fully execute the I/O operations.

        bufferedReader();

    }

    public static void bufferedReader () throws IOException {

        // Reads input from keyboard & File only Char, CHar Set & String can be used, store them in a buffer.

        // Keyboard input is obtained by InputStreamReader Class
        InputStreamReader learnISR = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(learnISR);

        // Integer & Float can be read using ParseInt & Float Method
        System.out.println("Enter Integer Input for BufferReader:");
        int bufferInteger = Integer.parseInt(br.readLine());
        System.out.println("Enter Float Input for BufferReader:");
        float bufferFloat = Float.parseFloat(br.readLine());
        System.out.println("Enter String Input for BufferReader:");
        String bufferString = br.readLine();

        System.out.println("Integer Input: " + bufferInteger);
        System.out.println("Float Input: " + bufferFloat);
        System.out.println("String Input: " + bufferString);


        // File data is read from FileReader Class (Only the first line is captured from the Text File)
        FileReader fr = new FileReader("out/Resource/basic/TakingUserInput.txt");
        br = new BufferedReader(fr);
        String readFileData;
        while((readFileData = br.readLine()) != null){
            System.out.println(readFileData);
        }

    }

}


