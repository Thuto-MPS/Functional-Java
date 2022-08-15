package ControlFLowAndConditionals;

public class LogicalOperators {
    public static void main(String[] args) {
        /*Logical Operators bafethu
         */
        int ticketPrice = 10;
        int age = 15;
        boolean isStudent = false;

        if(age <= 15 || age > 60 || isStudent) {
            ticketPrice = 5;
        } else {
            ticketPrice = 10;
        }
        System.out.println(ticketPrice);
    }
}
