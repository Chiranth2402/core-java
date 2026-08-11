class StreetLight{
	public static void streetLightinfo(String loaction,double height){
		System.out.println("The Loaction of the Street is:"+loaction);
		System.out.println("The height of the street light is:"+height+" feet");
	}
	public static void main(String... args){
		String loaction="MarathHalli";
		double height=5.5;
		StreetLight.streetLightinfo(loaction,height);//explicit
		
		StreetLight.streetLightinfo("HopeFarm",5.6);//implicit
	}
}
