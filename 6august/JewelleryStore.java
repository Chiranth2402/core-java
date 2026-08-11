class JewelleryStore{
	public static void store(String item,String material,double price,int quantity,double weight,String color,boolean hallmark){

		System.out.println("Running store() in JewelleryStore");

		if(item==null){
			System.out.println("Item is Invalid");
		}
		if(material==null || material.isEmpty()){
			System.out.println("Material is Invalid");
		}
		if(price<=0){
			System.out.println("Price is Invalid");
		}
		if(quantity<=0 || quantity>50){
			System.out.println("Quantity is Invalid");
		}
		if(weight<=0){
			System.out.println("Weight is Invalid");
		}
		if(color==null || color.isEmpty()){
			System.out.println("Color is Invalid");
		}
		if(hallmark==false){
			System.out.println("Hallmark is Invalid");
		}
	}
}