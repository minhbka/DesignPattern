package structural.facade.mobileshop;

public class Blackberry implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println("Blackberry Mercury");
    }

    @Override
    public void price() {
        System.out.println("899USD");
    }
}
