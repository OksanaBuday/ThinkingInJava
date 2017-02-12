package section4

import java.util.Random;

/**
 * Created by Oksana on 08.02.2017.
 */
public class my22 {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i =0; i< 30; i++){
            int c = rand.nextInt(26) + 'a';
            System.out.println((char)c + ", " + c + ":");
            switch (c) {
                case 'a' :
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("голосна");
                    break;
                case 'y':
                case 'w':
                    System.out.println("умовно голосна");

                    default:
                        System.out.println("приголосна");
            }
        }
    }

}
