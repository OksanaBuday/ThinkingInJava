package section

public class array20 {

    static void OutputCurrencies (String[] arr ) {
        for (String x : arr) {
            System.out.println(" content: " + x);
        }
    }

    static void OutputCurrenciesEnum () {
        for (Currencies x : Currencies.values()) {
            System.out.println(" content: " + x + ", ordinal = " + x.ordinal());
        }
    }

    static void OutputFromSwitch(Currencies curr) {
        switch (curr){
            case EUR:
                System.out.println("Euro, baby!");
                break;
            case USD:
                System.out.println("We are all living in America!");
                break;
            default:
                System.out.println("Forget about all the other currencies!");
        }
    }

    public static void main(String[] args) {
        String n[] = {"UA", "USD", "EUR", "PLN", "RUB", "AUD"};
        OutputCurrencies(n);
        System.out.println("--------");
        OutputCurrenciesEnum();
        System.out.println("--------");
        OutputFromSwitch(Currencies.AUD);
        OutputFromSwitch(Currencies.EUR);
        OutputFromSwitch(Currencies.USD);
    }
}