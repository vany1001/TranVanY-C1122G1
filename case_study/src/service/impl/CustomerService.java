package service.impl;

import models.person.Customer;
import repository.ICustomerRepository;
import repository.impl.CustomerRepository;
import service.ICustomerService;
import until.ReadAndWriteCustomer;
import java.util.LinkedList;
import java.util.List;


public class CustomerService implements ICustomerService {
    ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public void display() {
        customerRepository.display();
    }

    @Override
    public void add(Customer customer) {
        customerRepository.add(customer);
    }

    @Override
    public Customer findCustomerById(String id) {
        return customerRepository.findCustomerById(id);
    }

    @Override
    public void edit(Customer customer) {
        customerRepository.edit(customer);
    }
}
