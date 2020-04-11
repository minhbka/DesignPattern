package behavior.command.bank;

public class Client {
    public static void main(String[] args){
        System.out.println("This is Client");

        Account account = new Account("Minhpv");

        Command open = new OpenAccount(account);
        Command close = new CloseAccount(account);

        BankApp bankApp = new BankApp(open, close);

        bankApp.clickOpenAccount();
        bankApp.clickCloseAccount();

    }
}
