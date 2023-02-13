package models.facility;

public class Room extends Facility{
    private String freeService;

    public Room() {
    }

    public Room(String nameService, double areaUse, double cost, int personMax, String rent, String freeService) {
        super(nameService, areaUse, cost, personMax, rent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
