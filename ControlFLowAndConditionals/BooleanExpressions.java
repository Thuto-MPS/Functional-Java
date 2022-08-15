package ControlFLowAndConditionals;

public class BooleanExpressions {
    public static void main(String[] args) {
        //boolean variables can be directly assigned:
        boolean b1 = true;
        boolean b2 = false;

        //or calculated with tests like comparisons
        boolean b3 = 3 < 5; //true 3 is less than 5
        System.out.println(b3);

        boolean b4 = 3 > 4; //false because 3 is not greater than 4
        System.out.println(b4);

        int x = 10;
        boolean b5 = x >= 10;
        System.out.println(b5);
        boolean b6 = x == 5;
        System.out.println(b6);

    }
}
