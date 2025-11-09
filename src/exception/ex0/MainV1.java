package exception.ex0;

import java.util.Scanner;

public class MainV1 {

    public static void main(String[] args) {
//        NetworkServiceV1_1 networkService = new NetworkServiceV1_1();
//        NetworkServiceV1_2 networkService = new NetworkServiceV1_2();
        NetworkServiceV1_3 networkService = new NetworkServiceV1_3();
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
문제점
//- 연결이 실패하면 데이터를 전송하지 않아야 되는데, 여기서는 데이터가 전송됨.
//
//개선사항
//- 오류가 발생했을 때 어떤 오류가 발생했는지 자세한 내역을 남기면 이후 디버깅에 도움이 될 것 같다.
//  오류 로그를 남기자.

//- 사용 후 반드시 disconnect()를 호출해서 연결을 해제 해야 하는데, 그것이 안되고 있다.
 */