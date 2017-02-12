package section

/**
 * Created by Oksana on 12.02.2017.
 */
public class array19str {
    static void Test ( String name []) {
    System.out.println(" к-сть елементів: " + name.length + ", зміст: ");
    for ( String  x : name)
        System.out.println(x + " ");
    System.out.println();
}

    public static void main(String[] args) {
        String n1[] = {"kate"};
        String n2[] = {"kate","jon","jec", "bul" };
        String n3[] = { };
        Test(n1);
        Test(n2);
        Test(n3);
    }
}
