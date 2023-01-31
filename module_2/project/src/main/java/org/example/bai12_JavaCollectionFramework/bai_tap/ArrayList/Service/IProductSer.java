package org.example.bai12_JavaCollectionFramework.bai_tap.ArrayList.Service;

import org.example.bai12_JavaCollectionFramework.bai_tap.ArrayList.Product;

public interface IProductSer {
    void display();
    void add(Product product);
    Product findById(int ID);
    void update(Product product);
    void remove(Product product);
    void seachId(Product product);
    void sort();
}
