package structural.facade.mobileshop;

public class Samsung implements MobileShop{
    @Override
    public void modelNo() {
        System.out.println("Samsung galaxy Note 10");
    }

    @Override
    public void price() {
        System.out.println("999USD");
    }
}
