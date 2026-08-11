class Mascara{
    public static void mascaraInfo(String brandName,String color,double price,int quantity,boolean isWaterproof,String shopName,int rating,boolean isAvailable,String companyName,int discount){
		System.out.println("Brand Name:"+brandName);
		System.out.println("Color:"+color);
		System.out.println("Price:"+price);
		System.out.println("Quantity:"+quantity);
		System.out.println("Is Waterproof:"+isWaterproof);
		System.out.println("Shop Name:"+shopName);
		System.out.println("Rating:"+rating);
		System.out.println("Is Available:"+isAvailable);
		System.out.println("Company Name:"+companyName);
		System.out.println("Discount:"+discount);
	}
	public static void main(String[] args){

		String brandName="Lakme";
		String color="Black";
		double price=350;
		int quantity=5;
		boolean isWaterproof=true;
		String shopName="Health and Glow";
		int rating=4;
		boolean isAvailable=true;
		String companyName="Lakme";
		int discount=20;

		Mascara.mascaraInfo(brandName,color,price,quantity,isWaterproof,shopName,rating,isAvailable,companyName,discount);

		Mascara.mascaraInfo("Maybelline","Brown",450,3,false,"Myntra",5,true,"Maybelline",15);
	}
}
