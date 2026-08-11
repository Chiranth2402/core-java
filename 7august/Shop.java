class Shop {

    public static double getPriceByName(String name) {

        System.out.println("Running getPriceByName in Shop");

        if (name != null) {
			System.out.println("Vegetable name is valid ");
			
            if (name == "Onion") {
                return 25;
            }
            else if (name == "Potato") {
                return 30;
            }
            else if (name == "Tomato") {
                return 15;
            }
            else if (name == "Chilli") {
                return 80;
            }
            else if (name == "Garlic") {
                return 250;
            }
		}
        else {
            System.out.println("Vegetable name is Invalid");
           
        }
		return 0;
    }
}
