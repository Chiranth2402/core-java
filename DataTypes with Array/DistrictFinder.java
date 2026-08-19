class DistrictFinder{
	public static String[] findDistrictsByStateName(String stateName){
		
		System.out.println("Running findDistrictsByStateName in DistrictFinder");
		System.out.println("State Name:"+stateName);
		
		
		if(stateName == "Karnataka"){
			System.out.println("You have selected karnataka, Here are the Districts");
			
			String[] karnatakasDistricts={"Bagalkote", "Ballari", "Belagavi", "Bengaluru Rural", "Bengaluru Urban",
			"Bidar", "Chamarajanagar", "Chikkaballapur", "Chikkamagaluru", "Chitradurga", "Dakshina Kannada", 
			"Davanagere", "Dharwad", "Gadag", "Hassan", "Haveri", "Kalaburagi", "Kodagu", "Kolar", "Koppal",
			"Mandya", "Mysuru", "Raichur", "Ramanagara", "Shivamogga", "Tumakuru", "Udupi", "Uttara Kannada", 
			"Vijayanagara", "Vijayapura", "Yadgir"};
			
			return karnatakasDistricts;
			
		}
		else if(stateName == "Andhra Pradesh"){
			System.out.println("You have selected Andhra Pradesh, Here are the Districts");
			
			String[] andhraPradeshDistricts={"Alluri Sitharama Raju", "Anakapalli", "Anantapuramu", "Annamayya", 
			"Bapatla","Chittoor", "Dr. B.R. Ambedkar Konaseema", "East Godavari", "Eluru", "Guntur", "Kakinada", 
			"Krishna", "Kurnool", "NTR", "Nandyal", "Palnadu", "Parvathipuram Manyam", "Prakasam", 
			"Sri Potti Sriramulu Nellore", "Sri Sathya Sai", "Srikakulam", "Tirupati", "Visakhapatnam", 
			"Vizianagaram", "West Godavari", "YSR Kadapa"};
			
			return andhraPradeshDistricts;
			
		}
		else if(stateName == "Arunachal Pradesh"){
			System.out.println("You have selected Arunachal Pradesh, Here are the Districts");
			
			String[] arunachalPradeshDistricts={"Anjaw", "Bichom", "Changlang", "Dibang Valley", "East Kameng", 
			"East Siang", "Itanagar", "Kamle", "Keyi Panyor", "Kra Daadi", "Kurung Kumey", "Lepa Rada", "Lohit",
			"Longding", "Lower Dibang Valley", "Lower Siang", "Lower Subansiri", "Namsai", "Pakke Kessang", 
			"Papum Pare", "Shi Yomi", "Siang", "Tawang", "Tirap", "Upper Siang", "Upper Subansiri", "West Kameng", 
			"West Siang"};
			
			return arunachalPradeshDistricts;
		}
		
		else if(stateName == "Assam"){
			System.out.println("You have selected Assam, Here are the Districts");
			
			String[] assamsDistricts={"Bajali", "Baksa", "Barpeta", "Biswanath", "Bongaigaon", "Cachar", "Charaideo",
			"Chirang", "Darrang", "Dhemaji", "Dhubri", "Dibrugarh", "Dima Hasao", "Goalpara", "Golaghat", 
			"Hailakandi", "Hojai", "Jorhat", "Kamrup", "Kamrup Metropolitan", "Karbi Anglong", "Kokrajhar",
			"Lakhimpur", "Majuli", "Morigaon", "Nagaon", "Nalbari", "Sivasagar", "Sonitpur", "South Salmara-Mankachar",
			"Sribhumi", "Tamulpur", "Tinsukia", "Udalguri", "West Karbi Anglong"};
			
			return assamsDistricts;
		}
		else if(stateName == "Bihar"){
			System.out.println("You have selected Bihar, Here are the Districts");
			
			String[] biharsDistricts={"Araria", "Arwal", "Aurangabad", "Banka", "Begusarai", "Bhagalpur", "Bhojpur", 
			"Buxar", "Darbhanga", "East Champaran", "Gaya", "Gopalganj", "Jamui", "Jehanabad", "Kaimur", "Katihar", 
			"Khagaria", "Kishanganj", "Lakhisarai", "Madhepura", "Madhubani", "Munger", "Muzaffarpur", "Nalanda", "Nawada", 
			"Patna", "Purnia", "Rohtas", "Saharsa", "Samastipur", "Saran", "Sheikhpura", "Sheohar", "Sitamarhi", "Siwan", 
			"Supaul", "Vaishali", "West Champaran"};
			
			return biharsDistricts;
		}
		else if(stateName == "Chhattisgarh"){
			System.out.println("You have selected Chhattisgarh, Here are the Districts");
			
			String[] chhattisgarhsDistricts={"Balod", "Baloda Bazar-Bhatapara", "Balrampur-Ramanujganj", "Bastar", 
			"Bemetara", "Bijapur", "Bilaspur", "Dantewada", "Dhamtari", "Durg", "Gariaband", "Gaurela-Pendra-Marwahi",
			"Janjgir-Champa", "Jashpur", "Kabirdham", "Kanker", "Khairagarh-Chhuikhadan-Gandai", "Kondagaon", 
			"Korba", "Korea", "Mahasamund", "Manendragarh-Chirmiri-Bharatpur", "Mohla-Manpur-Ambagarh Chowki",
			"Mungeli", "Narayanpur", "Raigarh", "Raipur", "Rajnandgaon", "Sakti", "Sarangarh-Bilaigarh", "Sukma", 
			"Surajpur", "Surguja"};
			
			return chhattisgarhsDistricts;
		}
		else if(stateName == "Goa"){
			System.out.println("You have selected Goa, Here are the Districts");
			
			String[] goasDistricts={"North Goa", "South Goa"};
			
			return goasDistricts;
		}
		else if(stateName == "Gujarat"){
			System.out.println("You have selected Gujarat, Here are the Districts");
			
			String[] gujaratsDistricts={"Ahmedabad", "Amreli", "Anand", "Aravalli", "Banaskantha", "Bharuch", 
			"Bhavnagar", "Botad", "Chhota Udepur", "Dahod", "Dang", "Devbhumi Dwarka", "Gandhinagar", 
			"Gir Somnath", "Jamnagar", "Junagadh", "Kheda", "Kutch", "Mahisagar", "Mehsana", "Morbi", 
			"Narmada", "Navsari", "Panchmahal", "Patan", "Porbandar", "Rajkot", "Sabarkantha", "Surat", 
			"Surendranagar", "Tapi", "Vadodara", "Valsad"};
			
			return gujaratsDistricts;
		}
		else if(stateName == "Haryana"){
			System.out.println("You have selected Haryana, Here are the Districts");
			
			String[] haryanasDistricts={"Ambala", "Bhiwani", "Charkhi Dadri", "Faridabad", "Fatehabad", 
			"Gurugram", "Hisar", "Jhajjar", "Jind", "Kaithal", "Karnal", "Kurukshetra", "Mahendragarh",
			"Nuh", "Palwal", "Panchkula", "Panipat", "Rewari", "Rohtak", "Sirsa", "Sonipat", "Yamunanagar"};
			
			return haryanasDistricts;		
		}
		else if(stateName == "Himachal Pradesh"){
			System.out.println("You have selected Himachal Pradesh, Here are the Districts");
			
			String[] himachalPradeshDistricts={"Bilaspur", "Chamba", "Hamirpur", "Kangra", "Kinnaur", "Kullu", 
			"Lahaul and Spiti", "Mandi", "Shimla", "Sirmaur", "Solan", "Una"};
			
			return himachalPradeshDistricts;
		}
		else if(stateName == "Jharkhand"){
			System.out.println("You have selected Jharkhand, Here are the Districts");
			
			String[] jharkhandsDistricts={"Bokaro", "Chatra", "Deoghar", "Dhanbad", "Dumka", "East Singhbhum", 
			"Garhwa", "Giridih", "Godda", "Gumla", "Hazaribagh", "Jamtara", "Khunti", "Koderma", "Latehar",
			"Lohardaga", "Pakur", "Palamu", "Ramgarh", "Ranchi", "Sahibganj", "Seraikela Kharsawan", "Simdega", 
			"West Singhbhum"};
			
			return jharkhandsDistricts;
		}
		else if(stateName == "Kerala"){
			System.out.println("You have selected Kerala, Here are the Districts");
			
			String[] keralasDistrict={"Alappuzha", "Ernakulam", "Idukki", "Kannur", "Kasaragod", 
			"Kollam", "Kottayam", "Kozhikode", "Malappuram", "Palakkad", "Pathanamthitta", 
			"Thiruvananthapuram", "Thrissur", "Wayanad"};
			
			return keralasDistrict;
		}
		else if(stateName == "Madhya Pradesh"){
			System.out.println("You have selected Madhya Pradesh, Here are the Districts");
			
			String[] madyaPradeshDistricts={"Agar Malwa", "Alirajpur", "Anuppur", "Ashoknagar", "Balaghat", 
			"Barwani", "Betul", "Bhind", "Bhopal", "Burhanpur", "Chhatarpur", "Chhindwara", "Damoh", "Datia", 
			"Dewas", "Dhar", "Dindori", "Guna", "Gwalior", "Harda", "Indore", "Jabalpur", "Jhabua", "Katni", 
			"Khandwa", "Khargone", "Maihar", "Mandla", "Mandsaur", "Mauganj", "Morena", "Narmadapuram", "Narsinghpur", 
			"Neemuch", "Niwari", "Pandhurna", "Panna", "Raisen", "Rajgarh", "Ratlam", "Rewa", "Sagar", "Satna", "Sehore", 
			"Seoni", "Shahdol", "Shajapur", "Sheopur", "Shivpuri", "Sidhi", "Singrauli", "Tikamgarh", "Ujjain", "Umaria", 
			"Vidisha"};
			
			return madyaPradeshDistricts;	
		}
		else if(stateName == "Maharashtra"){
			System.out.println("You have selected Maharashtra, Here are the Districts");
			
			String[] maharashtrasDistricts={"Ahmednagar", "Akola", "Amravati", "Beed", "Bhandara", "Buldhana", "Chandrapur", 
			"Chhatrapati Sambhajinagar", "Dharashiv", "Dhule", "Gadchiroli", "Gondia", "Hingoli", "Jalgaon", "Jalna", 
			"Kolhapur", "Latur", "Mumbai City", "Mumbai Suburban", "Nagpur", "Nanded", "Nandurbar", "Nashik", "Palghar", 
			"Parbhani", "Pune", "Raigad", "Ratnagiri", "Sangli", "Satara", "Sindhudurg", "Solapur", "Thane", "Wardha", 
			"Washim", "Yavatmal"};
			
			return maharashtrasDistricts;
		}
		else if(stateName == "Manipur"){
			System.out.println("You have selected Manipur, Here are the Districts");
			
			String[] manipuraDistricts={"Bishnupur", "Chandel", "Churachandpur", "Imphal East", "Imphal West", "Jiribam",
			"Kakching", "Kamjong", "Kangpokpi", "Noney", "Pherzawl", "Senapati", "Tamenglong", "Tengnoupal", "Thoubal",
			"Ukhrul"};
			
			return manipuraDistricts;
			
		}
		else if(stateName == "Meghalaya"){
			System.out.println("You have selected Meghalaya, Here are the Districts");
			
			String[] meghalayaDistricts={"East Garo Hills", "East Jaintia Hills", "East Khasi Hills", "Eastern West Khasi Hills",
			"North Garo Hills", "Ri-Bhoi", "South Garo Hills", "South West Garo Hills", "South West Khasi Hills",
			"West Garo Hills", "West Jaintia Hills", "West Khasi Hills"};
			
			return meghalayaDistricts;
		}
		else if(stateName == "Mizoram"){
			System.out.println("You have selected Mizoram, Here are the Districts");
			
			String[] mizoramsDistricts={"Aizawl", "Champhai", "Hnahthial", "Khawzawl", "Kolasib", "Lawngtlai",
			"Lunglei", "Mamit", "Saiha", "Saitual", "Serchhip"};
			
			return mizoramsDistricts;
		}
		else if(stateName == "Nagaland"){
			System.out.println("You have selected Nagaland, Here are the Districts");
			
			String[] nagalandDistricts={"Chümoukedima", "Dimapur", "Kiphire", "Kohima", "Longleng", "Meluri", "Mokokchung", 
			"Mon", "Niuland", "Noklak", "Peren", "Phek", "Shamator", "Tseminyü", "Tuensang", "Wokha", "Zünheboto"};
			
			return nagalandDistricts;
		}
		else if(stateName == "Odisha"){
			System.out.println("You have selected Odisha, Here are the Districts");
			
			String[] odishasDistricts={"Angul", "Balangir", "Balasore", "Bargarh", "Bhadrak", "Boudh", "Cuttack", 
			"Deogarh", "Dhenkanal", "Gajapati", "Ganjam", "Jagatsinghpur", "Jajpur", "Jharsuguda", "Kalahandi",
			"Kandhamal", "Kendrapara", "Kendujhar", "Khordha", "Koraput", "Malkangiri", "Mayurbhanj", "Nabarangpur", 
			"Nayagarh", "Nuapada", "Puri", "Rayagada", "Sambalpur", "Subarnapur", "Sundargarh"};
			
			return odishasDistricts;
		}
		else if(stateName == "Punjab"){
			System.out.println("You have selected Panjab, Here are the Districts");
			
			String[] panjabsDistricts={"Amritsar", "Barnala", "Bathinda", "Faridkot", "Fatehgarh Sahib", "Fazilka", "Ferozepur",
			"Gurdaspur", "Hoshiarpur", "Jalandhar", "Kapurthala", "Ludhiana", "Malerkotla", "Mansa", "Moga", 
			"Pathankot", "Patiala", "Rupnagar", "Sahibzada Ajit Singh Nagar", "Sangrur", "Shahid Bhagat Singh Nagar",
			"Sri Muktsar Sahib", "Tarn Taran"};
			
			return panjabsDistricts;
		}
		else if(stateName == "Rajasthan"){
			System.out.println("You have selected Rajasthan, Here are the Districts");
			
			String[] rajastrhanDtsricts={"Ajmer", "Alwar", "Balotra", "Banswara", "Baran", "Barmer", "Beawar", "Bharatpur", 
			"Bhilwara", "Bikaner", "Bundi", "Chittorgarh", "Churu", "Dausa", "Deeg", "Dholpur", "Didwana-Kuchaman", 
			"Dungarpur", "Hanumangarh", "Jaipur", "Jaisalmer", "Jalore", "Jhalawar", "Jhunjhunu", "Jodhpur", "Karauli",
			"Khairthal-Tijara", "Kota", "Kotputli-Behror", "Nagaur", "Pali", "Phalodi", "Pratapgarh", "Rajsamand",
			"Salumbar", "Sawai Madhopur", "Sikar", "Sirohi", "Sri Ganganagar", "Tonk", "Udaipur"};
			
			return rajastrhanDtsricts;
		}
		else if(stateName == "Sikkim"){
			System.out.println("You have selected Sikkim, Here are the Districts");
			
			String[] sikkinmsDistricts={"Gangtok", "Gyalshing", "Mangan", "Namchi", "Pakyong", "Soreng"};
			
			return sikkinmsDistricts;
			
		}
		else if(stateName == "Tamil Nadu"){
			System.out.println("You have selected Tamil Nadu, Here are the Districts");
			
			String[] tamilNadusDustricts={"Ariyalur", "Chengalpattu", "Chennai", "Coimbatore", "Cuddalore", 
			"Dharmapuri", "Dindigul", "Erode", "Kallakurichi", "Kanchipuram", "Kanniyakumari", "Karur", "Krishnagiri",
			"Madurai", "Mayiladuthurai", "Nagapattinam", "Namakkal", "Nilgiris", "Perambalur", "Pudukkottai",
			"Ramanathapuram", "Ranipet", "Salem", "Sivagangai", "Tenkasi", "Thanjavur", "Theni", "Thoothukudi", 
			"Tiruchirappalli", "Tirunelveli", "Tirupathur", "Tiruppur", "Tiruvallur", "Tiruvannamalai", 
			"Tiruvarur", "Vellore", "Viluppuram", "Virudhunagar"};
			
			return tamilNadusDustricts;
		}
		else if(stateName == "Telangana"){
			System.out.println("You have selected Telangana, Here are the Districts");
			
			String[] telanganasDistricts={"Adilabad", "Bhadradri Kothagudem", "Hanamkonda", "Hyderabad", "Jagtial", 
			"Jangaon", "Jayashankar Bhupalpally", "Jogulamba Gadwal", "Kamareddy", "Karimnagar", "Khammam", "Kumuram Bheem Asifabad",
			"Mahabubabad", "Mahabubnagar", "Mancherial", "Medak", "Medchal-Malkajgiri", "Mulugu", "Nagarkurnool", 
			"Nalgonda", "Narayanpet", "Nirmal", "Nizamabad", "Peddapalli", "Rajanna Sircilla", "Rangareddy", 
			"Sangareddy", "Siddipet", "Suryapet", "Vikarabad", "Wanaparthy", "Warangal", "Yadadri Bhuvanagiri"};
			
			return telanganasDistricts;			
		}
		else if(stateName == "Tripura"){
			System.out.println("You have selected Tripura, Here are the Districts");
			
			String[] tripurasDistricts={"Dhalai", "Gomati", "Khowai", "North Tripura", "Sipahijala", "South Tripura", 
			"Unakoti", "West Tripura"};
			
			return tripurasDistricts;
			
		}
		else if(stateName == "Uttar Pradesh"){
			System.out.println("You have selected Uttar Pradesh , Here are the Districts");
			
			String[] uttarPrdaeshDistrricts={"Agra", "Aligarh", "Ambedkar Nagar", "Amethi", "Amroha", "Auraiya", "Ayodhya", "Azamgarh", 
			"Baghpat", "Bahraich", "Ballia", "Balrampur", "Banda", "Barabanki", "Bareilly", "Basti", "Bhadohi", "Bijnor",
			"Budaun", "Bulandshahr", "Chandauli", "Chitrakoot", "Deoria", "Etah", "Etawah", "Ayodhya", 
			"Farrukhabad", "Fatehpur", "Firozabad", "Gautam Buddha Nagar", "Ghaziabad", "Ghazipur", "Gonda", 
			"Gorakhpur", "Hamirpur", "Hapur", "Hardoi", "Hathras", "Jalaun", "Jaunpur", "Jhansi", "Kannauj", 
			"Kanpur Dehat", "Kanpur Nagar", "Kasganj", "Kaushambi", "Kushinagar", "Lakhimpur Kheri", "Lalitpur",
			"Lucknow", "Maharajganj", "Mahoba", "Mainpuri", "Mathura", "Mau", "Meerut", "Mirzapur", "Moradabad", 
			"Muzaffarnagar", "Pilibhit", "Pratapgarh", "Prayagraj", "Raebareli", "Rampur", "Saharanpur",
			"Sambhal", "Sant Kabir Nagar", "Shahjahanpur", "Shamli", "Shravasti", "Siddharthnagar", "Sitapur", 
			"Sonbhadra", "Sultanpur", "Unnao", "Varanasi"};
			
			return uttarPrdaeshDistrricts;
			
		}
		else if(stateName == "Uttarakhand"){
			System.out.println("You have selected Uttarakhand , Here are the Districts");
			
			String[] uttarakhandDistricts={"Almora", "Bageshwar", "Chamoli", "Champawat", "Dehradun", "Haridwar", "Nainital",
			"Pauri Garhwal", "Pithoragarh", "Rudraprayag", "Tehri Garhwal", "Udham Singh Nagar", "Uttarkashi"};
			
			return uttarakhandDistricts;
			
		}
		else if(stateName == "West Bengal"){
			System.out.println("You have selected Uttarakhand , Here are the Districts");
			
			String[] westBengalsDistricts={"Alipurduar", "Bankura", "Birbhum", "Cooch Behar", "Dakshin Dinajpur", 
			"Darjeeling", "Hooghly", "Howrah", "Jalpaiguri", "Jhargram", "Kalimpong", "Kolkata", "Malda", 
			"Murshidabad", "Nadia", "North 24 Parganas", "Paschim Bardhaman", "Paschim Medinipur", "Purba Bardhaman", 
			"Purba Medinipur", "Purulia", "South 24 Parganas", "Uttar Dinajpur"};
			
			return westBengalsDistricts;
		}
		String[] empty={};
		return empty;
	}
}
