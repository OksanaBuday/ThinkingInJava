package section

/**
 * Created by Oksana on 10.02.2017.
 */
public class finalize10 {
    private int i;
    protected void finalize () throws Throwable {
        System.out.println(i);
    }

    public static void main(String[] args) {
        int i = 4;
        finalize10 b = new finalize10();
        b.i = 5;
        System.out.println(b.i);
    }
}
