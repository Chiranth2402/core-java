class Keychain{
    public static void keychainInfo(String brandName,String color,double price,int quantity,boolean isAvailable,String material,int keyCount,boolean isMetal,String shopName,int discount,String shape,int weight,String design){
		System.out.println("Brand Name:"+brandName);
		System.out.println("Color:"+color);
		System.out.println("Price:"+price);
		System.out.println("Quantity:"+quantity);
		System.out.println("Is Available:"+isAvailable);
		System.out.println("Material:"+material);
		System.out.println("Key Count:"+keyCount);
		System.out.println("Is Metal:"+isMetal);
		System.out.println("Shop Name:"+shopName);
		System.out.println("Discount:"+discount);
		System.out.println("Shape:"+shape);
		System.out.println("Weight:"+weight);
		System.out.println("Design:"+design);
	}
	public static void main(String[] args){

		String brandName="Skybags";
		String color="Black";
		double price=199;
		int quantity=2;
		boolean isAvailable=true;
		String material="Steel";
		int keyCount=4;
		boolean isMetal=true;
		String shopName="DMart";
		int discount=10;
		String shape="Round";
		int weight=50;
		String design="Simple";

		Keychain.keychainInfo(brandName,color,price,quantity,isAvailable,material,keyCount,isMetal,shopName,discount,shape,weight,design);

		Keychain.keychainInfo("Wildcraft","Blue",149,1,true,"Plastic",2,false,"Reliance",5,"Square",35,"Star");
	}
}