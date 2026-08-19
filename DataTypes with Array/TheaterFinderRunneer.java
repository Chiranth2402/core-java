class TheaterFinderRunneer{
	public static void main(String[] args){
		
		String[] theatersOfNavagraha=TheaterFinder.getTheaterByMovieName("Navagraha");
		System.out.println("The length of the array is:"+theatersOfNavagraha.length);
		
		
		String[] theatersOfKantara=TheaterFinder.getTheaterByMovieName("Kantara");
		System.out.println("The length of the array is:"+theatersOfKantara.length);
		
		
		String[] theatersOfKGF=TheaterFinder.getTheaterByMovieName("KGF");
		System.out.println("The length of the array is:"+theatersOfKGF.length);
		
		
		String[] theatersOfToxic=TheaterFinder.getTheaterByMovieName("Toxic");
		System.out.println("The length of the array is:"+theatersOfToxic.length);
	}
}