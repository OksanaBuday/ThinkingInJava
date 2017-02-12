package D;

/**
 * Created by Oksana on 21.01.2017.
 */
public class D {
    private int height;
    private int weight;

    public D (int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public D() {
    }

    public void One(int a, int b) {System.out.println(a + b);}
    public void Two (int a, int b) {System.out.println(a*b);}

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "D{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}




