package homework.moduleone.files;

import java.text.NumberFormat;

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

    public static boolean idMeetsCriteria(String receiptId, char firstChar, char secondChar, int timesAfter) {
        int count = 0;
        int firstCharIndex = receiptId.indexOf(firstChar);
        int secondCharIndex = receiptId.lastIndexOf(secondChar);
        if (firstCharIndex >= 0 && firstCharIndex < secondCharIndex) {
            char[] ch = receiptId.toCharArray();
            for (int i = firstCharIndex + 1; i < ch.length; i++) {
                if (ch[i] == secondChar) {
                    count++;
                }
            }
        }

        return count == timesAfter;
    }

    public String toString() {
        return this.store.getName() + " \n" +
                this.getNumberOfItems() + (this.getNumberOfItems() > 1 ||  this.getNumberOfItems() == 0? "S" : "")+ " \n" +
                NumberFormat.getCurrencyInstance().format(this.getTotal()) + " \n" +
                this.receiptId + "\n";
    }

    @Override
    public  boolean equals(Object obj) {
            if(obj instanceof Receipt other) {
                return this.store.equals(other.getStore()) &&
                        this.numberOfItems == other.getNumberOfItems() && this.total == other.getTotal() &&
                        this.receiptId.equalsIgnoreCase(((Receipt) obj).getReceiptID());
            } else {
                return false;
            }
    }
}
