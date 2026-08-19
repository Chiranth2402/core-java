class CaptainFinderRunneer{
	public static void main(String[] args){
		
		String[] captainAndViceCaptainOfIndia=CaptainFinder.getCaptainAndViceCaptain("India");
		System.out.println("The length of the array is:"+captainAndViceCaptainOfIndia.length);
		
		
		String[] captainAndViceCaptainOfAustrelia=CaptainFinder.getCaptainAndViceCaptain("Austrelia");
		System.out.println("The length of the array is:"+captainAndViceCaptainOfAustrelia.length);
	}
}
		