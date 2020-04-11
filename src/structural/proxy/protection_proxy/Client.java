package structural.proxy.protection_proxy;

public class Client {
    public static void main(String[] args){
        UserService admin = new UserServiceProxy("minhpv", "admin");
        admin.load();
        admin.insert();

        UserService customer = new UserServiceProxy("customer", "guest");
        customer.load();
        customer.insert();
    }
}
