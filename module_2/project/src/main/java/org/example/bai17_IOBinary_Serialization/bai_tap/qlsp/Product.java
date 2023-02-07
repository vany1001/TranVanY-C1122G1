package org.example.bai17_IOBinary_Serialization.bai_tap.qlsp;

import java.io.Serializable;

public class Product implements Serializable {
    private int productId;
    private String productName;
    private String manuFacturer;
    private int price;

    public Product(int productId, String productName, String manuFacturer, int price) {
        this.productId = productId;
        this.productName = productName;
        this.manuFacturer = manuFacturer;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManuFacturer() {
        return manuFacturer;
    }

    public void setManuFacturer(String manuFacturer) {
        this.manuFacturer = manuFacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", manuFacturer='" + manuFacturer + '\'' +
                ", price=" + price +
                '}';
    }
}
