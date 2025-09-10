package inheritance;

// 접근 제어자 - protected
    // 상속받는 클래스에서만 접근 가능함

public class NewCar {
    protected String brand; // 브랜드명
    protected String model; // 모델명
    protected int speed; // 속도

    // 생성자
    public NewCar(String brand, String model){
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }


    // 속도 기능 - 가속
    public void accelerate(int amount){
        speed += amount;
        System.out.println(model + " (가속) 현재 주행 속도: " + speed + "km/h");
    }

    // 속도 기능 - 감속
    public void brake(int amount){
        speed -= amount;
        if(speed < 0) 
            speed = 0; // 속도의 최소값을 제한함
        System.out.println(model + " (감속) 현재 주행 속도: " + speed + "km/h");
    }

    // 차 정보 출력
    public void showInfo(){
        System.out.println("자동차 정보");
        System.out.println("제조사: " + brand + "\n모델명: " + model);
    }
}
