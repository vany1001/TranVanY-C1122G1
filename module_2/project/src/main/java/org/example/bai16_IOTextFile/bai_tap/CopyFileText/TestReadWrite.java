package org.example.bai16_IOTextFile.bai_tap.CopyFileText;

import java.util.List;

public class TestReadWrite {
//    public static int countCharactor(List<String> list) {
//        int count = 0;
//        for (int i = 0; i < list.size(); i++) {
//            count += list.get(i).length();
//        }
//        return count;
//    }
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<String> list = readAndWriteFile.readFile("D:\\codegym\\TranVanY-C1122G1\\module_2\\project\\src\\main\\java\\org\\example\\bai16_IOTextFile\\bai_tap\\CopyFileText\\file.txt");
//        list.add(String.valueOf(countCharactor(list)));
        readAndWriteFile.writeFile("D:\\codegym\\TranVanY-C1122G1\\module_2\\project\\src\\main\\java\\org\\example\\bai16_IOTextFile\\bai_tap\\CopyFileText\\copyfile.txt",list);
    }
}
