public class App {
    public static void main(String[] args) {
        RehabCalc rehabCalc = new RehabCalc(1000, 1, 1, 1, 1, 1, 1, 2);
        double rehabCost = rehabCalc.calcRehabCost();
        System.out.println("The rehab cost is: " + rehabCost);


        OfferProfitCalc offerProfitCalc = new OfferProfitCalc(200000, rehabCost, 4);
        System.out.println(offerProfitCalc);
    }
}
