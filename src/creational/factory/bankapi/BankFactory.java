package creational.factory.bankapi;

public class BankFactory {
    private BankFactory(){

    }

    public static final Bank getBank(BankType bankType){
        switch (bankType){
            case IBKBANK:
                return new IBKBank();
            case WOORIBANK:
                return new WooriBank();
            case KOOKMINBANK:
                return new KookminBank();

            default:
                throw new IllegalArgumentException("This bank is unsupported");
        }
    }
}
