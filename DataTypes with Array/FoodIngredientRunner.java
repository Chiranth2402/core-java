class FoodIngredientRunner{
	public static void main(String[] args){
		
	    String[] numberOfIngredientsToMakeBiriyani=FoodIngredient.findIngredientsByFood("Biriyani");
		System.out.println("The Number of Ingredients are:"+numberOfIngredientsToMakeBiriyani.length);
		
		
	    String[] numberOfIngredientsToMakeJamoon=FoodIngredient.findIngredientsByFood("Jamoon");
		System.out.println("The Number of Ingredients are:"+numberOfIngredientsToMakeJamoon.length);
		
		
	    String[] numberOfIngredientsToMakeGobi=FoodIngredient.findIngredientsByFood("Gobi");
		System.out.println("The Number of Ingredients are:"+numberOfIngredientsToMakeGobi.length);
		
		
	    String[] numberOfIngredientsToMakeFriedRice=FoodIngredient.findIngredientsByFood("Fried Rice");
		System.out.println("The Number of Ingredients are:"+numberOfIngredientsToMakeFriedRice.length);
		}
}