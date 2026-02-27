public class OrganicHandler extends WasteHandler {
    @Override
    protected boolean canHandle(WasteContainer container) {
        return "organic".equals(container.getWasteType());
    }

    @Override
    protected void dispose(WasteContainer container) {
        System.out.println("→ Organic Handler: Composting initiated for " +
                           container.getCapacity() + "L organic waste.");
    }
}
