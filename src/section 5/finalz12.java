package section

/**
 * Created by Oksana on 10.02.2017.
 */
public class finalz12 {
    public static void main(String[] args) {
        Tank tank1 = new Tank();
        tank1 = null;

        Tank tank2 = new Tank(2);
        Tank tank3 =  new Tank(3);
        tank2=tank1;
        System.gc();

    }
}
class Tank {
    private int number;

    public Tank(int number) {
        this.number = number;
    }

    public Tank() {

    }

    protected void finalize () throws Throwable {
        try{
            System.out.println("kaput" + number);
        }
        finally {
            super.finalize();
        }
    }
}