public class App {
    public static void main(String[] args) {
        RehabCalc rehabCalc = new RehabCalc(1000, 1, 1, 1, 1, 1, 1, 2);
        System.out.println("The rehab cost is: " + rehabCalc.calcRehabCost());
    }
}
