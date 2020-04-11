package structural.facade.onlineshop;

public class Client {
    public static void main(String[] args) {
        ShopFacade.getInstance().buyProductByCashWithFreeShiping("minhpv@gmail.com");
        ShopFacade.getInstance().buyProductByPaypalWithStandardShipping("minhpv@gmail.com", "010.2222.3333");
    }
}
