package section3;

public class oper14a {
    public static void main(String[] args) {
        String name = "Byl";
        int age = 15;

        oper14 Men = new oper14();
        Men.age = 30;
        Men.name = "Jon";
        oper14 Women = new oper14();
        Women.age = 25;
        Women.name = " Kate";
        if ( name == "Jon" && age == 30 )
            System.out.println(" Men");
        else  if ( name == "Kate" && age == 25)
            System.out.println( "Women");
        else  if ( name != "jon" & name != "Kate" || age != 30 & age != 25)
            System.out.println("Dog");

    }


 }
