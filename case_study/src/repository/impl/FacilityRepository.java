package repository.impl;

import models.facility.Facility;
import repository.IFacilityRepository;
import until.ReadAndWriteRoom;
import until.ReadAndWriteVilla;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {

    @Override
    public void display() {
        Map<Facility, Integer> facilityIntegerRoom = ReadAndWriteRoom.readFile();
        Map<Facility, Integer> facilityIntegerVilla = ReadAndWriteVilla.readFile();
        for (Map.Entry<Facility, Integer> entry : facilityIntegerRoom.entrySet()) {
            System.out.println(entry.getKey() + " number of uses: "+ entry.getValue());
        }
        for (Map.Entry<Facility, Integer> entry : facilityIntegerVilla.entrySet()) {
            System.out.println(entry.getKey() + " number of uses: " + entry.getValue());
        }
    }

    @Override
    public void addRoom(Facility room, int numberOfUses) {
        Map<Facility, Integer> facilityIntegerRoom = new LinkedHashMap<>();
        facilityIntegerRoom.put(room, numberOfUses);
        ReadAndWriteRoom.writeFile(facilityIntegerRoom);
    }

    @Override
    public void addVilla(Facility villa, int numberOfUses) {
        Map<Facility, Integer> facilityIntegerVilla = new LinkedHashMap<>();
        facilityIntegerVilla.put(villa, numberOfUses);
        ReadAndWriteVilla.writeFile(facilityIntegerVilla);
    }

    @Override
    public void displayListFacilityMaintenance() {
        Map<Facility, Integer>facilityIntegerRoom = ReadAndWriteRoom.readFile();
        Map<Facility, Integer> facilityIntegerVilla = ReadAndWriteVilla.readFile();
        for (Map.Entry<Facility, Integer> entry : facilityIntegerRoom.entrySet()) {
            if (entry.getValue() >= 5) {
                System.out.println(entry.getKey() + "number of uses:" + entry.getValue());
            }

        }
        for (Map.Entry<Facility, Integer> entry : facilityIntegerVilla.entrySet()) {
            if (entry.getValue() >= 5) {
                System.out.println(entry.getKey() + "number of uses:" + entry.getValue());
            }
        }
    }
}
