package org.example.bai16_IOTextFile.bai_tap.fileCSV;



import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    private static final String FILE_PATH = "D:\\codegym\\TranVanY-C1122G1\\module_2\\project\\src\\main\\java\\org\\example\\bai16_IOTextFile\\bai_tap\\fileCSV\\countries.csv";

    public static List<Country> readCSV() {
        List<Country> countryList = new ArrayList<>();
        FileReader fileReader;
        BufferedReader bufferedReader= null;

        try {
            fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            Country country;

            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String code = temp[1];
                String name = temp[2];

                country = new Country(id, code, name);
                countryList.add(country);

            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return countryList;

    }

    public static void writeCSV(Country country) {

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(FILE_PATH,true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        try {
            bufferedWriter.write(country.getId() + "," + country.getCode() + "," + country.getName() + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
