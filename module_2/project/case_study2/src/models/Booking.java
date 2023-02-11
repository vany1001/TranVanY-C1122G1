package models;

import java.util.Date;

public class Booking {
    private String bookingId;
    private Date dayStar;
    private Date dayEnd;
    private String idCustomer;
    private String nameService;
    private String typeService;

    public Booking() {
    }

    public Booking(String bookingId, Date dayStar, Date dayEnd, String idCustomer, String nameService, String typeService) {
        this.bookingId = bookingId;
        this.dayStar = dayStar;
        this.dayEnd = dayEnd;
        this.idCustomer = idCustomer;
        this.nameService = nameService;
        this.typeService = typeService;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Date getDayStar() {
        return dayStar;
    }

    public void setDayStar(Date dayStar) {
        this.dayStar = dayStar;
    }

    public Date getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(Date dayEnd) {
        this.dayEnd = dayEnd;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", dayStar=" + dayStar +
                ", dayEnd=" + dayEnd +
                ", idCustomer='" + idCustomer + '\'' +
                ", nameService='" + nameService + '\'' +
                ", typeService='" + typeService + '\'' +
                '}';
    }
}
