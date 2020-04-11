package structural.facade.mobileshop;

public class FacadePattenClient {
    private static int choice;
    public static void main(String[] args){
        ShopKeeper shopKeeper = new ShopKeeper();
        shopKeeper.iphoneSale();
        shopKeeper.samsungSale();
    }
}
