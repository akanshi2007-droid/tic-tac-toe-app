public class UC4 {
    public static void main(String[] args) {
        int slot = 7;
        System.out.println("Slot: " + slot);
        System.out.println("Row: " + getRowFromSlot(slot));
        System.out.println("Column: " + getColFromSlot(slot));
    }
    static int getRowFromSlot(int slot) {
        // (slot - 1) / 3 gives the row index
        // e.g., Slot 7: (7-1) / 3 = 6 / 3 = 2
        return (slot - 1) / 3;
    }
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }
}
