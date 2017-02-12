package section

/**
 * Created by Oksana on 10.02.2017.
 */
public class final10a {
    int i;
    public static void main(String[] args) {
            final10a g = new final10a();
            final10a m = new final10a();
            g.i = 12;
            System.gc();
            System.out.println(g.i);
        }
}
