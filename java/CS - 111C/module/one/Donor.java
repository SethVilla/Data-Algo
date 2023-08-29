package module.one;

import java.util.*;
import java.time.*;

public class Donor {

	private String name, phone;
	private List<Donation> donationList;
	
	public Donor(String name, String phone) {
		this.name = name;
		this.phone = phone;
		donationList = new ArrayList<Donation>();
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public List<Donation> getDonationList() {
		return new ArrayList<Donation>(donationList);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String toString() {
		return name + " ("  + phone + ") \tNum Donations=" + donationList.size() + "\tTotal Donations=$" + getTotalDonations();
	}
	public boolean hasDonated() {
		return !donationList.isEmpty();
	}
	public boolean donate(int amount, boolean recurring) {
		Donation donation = new Donation(amount, recurring);
		return donate(donation);
	}
	public boolean donate(Donation donation) {
		return donationList.add(donation);
	}	
	public int getTotalDonations() {
		int total = 0;
		for(Donation donation : donationList) {
			total += donation.getAmount();
		}
		return total;
	}
	public Donation getMaximumDonation() {
		if(!hasDonated()) {
			return null;
		}
		Donation maxDonation = donationList.get(0);
		for(Donation currentDonation : donationList) {
			if(currentDonation.getAmount() > maxDonation.getAmount()) {
				maxDonation = currentDonation;
			}
		}
		return maxDonation;
	}
	public int getMaximumDonationAmount() {
		if(!hasDonated()) {
			return 0;
		} else {
			return getMaximumDonation().getAmount();
		}
	}
	public boolean isMaximumDonationRecurring() {
		if(!hasDonated()) {
			return false;
		} else {
			return getMaximumDonation().isRecurring();
		}
	}
}