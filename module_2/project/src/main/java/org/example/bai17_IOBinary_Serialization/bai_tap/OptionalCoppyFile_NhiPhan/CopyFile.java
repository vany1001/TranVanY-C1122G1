package org.example.bai17_IOBinary_Serialization.bai_tap.OptionalCoppyFile_NhiPhan;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập source file cần copy: ");
            String sourceFile = scanner.nextLine();
            try {
                inputStream = new FileInputStream(sourceFile);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println("Nhập source file để lưu: ");
            String targetFile = scanner.nextLine();
            try {
                outputStream = new FileOutputStream(targetFile);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println("Số byte của file là: " + targetFile.length());

            int length;
            byte[] buffer = new byte[1024];
            while (true) {
                try {
                    if (!((length = inputStream.read(buffer)) > 0)) break;
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    outputStream.write(buffer, 0, length);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }

        } finally {
            assert inputStream != null;
            assert outputStream != null;
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

