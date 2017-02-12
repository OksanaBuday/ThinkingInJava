package Shop;

/**
 * Created by Oksana on 01.01.2017.
 */
public class Shop {
        String name;
        String breand;
        int prise;

    public Shop(String name, String breand, int prise) {
    this.name = name;
    this.breand = breand;
    this.prise = prise;
    }

    public String getName () { return name;}
    public String getBreand () {return breand;}
    public int getPrise () {return prise;}
}