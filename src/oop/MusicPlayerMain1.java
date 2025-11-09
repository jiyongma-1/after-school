package oop;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        /*
        음악 플레이어를 시작합니다.
        현재 불륨: 1
        현재 블륨: 2
        음악 플레이어 on, 현재 블륨: 1
        음악 플레이어를 종료합니다.
        */

        int volume = 0;
        boolean isOn = false;

        isOn = true;

        System.out.println("음악 플레이어를 시작합니다.");

        volume++;
        System.out.println("현재 볼륨: " + volume);

        volume++;
        System.out.println("현재 볼륨: " + volume);

        volume--;
        System.out.println("현재 볼륨: " + volume);

        if (isOn) {
            System.out.println("음악 플레이어 On, 현재 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 Off, 현재 볼륨: " + volume);
        }

        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}