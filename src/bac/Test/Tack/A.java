package bac.Test.Tack;

/**
 * Created by Oksana on 04.01.2017.
 */
public class A {
 int weight;
 int height;

    public A(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public A() {
    }

    public void One(int a, int b){
        System.out.println(a+b);
    }
    public void Two(int a, int b){
        System.out.println(a*b);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "A{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
