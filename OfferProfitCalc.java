//Kyle Hix
//Copyright 2025

//TODO Add variables and Setters

public class OfferProfitCalc {
    private double afterRepairValue;
    private double offer;
    private double rehabCost;
    private double holdingMonths;
    

    public OfferProfitCalc(double afterRepairValue, double offer, double rehabCost, double holdingMonths)
    {
        this.afterRepairValue = afterRepairValue;
        this.offer = offer;
        this.rehabCost = rehabCost;
        this.holdingMonths = holdingMonths;
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

    //---------------------

    public double getHedge(double rehabCost)
    {
        double hedge = rehabCost *.1;
        return hedge;
    }

    public double getHoldingPerMonthExpense(){
        double holdingPerMonthExpense = ((.12*offer)*(.12*rehabCost)/12);
        return holdingPerMonthExpense;
    }

    public double getAcquisitionCost(){
        double acquisitionCost = ((.03*offer)+(.03*rehabCost)+3000);
        return acquisitionCost;
    }

    public double getAgentPercentage(){
        double agentPercentage = (.025*afterRepairValue);
        return agentPercentage;
    }




    

  


    
}
