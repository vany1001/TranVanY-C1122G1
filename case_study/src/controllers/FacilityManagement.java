package controllers;

import models.facility.Facility;
import models.facility.Room;
import models.facility.Villa;
import service.IFacilityService;
import service.Regex;
import service.impl.FacilityService;

import java.util.Scanner;

public class FacilityManagement {
    public void displayMainMenuFacility() {
        IFacilityService facilityService = new FacilityService();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-------Menu-------\n" +
                    "1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Return main menu\n" +
                    "-----------------\n" +
                    "Input your choice");
            int choiceFacility = 0;
            try {
                choiceFacility = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                e.printStackTrace();
            }

            switch (choiceFacility) {
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    System.out.println("------Menu new Facility----\n" +
                            "1. Add New Villa\n" +
                            "2. Add New Room\n" +
                            "3. Back to menu\n" +
                            "-----------------\n" +
                            "Input your choice");
                    int choiceNewFacility = 0;
                    try {
                        choiceNewFacility = Integer.parseInt(sc.nextLine());
                    }catch (NumberFormatException e){
                        e.printStackTrace();
                    }

                    switch (choiceNewFacility) {
                        case 1:
                            String newServiceNameVilla = null;
                            do {
                                System.out.println("Input new name service ");
                                newServiceNameVilla = sc.nextLine();
                                if (!newServiceNameVilla.matches(Regex.REGEX_VILLA_NAME)) {
                                    System.err.println("Please input again");
                                }
                            } while (!newServiceNameVilla.matches(Regex.REGEX_VILLA_NAME));

                            String newNameVilla = null;
                            do {
                                System.out.println("Input new name");
                                newNameVilla = sc.nextLine();
                                if (!newNameVilla.matches(Regex.REGEX_NAME)) {
                                    System.err.println("Please input again");
                                }
                            } while (!newNameVilla.matches(Regex.REGEX_NAME));

                            String newUsableArea = null;
                            do {
                                System.out.println("Input new usable area");
                                newUsableArea = sc.nextLine();
                                if (!newUsableArea.matches(Regex.REGEX_AREA)) {
                                    System.err.println("Please input again");
                                }
                            } while (!newUsableArea.matches(Regex.REGEX_AREA) );

                            String newRentalCosts;
                            do {
                                System.out.println("Input rental costs");
                                newRentalCosts = sc.nextLine();
                                if (!newRentalCosts.matches(Regex.REGEX_RENTAL_COSTS)) {
                                    System.err.println("Please input again");
                                }
                            } while (!newRentalCosts.matches(Regex.REGEX_RENTAL_COSTS));

                            String newMaximumNumberOfPeople;
                            do {
                                System.out.println("Input maximum number of people");
                                newMaximumNumberOfPeople = sc.nextLine();
                                if (!newMaximumNumberOfPeople.matches(Regex.REGEX_MAX_PEOPLE)) {
                                    System.err.println("Please input again");
                                }
                            } while (!newMaximumNumberOfPeople.matches(Regex.REGEX_MAX_PEOPLE));

                            String newRentalType;
                            do {
                                System.out.println("Input rental type");
                                newRentalType = sc.nextLine();
                                if (!newRentalType.matches(Regex.REGEX_RENTAL_TYPE)) {
                                    System.err.println("Please input again");
                                }
                            } while (!newRentalType.matches(Regex.REGEX_RENTAL_TYPE));

                            String newRoomStandard;
                            do {
                                System.out.println("Input room standard");
                                newRoomStandard = sc.nextLine();
                                if (!newRoomStandard.matches(Regex.REGEX_ROOM_STANDARD)) {
                                    System.err.println("Please input again");
                                }
                            } while (!newRoomStandard.matches(Regex.REGEX_ROOM_STANDARD));

                            String newPoolArea;
                            do {
                                System.out.println("Input pool area");
                                newPoolArea = sc.nextLine();
                                if (!newPoolArea.matches(Regex.REGEX_AREA)) {
                                    System.err.println("Please input again");
                                }
                            } while (!newPoolArea.matches(Regex.REGEX_AREA));

                            String newNumberOfFloors;
                            do {
                                System.out.println("Input number of floors");
                                newNumberOfFloors = sc.nextLine();
                                if (!newNumberOfFloors.matches(Regex.REGEX_NUMBER_OF_FLOORS)) {
                                    System.err.println("Please input again");
                                }
                            } while (!newNumberOfFloors.matches(Regex.REGEX_NUMBER_OF_FLOORS));

                            System.out.println("Input number of use");
                            int numberOfUses = Integer.parseInt(sc.nextLine());
                            Facility villa = new Villa(newServiceNameVilla, newNameVilla, newUsableArea, newRentalCosts, newMaximumNumberOfPeople, newRentalType, newRoomStandard, newPoolArea, newNumberOfFloors);
                            facilityService.addVilla(villa, numberOfUses);
                            break;
                        case 2:
                            String newServiceName;
                            do {
                                System.out.println("Input new name service");
                                newServiceName = sc.nextLine();
                                if (!newServiceName.matches(Regex.REGEX_ROOM_NAME)) {
                                    System.err.println("Please input again");
                                }
                            } while (!newServiceName.matches(Regex.REGEX_ROOM_NAME));

                            String newNameRoom;
                            do {
                                System.out.println("Input name");
                                newNameRoom = sc.nextLine();
                                if (!newNameRoom.matches(Regex.REGEX_NAME)) {
                                    System.err.println("Please input again");
                                }
                            } while (!newNameRoom.matches(Regex.REGEX_NAME));

                            String newUsableAreaRoom;
                            do {
                                System.out.println("Input new usable area");
                                newUsableAreaRoom = sc.nextLine();
                                if (!newUsableAreaRoom.matches(Regex.REGEX_AREA)) {
                                    System.err.println("Please input again");
                                }
                            } while (!newUsableAreaRoom.matches(Regex.REGEX_AREA));

                            String newRentalCostsRoom;
                            do {
                                System.out.println(" Input rental costs");
                                newRentalCostsRoom = sc.nextLine();
                                if (!newRentalCostsRoom.matches(Regex.REGEX_RENTAL_COSTS)) {
                                    System.err.println("Please input again");
                                }
                            } while (!newRentalCostsRoom.matches(Regex.REGEX_RENTAL_COSTS));

                            String newMaximumNumberOfPeopleRoom;
                            do {
                                System.out.println("Input maximum number of people");
                                newMaximumNumberOfPeopleRoom = sc.nextLine();
                                if (!newMaximumNumberOfPeopleRoom.matches(Regex.REGEX_MAX_PEOPLE)) {
                                    System.err.println("Please input again");
                                }
                            } while (!newMaximumNumberOfPeopleRoom.matches(Regex.REGEX_MAX_PEOPLE));

                            String newRentalTypeRoom;
                            do {
                                System.out.println("Input rental type");
                                newRentalTypeRoom = sc.nextLine();
                                if (!newRentalTypeRoom.matches(Regex.REGEX_RENTAL_TYPE)) {
                                    System.err.println("Please input again");
                                }
                            } while (!newRentalTypeRoom.matches((Regex.REGEX_RENTAL_TYPE)));

                            System.out.println("Input free service");
                            String newFreeServiceRoom = sc.nextLine();

                            System.out.println("Input number of use");
                            int numberOfUsesRoom = Integer.parseInt(sc.nextLine());
                            Facility room = new Room(newServiceName, newNameRoom, newUsableAreaRoom, newRentalCostsRoom, newMaximumNumberOfPeopleRoom, newRentalTypeRoom, newFreeServiceRoom);
                            facilityService.addRoom(room, numberOfUsesRoom);
                            break;
                        case 3:
                            displayMainMenuFacility();
                            break;
                        default:
                            System.out.println("Please input choice in menu");
                    }
                    break;
                case 3:
                    facilityService.displayListFacilityMaintenance();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Please input choice in menu");
            }
        } while (true);
    }
}
