package structuralPattern.adapter.UsbAdapter;

//Client Interface 역할
//Client는 이 인터페이스를 사용하여 어댑티(서비스)에 요청을 보낸다.
public interface USBPort {
	void connectWithUSB();
}
