class HotelRunner{
	public static void main(String[] args){
		
		int nonVegSamosaPrice = Hotel.getPriceByFoodItemAndType("Samosa","Non Veg");
		System.out.println("Price:"+nonVegSamosaPrice);
		
		int nonVegBiriyaniPrice = Hotel.getPriceByFoodItemAndType("Biriyani","Non Veg");
		System.out.println("Price:"+nonVegBiriyaniPrice);
		
		int nonVegFriedRicePrice = Hotel.getPriceByFoodItemAndType("Fried Rice","Non Veg");
		System.out.println("Price:"+nonVegFriedRicePrice);
		
		int VegSamosaPrice = Hotel.getPriceByFoodItemAndType("Samosa","Veg");
		System.out.println("Price:"+VegSamosaPrice);
		
		int vegBiriyaniPrice = Hotel.getPriceByFoodItemAndType("Biriyani","Veg");
		System.out.println("Price:"+vegBiriyaniPrice);
		
		int vegFriedRicePrice = Hotel.getPriceByFoodItemAndType("Fried Rice","Veg");
		System.out.println("Price:"+vegFriedRicePrice);
	}
}

		