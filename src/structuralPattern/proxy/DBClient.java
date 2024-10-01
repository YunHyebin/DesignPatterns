package structuralPattern.proxy;

//Client: Proxy를 통해 Service객체에 접근하는 클래스
public class DBClient {

	public static void main(String[] args) {
		DBService proxyWithAccess = new DBServiceProxy(true);
		proxyWithAccess.query("SELECT * FROM users"); // 권한이 있는 경우

		DBService proxyWithoutAccess = new DBServiceProxy(false);
		proxyWithoutAccess.query("DELETE FROM users"); // 권한이 없는 경우
	}
}