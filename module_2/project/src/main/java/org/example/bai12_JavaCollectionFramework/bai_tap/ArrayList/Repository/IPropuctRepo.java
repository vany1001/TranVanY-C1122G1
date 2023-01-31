package org.example.bai12_JavaCollectionFramework.bai_tap.ArrayList.Repository;

import org.example.bai12_JavaCollectionFramework.bai_tap.ArrayList.Product;

public interface IPropuctRepo {
    void display();
    void add(Product product);
    Product findById(int id);
    void update(Product product);
    void remove(Product product);
    void seachId(Product product);
    void sort();

}
