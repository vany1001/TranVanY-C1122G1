package repository.impl;

import models.person.Customer;
import repository.ICustomerRepository;
import until.ReadAndWriteCustomer;
import java.util.LinkedList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customerList = new LinkedList<>();

    @Override
    public void display() {
        customerList = ReadAndWriteCustomer.readFileCustomer();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void add(Customer customer) {
        customerList = ReadAndWriteCustomer.readFileCustomer();
        customerList.add(customer);
        ReadAndWriteCustomer.writeFile(customerList);
    }

    @Override
    public Customer findCustomerById(String id) {
        for (Customer customer : customerList) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public void edit(Customer customer) {
        customerList = ReadAndWriteCustomer.readFileCustomer();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equals(customer.getId())) {
                customerList.set(i, customer);
                break;
            }
        }
        ReadAndWriteCustomer.writeFile(customerList);
    }
}
