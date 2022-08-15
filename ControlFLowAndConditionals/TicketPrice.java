package ControlFLowAndConditionals;

public class TicketPrice {
    public static void main(String[] args) {
        int ticketPrice = 10;
        int age = 20;
        boolean isStudent = false;

        if (age <= 15) {
            //age is less than or equal to 15
            ticketPrice = 5;
        } else if (age > 60) {
            ticketPrice = 5;
        } else if (isStudent) {
            ticketPrice = 5;
        } else {
            ticketPrice = 10;
        }
        System.out.println(ticketPrice);
    }


}
