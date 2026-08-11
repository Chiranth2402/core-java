class You{
	public static void sendMessage(){
		String from="Chiranth";
		String to="Yashwanth";
		String message="Hii Brother,How are you";
		
		System.out.println("Running send () from You class");
		
		Message.send(from,to,message);
	}
}
