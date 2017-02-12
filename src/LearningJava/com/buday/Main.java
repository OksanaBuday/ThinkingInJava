package LearningJava.com.buday;

public class Main {

    public static void main(String[] args) {

        // write your code here
        Pet jerry = new Pet("jerry", 5, 10);
        float h = jerry.getHeight();
        System.out.println(h);
        String jerryAsString = jerry.getInfoAboutPet();
        System.out.println(jerryAsString);
    }
}
