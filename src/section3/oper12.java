package section3;

/**
 * Created by Oksana on 07.02.2017.
 */
public class oper12 {
    public static void main(String[] args) {
        int i = 0x12 ;
        System.out.println(Integer.toBinaryString(i));
        i <<= -0x12;
        System.out.println(Integer.toBinaryString(i));
        i >>>= -0x12;
        System.out.println(Integer.toBinaryString(i));
        i = -1;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString( i>>>10));
    }
}
