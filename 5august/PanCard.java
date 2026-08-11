class PanCard{
	public static void apply(String firstName,String lastName,String middleName,char gender,String dob,long mobileNumber,String address,String email){
		
		System.out.println("Pan Card Application");
		System.out.println("First Name:"+firstName);
		System.out.println("Last Name:"+lastName);
		System.out.println("Middle Name:"+middleName);
		System.out.println("Gender:"+gender);
		System.out.println("Date of Birth:"+dob);
		System.out.println("Mobile Number:"+mobileNumber);
		System.out.println("Address:"+address);
		System.out.println("Email:"+email);
		
		if(gender=='M'||gender=='F'||gender=='O'||gender=='m'||gender=='f'||gender=='o'){
			
			System.out.println("Valid Data");
		}
		else{
			System.out.println("Invalid Data, Enter M/F/O/m/f/r");
		}
	}
}

		
		