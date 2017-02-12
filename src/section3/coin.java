package section3;

public class coin{
    public static void main(String[] args) {
        int figure = 10;
        String prize = null;

        if (figure == 10 || figure == 15  )
        {
            prize = "cat";
        }

        else if (figure != 10 || figure !=15 ){
            prize = "not prize";
        }
        System.out.println( "Resoult: " + prize);
    }

}
