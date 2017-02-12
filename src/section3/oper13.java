package section3;

/**
 * Created by Oksana on 07.02.2017.
 */
public class oper13 {
    public static void main(String[] args) {
        char c = 'f';
        System.out.println(Integer.toBinaryString(c));
        c <<= 'f';
        System.out.println(Integer.toBinaryString(c));
        c >>>= -'f';
        System.out.println(Integer.toBinaryString(c));
    }
}