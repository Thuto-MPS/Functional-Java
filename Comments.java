public class Comments {
    public static void main(String[] args) {
        /* This is a multi-line comment.

         */
        int x = 5;
        int y = 2;
        //dividing x by y
        double div = x/y;
        //this won't work
        System.out.println(div);
        //casting x to double
        double accurateDiv =(double) x/y;
        //this looks better
        System.out.println(accurateDiv);

    }
}
