public abstract class WasteHandler {
    private WasteHandler successor;

    public void setSuccessor(WasteHandler successor) {
        this.successor = successor;
    }

    public boolean handle(WasteContainer container) {
        if (canHandle(container)) {
            dispose(container);
            return true;
        } else if (successor != null) {
            return successor.handle(container);
        } else {
            System.out.println("No handler found for waste type: " + container.getWasteType());
            return false;
        }
    }

    protected abstract boolean canHandle(WasteContainer container);

    protected abstract void dispose(WasteContainer container);
}
