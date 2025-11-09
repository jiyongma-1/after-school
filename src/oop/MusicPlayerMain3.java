package oop;

public class MusicPlayerMain3 {
    public static void main(String[] args) {

        MusicPlayerData music = new MusicPlayerData();

        on(music);
        volumeUp(music);
        volumeUp(music);
        volumeDown(music);
        showStatus(music);
        off(music);

        /*
        각각의 기능을 메서드로 만들어서 각 기능이 모듈화 함.
        1. 중복 제거: 로직 중복이 제거 되었다 같은 로직이 필요하면 메서드를 호출.
        2. 변경 영향 범위: 기능을 수정할 때 해당하는 메서드만 수정하면 된다.
        3. 메서드 이름을 통해 코드를 좀 더 직관적으로 이해할수있다.

        절차 지향 프로그램의 한계
        1. 데이터와 기능이 분리되어있다
        2. 음악 플레이어 데이터는 음악 플레이어 데이터에 있는데 그 데이터를 사용하는 기능은 음악 플레이어3에 있다.
        3. 음악 플레이어와 관련된 데이터는 음악 플레이어 데이터를 사용해야 되고 음악 플레이어 관련 기능은 음악 플레이어3을 사용해야된다.
        4. 데이터와 기능을 분리하면 유지보수 관리 포인트가 늘어나 용이하지 않다.
            -> 관련 데이터가 변경 되면 음악 플레이어3 부분의 메서드들도 함께 변경해야 한다.
        */
    }

    static void on (MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off (MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp (MusicPlayerData data) {
        data.volume++;
        System.out.println("현재 볼륨: " + data.volume);
    }

    static void volumeDown (MusicPlayerData data) {
        data.volume--;
        System.out.println("현재 볼륨: " + data.volume);
    }

    static void showStatus (MusicPlayerData data) {
        System.out.println("음악 플레이어의 상태를 확인.");

        if (data.isOn) {
            System.out.println("음악 플레이어 On, 현재 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 Off, 현재 볼륨: " + data.volume);
        }
    }
}