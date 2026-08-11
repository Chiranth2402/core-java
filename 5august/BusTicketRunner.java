class BusTicketRunner{
	public static void main(String[] args){
		
		String from="Davangere";
		String to="Bengalore";
		int age=22;
		String address="RajajiNagar";
		int pincode=560010;
		String paymentType="UPI";
		String bookingLocation="Mejestic";
		
		BusTicket.book(from,to,age,address,pincode,paymentType,bookingLocation);
		
		
	}
}
