package behavioralPattern.command;

//FoodOrder(ConcreteCommands): 실제 다양한 종류의 작업을 chef(receiver)를 호출하여 수행
public class FoodOrder implements OrderCommand {
    private Chef chef;
    private String dishName;

    public FoodOrder(Chef chef, String dishName) {
        this.chef = chef;
        this.dishName = dishName;
    }

    @Override
    public void execute() {
        chef.cook(dishName);
    }
}
