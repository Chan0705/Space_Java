package Interface_0915.interfaceRemoteControll;

// Interface의 접근제어 속성은 public임
// => 변수 선언 시, 상수로 변환되어짐(psvm)
// default =>

public interface RemoteCtrl {

    // 상수 선언
    public int MAX_VOLUME = 100;
    public int MIN_VOLUME = 1;
    
    //추상 메서드
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);
//    public void setChannel(int ch);

    // 실체 메서드 사용 가능 - default 키워드 사용
    public default void setMute(boolean mute){
        System.out.println(mute ? "음소거" : "음소거 해제");
    }

    // 정적메서드
    // 배터리 교환
    public static void replaceBattery(){
        System.out.println("電池を変わってください。");
    }
    

}
