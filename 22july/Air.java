class Air {
    public static void main(String[] args) {

        String type = "Fresh Air";
        String color = "Colorless";
        String smell = "Odorless";
        double oxygen = 21.0;
        double nitrogen = 78.0;
        double carbonDioxide = 0.04;
        boolean visible = false;
        String state = "Gas";
        double temperature = 27.0;
        String location = "Earth";

        System.out.println("Air Details");
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Smell: " + smell);
        System.out.println("Oxygen: " + oxygen + "%");
        System.out.println("Nitrogen: " + nitrogen + "%");
        System.out.println("Carbon Dioxide: " + carbonDioxide + "%");
        System.out.println("Visible: " + visible);
        System.out.println("State: " + state);
        System.out.println("Temperature: " + temperature + " °C");
        System.out.println("Location: " + location);
    }
}