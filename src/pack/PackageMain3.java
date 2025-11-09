package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
/*
패키지 규칙
1. 패키지의 이름과 위치는 폴더(디렉터리) 위치와 같아야 한다. (필수)
2. 패키지의 이름은 모두 소문자로 사용한다. (관례)
3. 패키지 이름의 앞 부분에는 일반적으로 회사의 도메인 이름을 거꾸로 사용한다.
    - com.company.myapp 과 같이 사용한다. (관례)
    - 수 많은 외부 라이브러리가 함께 사용되면 같은 패키지에 같은 클래스 이름이 존재할 수도 있다.
      이렇게 도메인 이름을 거꾸로 사용하면 이런 문제를 방지할 수 있다.
    - 오픈소스나 라이브러리를 만들어서 외부에 제공한다면 꼭 지키는 것이 좋다.
 */