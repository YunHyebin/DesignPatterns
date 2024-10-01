package structuralPattern.proxy;

//Service: 실제 DB쿼리를 처리하는 클래스
public class RealDBService implements DBService{

	@Override
	public void query(String sql) {
		System.out.println("Executing query: " + sql);		
	}

}
