public class Main {
    public static void main(String[] args) {
        // Build the chain: Organic → Recyclable → Hazardous
        WasteHandler organic = new OrganicHandler();
        WasteHandler recyclable = new RecyclableHandler();
        WasteHandler hazardous = new HazardousHandler();

        organic.setSuccessor(recyclable);
        recyclable.setSuccessor(hazardous);
        // hazardous has no successor

        // Create sample containers
        WasteContainer[] containers = {
            new WasteContainer(100, "organic"),
            new WasteContainer(220, "recyclable"),
            new WasteContainer(60, "hazardous"),
            new WasteContainer(180, "electronic"),   // should fall through
            new WasteContainer(85, "ORGANIC")        // case-insensitive
        };

        // Simulate collection process
        for (WasteContainer container : containers) {
            // Fill to full + overflow (triggers collection)
            boolean wasFull = container.fill(container.getCapacity() + 15);

            if (wasFull) {
                System.out.println("\nContainer full → " + container);
                boolean handled = organic.handle(container);  // start from head of chain
                System.out.println(handled ? "✓ Disposal completed" : "✗ No disposal");
            }
        }
    }
}
