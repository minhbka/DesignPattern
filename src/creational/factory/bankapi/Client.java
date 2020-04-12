package creational.factory.bankapi;

public class Client {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.IBKBANK);
        System.out.println(bank.getBankName());

        Bank bank1 = BankFactory.getBank(BankType.WOORIBANK);
        System.out.println(bank1.getBankName());
    }
}
