package controllers;

import java.util.Scanner;

public class FuramaController {

    public static void displayMainMenu() {

        do {
            System.out.println("----------Furama Resort------------");
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            Scanner scanner = new Scanner(System.in);
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    employeeManagement();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    bookingManagement();
                    break;
                case 5:
                    promotionManagement();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập lại");
            }
        } while (true);

    }

    public static void employeeManagement() {
        do {
            System.out.println("----------Menu------------");
            System.out.println("1.Display List Employees");
            System.out.println("2.Add New Employee");
            System.out.println("3.Delete Employee");
            System.out.println("4.Edit Employee");
            System.out.println("5.Return Main Menu");
            Scanner scanner = new Scanner(System.in);
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    displayListEmployees();
                    break;
                case 2:
                    addnewEmployee();
                    break;
                case 3:
                    deleteEmployee();
                    break;
                case 4:
                    editEmployee();
                    break;
                case 5:
                    returnMainMenu();
                    break;
                default:
                    System.out.println("Vui lòng nhập lại");
            }
        } while (true);
    }

    public static void customerManagement() {
        do {
            System.out.println("----------Menu------------");
            System.out.println("1.Display List Cstomers");
            System.out.println("2.Add New Customer");
            System.out.println("3.Edit Customer");
            System.out.println("4.Return Main Menu");

            Scanner scanner = new Scanner(System.in);
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    displaylistCustomers();
                    break;
                case 2:
                    addNewCustomer();
                    break;
                case 3:
                    editCustomer();
                    break;
                case 4:
                    returnMainMenu();
                    break;
                default:
                    System.out.println("Vui lòng nhập lại");
            }
        } while (true);
    }

    public static void facilityManagement() {
        do {
            System.out.println("----------Menu------------");
            System.out.println("1.Display List Facility ");
            System.out.println("2.Add New Facility");
            System.out.println("3.Display List Facility Maintenance");
            System.out.println("4.Return Main Menu");
            Scanner scanner = new Scanner(System.in);
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    displayListFacility();
                    break;
                case 2:
                    addNewFacility();
                    break;
                case 3:
                    displayListFacilityMaintenance();
                    break;
                case 4:
                    returnMainMenu();
                    break;
                default:
                    System.out.println("Vui lòng nhập lại");
            }
        } while (true);

    }

    public static void bookingManagement() {
        do {
            System.out.println("----------Menu------------");
            System.out.println("1.Add New Booking");
            System.out.println("2.Display List Booking");
            System.out.println("3.Return Main Menu");
            Scanner scanner = new Scanner(System.in);
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    addNewBooking();
                    break;
                case 2:
                    displayListBooking();
                    break;
                case 3:
                    returnMainMenu();
                    break;
                default:
                    System.out.println("Vui lòng nhập lại");
            }

        } while (true);
    }

    public static void promotionManagement() {
        do {
            System.out.println("----------Menu------------");
            System.out.println("1.Display List Customers Use Service");
            System.out.println("2.Display List Customers Get Voucher");
            System.out.println("3.Return Main Menu");
            Scanner scanner = new Scanner(System.in);
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    displayListCustomersUseService();
                    break;
                case 2:
                    displayListCustomersGetVoucher();
                    break;
                case 3:
                    returnMainMenu();
                    break;
                default:
                    System.out.println("Vui lòng nhập lại");
            }
        } while (true);

    }

}
