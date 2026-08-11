class Customer{
	public static void order(){
		System.out.println("The customer placed an order");
		System.out.println("Running buy(),discount(),member() from Customer class");
		Amazon.buy();
		Amazon.discount();
		Amazon.member();
	}
}

		
		