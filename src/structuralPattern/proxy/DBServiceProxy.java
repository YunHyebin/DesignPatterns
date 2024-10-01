package structuralPattern.proxy;

//Proxy: Service객체에 대한 접근을 제어하는 클래스
//Proxy는 Service 호출을 가로채거나 접근을 제어한다.
public class DBServiceProxy implements DBService {
	private RealDBService service;
	private boolean hasAccess;

	public DBServiceProxy(boolean hasAccess) {
		this.hasAccess = hasAccess;
	}

	@Override
	public void query(String sql) { //접근 제어
		if (hasAccess) {
			if (service == null) {
				service = new RealDBService(); // lazy initialization
			}
			service.query(sql);
		} else {
			System.out.println("Access denied: insufficient permissions to execute query.");
		}
	}
}
