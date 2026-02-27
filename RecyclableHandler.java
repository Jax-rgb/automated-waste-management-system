public class RecyclableHandler extends WasteHandler {
    @Override
    protected boolean canHandle(WasteContainer container) {
        return "recyclable".equals(container.getWasteType());
    }

    @Override
    protected void dispose(WasteContainer container) {
        System.out.println("→ Recyclable Handler: Sorting & recycling started for " +
                           container.getCapacity() + "L recyclable waste.");
    }
}
