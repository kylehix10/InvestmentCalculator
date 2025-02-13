//Kyle Hix
//Copyright 2025
public class OfferCalc extends Calculator {
      public OfferCalc() {
        super();
      }

      public double calcOffer()
      {
          offer = afterRepairValue - acquisitionCost - hedge - (holdingPerMonthExpense * holdingMonths)-agentPercentage - profitExpected;
          return offer;
      }
}
