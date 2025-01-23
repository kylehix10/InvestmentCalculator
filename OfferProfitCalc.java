//Kyle Hix
//Copyright 2025

//TODO Add variables and Setters

public class OfferProfitCalc {
    private double afterRepairValue;
    private double offer;
    private double rehabCost;
    private double holdingMonths;
    private double acquisitionCost;
    private double holdingPerMonthExpense;
    private double agentPercentage;
    private double profit;
    private double percentOfARV;
    private double offerAndRehavLTV;
    private double hedge;
    private double offerLTV;

    

    public OfferProfitCalc(double afterRepairValue,  double rehabCost, double holdingMonths)
    {
        this.afterRepairValue = afterRepairValue;
        this.offer = 0;
        this.rehabCost = rehabCost;
        this.holdingMonths = holdingMonths;
        this.acquisitionCost = 0;
        this.holdingPerMonthExpense = 0;
        this.agentPercentage = 0;
        this.profit=0;
        this.percentOfARV = 0;
        this.offerAndRehavLTV = 0;
        this.offerLTV = 0;
        this.hedge=0;
    }

    public double getAfterRepairValue() {
        return afterRepairValue;
    }

    public void setAfterRepairValue(double afterRepairValue) {
        if(afterRepairValue < 0)
        {
            throw new IllegalArgumentException("After Repair Value must be greater than 0");
        }
        else
            this.afterRepairValue = afterRepairValue;
    }

    public double getOffer() {
        return offer;
    }

    public void setOffer(double offer) {
        this.offer = offer;
    }

    public double calcOffer()
    {
        offer = afterRepairValue - acquisitionCost - hedge - (holdingPerMonthExpense * holdingMonths)-agentPercentage - profit;
        return offer;
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
        this.acquisitionCost = acquisitionCost;
    }

    public double calcAcquisitionCost()
    {
        acquisitionCost = (offer * 0.03) + (.03 * rehabCost)+3000;
        return acquisitionCost;
    }

    public double getHoldingPerMonthExpense() {
        return holdingPerMonthExpense;
    }

    public void setHoldingPerMonthExpense(double holdingPerMonthExpense) {
        this.holdingPerMonthExpense = holdingPerMonthExpense;
    }

    public double calcHoldingPerMonthExpense()
    {
        holdingPerMonthExpense = (.12*offer)+(.12*rehabCost)/12;
        return holdingPerMonthExpense;
    }

    public double getAgentPercentage() {
        return agentPercentage;
    }

    public void setAgentPercentage(double agentPercentage) {
        this.agentPercentage = agentPercentage;
    }

    public double calcAgentPercentage()
    {
        agentPercentage = (afterRepairValue * 0.025);
        return agentPercentage;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public double calcProfit()
    {
        profit =afterRepairValue- acquisitionCost - rehabCost - hedge - (holdingPerMonthExpense *holdingMonths)
        - agentPercentage - offer;
        return profit;
    }

    public double getPercentOfARV() {
        return percentOfARV;
    }

    public void setPercentOfARV(double percentOfARV) {
        this.percentOfARV = percentOfARV;
    }

    public double calcPercentOfARV()
    {
        percentOfARV = (offer/afterRepairValue)*100;
        return percentOfARV;
    }

    public double getOfferAndRehavLTV() {
        return offerAndRehavLTV;
    }

    public void setOfferAndRehavLTV(double offerAndRehavLTV) {
        this.offerAndRehavLTV = offerAndRehavLTV;
    }

    public double calcOfferAndRehavLTV()
    {
        offerAndRehavLTV = (offer + rehabCost)/afterRepairValue;
        return offerAndRehavLTV;
    }

    public double getHedge() {
        return hedge;
    }   

    public double setHedge(double hedge) {
        return this.hedge = hedge;
    }

    public double calcHedge()
    {
        hedge = (afterRepairValue * 0.1);
        return hedge;
    }

    public double getOfferLTV() {
        return offerLTV;
    }
    
    public double setOfferLTV(double offerLTV) {
        return this.offerLTV = offerLTV;
    }

    public double calcOfferLTV(){
        offerLTV = (offer/afterRepairValue)*100;
        return offerLTV;
    }

    public String toString()
    {
        return "After Repair Value: " + afterRepairValue + "\nOffer: " + offer + "\nRehab Cost: " + rehabCost + "\nHolding Months: " + holdingMonths
        + "\nAcquisition Cost: " + acquisitionCost + "\nHolding Per Month Expense: " + holdingPerMonthExpense + "\nAgent Percentage: " + agentPercentage
        + "\nProfit: " + profit + "\nPercent of ARV: " + percentOfARV + "\nOffer and Rehab LTV: " + offerAndRehavLTV + "\nHedge: " + hedge + "\nOffer LTV: " + offerLTV;
    }

    


    

  


    
}
