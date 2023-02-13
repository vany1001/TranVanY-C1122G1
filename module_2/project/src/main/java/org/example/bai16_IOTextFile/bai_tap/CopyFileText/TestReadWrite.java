package org.example.bai16_IOTextFile.bai_tap.CopyFileText;

import java.io.IOException;
import java.util.List;

import static org.example.bai16_IOTextFile.bai_tap.CopyFileText.ReadAndWriteFile.copyFile;

public class TestReadWrite {
    public static void main(String[] args) throws IOException {
        String fileSource = "D:\\codegym\\TranVanY-C1122G1\\module_2\\project\\src\\main\\java\\org\\example\\bai16_IOTextFile\\bai_tap\\CopyFileText\\file.txt";
        String fileTarget = "D:\\codegym\\TranVanY-C1122G1\\module_2\\project\\src\\main\\java\\org\\example\\bai16_IOTextFile\\bai_tap\\CopyFileText\\copyfile.txt";
        copyFile(fileSource, fileTarget);
    }
}
