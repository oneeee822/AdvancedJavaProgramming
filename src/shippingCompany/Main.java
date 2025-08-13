package shippingCompany;

public class Main {
    public static void main(String[] args) {
        // ===== Example shipment =====
        // 1) Laptop: 60 x 50 x 50 cm, 6.5 kg, qty 100
        // 2) Mouse:  30 x 30 x 20 cm, 0.2 kg, qty 200
        // 3) Desktop:100 x 150 x 50 cm, 20 kg, qty 200
        // 4) Screen: 100 x 20 x 120 cm, 16 kg, qty 100
        Shipment shipment = new Shipment();
        shipment.addItem(new Item("Laptop", 60, 50, 50, 6.5, 100));
        shipment.addItem(new Item("Mouse", 30, 30, 20, 0.2, 200));
        shipment.addItem(new Item("Desktop", 100, 150, 50, 20, 200));
        shipment.addItem(new Item("Screen", 100, 20, 120, 16, 100));

        // ===== Containers =====
        // Small: H 2.59 m, W 2.43 m, L 6.06 m
        // Big:   H 2.59 m, W 2.43 m, L 12.01 m
        Container small = new Container(6.06, 2.43, 2.59, 0);     
        Container big   = new Container(12.01, 2.43, 2.59, 1800); 

        // ===== Plans =====
        CostCalculator.Plan mixed    = CostCalculator.bestPlan(shipment, big, small);
        CostCalculator.Plan bigOnly  = CostCalculator.allBigPlan(shipment, big);
        CostCalculator.Plan smallOnly= CostCalculator.allSmallPlan(shipment, small);

        // ===== Output =====
        System.out.println("=== Summary ===");
        System.out.printf("Total volume (m³): %.3f%n", shipment.totalVolume());
        System.out.printf("Total weight (kg): %.3f%n", shipment.totalWeight());
        System.out.printf("Small container volume (m³): %.3f%n", small.volume());
        System.out.printf("Big container volume (m³): %.3f%n", big.volume());

        System.out.println("\n=== Single Container Strategy ===");
        System.out.println("[Big only]   " + bigOnly);
        System.out.println("[Small only] " + smallOnly);

        System.out.println("\n=== Mixed Optimal Strategy ===");
        System.out.println(mixed);

        System.out.println("\n=== Final Recommendation (Lowest Cost) ===");
        CostCalculator.Plan best = mixed;
        if (bigOnly.totalCost < best.totalCost) best = bigOnly;
        if (smallOnly.totalCost < best.totalCost) best = smallOnly;
        System.out.println(best);
    }
}
