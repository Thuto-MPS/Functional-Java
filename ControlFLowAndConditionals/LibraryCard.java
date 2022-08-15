package ControlFLowAndConditionals;

public class LibraryCard {
    public static void main(String[] args) {
        boolean passport = false;
        boolean birthCertificate = true;
        boolean driversLicense = true;

        if (passport) {
            System.out.println("A passport is a valid ID.");
        } else if (birthCertificate) {
            System.out.println("A birth certificate is a valid ID.");
        } else if (driversLicense) {
            System.out.println("a driver's license is a valid ID");
        } else {
            System.out.println("Invalid ID. YOur application is denied");
        }

    }

}
