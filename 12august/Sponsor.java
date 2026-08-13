class Sponsor{
	public static String getSponsorNameByTotalBill(double bill) {
		
		System.out.println("Running getSponsorNameByTotalBill in Sponsor dataType");
		
		System.out.println("Bill Ammount:"+bill);

		String sponsor1 = "Appolo Tyers";
		String sponsor2 = "Byjus";
		String sponsor3 = "Dream 11";
		String sponsor4 = "Sahara";
		String sponsor5 = "Qutar";

		if (bill >= 50000) {
			System.out.println("You have Appolo Tyers Sponsor");
			return sponsor1;
		}
		else if (bill >= 40000) {
			System.out.println("You have Byjus Sponsor");
			return sponsor2;
		}
		else if (bill >= 30000) {
			System.out.println("You have Dream 11 Sponsor");
			return sponsor3;
		}
		else if (bill >= 20000) {
			System.out.println("You have Sahara Sponsor");
			return sponsor4;
		}
		else if (bill >= 10000) {
			System.out.println("You have Qutar Sponsor");
			return sponsor5;
		}

		return " No Sponsor";
	}
}