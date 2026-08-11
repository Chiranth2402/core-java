class SalesRunner{
	public static void main(String[] args){
		
		double cost=Sales.getCostByProductName("Pressure cooker");
		System.out.println("Cost:"+cost);
		System.out.println();
		
		double weight=Sales.getWeightByProductNameAndBrand("Pressure cooker","Butterfly");
		System.out.println("Weight:"+weight+" KG");
		System.out.println();
		
		double warranry=Sales.getWarrantyByProductNameAndBrand("Pressure cooker","Butterfly");
		System.out.println("Warranty:"+warranry+" Months");
		System.out.println();
		
		
	}
}