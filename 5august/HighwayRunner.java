class HighwayRunner{
	public static void main(String[] args){

		String highwayName="NH-75";
		double distance=185.5;
		int speedLimit=-80;
		boolean toll=true;
		String destination="Mangaluru";

		Highway.travel(highwayName,distance,speedLimit,toll,destination);
	}
}