package section4

/**
 * Created by Oksana on 08.02.2017.
 */
public class my20 {
    static int test (int testval, int begin, int end) {

        if (testval >= begin)
            return +2;
        else if (testval <= begin)
            return +3;
        else if (testval >= end)
            return +4;
        else if (testval <= end)
            return -1;
        return testval;
    }
    public static void main(String[] args) {
        System.out.println(test(4,5, 4));

    }


    }


