package creationalPattern.singleton;

public class BasicMain {
    public static void main(String[] args) {
        BasicSingleton instance1 = BasicSingleton.getInstance();
        BasicSingleton instance2 = BasicSingleton.getInstance();
        BasicSingleton instance3 = BasicSingleton.getInstance();

        // 두 객체는 동일한 인스턴스 (메모리 주소가 동일)
        System.out.println(instance1 == instance2);  // Output: true
        instance1.showAddress();
        instance2.showAddress();
        instance3.showAddress();
    }
}