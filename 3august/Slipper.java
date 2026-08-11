class Slipper{
     public static void slipperInfo(String brandName,String color,double price,int size,boolean isAvailable,String material,int quantity,boolean isWashable,String shopName,int discount,String slipperType){
		System.out.println("Brand Name:"+brandName);
		System.out.println("Color:"+color);
		System.out.println("Price:"+price);
		System.out.println("Size:"+size);
		System.out.println("Is Available:"+isAvailable);
		System.out.println("Material:"+material);
		System.out.println("Quantity:"+quantity);
		System.out.println("Is Washable:"+isWashable);
		System.out.println("Shop Name:"+shopName);
		System.out.println("Discount:"+discount);
		System.out.println("Slipper Type:"+slipperType);
	}
	public static void main(String[] args){

		String brandName="Puma";
		String color="Black";
		double price=799;
		int size=9;
		boolean isAvailable=true;
		String material="Rubber";
		int quantity=2;
		boolean isWashable=true;
		String shopName="Bata";
		int discount=10;
		String slipperType="Casual";

		Slipper.slipperInfo(brandName,color,price,size,isAvailable,material,quantity,isWashable,shopName,discount,slipperType);

		Slipper.slipperInfo("Sparx","Blue",599,8,true,"Foam",1,true,"Metro",15,"Sports");
	}
}