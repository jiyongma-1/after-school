package access.b;

import access.a.AccessData;

class A {}
class B {}
//public class c {}

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출 - 가능
        data.publicField = 1;
        data.publicMethod();

        // 다른 패키지 내에서 default 호출 - 불가
//        data.defaultField = 2;
//        data.defaultMethod();

        // private 호출 - 불가
//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess();
    }
}
