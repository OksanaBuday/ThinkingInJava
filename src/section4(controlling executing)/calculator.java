package section4

/**
 * Created by Oksana on 09.02.2017.
 */
public class calculator {
    public static void main(String[] args) {
        double a = 3;
        double b =5;

         char operator = '*';
    double result = 0.0;

        switch (operator)  {
            case '+':  result = a+b; break;
            case '-':  result = a-b; break;
            case '*':  result = a*b; break;
        }
        System.out.println(result);
    }


}
