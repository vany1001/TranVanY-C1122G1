package models;

public class Customer extends Person{
    private String customerId;
    private String guest;
    private String address;

    public Customer() {
    }

    public Customer(String name, String birthDay, String gender, String cmnd, String phone, String email, String customerId, String guest, String address) {
        super(name, birthDay, gender, cmnd, phone, email);
        this.customerId = customerId;
        this.guest = guest;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", guest='" + guest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
