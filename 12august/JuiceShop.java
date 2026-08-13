class JuiceShop{
	public static double getPriceByJuiceName(String name){
		
		System.out.println("Running getPriceByJuiceName in JuiceShop dataType");
		
		System.out.println("Juice Name:"+name+" Juice");
		double appleJuicePrice=65.2;
		double grapesJuicPrice=20.2;
		double pomogranatePrice=52.22;
		double watermelonJuicePrice=40.2;
		double pineAppleJuice=30.25;
		
		if(name=="Apple"){
			System.out.println("You have selected an apple juice");
			return appleJuicePrice;
		}
		else if(name=="Grapes"){
			System.out.println("You have selected a Grapes Juice");
			return grapesJuicPrice;
		}
		else if(name=="Pomogranate"){
			System.out.println("You have selected a Pomogranate Juice");
			return pomogranatePrice;
		}
		else if(name=="WaterMelon"){
			System.out.println("You have selected a Watermelon Juice");
			return watermelonJuicePrice;
		}
		else if(name=="PineApple"){
			System.out.println("You have selected a PineApple Juice");
			return pineAppleJuice;
		}
		return 0;
	}
}

		