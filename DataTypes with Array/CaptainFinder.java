class CaptainFinder{
	public static String[] getCaptainAndViceCaptain(String counrtyName){
		
		System.out.println("Running getCaptainAndViceCaptain in CaptainFinder");
		System.out.println("Country Name:"+counrtyName);
		
		
		if(counrtyName=="India"){
			
			System.out.println("You have selected India, Here are the Captain and vice Captain");
			
			String[] indianCaptianAndViceCaptian={"Shubman Gill","KL Rahul"};
			
			return indianCaptianAndViceCaptian;
			
		}
		else if(counrtyName=="Austrelia"){
			System.out.println("You have selected Austrelia, Here are the Captain and vice Captain");
			
			String[] austrelianCaptianAndViceCaptian={"Pat Cummins", "Mitchell Marsh"};
			
			return austrelianCaptianAndViceCaptian;
		}
		else if(counrtyName=="England"){
			System.out.println("You have selected England, Here are the Captain and vice Captain");
			
			String[] englandCaptianAndViceCaptian={"Ben Stokes", "Ollie Pope"};
			
			return englandCaptianAndViceCaptian;
		}
		else if(counrtyName=="New zeeland"){
			System.out.println("You have selected New zeeland, Here are the Captain and vice Captain");
			
			String[] newZeeLandCaptianAndViceCaptian={"Tom Latham", "Mitchell Santner"};
			
			return newZeeLandCaptianAndViceCaptian;
		}
		else if(counrtyName=="South Africa"){
			System.out.println("You have selected South Africa, Here are the Captain and vice Captain");
			
			String[] southAfricanCaptianAndViceCaptian={"Temba Bavuma", "Aiden Markram"};
			
			return southAfricanCaptianAndViceCaptian;
		}
		else if(counrtyName=="Sri lanka"){
			System.out.println("You have selected sri lanka, Here are the Captain and vice Captain");
			
			String[] sriLankanCaptianAndViceCaptian={"Charith Asalanka", "Kusal Mendis"};
			
			return sriLankanCaptianAndViceCaptian;
		}
		else if(counrtyName=="Afganisthan"){
			System.out.println("You have selected Afganisthan, Here are the Captain and vice Captain");
			
			String[] afganisthanCaptianAndViceCaptian={"Rashid Khan", "Hashmatullah Shahidi"};
			
			return afganisthanCaptianAndViceCaptian;
		}
		else if(counrtyName=="Bangladesh"){
			System.out.println("You have selected Bangladesh, Here are the Captain and vice Captain");
			
			String[] bangladeshiCaptianAndViceCaptian={"Najmul Hossain Shanto", "Mehidy Hasan Miraz"};
			
			return bangladeshiCaptianAndViceCaptian;
		}
		else if(counrtyName=="West Indies"){
			System.out.println("You have selected West Indies, Here are the Captain and vice Captain");
			
			String[] westIndiesCaptianAndViceCaptian={"Rovman Powell", "Shai Hope"};
			
			return westIndiesCaptianAndViceCaptian;
		}
		else if(counrtyName=="Pakisthan"){
			System.out.println("You have selected Pakisthan, Here are the Captain and vice Captain");
			
			String[] pakisthaniCaptianAndViceCaptian={"Babar Azam", "Mohammad Rizwan"};
			
			return pakisthaniCaptianAndViceCaptian;
		}
		
		String[] empty={};
		return empty;
	}
}		