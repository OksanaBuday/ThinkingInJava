package section

import java.util.Arrays;

/**
 * Created by Oksana on 12.02.2017.
 */
public class array17 {
    public String name;

    public array17(String name) {
        this.name = name;

    }

    public static void main(String[] args) {
        String [] name;
        name = new String[] { "kate", "jec", "bul"};


        System.out.println("names:" + Arrays.toString(name));

    }


}
