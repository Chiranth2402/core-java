class FoodIngredient{
	public static String[] findIngredientsByFood(String foodName){
		System.out.println("Running findIngredientsByFood in FoodIngredient");
		
		System.out.println("Food Name:"+foodName);
		if(foodName == "Biriyani"){
			System.out.println("You have selected the Biriyani, Here are the ingredients to make biriyani");
			String[] biriyaniIngredients={"Oil","Ghee","Onion","Salt","Termeric","Tamoto","Spices","Rice","Chicken","Mint Leaves",
			"Coriender Leaves"};
			return biriyaniIngredients;
		}
	    else if(foodName=="Jamoon"){
			System.out.println("You have selected the Jamoon, Here are the ingredients to make Jamoon");
			String[] jamoonIngredients={"Oil","Ghee","Milk","Maida","Sugar","Cardomom","Water"};
			return jamoonIngredients;
		}
		else if(foodName == "Gobi"){
			System.out.println("You have selected the Gobi, Here are the ingredients to make Gobi");
			String[] gobiIngredients={"Oil","Cabbage","CornFlour","Maida","Chilly Powder","Souce"};
			return gobiIngredients;
		}
		else if(foodName == "Fried Rice"){
			System.out.println("You have selected the Fried Rice, Here are the ingredients to make Fried Rice");
			String[] friedRiceIngredients={"Oil","Onion","Chilly","Masala","Cabbage","Carrot","Beans","Egg","Rice","salt",
			"Salt","CoreinderLeaves"};
			return friedRiceIngredients;
		}
		String[] empty={};
		return empty;
	}
}