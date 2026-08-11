class WineStore{
	public static void store(String brand,double price,int quantity){
		System.out.println("Running store() in WineStore");

		if(brand==null){
			System.out.println("Brand is Invalid");
		}
		if(price<=0){
			System.out.println("Price is Invalid");
		}
		if(quantity<=0 || quantity>100){
			System.out.println("Quantity is Invalid");
		}
	}
}