package inheritance;

public class CarMain {
    public static void main(String[] args) {

        EV myEv = new EV("TESLA", "TESTLA-X", 27);


        // 정보 출력 * 기존
        myEv.showInfo();

        System.out.println("----------------");

        // 기능 테스트
        myEv.accelerate(60);
        myEv.brake(30); // 최저 속도 0
        myEv.chargeBattery(100); // 최대 충전 100

        System.out.println("----------------");

        // 출력 * 배터리 충전 후
        myEv.showInfo();

        System.out.println("----------------");

    }
}
