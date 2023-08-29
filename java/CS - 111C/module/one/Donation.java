package module.one;

public class Donation {

	private int amount;
	private boolean recurring;
	
	public static final int DEFAULT_DONATION_AMOUNT = 25;
	public static final boolean DEFAULT_RECURRING = false;
	
	public Donation(int amount, boolean recurring) {
		this.amount = amount;
		this.recurring = recurring;
	}
	public Donation(int amount) {
		this(amount, DEFAULT_RECURRING);
	}
	public Donation(boolean recurring) {
		this(DEFAULT_DONATION_AMOUNT, recurring);
	}
	public Donation() {
		this(DEFAULT_DONATION_AMOUNT, DEFAULT_RECURRING);
	}
	public int getAmount() {
		return amount;
	}
	public boolean isRecurring() {
		return recurring;
	}
	public void setAmount(int amount) {
		if(amount >= 0) {
			this.amount = amount;
		}
	}
	public void setRecurring(boolean recurring) {
		this.recurring = recurring;
	}
	public String toString() {
		return "Amount: " + amount + 
				(recurring ? " (recurring)" : "");
	}
	
}
