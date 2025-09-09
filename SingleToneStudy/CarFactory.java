package SingleToneStudy;

import Car.Car;

public class CarFactory {
    //멤버변수
    private static CarFactory instance; // 싱글톤 instance

    // 생성자
    private CarFactory(){} // private로 외부에서 접근 못하게 함

    // 인스턴스 반환 메서드
    public static CarFactory getInstance() {
        // instance는 중복생성이 되지 않음
        if (instance == null) {
            instance = new CarFactory(); // 최초 1회만 생성
        }
        return instance;
    }

    // 자동차 생성 메서드 정의
    public Car createCar(){
        Car car = new Car();
        return car; // Car class에 있는 내용으로 끌고옴
    }
}
