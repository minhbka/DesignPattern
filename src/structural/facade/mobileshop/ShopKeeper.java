package structural.facade.mobileshop;

public class ShopKeeper {
    private MobileShop iphone;
    private MobileShop blackberry;
    private MobileShop samsung;

    public ShopKeeper(){
        iphone = new Iphone();
        samsung = new Samsung();
        blackberry = new Blackberry();
    }
    public void iphoneSale(){
        iphone.modelNo();
        iphone.price();
    }

    public void samsungSale(){
        samsung.modelNo();
        samsung.price();
    }

    public void blackberrySale(){
        blackberry.modelNo();
        blackberry.price();
    }
}
