package section

/**
 * Created by Oksana on 12.02.2017.
 */
public class array19 {
    static void Test ( int v []) {
        System.out.println(" к-сть елементів: " + v.length + ", зміст: ");
        for (int x : v)
            System.out.println(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int n1[] = {10};
        int n2[] = {1,2,3 };
        int n3[] = { };
        Test(n1);
        Test(n2);
        Test(n3);
    }
    }
