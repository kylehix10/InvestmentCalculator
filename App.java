public class App {
    public static void main(String[] args) {
       Property property = new Property("House1", "123 Main St", "Anytown", "CA", 90210, 1500, 3, 2);
       property.setSquareFootage(1000);
       property.setBathrooms(1);
       property.setKichen(1);
       property.setRoof(1); 
       property.setAirconditioning(1);
       property.setPaint(2);
       property.setFloors(1);
       property.setMisc(2);
         //System.out.println("Rehab Estimate: " + RehabCalc.estimateRehab(property));

        //Test OfferCalc
        property.setAfterRepairValue(200000);
        property.setAcquisitionCost(0);
        property.setHedge(0);
        property.setHoldingPerMonthExpense(0);
        property.setHoldingMonths(5);
        property.setAgentPercentage(0);
        System.out.println(property.getAfterRepairValue());
        System.out.println(property.getAcquisitionCost());
        System.out.println(property.getHedge());
        System.out.println(property.getHoldingPerMonthExpense());
        System.out.println(property.getHoldingMonths());
        System.out.println(property.getAgentPercentage());
        System.out.println(property.getProfitExpected());
        System.out.println(property.getRehabCost());
        System.out.println(property.getOffer()); 

        System.out.println("Offer: " + OfferCalc.calculateOffer(property));
    }
}
