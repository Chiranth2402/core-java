class TailorShop{
	public static void stitch(String dressType,double width,String material,String pattern,int price,boolean iron,String date,double time){
		System.out.println("Stitch Details:");
		System.out.println("Dress Type:"+dressType);
		System.out.println("Cloth Width:"+width);
		System.out.println("Cloth Material:"+material);
		System.out.println("Dress Pattern:"+pattern);
		System.out.println("Stitching Price:"+price);
		System.out.println("Is Cloth is Iron:"+iron);
		System.out.println("Date:"+date);
		System.out.println("Stitching Duration:"+time+" days");
		
		if(price<0){
			System.out.println("Invalid Data, price shoul not be 0 or negative, enter valid price");
		}
		else{
			System.out.println("Valid Data");
		}
	}
}
