package section3;

public class Jec {
    static void f(Men x) {
       x.height = '2';
    }
    public static void main(String[] args) {
        Men y = new Men();
        y.height = '6';
        System.out.println("1: y.height : " + y.height );
        f( y );
        System.out.println("2: y.height : " + y.height);
    }

}
