//Kyle Hix
//Copyright 2025
public class OfferCalc {
    public static double calculateOffer(Property property) {
        double offer = 0;
        offer = property.getAfterRepairValue() - property.getAcquisitionCost()-
        property.getRehabCost() - property.getHedge() - 
        (property.getHoldingPerMonthExpense() * property.getHoldingMonths()) -
        property.getAgentPercentage() - property.getProfitExpected();
        return offer;
    }
   
}
