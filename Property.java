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
    private int kitchen;
    private int airconditioning;
    private int paint;  
    private int floors;
    private int roof;
    private UUID uuid;
    private double afterRepairValue;
    private double offer;
    private double rehabCost;
    private double holdingMonths;
    private double acquisitionCost;
    private double holdingPerMonthExpense;
    private double agentPercentage;
    private double profit;
    private double percentOfARV;
    private double offerAndRehabLTV;
    private double hedge;
    private double offerLTV;
    private double misc;
    private double profitExpected;
    

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
        this.zip = zip;
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
    
    public int getKitchen() {
        return kitchen;
    }
    
    public void setKichen(int kichen) {
        this.kitchen = kichen;
    }
    
    public int getAirconditioning() {
        return airconditioning;
    }
    
    public void setAirconditioning(int airconditioning) {
        this.airconditioning = airconditioning;
    }
    
    public int getPaint() {
        return paint;
    }
    
    public void setPaint(int paint) {
        this.paint = paint;
    }
    
    public int getFloors() {
        return floors;
    }
    
    public void setFloors(int floors) {
        this.floors = floors;
    }
    
    public int getRoof() {
        return roof;
    }
    
    public void setRoof(int roof) {
        this.roof = roof;
    }
    
    public UUID getUuid() {
        return uuid;
    }
    
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
    
    public double getAfterRepairValue() {
        return afterRepairValue;
    }
    
    public void setAfterRepairValue(double afterRepairValue) {
        this.afterRepairValue = afterRepairValue;
    }
    
    public double getOffer() {
        return offer;
    }
    
    public void setOffer(double offer) {
        this.offer = offer;
    }
    
    public double getRehabCost() {
        return rehabCost;
    }
    
    public void setRehabCost(double rehabCost) {
        this.rehabCost = rehabCost;
    }
    
    public double getHoldingMonths() {
        return holdingMonths;
    }
    
    public void setHoldingMonths(double holdingMonths) {
        this.holdingMonths = holdingMonths;
    }
    
    public double getAcquisitionCost() {
        return acquisitionCost;
    }
    
    public void setAcquisitionCost(double acquisitionCost) {
        this.acquisitionCost = (offer * .03)+(.03*rehabCost)+3000;
    }
    
    public double getHoldingPerMonthExpense() {
        return holdingPerMonthExpense;
    }
    
    public void setHoldingPerMonthExpense(double holdingPerMonthExpense) {
        this.holdingPerMonthExpense = ((offer *.12)+(.12*rehabCost))/12;
    }
    
    public double getAgentPercentage() {
        return agentPercentage;
    }
    
    public void setAgentPercentage(double agentPercentage) {
        this.agentPercentage = afterRepairValue*.025;
    }
    
    public double getProfit() {
        return profit;
    }
    
    public void setProfit(double profit) {
        this.profit = profit;
    }
    
    public double getPercentOfARV() {
        return percentOfARV;
    }
    
    public void setPercentOfARV(double percentOfARV) {
        this.percentOfARV = percentOfARV;
    }
    
    public double getOfferAndRehabLTV() {
        return offerAndRehabLTV;
    }
    
    public void setOfferAndRehabLTV(double offerAndRehabLTV) {
        this.offerAndRehabLTV = offerAndRehabLTV;
    }
    
    public double getHedge() {
        return hedge;
    }
    
    public void setHedge(double hedge) {
        this.hedge = this.rehabCost *.10;
    }
    
    public double getOfferLTV() {
        return offerLTV;
    }
    
    public void setOfferLTV(double offerLTV) {
        this.offerLTV = offerLTV;
    }

    public double getMisc() {
        return misc;
    }
    public void setMisc(double misc) {
        this.misc = misc;
    }
    public double getProfitExpected() {
        return profitExpected;
    }
    public void setProfitExpected(double profitExpected) {
        this.profitExpected = profitExpected;
    }
}