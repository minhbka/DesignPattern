package creational.builder.bank;

public class Client {
    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount
                .BankAccountBuilder("Minhpv", "01012345678")
                .withEmail("minhpv@gmail.com")
                .wantNewsletter(true)
                .build();

        System.out.println(newAccount);
    }
}
