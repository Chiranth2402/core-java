class OS {
    public static void main(String[] args) {

        String name = "Windows";
        String version = "11";
        String developer = "Microsoft";
        int releaseYear = 2021;
        String architecture = "64-bit";
        boolean openSource = false;
        double size = 5.2;
        String fileSystem = "NTFS";
        int users = 1500000000;
        String license = "Commercial";

        System.out.println("Operating System Details");
        System.out.println("Name: " + name);
        System.out.println("Version: " + version);
        System.out.println("Developer: " + developer);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Architecture: " + architecture);
        System.out.println("Open Source: " + openSource);
        System.out.println("Size: " + size + " GB");
        System.out.println("File System: " + fileSystem);
        System.out.println("Users: " + users);
        System.out.println("License: " + license);
    }
}