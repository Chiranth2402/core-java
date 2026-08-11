class Highway{

	public static void travel(String highwayName,double distance,int speedLimit,boolean toll,String destination){
		System.out.println("Highway Details");
		System.out.println("Highway Name: "+highwayName);
		System.out.println("Distance: "+distance+" km");
		System.out.println("Speed Limit: "+speedLimit+" kmph");
		System.out.println("Toll Available: "+toll);
		System.out.println("Destination: "+destination);
			
		if(speedLimit<=0){
			System.out.println("Invalid Data, speed should not be zero or nagative");
			}
		else{
			System.out.println("Valid Data");
			
		}
	}
}