package structuralPattern.proxy;

//Service :Proxy와 Service 클레스가 구현하는 공통 인터페이스
public interface DBService {
	void query(String sql);

}
