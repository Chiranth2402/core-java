class DryFruitStore{
	public static void store(String name,double price,int quantity){
		System.out.println("Running store() in DryFruitStore");

		if(name==null){
			System.out.println("Name is Invalid");
		}
		if(price<=0){
			System.out.println("Price is Invalid");
		}
		if(quantity<=0 || quantity>100){
			System.out.println("Quantity is Invalid");
		}
	}
}