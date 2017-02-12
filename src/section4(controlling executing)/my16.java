package section4

import java.util.Random;

/**
 * Created by Oksana on 08.02.2017.
 */
public class my16 {
    public static void main(String[] args) {
            Random number = new Random();
            for (int i =1; i<= 25; i++) {
                int iNumber = number.nextInt(25);
                System.out.println("i:" + iNumber);
            }

            Random number1 = new Random();
                for (int d =1; d<= 25; d++)
                {
                    int iNumber = number1.nextInt(25);
                    System.out.println("d: " + iNumber);
                }

    }
}
