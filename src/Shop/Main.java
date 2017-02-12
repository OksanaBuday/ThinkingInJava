package Shop;

/**
 * Created by Oksana on 01.01.2017.
 */
public class Main {
    public static void main(String [] args) {
        Shop Jim = new Shop( "Jim", "puma", 5 );

        String h = Jim.getName();
        System.out.println(h);
        String g = Jim.getBreand();
        System.out.println(g);
        int b = Jim.getPrise();
        System.out.println(b);
    }

}
