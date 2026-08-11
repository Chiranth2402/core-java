class TailorShopRunner{
	public static void main(String... args){
		
		String dressType="Shirt";
		double width=2.5;
		String material="Cotton";
		String pattern="Full sleeves with double Side pockets";
		int price=-100;
		boolean iron=true;
		String date="August 15";
		double time=3;
		
		TailorShop.stitch(dressType, width,material,pattern,price,iron,date,time);
	}
}
