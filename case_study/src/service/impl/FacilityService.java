package service.impl;

import models.facility.Facility;
import repository.IFacilityRepository;
import repository.impl.FacilityRepository;
import service.IFacilityService;
import until.ReadAndWriteRoom;
import until.ReadAndWriteVilla;


import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityService implements IFacilityService {
    IFacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void display() {
        facilityRepository.display();
    }

    @Override
    public void addRoom(Facility room, int numberOfUses) {
        facilityRepository.addRoom(room, numberOfUses);
    }

    @Override
    public void addVilla(Facility villa, int numberOfUses) {
        facilityRepository.addVilla(villa, numberOfUses);
    }

    @Override
    public void displayListFacilityMaintenance() {
        facilityRepository.displayListFacilityMaintenance();
    }
}
