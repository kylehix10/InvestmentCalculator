//Kyle Hix
//Copyright 2025
public class RehabCalc {
  
        public static double estimateRehab(Property property) {
            double rehabEstimate = ((property.getSquareFootage()*property.getPaint())*3.5)+((property.getFloors()*property.getSquareFootage())*5)+(property.getRoof()*8000)+(property.getAirconditioning()*7000)+
            (property.getKitchen()*(property.getSquareFootage()*10))+ (property.getBathrooms()*5000)+(property.getMisc()*5000);
            property.setRehabCost(rehabEstimate);
            return rehabEstimate;
        }
    

    

}
