package models.facility;

public abstract class Facility {
    private String serviceName;
    private String name;
    private String usableArea;
    private String rentalCosts;
    private String maximumNumberOfPeople;
    private String rentalType;

    public Facility(String serviceName, String name, String usableArea, String rentalCosts, String maximumNumberOfPeople, String rentalType) {
        this.serviceName = serviceName;
        this.name = name;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maximumNumberOfPeople = maximumNumberOfPeople;
        this.rentalType = rentalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public String getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(String rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public String getMaximumNumberOfPeople() {
        return maximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(String maximumNumberOfPeople) {
        this.maximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }


    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", name='" + name + '\'' +
                ", usableArea='" + usableArea + '\'' +
                ", rentalCosts='" + rentalCosts + '\'' +
                ", maximumNumberOfPeople='" + maximumNumberOfPeople + '\'' +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    public String     convertLineFacility() {
        final String COMMA = ",";
        return this.serviceName + COMMA + this.name + COMMA + this.usableArea + COMMA + this.rentalType + COMMA + this.maximumNumberOfPeople + COMMA + this.rentalType;
    }
}
