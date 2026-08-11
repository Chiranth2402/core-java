//static 
class Chair{
	static void chairType(){
		System.out.println("The type of the chair is Plastic");
	}
	void chairManufacturer(){
		System.out.println("The manufacturer of the Chair is Malnad chair company");
		chairType();
		
	}
	static void chairPrice(){
		System.out.println("The price of the chair is $20");
		//chairManufacturer();
		chairType();
	}
}
