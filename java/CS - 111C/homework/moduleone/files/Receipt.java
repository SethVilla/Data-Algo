package homework.moduleone.files;

public class Receipt {
    private Store store;
   private int numberOfItems;

    private double total;

    private String receiptId;

    public Receipt(Store store, int numItems, double totalSpent, String receiptId) {
        this.store = store;
        this.numberOfItems = numItems;
        this.total = totalSpent;
        this.receiptId = receiptId;
    }

    public Receipt(Store store, double totalSpent, String receiptId) {
        this.store = store;
        this.total = totalSpent;
        this.numberOfItems = 1;
        this.receiptId = receiptId;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getReceiptID() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    static boolean idMeetsCriteria(String receiptId, char firstChar, char secondChar, int timesAfter) {
        return false;
    }
}
