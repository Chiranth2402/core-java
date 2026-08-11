class Theater{
	public static void book(String movieName,int quantity,String screen,boolean discount,boolean orderSnacks){
		System.out.println("Booking a Movie Ticket");
		System.out.println("Movie Name:"+movieName);
		System.out.println("Ticket Quantity:"+quantity);
		System.out.println("Screen:"+screen);
		System.out.println("Discount applaid:"+discount);
		System.out.println("Can Order Snacks:"+orderSnacks);
		
		
		if(quantity <= 10){
			
			System.out.println("Invalid Data,You cannot book more than 10 Tickets");
		}
		else{
			System.out.println("Valid Data");
		}
	}
}