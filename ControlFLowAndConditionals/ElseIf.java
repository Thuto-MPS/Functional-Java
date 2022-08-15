package ControlFLowAndConditionals;

public class ElseIf {
    public static void main(String[] args) {
        boolean isLightGreen = false;
        boolean isLightYellow = true;

        if(isLightGreen) {
            //robot is green.
            System.out.println("Drive!");
        } else if(isLightYellow) {
            //light is NOT green but is yellow
            System.out.println("Slow down.");
        } else {
            //light is neither green nor yellow
            System.out.println("Stop!");
        }

    }
}
