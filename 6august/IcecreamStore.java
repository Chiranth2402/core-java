class IcecreamStore{
	public static void save(String name,String flavour,int cost,char size,boolean cone,boolean cup){
		
		System.out.println("Running save() in IcecreamStore");
		
		if(name==null || name.isEmpty()){
			System.out.println("Name is Invalid");
		}
		if(flavour.isEmpty()){
			System.out.println("Flavour is Invalid");
		}
		if(cost<=0 || cost>601){
			System.out.println("Cost is Invalid");
		}
		if(size!='L' && size!='M' && size!='S'){
			System.out.println("Size is Invalid");
		}
		if(cone==false){
			System.out.println("Cone is Invalid");
		}
		if(cup==true){
			System.out.println("Cup is Invalid");
		}
	}
		
	public static void order(String name,String flavour,int quantity){
		
		System.out.println("Running order() in IcecreamStore");
		
		if(name==null){
			System.out.println("Name is Invalid");
		}
		if(flavour.isEmpty()||flavour==null){
			System.out.println("Flavor is Invalid");
		}
		if(quantity<=0){
			System.out.println("Quantity is Invalid");
		}
	}
}

