package section3;

public class Dog{
        public static void main(String[] args) {
            Dog5 spot = new Dog5();
            Dog5 scruffy = new Dog5();
            spot.name = "spot";
            spot.says = "hav-hav";
            spot.alias = "hry";
            scruffy.name = "scruffy";
            scruffy.says = "by";
            System.out.println("Dog1: " + spot.name + ", say: " + spot.says);
            System.out.println(spot.name==spot.alias);
            System.out.println(spot.name.equals(spot.alias));
            System.out.println("Dog2: " + scruffy.name + ", say: " + scruffy.says);
             }

    }
