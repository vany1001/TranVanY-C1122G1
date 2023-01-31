package org.example.bai12_JavaCollectionFramework.bai_tap.ArrayList.Service;

import org.example.bai12_JavaCollectionFramework.bai_tap.ArrayList.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductSer implements IProductSer {
    static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Iphone8", 20));
        productList.add(new Product(2, "Iphone10", 10));
        productList.add(new Product(3, "Iphone14", 30));
    }

    @Override
    public void display() {
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i));
        }
    }

    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public Product findById(int id) {
        for (Product c : productList) {
            if (c.getID() == id) {
                return c;
            }

        }
        return null;
    }

    @Override
    public void update(Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getID() == product.getID()) {
                productList.set(i, product);
            }
        }
    }

    @Override
    public void remove(Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getID() == product.getID()) {
                productList.remove(product);
            }
        }
    }

    @Override
    public void seachId(Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getID() == product.getID()) {
                productList.set(i,product);
            }
        }

    }

    @Override
    public void sort() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getID()-o2.getID();
            }
        });
    }

}
