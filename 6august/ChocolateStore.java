class ChocolateStore{
	public static void store(String name,double price){
		System.out.println("Running store() in ChocolateStore");

		if(name==null){
			System.out.println("Name is Invalid");
		}
		if(price<=0){
			System.out.println("Price is Invalid");
		}
	}
}