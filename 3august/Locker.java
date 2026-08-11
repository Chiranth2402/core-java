class Locker{
    public static void lockerInfo(String lockerBrand,String lockerColor,double lockerPrice,int lockerNumber,boolean isLocked,String lockerMaterial,int keyCount,boolean hasPassword,String shopName,int warrantyYears,String lockerSize,int capacity){
		System.out.println("Locker Brand:"+lockerBrand);
		System.out.println("Locker Color:"+lockerColor);
		System.out.println("Locker Price:"+lockerPrice);
		System.out.println("Locker Number:"+lockerNumber);
		System.out.println("Is Locked:"+isLocked);
		System.out.println("Locker Material:"+lockerMaterial);
		System.out.println("Key Count:"+keyCount);
		System.out.println("Has Password:"+hasPassword);
		System.out.println("Shop Name:"+shopName);
		System.out.println("Warranty Years:"+warrantyYears);
		System.out.println("Locker Size:"+lockerSize);
		System.out.println("Capacity:"+capacity);
	}
	public static void main(String[] args){

		String lockerBrand="Godrej";
		String lockerColor="Grey";
		double lockerPrice=15000;
		int lockerNumber=101;
		boolean isLocked=true;
		String lockerMaterial="Steel";
		int keyCount=2;
		boolean hasPassword=true;
		String shopName="Reliance";
		int warrantyYears=5;
		String lockerSize="Medium";
		int capacity=50;

		Locker.lockerInfo(lockerBrand,lockerColor,lockerPrice,lockerNumber,isLocked,lockerMaterial,keyCount,hasPassword,shopName,warrantyYears,lockerSize,capacity);

		Locker.lockerInfo("Ozone","Black",12000,102,false,"Iron",3,false,"Metro",3,"Small",40);
	}
}
