package homework.moduleone.files;

public class DigitalReceipt extends  Receipt {

    private String email;

    public DigitalReceipt(Store store, int numItems, double totalSpent, String receiptId, String email) {
        super(store, numItems, totalSpent, receiptId);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static boolean validateEmail(String email) {
        int symbolIndex = email.indexOf("@");
        int dotIndex = 0;
        boolean foundChar = false;

        if (symbolIndex > 0) {
            for (int i = symbolIndex; i < email.length(); i++) {
                if (email.charAt(i) == '.') {
                    dotIndex = i;
                    break;
                }
            }

            for (int i = symbolIndex; i >=0 ; i--) {
                if(Character.isLetter(email.charAt(i))) {
                    foundChar = true;
                    break;
                }
            }

            if (!foundChar) {
                return false;
            }

            int count = 0;
            if (dotIndex > symbolIndex) {
                for (int i = dotIndex + 1; i < email.length(); i++) {
                    count++;
                    if (count > 3) {
                        return false;
                    }
                }
            }

            return count == 3;
        }

        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Digital copy sent to: " + email;
    }
}
