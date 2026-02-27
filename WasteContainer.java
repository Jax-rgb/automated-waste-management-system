public class WasteContainer {
    private final int capacity;
    private final String wasteType;   // e.g., "organic", "recyclable", "hazardous"
    private int currentLevel;

    public WasteContainer(int capacity, String wasteType) {
        this.capacity = capacity;
        this.wasteType = wasteType.toLowerCase();
        this.currentLevel = 0;
    }

    public boolean fill(int amount) {
        currentLevel += amount;
        if (currentLevel > capacity) {
            currentLevel = capacity; // cap at maximum
        }
        return isFull();
    }

    public boolean isFull() {
        return currentLevel >= capacity;
    }

    public String getWasteType() {
        return wasteType;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "WasteContainer{type='" + wasteType + "', capacity=" + capacity +
               ", current=" + currentLevel + ", full=" + isFull() + "}";
    }
}
