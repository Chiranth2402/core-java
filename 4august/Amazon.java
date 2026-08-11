class Amazon{
	public static void buy(){
		System.out.println("Product purchased");
	}
	public static void discount(){
		System.out.println("Discount applaid Successfully");
	}
	public static void member(){
		System.out.println("Discount applaid because you are a prime subscription member");
		
		System.out.println("Running pickup() from Amazon class");
	    Logistic.pickup();
	}
}

		