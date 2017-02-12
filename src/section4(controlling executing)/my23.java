package section4

/**
 * Created by Oksana on 09.02.2017.
 */
public class my23 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int n = 11;

        System.out.println(a + "" + b);
        int fib ;
        int i = 2;
        while (i < n) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.println("fib: " + fib);
            i++;
/*
        int a=0;
        int b =1;
        int c =0;
        for (int i=0; i<10;i++){
        a=b;
        b=c;
        c=a+b;
            System.out.println(c);
 */
        }
    }
}



