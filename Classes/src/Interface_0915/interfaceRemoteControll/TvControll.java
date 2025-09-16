package Interface_0915.interfaceRemoteControll;

public class TvControll {

    public static void main(String[] args) {
        // Interface(부모 형)으로 인스턴스 생성(다형성)
        RemoteCtrl remote = new TV(); // = new RemoteCtrl(); 불가능함

        // 기능 테스트
        remote.turnOn();
        System.out.println("----------------");
        remote.setVolume(110); // 최대 소리 제한 => 100까지
        remote.setVolume(0); // 최소 소리 제한 => 1까지
        System.out.println("----------------");
        remote.setMute(true); // mute on
        System.out.println("----------------");
        remote.setMute(false); // mute off
        System.out.println("----------------");
        remote.turnOff();

        System.out.println("----------------");
        // 배터리 교환
        RemoteCtrl.replaceBattery();

    }
}
