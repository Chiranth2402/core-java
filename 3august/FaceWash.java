class FaceWash{
	public static void faceWashInfo(String brand,double netQuantity,double price,String deliveryStatus){
		System.out.println("The brand of the Face wash is:"+brand);
		System.out.println("Net Quantity of the Face Wash is:"+netQuantity+" ml");
		System.out.println("The Price of the Face wash is $:"+price);
		System.out.println("Delivery Staus of the facewash:"+deliveryStatus);
	}
	public static void main(String... args){
		String brand="Garniar Men";
		double netQuantity=100;
		double price=300;
		String deliveryStatus="Delivered";
		
		FaceWash.faceWashInfo(brand,netQuantity,price,deliveryStatus);
		
		FaceWash.faceWashInfo("Magic Ghar",125,250,"Out for delivery");
	}
}