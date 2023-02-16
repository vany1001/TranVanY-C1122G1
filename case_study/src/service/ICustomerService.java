package service;

import models.person.Customer;

import java.io.IOException;

public interface ICustomerService{


    void display();

    void add(Customer customer);

    Customer findCustomerById(String id);

    void edit(Customer customer);

}
