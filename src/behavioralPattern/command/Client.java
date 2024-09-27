package behavioralPattern.command;

public class Client {
    public static void main(String[] args) {
        // Receiver 생성 (쉐프)
        Chef chef = new Chef();

        // Concrete Command 생성 (음식 주문)
        OrderCommand pastaOrder = new FoodOrder(chef, "Pasta");
        OrderCommand burgerOrder = new FoodOrder(chef, "Burger");

        // Invoker 생성 (웨이터)
        Waiter waiter = new Waiter();

        // 주문 접수 및 처리
        waiter.takeOrder(pastaOrder);
        waiter.takeOrder(burgerOrder);

        // 모든 주문을 쉐프에게 전달
        waiter.placeOrders();
    }
}
