class Hostel{
	public static void hostelDetails(String hostelName,int numberOfStudents,boolean wifiAvailability, double fees,String wardenName){
		System.out.println("Hostel Details:");
		System.out.println("Hostel Name:"+hostelName);
		System.out.println("Number of Students:"+numberOfStudents);
		System.out.println("Is Wifi Available:"+wifiAvailability);
		System.out.println("Hostel Fees:"+fees);
		System.out.println("Hostel Warden Name:"+wardenName);
		
		if(numberOfStudents<=0){
			System.out.println("Invalid Data, Number of students should be more than 1 in a Hostel");
		}
        else{
             System.out.println("Valid Data");
		}
	}
}
	