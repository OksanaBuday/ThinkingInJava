package section

/**
 * Created by Oksana on 11.02.2017.
 */
public class Cup13 {
    public Cup13( int marker) {
        System.out.println("Cup( " + marker + ")");
    }
    void f (int marker){
        System.out.println("f (" + marker + ")");
    }
}
class Cups {
    static Cup13 cup1;
    static  Cup13 cup2;
    static {
        cup1 = new Cup13(1);
        cup2 = new Cup13(2);
    }

    public Cups() {
        System.out.println("Cups () ");
    }
}
