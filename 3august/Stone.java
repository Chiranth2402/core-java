class Stone{
	public static void stoneInfo(String stoneName,double stoneWeight,int stonePrice,char stoneGrade,boolean isNatural,String stoneColor,int stoneQuantity){
		System.out.println("Stone Name:"+stoneName);
		System.out.println("Stone Weight:"+stoneWeight);
		System.out.println("Stone Price:"+stonePrice);
		System.out.println("Stone Grade:"+stoneGrade);
		System.out.println("Is Natural:"+isNatural);
		System.out.println("Stone Color:"+stoneColor);
		System.out.println("Stone Quantity:"+stoneQuantity);
	}
	public static void main(String[] args){
		String stoneName="Granite";
		double stoneWeight=12.5;
		int stonePrice=850;
		char stoneGrade='A';
		boolean isNatural=true;
		String stoneColor="Black";
		int stoneQuantity=25;

		Stone.stoneInfo(stoneName,stoneWeight,stonePrice,stoneGrade,isNatural,stoneColor,stoneQuantity);

		Stone.stoneInfo("Marble",8.2,1200,'B',true,"White",15);
	}
}