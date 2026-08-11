class BusTicket{
	public static void book(String from,String to,int age,String address,int pincode,String paymentType,String bookingLocation){
		System.out.println("Bus Ticket Booking Details:");
		System.out.println("From:"+from);
		System.out.println("To:"+to);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
		System.out.println("Pincode:"+pincode);
		System.out.println("Payment Type:"+paymentType);
		System.out.println("Booking Location:"+bookingLocation);
		
		if(age<3 || age>100){
			System.out.println("Invalid Data,You Cannot travell in the bus");
		}
		else{
			System.out.println("Valid Data");
		}
	}
}
