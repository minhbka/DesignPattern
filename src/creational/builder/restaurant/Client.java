package creational.builder.restaurant;

public class Client {
    public static void main(String[] args) {
        Order order = new FastFoodOrderBuilder()
                .orderType(OrderType.ON_SITE)
                .orderBread(BreadType.FRIED_EGG)
                .build();

        System.out.println(order);
    }
}
