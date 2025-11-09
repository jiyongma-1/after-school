package oop;

public class MusicPlayerMain2 {
    public static void main(String[] args) {

        MusicPlayerData music = new MusicPlayerData();

        music.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        music.volume++;
        System.out.println("현재 볼륨: "+music.volume);

        music.volume++;
        System.out.println("현재 볼륨: "+music.volume);

        music.volume--;
        System.out.println("현재 볼륨: "+music.volume);

        if (music.isOn) {
            System.out.println("음악 플레이어 On, 현재 볼륨: " + music.volume);
        } else {
            System.out.println("음악 플레이어 Off, 현재 볼륨: " + music.volume);
        }

        music.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");

        /*
        음악 플레이어와 관련된 데이터는 음악 플레이어 데이터에 보관되어있음.
        데이터로 로직을 사용하도록 했다.
        프로그램 로직이 더 다양해져 복잡해져도 음악 플레이어와 관련된 변수들은
        객체 내에 존재하므로 관리하기 쉬워진다.
        */

    }
}