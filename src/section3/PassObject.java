package section3;

public class PassObject {
   static void f(Letter y) {
       y.c = 'z';
   }
   public static void main(String[] args) {
       Letter x = new Letter();
       x.c = 'a';
       System.out.println(" 1 : y.c : " + x.c);
       f(x);
       System.out.println(" 2 : y.c : " + x.c);
   }
}
