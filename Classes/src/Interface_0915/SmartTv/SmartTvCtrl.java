package Interface_0915.SmartTv;

import Interface_0915.interfaceRemoteControll.RemoteCtrl;

public class SmartTvCtrl {

    public static void main(String[] args) {
        RemoteCtrl remote = new SmartTv();
//        NewInterface search = new SmartTv();
        NewInterface search = (NewInterface) remote; // 강제형변환, 위와 동일하게 작동

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

        // 검색기능
        search.searchWeb("https://www.naver.com");

        System.out.println("-------------------");
    }
}
