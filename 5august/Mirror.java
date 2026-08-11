class Mirror{
	public static void reflect(String shape,double height,String frameColor,boolean forWall,int price){
		System.out.println("Mirror Details");
		System.out.println("Shape: "+shape);
		System.out.println("Height: "+height+" feet");
		System.out.println("Frame Color: "+frameColor);
		System.out.println("Wall Mounted: "+forWall);
		System.out.println("Price: "+price);
			
		if(price<=0){
			System.out.println("Invalid Data, price should be zero or nagative");
		}
		else{
			System.out.println("Valid Data");
		}
	}
}