package section

/**
 * Created by Oksana on 10.02.2017.
 */
public class my9 {
    int age;
    int height;

    public my9(int i, int b) {
        age = i;
        height = b;
    }

    public my9(int i) {
        this(i, i);
    }

    public my9() {
        this(0, 0);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "my9{" +
                "age=" + age +
                ", height=" + height +
                '}';
    }
}



