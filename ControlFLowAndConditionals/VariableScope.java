package ControlFLowAndConditionals;

public class VariableScope {
    public static void main(String[] args){

        boolean isLightGreen = true;
        boolean isREcyclable = true;

        if(isLightGreen) {
            //traffic light is green.
            int carSpeed = 100; //in km/hr
            System.out.println("Drive!");
            System.out.println("Speed is: " + carSpeed);
        }

        if(isREcyclable) {
            //item is recyclable
            double weight = 13.5;
            System.out.println("This is recyclable");
            System.out.println("Weighs: " + weight + ":kg");
        }
    }
}
