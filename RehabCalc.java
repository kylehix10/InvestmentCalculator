//Kyle Hix
//Copyright 2025
public class RehabCalc {
    private int squareFootage;
    private int bedrooms;
    private int bathrooms;
    private int kitchen;
    private int airconditioning;
    private int roof;
    private int floors;
    private int misc5K;
    private int misc10K;
    private int misc15K;
    private int misc20K;

    public RehabCalc(int squareFootage, int bedrooms, int bathrooms, int kitchen, int airconditioning,
    int roof, int floors, int misc5K, int misc10K, int misc15K, int misc20K) {
        this.squareFootage = squareFootage;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.kitchen = kitchen;
        this.airconditioning = airconditioning;
        this.roof = roof;
        this.floors = floors;
        this.misc5K = misc5K;
        this.misc10K = misc10K;
        this.misc15K = misc15K;
        this.misc20K = misc20K;
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

    public void setKitchen(int kitchen) {
        this.kitchen = kitchen;
    }

    public int getAirconditioning() {
        return airconditioning;
    }

    public void setAirconditioning(int airconditioning) {
        this.airconditioning = airconditioning;
    }

    public int getRoof() {
        return roof;
    }

    public void setRoof(int roof) {
        this.roof = roof;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getMisc5K() {
        return misc5K;
    }

    public void setMisc5K(int misc5K) {
        this.misc5K = misc5K;
    }

    public int getMisc10K() {
        return misc10K;
    }

    public void setMisc10K(int misc10K) {
        this.misc10K = misc10K;
    }

    public int getMisc15K() {
        return misc15K;
    }

    public void setMisc15K(int misc15K) {
        this.misc15K = misc15K;
    }

    public int getMisc20K() {
        return misc20K;
    }

    public void setMisc20K(int misc20K) {
        this.misc20K = misc20K;
    }

    public int calcRehabCost() {
        return 9;
    }

}
