// stack overflow example:
class Bullet{
	static void bulletPrice(){
		System.out.println("The price of the bullet is $500");
		fuelType();
	}
	static void fuelType(){
		System.out.println("The fule type of the bullet is Petrol");
		 bulletPrice();
	}
	public static void main(String[] args){
		bulletPrice();
		fuelType();
	}
}
