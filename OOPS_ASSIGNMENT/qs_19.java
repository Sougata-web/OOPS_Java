package OOPS_ASSIGNMENT;
//Write a java program to create your own copy file program where in command line
//two file names will be passed as input. The program will copy the content of one file
//into another with a suitable message to the user.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class qs_19 {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: java FileCopy <source_file> <destination_file>");
            return;
        }

        String sourceFile = args[0];
        String destinationFile = args[1];

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int bytesRead;
            byte[] buffer = new byte[1024];


            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully from " + sourceFile + " to " + destinationFile);
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file: " + e.getMessage());
        }
    }
}

