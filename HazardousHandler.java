public class HazardousHandler extends WasteHandler {
    @Override
    protected boolean canHandle(WasteContainer container) {
        return "hazardous".equals(container.getWasteType());
    }

    @Override
    protected void dispose(WasteContainer container) {
        System.out.println("→ Hazardous Handler: Secure containment & special disposal " +
                           "activated for " + container.getCapacity() + "L hazardous waste.");
    }
}
