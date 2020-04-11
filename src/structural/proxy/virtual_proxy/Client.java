package structural.proxy.virtual_proxy;

public class Client {
    public static void main(String[] args){
        System.out.println("Init proxy image");
        ProxyImage proxyImage = new ProxyImage("https://avatars2.githubusercontent.com/u/22513525?s=400&u=e1a1a4921b99e38921ccfcce2990cf498c7b5d22&v=4");

        System.out.println("----");
        System.out.println("Call real service 1st");
        proxyImage.showImage();

        System.out.println("----");
        System.out.println("Call real service 2nd");
        proxyImage.showImage();
    }
}
