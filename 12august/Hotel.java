class Hotel{
	public static int getPriceByFoodItemAndType(String name,String type){
		
		System.out.println("Running getPriceByFoodItemAndType in Hotel Data Type");
		
		System.out.println("Food Name:"+name);
		System.out.println("Food Type:"+type);
		
		
		
		int nonVegBiriyaniPrice=200;
		int vegBiriyaniPrice=150;
		
		if(name=="Biriyani"){
			if(type=="Veg"){
				System.out.println("You have selected the Veg Biriyani");
				return vegBiriyaniPrice;
			}
			else if(type=="Non Veg"){
				System.out.println("You have selected the Non Veg Biriyani");
				return nonVegBiriyaniPrice;
			}
		}
		
		int nonVegFriedRicePrice=150;
		int vegFriedRicePrice=120;
		
		if(name=="Fried Rice"){
			if(type=="Veg"){
				System.out.println("You have selected the Veg Fried Rice");
				return vegFriedRicePrice;
			}
			else if(type=="Non Veg"){
				System.out.println("You have selected the Non Veg Fried Rice");
				return nonVegFriedRicePrice;
			}
		}
		
		int nonVegSamosaPrice=40;
		int vegSamosaPrice=20;
		
		if(name=="Samosa"){
			if(type=="Veg"){
				System.out.println("You have selected the Veg Samosa");
				return vegSamosaPrice;
			}
			else if(type=="Non Veg"){
				System.out.println("You have selected the Non Veg Samosa");
				return nonVegSamosaPrice;
			}
		}
		
		return 0;
	}
}

		
		
				
				