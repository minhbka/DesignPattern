package creational.factory.bankapi;

public class IBKBank implements Bank{

    @Override
    public String getBankName() {
        return "기업은행";
    }
}
