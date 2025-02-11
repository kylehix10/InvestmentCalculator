//Kyle Hix
//Copyright 2025
public class Calculator {
    protected double afterRepairValue;
    protected double offer;
    protected double rehabCost;
    protected double holdingMonths;
    protected double acquisitionCost;
    protected double holdingPerMonthExpense;
    protected double agentPercentage;
    protected double profit;
    protected double percentOfARV;
    protected double offerAndRehavLTV;
    protected double offerLTV;
    protected double hedge;
    protected double profitExpected;

    public Calculator() {
        this.afterRepairValue = 0;
        this.offer = 0;
        this.rehabCost = 0;
        this.holdingMonths = 0;
        this.acquisitionCost = 0;
        this.holdingPerMonthExpense = 0;
        this.agentPercentage = 0;
        this.profit = 0;
        this.percentOfARV = 0;
        this.offerAndRehavLTV = 0;
        this.offerLTV = 0;
        this.hedge = 0;
        this.profitExpected = 0;
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
        this.acquisitionCost = acquisitionCost;
    }

    public double getHoldingPerMonthExpense() {
        return holdingPerMonthExpense;
    }

    public void setHoldingPerMonthExpense(double holdingPerMonthExpense) {
        this.holdingPerMonthExpense = holdingPerMonthExpense;
    }

    public double getAgentPercentage() {
        return agentPercentage;
    }

    public void setAgentPercentage(double agentPercentage) {
        this.agentPercentage = agentPercentage;
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

    public double getOfferAndRehavLTV() {
        return offerAndRehavLTV;
    }

    public void setOfferAndRehavLTV(double offerAndRehavLTV) {
        this.offerAndRehavLTV = offerAndRehavLTV;
    }

    public double getOfferLTV() {
        return offerLTV;
    }

    public void setOfferLTV(double offerLTV) {
        this.offerLTV = offerLTV;
    }

    public double getHedge() {
        return hedge;
    }

    public void setHedge(double hedge) {
        this.hedge = hedge;
    }

    public double getProfitExpected() {
        return profitExpected;
    }

    public void setProfitExpected(double profitExpected) {
        this.profitExpected = profitExpected;
    }



}