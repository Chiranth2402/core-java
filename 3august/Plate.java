class Plate{
	public static void plateInfo(String plateType,double plateDiameter,int quantity){
		System.out.println("The type of the plate is:"+plateType);
		System.out.println("The Diametyer of the plate is :"+plateDiameter+" CM");
		System.out.println("There are "+quantity+" plates in the rack");
	}
	public static void main(String... args){
		String plateType="Steel";
		double plateDiameter=2.5;
		int quantity=5;
		
		Plate.plateInfo(plateType,plateDiameter,quantity);
		
		Plate.plateInfo("Plastic",2.8,9);
	}
}
