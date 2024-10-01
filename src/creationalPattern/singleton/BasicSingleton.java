package creationalPattern.singleton;

public class BasicSingleton {
    private static BasicSingleton instance;

    // private 생성자 : 인스턴스 여러개 생성 방지
    private BasicSingleton() {}

    public static BasicSingleton getInstance() {
        if (instance == null) {
            // 인스턴스가 없을 경우에만 인스턴스 생성
            instance = new BasicSingleton();
        }
        return instance;
    }
		
		//메모리주소 출력 메소드
    public void showAddress() {
     System.out.println("Singleton instance's address : " + this); 
     }
}
