package module.one;

import java.util.*;

public class NonProfit {
	
	private String name;
	private List<Donor> donorList;
	
	public NonProfit(String name) {
		this.name = name;
		this.donorList = new ArrayList<Donor>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Donor> getDonorList() {
		return new ArrayList<Donor>(donorList);
	}
	public void setDonorList(List<Donor> donorList) {
		this.donorList = donorList;
	}
	@Override
	public String toString() {
		return name + "\tNumber of Donors=" + getNumberOfDonors() + "\tTotal Donations=$" + getTotalDonations();
	}
	public boolean addDonor(Donor donor) {
		return donorList.add(donor);
	}
	public boolean addDonor(String name, String phone) {
		return addDonor(new Donor(name, phone));
	}
	public int getNumberOfDonors() {
		return donorList.size();
	}
	public void printDonors() {
		for(Donor donor : donorList) {
			System.out.println(donor);
		}
	}
	public int getTotalDonations() {
		int total = 0;
		for(Donor donor : donorList) {
			total += donor.getTotalDonations();
		}
		return total;
	}
	public Donor getBiggestDonor() {
		if(donorList.isEmpty()) {
			return null;
		}
		Donor maxDonor = donorList.get(0);
		int maxDonation = maxDonor.getTotalDonations();
		for(Donor currentDonor : donorList) {
			int currentDonation = currentDonor.getTotalDonations();
			
			if(currentDonation > maxDonation) {
				maxDonor = currentDonor;
				maxDonation = currentDonation;
			}
		}
		return maxDonor;
	}
}

