class ProvisionStore{
	public static void store(String item,double price,int quantity,String brand){

		System.out.println("Running store() in ProvisionStore");

		if(item==null){
			System.out.println("Item is Invalid");
		}
		if(price<=0){
			System.out.println("Price is Invalid");
		}
		if(quantity<=0 || quantity>200){
			System.out.println("Quantity is Invalid");
		}
		if(brand==null || brand.isEmpty()){
			System.out.println("Brand is Invalid");
		}
	}
}