//Kyle Hix
//Copyright 2025
import java.util.UUID;

public class Property {
    private String name;
    private String address;
    private String city;
    private String state;
    private int zip;
    private int squareFootage;
    private int bedrooms;
    private int bathrooms;  
    private UUID uuid;
    private double rehabCost;
    private RehabCalc rehabCalc;
    private OfferCalc offerCalc;
    private ProfitCalc profitCalc;

    public Property(String name, String address, String city,
    String state, int zip, int squareFootage, int bedrooms, int bathrooms) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.squareFootage = squareFootage;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.uuid = UUID.randomUUID();
        this.rehabCost = 0;
        
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        if(zip<89050 && zip>00500)
          this.zip = zip;
        else
          this.zip = 0;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }
    //End of getters and setters

    public String toString() {
        return "Property{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", squareFootage=" + squareFootage +
                ", bedrooms=" + bedrooms +
                ", bathrooms=" + bathrooms +
                '}';
    }

}