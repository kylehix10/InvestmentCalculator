//Kyle Hix
//Copyright 2025
public class RehabCalc {
    private int squareFootage;
    private int bathrooms;
    private int kitchen;
    private int airconditioning;
    private int roof;
    private int paint;
    private int floors;
    private int miscCosts;


    public RehabCalc(int squareFootage, int bathrooms, int kitchen, int airconditioning,
    int roof, int paint, int floors, int miscCosts) {
        this.squareFootage = squareFootage;
        this.bathrooms = bathrooms;
        this.kitchen = kitchen;
        this.airconditioning = airconditioning;
        this.roof = roof;
        this.paint = paint;
        this.floors = floors;
        this.miscCosts = miscCosts;
        
    }

    //SquareFootage
    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    //Bathrooms
    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public double getBathroomCost() {
        double bathroomCost = bathrooms * 5000;
        return bathroomCost;
    }

    //Kitchen
    public int getKitchen() {
        return kitchen;
    }

    public void setKitchen(int kitchen) {
        this.kitchen = kitchen;
    }

    public double getKitchenCost() {
        double kitchenCost = kitchen * squareFootage *10;
        return kitchenCost;
    }

    //Airconditioning
    public int getAirconditioning() {
        return airconditioning;
    }

    public void setAirconditioning(int airconditioning) {
        this.airconditioning = airconditioning;
    }

    public double getAirconditioningCost() {
        double airconditioningCost = airconditioning * 7000;
        return airconditioningCost;
    }

    //Roof
    public int getRoof() {
        return roof;
    }

    public void setRoof(int roof) {
        this.roof = roof;
    }

    public double getRoofCost() {
        double roofCost = roof *8000;
        return roofCost;
    }

    //Paint
    public int getPaint() {
        return paint;
    }

    public void setPaint(int paint) {
        this.paint = paint;
    }   

    public double getPaintCost() {
        double paintCost = paint * squareFootage * 3.5;
        return paintCost;
    }

    //Floors
    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public double getFloorCost() {
        double floorCost = floors * squareFootage * 5;
        return floorCost;
    }

    //MiscCosts
    public int getMiscCosts() {
        return miscCosts;
    }

    public void setMiscCosts(int miscCosts) {
        this.miscCosts = miscCosts;
    }

    public double getMiscCost() {
        double miscCost = miscCosts *5000;
        return miscCost;
    }

    //Calculate Rehab Costs
    public double calcRehabCost() {
        RehabCalc calc = new RehabCalc(squareFootage, bathrooms, kitchen, airconditioning, roof, paint, floors, miscCosts);
        double bathroomCost = calc.getBathroomCost();
        double kitchenCost = calc.getKitchenCost();
        double airconditioningCost = calc.getAirconditioningCost();
        double roofCost = calc.getRoofCost();
        double paintCost = calc.getPaintCost();
        double floorCost = calc.getFloorCost();
        double miscCost = calc.getMiscCost();
        double rehabCosts = bathroomCost + kitchenCost + airconditioningCost + roofCost + paintCost + floorCost + miscCost;
        return rehabCosts;
    }

}
