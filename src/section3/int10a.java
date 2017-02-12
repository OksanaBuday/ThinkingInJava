package section3;

public class int10a {
    public static void main(String[] args){

        int i = 0x123;
        int b = 0x234;

            if ( i == 0x123 || b == 0x234  )
                System.out.println( "Resoult: " +Integer.toBinaryString(i) + Integer.toBinaryString(b));

            else if ( i != 0x123  && b !=  0x234)
                System.out.println( "Resoult: " +Integer.toBinaryString(i) + Integer.toBinaryString(b));

            else if ( i != 0x123  || b !=  0x234)
                System.out.println( "Resoult: " +Integer.toBinaryString(i) + Integer.toBinaryString(b));
    }
}
