class GeographyRunner{
	public static void main(String[] args){
		
		
		String capitalCity=Geography.getCapitalCityByCountryName("India");
		System.out.println("Capital City:"+capitalCity);
		System.out.println();
		
		
		int countryCode=Geography.getCountryCodeByCountryName("India");
		System.out.println("Country Code:+"+countryCode);
		System.out.println();
		
		long population=Geography.getPopulationByCountryName("India");
		System.out.println("Population:"+population);
		System.out.println();
		}
}


