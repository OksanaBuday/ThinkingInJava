package section4

/**
 * Created by Oksana on 08.02.2017.
 */
public class WhileTest {
    static boolean contition () {
        boolean result = Math.random() < 0.99;
        System.out.println( result + ", ");
        return result;
    }
    public static void main(String[] args) {
        while (contition())
            System.out.println("Inside 'while'");
        System.out.println("Exited 'while' ");
    }
}

