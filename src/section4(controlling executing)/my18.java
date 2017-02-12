package section4

/**
 * Created by Oksana on 08.02.2017.
 */
public class my18 {
    public static void main(String[] args) {
        boolean isPrime = true;
        int n = 7;
        for (int i = 2; i < n; i++)
            if ((n % i) == 0) {
                isPrime = false;
                continue;
            }
        if (isPrime) System.out.println(n+ ", Proste");
        else System.out.println("ne proste");
    }
}
