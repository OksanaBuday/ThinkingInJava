package section4

public class my19a {
    public static void main(String[] args){

        int i = 0x124;
        int b = 0x233;

        int d = ( i == 0x123 && b == 0x234  ) ? i*10: b*100;
        System.out.println( "Resoult: " + d);
            int r = ( i != 0x123 || b != 0x234  ) ? i*1: b*10;
            System.out.println( "Resoult: " + r);
}


    }
