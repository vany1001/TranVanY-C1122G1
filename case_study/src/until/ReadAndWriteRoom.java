package until;

import models.facility.Facility;
import models.facility.Room;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadAndWriteRoom {
    public static final String FILE_PATH_ROOM = "D:\\codegym\\TranVanY-C1122G1\\case_study\\src\\data\\room\\room.csv";
    public static Map<Facility, Integer> readFile() {
        Map<Facility, Integer> roomMap = new LinkedHashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_PATH_ROOM);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String temp[] = line.split(",");
                String serviceName = temp[0];
                String name = temp[1];
                String usableArea = temp[2];
                String rentalCosts = temp[3];
                String maximumNumberOfPeople = temp[4];
                String rentalType = temp[5];
                String freeService = temp[6];
                Room room = new Room(serviceName, name, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, freeService);
                roomMap.put(room, Integer.parseInt(temp[7]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return roomMap;
    }

    public static void writeFile(Map<Facility, Integer> roomMap) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_PATH_ROOM,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Facility, Integer> entryRoom : roomMap.entrySet()) {
                if(entryRoom.getKey() instanceof Room) {
                    bufferedWriter.write(((Room) entryRoom.getKey()).formatCSVRoom() + "," + entryRoom.getValue());
                    bufferedWriter.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
