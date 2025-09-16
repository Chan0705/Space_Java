package Interface_0915.SmartTv;

import Interface_0915.interfaceRemoteControll.RemoteCtrl;

// RemoteCtrl, NewInterface 다중구현
public class SmartTv implements RemoteCtrl, NewInterface {

    private int volume; // 🔧 필드 선언 추가
    private boolean isPowerOn = false; //상태변수(토글기능)

    @Override
    public void searchWeb(String url) {
        System.out.println("searching " + url + ".");
    }

    @Override
    public void turnOn(){
        if ( !isPowerOn) { // !false = true
            isPowerOn = true;
        }
        System.out.println("현재 TV가 켜져있음");
    }

    @Override
    public void turnOff(){
        if (isPowerOn){ // isPowerOn = true
            isPowerOn = false;
        }
        System.out.println("TV OFF");
    }

    @Override
    public void setVolume(int volume){
        // 소리 크기 제한
        if (volume >RemoteCtrl.MAX_VOLUME)
            this.volume = RemoteCtrl.MAX_VOLUME; //  최대 소리 설정
        else if (volume < RemoteCtrl.MIN_VOLUME)
            this.volume = (RemoteCtrl.MIN_VOLUME); // 최소 소리 설정
        else
            this.volume = volume;
        System.out.println("TV Volume: " + this.volume);
    }

}
