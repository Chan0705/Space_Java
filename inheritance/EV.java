package inheritance;

// 상속받을 때 생성자 관련 에러 발생
// 생성자를 상속받는 방법
    // => 부모의 생성자를 그대로 작성
    // => this대신 super 키워드로 작성하여 상속

public class EV extends NewCar {
    private int battery; // 배터리 잔량

    // 생성자
    public EV(String brand, String model, int battery){
        super(brand, model);
        this.battery = battery;
    }

    // 충전기능
    public void chargeBattery(int amount){
        battery += amount;
        if (battery > 100)
            battery = 100; // 최대 충전 치 제한
        System.out.println(model + " 충전됨 - 현재 배터리 잔량: " + battery + "%");
    }


    // EV 정보 출력 - override로 메서드 재정의
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("배터리 잔량: " + battery + "%");
    }
}
