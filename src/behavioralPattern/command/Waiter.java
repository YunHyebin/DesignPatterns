package behavioralPattern.command;
import java.util.ArrayList;
import java.util.List;

//Waiter(Invoker) : Command 요청 객체를 실행시키는 역할
//Client가 특정 작업을 요청하면 Waiter는 Chef에게 요청을 직접 보내는 대신 Command를 실행시키킨다.
public class Waiter {
    private List<OrderCommand> orderQueue = new ArrayList<>();

    public void takeOrder(OrderCommand order) {
        orderQueue.add(order);
        System.out.println("Waiter: Order received and added to queue.");
    }

    public void placeOrders() {
        System.out.println("Waiter: Placing all orders...");
        for (OrderCommand order : orderQueue) {
            order.execute();
        }
        orderQueue.clear();
    }
}
