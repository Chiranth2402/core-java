class GirakiRunner{
	public static void main(String[] args){
		System.out.println("Running kondko(),kaldaku(),mobile() from GirakiRunner class");
		
		Giraki.kondko();
		
		String vastu="Mobile";
		String yavaga="Ivathu";
		
		System.out.println("Kaleda Vasthuvina Vivara");
		System.out.println("Running kaldaku() from GirakiRunner class");
		Giraki.kaldaku(vastu,yavaga);
		
		System.out.println("Running mobile() from GirakiRunner class");
		
		Giraki.mobile("Samsung","Galaxy",180000,true);
		
	}
}
