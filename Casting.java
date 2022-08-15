public class Casting {
    public static void main(String[] args) {
        /* The following code estimates the number
        of students that will sign up for a course. */
        double currentStudents = 17;
        double rateOfGrowth = 1.5;
        double futureStudents = currentStudents * rateOfGrowth;
        System.out.println(futureStudents);
        int approximation = (int) futureStudents; //converts double to int
        System.out.println(approximation);

        //Casting
        int x = 5;
        int y = 2;
        double div = x/y;
        System.out.println(div);
        double accurateDiv =(double) x/y;
        System.out.println(accurateDiv);
    }
}
