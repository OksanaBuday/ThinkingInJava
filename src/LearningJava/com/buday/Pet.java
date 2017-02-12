package LearningJava.com.buday;

/**
 * Created by Oksana on 30.12.2016.
 */
public class Pet {
    int age;
    float height;
    String name;

    public Pet(String name, int age, float height) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public String getInfoAboutPet() {
        return  " age: " + age, " height: " + height, "name: " + name}
}
