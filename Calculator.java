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

    public double calcOffer()
    {
        offer = afterRepairValue - acquisitionCost - hedge - (holdingPerMonthExpense * holdingMonths)-agentPercentage - profitExpected;
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
        acquisitionCost = (profitExpected * 0.03) + (.03 * rehabCost)+3000;
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

    public double getOfferLTV() {
        return offerLTV;
    }

    public void setOfferLTV(double offerLTV) {
        this.offerLTV = offerLTV;
    }

    public double calcOfferLTV(){
        offerLTV = (offer/afterRepairValue)*100;
        return offerLTV;
    }
    
    public double getHedge() {
        return hedge;
    }

    public void setHedge(double hedge) {
        this.hedge = hedge;
    }

    public double calcHedge()
    {
        hedge = (afterRepairValue * 0.1);
        return hedge;
    }
    public double getProfitExpected() {
        return profitExpected;
    }

    public void setProfitExpected(double profitExpected) {
        this.profitExpected = profitExpected;
    }





}