package Car;

public class Car {
    private static int carId = 1000; // 차량번호 생성을 위한 기준 번호, static이 없을 시 항상 1000 고정
    private int carNumber; // 차량번호

    public Car(){
        carId++; // carId = carId + 1;
        carNumber = carId; // carNumber = carId;
    }

    // 차량번호 반환(가져오기)
    // private기 때문에 get으로 가져옴
    public int getCarNumber(){
        return carNumber;
    }

}
