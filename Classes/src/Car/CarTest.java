package Car;

public class CarTest {
    // Car 생성자 호출
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

    System.out.println("차량번호: " + car1.getCarNumber());
    System.out.println("차량번호: " + car2.getCarNumber());

    // 인스턴스 출력 - 클래스 이름은 패키지명.클래스명
        System.out.println(car1); // Car.Car@123456789

    }

}
