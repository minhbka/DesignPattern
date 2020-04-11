package structural.facade.mobileshop;

public class Iphone implements MobileShop{
    @Override
    public void modelNo() {
        System.out.println("Iphone 11 Pro-Max");
    }

    @Override
    public void price() {
        System.out.println("1199USD");
    }
}
