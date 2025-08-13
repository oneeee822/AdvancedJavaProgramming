package shippingCompany;

import java.util.ArrayList;
import java.util.List;

class Shipment {
    private final List<Item> items = new ArrayList<>();

    public void addItem(Item i) {
        items.add(i);
    }

    public double totalVolume() {
        return items.stream().mapToDouble(Item::totalVolume).sum();
    }

    public double totalWeight() {
        return items.stream().mapToDouble(Item::totalWeight).sum();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}
