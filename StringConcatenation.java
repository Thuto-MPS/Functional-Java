public class StringConcatenation {
    public static void main(String[] args) {
        String billionaireFirstName;
        billionaireFirstName = "Bill";
        String billionaireLastName;
        billionaireLastName = "Gates";
        String billionaireFullName = billionaireFirstName + " " + billionaireLastName;
        System.out.println(billionaireFullName);

        int stops;
        int fare;
        stops = 0;
        fare = 0;
        stops = stops + 1;
        fare = fare + 5;
        stops = stops + 1;
        fare = fare + 3;
        stops = stops + 1;
        fare = fare + 7;
        System.out.println("The bus made R"+fare+ " after " + stops + " stops.");

    }
}
