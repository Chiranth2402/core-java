class FancyStore{
	public static void store(String item,double cost,int quantity,String color){
		
		System.out.println("Running store() in FancyStore");
		
		if(item==null){
			System.out.println("Item is Invalid");
		}
		if(cost<=0){
			System.out.println("Cost is Invalid");
		}
		if(quantity<=0||quantity>150){
			System.out.println("Quantity is Invalid");
		}
		if(color.isEmpty()){
			System.out.println("Color is Invalid");
		}
	}
}

			