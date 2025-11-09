package exception.ex0;

import java.util.Scanner;

public class MainV0 {

    public static void main(String[] args) {
        NetworkServiceV0 networkService = new NetworkServiceV0();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자: ");
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }

        System.out.println("프로그램을 정상 종료합니다.");
    }
}
/*
예외 처리가 필요한 이유
- 외부 서버와 통신할 때는 다음과 같은 다양한 문제들이 발생한다.
  - 외부 서버와 연결에 실패한다. (네트워크 오류 등등)
  - 데이터 전송에 문제가 발생한다.
- 오류 상황을 강제 발생해서 상황을 지켜보자

오류 상황 시뮬레이션
- NetworkClientV1
- NetworkServiceV1_1
- MainV1

1. 연결 실패 : 사용자가 입력하는 문자에 "error1" 단어가 있으면 연결에 실패, 오류코드는 "connectError"
2. 전송 실패 : 사용자가 입력하는 문자에 "error2" 단어가 있으면 전송에 실패, 오류코드는 "sendError"
 */