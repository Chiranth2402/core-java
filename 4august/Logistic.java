class Logistic{
	public static void pickup(){
		System.out.println("Logistic picked up the Product package");
		System.out.println("Running sell() from Logistic class");
		Vendor.sell();
	}
}
		