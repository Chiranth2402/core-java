class MedicalStore{
	public static void store(String medicine,double price){
		System.out.println("Running store() in MedicalStore");

		if(medicine==null){
			System.out.println("Medicine is Invalid");
		}
		if(price<=0){
			System.out.println("Price is Invalid");
		}
	}
}