class MobileStore{
	public static void store(String brand,double price,int quantity,String color){
		System.out.println("Running store() in MobileStore");
		
		if(brand==null){
			System.out.println("Brand is Invalid");
		}
		if(price<=0){
			System.out.println("Price is Invalid");
		}
		if(quantity<=0 || quantity>100){
			System.out.println("Quantity is Invalid");
		}
		if(color==null || color.isEmpty()){
			System.out.println("Color is Invalid");
		}
	}
}