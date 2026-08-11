class FishShop{
	public static void sell(String fishName,int quantity,double price){
		System.out.println("fish Name:"+fishName);
		System.out.println("Quantity:"+quantity);
		System.out.println("Price:"+price);
		
		
		if(quantity<=0||quantity>100){
			System.out.println("Invalid data");
		}
		else{
			System.out.println("Valid Data");
		}
	}
}

		