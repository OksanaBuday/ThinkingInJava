package for1;

/**
 * Created by Oksana on 23.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human("Yar",20);

        System.out.println(human);
        human.setName("GNOM");
        human.setAge(70);
        human.setAge(human.getAge()/4);
        System.out.println(human);


    }
}
