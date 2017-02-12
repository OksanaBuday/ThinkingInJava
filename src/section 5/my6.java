package section

/**
 * Created by Oksana on 09.02.2017.
 */
public class my6 {
    private String name;
    private int age;

    public my6 ( String name, int age) {
        this.name = name;
        this.age = age;
    }

    public my6() {

    }

    public void A (String name, int age) {
        System.out.println( name + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "my2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}











