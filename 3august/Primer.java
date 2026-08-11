class Primer{
	public static void primerName(String name){
		System.out.println("The name of the Primer is:"+name);
	}
	public static void main(String... values){
		String name="Asian paint primer";
		Primer.primerName(name);//explicit
		
		Primer.primerName("Burger paint primer");//implicit
	}
}
