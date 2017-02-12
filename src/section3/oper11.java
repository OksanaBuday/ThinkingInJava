package section3;

/**
 * Created by Oksana on 07.02.2017.
 */
public class oper11 {
    public static void main(String[] args) {
        int i = -0x23;
        System.out.println(Integer.toBinaryString(i));
        i >>=-0x23;
        System.out.println(Integer.toBinaryString(i));
    }
}
