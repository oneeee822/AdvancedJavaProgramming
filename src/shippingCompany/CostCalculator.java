package shippingCompany;

public class CostCalculator {

    public static class Plan {
        public final int bigCount;
        public final int smallCount;
        public final double totalCost;

        public Plan(int bigCount, int smallCount, double totalCost) {
            this.bigCount = bigCount;
            this.smallCount = smallCount;
            this.totalCost = totalCost;
        }

        @Override
        public String toString() {
            return String.format("Big containers: %d, Small containers: %d, Total cost: €%.2f",
                    bigCount, smallCount, totalCost);
        }
    }

    // Big container strategy
    public static Plan allBigPlan(Shipment shipment, Container big) {
        double totalVol = shipment.totalVolume();
        int bigCnt = (int) Math.ceil(totalVol / big.volume());
        double cost = bigCnt * big.getCost();
        return new Plan(bigCnt, 0, cost);
    }

    // Small container strategy
    public static Plan allSmallPlan(Shipment shipment, Container small) {
        double totalVol = shipment.totalVolume();
        double totalW = shipment.totalWeight();
        int smallCnt = (int) Math.ceil(totalVol / small.volume());
        if (smallCnt == 0) return new Plan(0, 0, 0);

        // Average weight per small container
        double avgPerSmall = totalW / smallCnt;
        double unitCost = (avgPerSmall <= 500.0) ? 1000.0 : 1200.0;

        return new Plan(0, smallCnt, smallCnt * unitCost);
    }

    // Mixed strategy  
    public static Plan bestPlan(Shipment shipment, Container big, Container small) {
        double totalVol = shipment.totalVolume();
        double totalW = shipment.totalWeight();

        if (totalVol <= 0) return new Plan(0, 0, 0);

        int maxBig = (int) Math.ceil(totalVol / big.volume()); // Max big containers needed
        double best = Double.POSITIVE_INFINITY;
        Plan bestPlan = null;

        for (int bigCnt = 0; bigCnt <= maxBig; bigCnt++) {
            double volByBig = bigCnt * big.volume();
            double remainVol = Math.max(0, totalVol - volByBig);

            int smallCnt = (remainVol <= 0) ? 0 : (int) Math.ceil(remainVol / small.volume());

            // Calculate costs
            double costBig = bigCnt * big.getCost();
            double costSmall = 0;

            if (smallCnt > 0) {
                double density = totalW / totalVol; 
                double avgWeightPerSmall = density * small.volume(); 

                double smallUnitCost = (avgWeightPerSmall <= 500.0) ? 1000.0 : 1200.0;
                costSmall = smallCnt * smallUnitCost;
            }

            double totalCost = costBig + costSmall;

            if (totalCost < best) {
                best = totalCost;
                bestPlan = new Plan(bigCnt, smallCnt, totalCost);
            }
        }
        return bestPlan;
    }
}
