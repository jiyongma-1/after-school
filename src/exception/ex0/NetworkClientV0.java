package exception.ex0;

public class NetworkClientV0 {

    private final String address;

    public NetworkClientV0(String address) {
        this.address = address;
    }

    public String connect() {
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    public String send(String data) {
        System.out.println(address + " 서버에 데이버 전송: " + data);
        return "success";
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }
}
/*
예외 처리가 필요한 이유
사용자의 입력을 받고, 입력 받은 문자를 외부 서버에 전송하는 프로그램
실제 통신 코드를 구현하지 않고, 예외 처리가 필요한 상황을 이해하는데 중점을 둠.
 */
