class Logo{
	public static void logoInfo(String logoName,double logoSize,double logoPrice,boolean isWaterProof,String logoColor){
		System.out.println("Logo name is:"+logoName);
		System.out.println("Logo Size is:"+logoSize+" sq cm");
		System.out.println("Logo Price:$"+logoPrice);
		System.out.println("Is Logo whater proof:"+isWaterProof);
		System.out.println("The logo color is :"+logoColor);
	}
	public static void main(String... main){
		
		String logoName = "Adidas";
        double logoSize = 10.0;
        double logoPrice = 399.50;
        boolean isWaterproof = false;
        String logoColor = "White";
		
		Logo.logoInfo(logoName, logoSize, logoPrice, isWaterproof, logoColor);
		
		Logo.logoInfo("Nike", 12.5, 499.99, true, "Black");
	}
}
		
		