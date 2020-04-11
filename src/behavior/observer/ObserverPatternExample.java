package behavior.observer;

public class ObserverPatternExample {

    public static void main(String[] args){
        AccountService account1 = createAccount("minhpv@gmail.com", "127.0.0.1");
        account1.login();
        account1.changeStatus(LoginStatus.EXPIRED);

        System.out.println("----");
        AccountService account2 = createAccount("minhpv@gmail.com", "128.0.0.1");
        account2.login();
    }

    private static AccountService createAccount(String email, String ip){
        User user = new User();
        user.setEmail(email);
        user.setIp(ip);
        AccountService account = new AccountService(user);
        account.attach(new Logger());
        account.attach(new Mailer());
        account.attach(new Protector());
        return account;
    }
}
