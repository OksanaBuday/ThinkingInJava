package section3;

public class Assignment {
    public static void main(String[] args) {
        my2 m1 = new my2 ();
        my2 m2 = new my2 ();
        m1.level = 9;
        m2.level = 32;
        System.out.println("1: m1.level: " + m1.level + " , m2.level: " + m2.level);
        m1 = m2;
        System.out.println(" 2: m1.level: " + m1.level + " , m2.level: " + m2.level);
        m1.level = 27;
        System.out.println( " 3: m1.level: " + m1.level + " , m2.level: " + m2.level);
    }
}
