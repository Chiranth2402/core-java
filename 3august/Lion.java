class Lion{
public static void lionInfo(String lionName,String lionColor,double lionWeight,int lionAge,boolean isWild,String lionHabitat,int lionSpeed,boolean isMale,String lionFood){
		System.out.println("Lion Name:"+lionName);
		System.out.println("Lion Color:"+lionColor);
		System.out.println("Lion Weight:"+lionWeight);
		System.out.println("Lion Age:"+lionAge);
		System.out.println("Is Wild:"+isWild);
		System.out.println("Lion Habitat:"+lionHabitat);
		System.out.println("Lion Speed:"+lionSpeed);
		System.out.println("Is Male:"+isMale);
		System.out.println("Lion Food:"+lionFood);
	}
	public static void main(String[] args){

		String lionName="Simba";
		String lionColor="Golden";
		double lionWeight=190.5;
		int lionAge=8;
		boolean isWild=true;
		String lionHabitat="Forest";
		int lionSpeed=80;
		boolean isMale=true;
		String lionFood="Deer";

		Lion.lionInfo(lionName,lionColor,lionWeight,lionAge,isWild,lionHabitat,lionSpeed,isMale,lionFood);

		Lion.lionInfo("Leo","Brown",210.0,10,true,"Grassland",85,true,"Buffalo");
	}
}