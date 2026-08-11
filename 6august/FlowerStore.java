class FlowerStore{
	public static void store(String name,String color,double price,int quantity,boolean fresh){

		System.out.println("Running store() in FlowerStore");

		if(name==null){
			System.out.println("Name is Invalid");
		}
		if(color==null || color.isEmpty()){
			System.out.println("Color is Invalid");
		}
		if(price<=0){
			System.out.println("Price is Invalid");
		}
		if(quantity<=0 || quantity>100){
			System.out.println("Quantity is Invalid");
		}
		if(fresh==false){
			System.out.println("Fresh is Invalid");
		}
	}
}