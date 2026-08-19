class DistrictFinderRunner{
	public static void main(String[] args){
		
		String[] numberOfDistrictsInKarnataka=DistrictFinder.findDistrictsByStateName("Karnataka");
		System.out.println("The Number of District in Karnataka are:"+numberOfDistrictsInKarnataka.length);
		
		
		String[] numberOfDistrictsInUttarPradesh=DistrictFinder.findDistrictsByStateName("Uttar Pradesh");
		System.out.println("The Number of District in Karnataka are:"+numberOfDistrictsInUttarPradesh.length);
		
		
	}
}