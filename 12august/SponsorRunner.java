class SponsorRunner {

	public static void main(String[] args) {

		String sponsor1 = Sponsor.getSponsorNameByTotalBill(55000);
		System.out.println("Sponsor Name: " + sponsor1);

		String sponsor2 = Sponsor.getSponsorNameByTotalBill(45000);
		System.out.println("Sponsor Name: " + sponsor2);

		String sponsor3 = Sponsor.getSponsorNameByTotalBill(35000);
		System.out.println("Sponsor Name: " + sponsor3);

		String sponsor4 = Sponsor.getSponsorNameByTotalBill(25000);
		System.out.println("Sponsor Name: " + sponsor4);

		String sponsor5 = Sponsor.getSponsorNameByTotalBill(15000);
		System.out.println("Sponsor Name: " + sponsor5);
	}
}