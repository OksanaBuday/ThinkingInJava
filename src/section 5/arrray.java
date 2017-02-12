package section

/**
 * Created by Oksana on 12.02.2017.
 */
public class arrray {
    static void f ( int required, String... trailing) {
        System.out.println("necessarily: " + required + " " );
        for (String s : trailing)
            System.out.println(s + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        f(1, "one");
        f (2, "two");
        f(0);
    }
}
//шо за фігня?