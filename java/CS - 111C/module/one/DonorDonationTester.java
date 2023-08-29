package module.one;

import java.util.*;

public class DonorDonationTester {

	public static void main(String[] args) {
		
		List<Donor> donorList = new ArrayList<Donor>();
		donorList.add(new Donor("Cam Payne", "555-123-4567"));
		donorList.add(new Donor("Ella Vader", "555-890-1234"));
		donorList.add(new Donor("June Bugg", "555-567-8901"));
		donorList.add(new Donor("Marsha Mellow", "555-234-5678"));
		donorList.add(new Donor("Royal Payne", "555-901-2345"));
		
		Random generator = new Random();
		for(Donor donor : donorList) {
			int numDonations = generator.nextInt(10);
			for(int i=0; i<numDonations; i++) {
				boolean recurring = generator.nextBoolean();
				int amount = generator.nextInt(100);
				donor.donate(amount, recurring);
			}
		}
		
		for(Donor donor : donorList) {
			System.out.print(donor);
			System.out.println("\tMaxDonation=" + donor.getMaximumDonationAmount());
		}
		
				
		System.out.println("--------------------------------------------------------");
		NonProfit charity = new NonProfit("Human Fund");
		charity.setDonorList(donorList);
		System.out.println(charity);
		charity.printDonors();
		System.out.println("Total donations=" + charity.getTotalDonations());
		System.out.println("Biggest donor: " + charity.getBiggestDonor());
	}

}
