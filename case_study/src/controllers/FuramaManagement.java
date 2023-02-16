package controllers;

import java.util.Scanner;

public class FuramaManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManagement employeeManagement = new EmployeeManagement();
        CustomerManagement customerManagement = new CustomerManagement();
        FacilityManagement facilityManagement = new FacilityManagement();
        BookingManagement bookingManagement = new BookingManagement();
        PromotionManagement promotionManagement = new PromotionManagement();
        int choice=0;
        do {
            System.out.println("-------Menu-------\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit" +
                    "-----------------\n" +
                    "Input your choice");
            try {
                choice = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                e.printStackTrace();
            }

            switch (choice) {
                case 1:
                    employeeManagement.displayMainMenuEmployee();
                    break;
                case 2:
                    customerManagement.displayMainMenuCustomer();
                    break;
                case 3:
                    facilityManagement.displayMainMenuFacility();
                    break;
                case 4:
                    bookingManagement.displayMainMenuBooking();
                    break;
                case 5:
                    promotionManagement.displayMainMenuPromotion();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please input choice in menu");
            }

        } while (true);

    }

}
