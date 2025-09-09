package arryas;

public class ArrayTest {
    public static void main(String[] args) {
        // 1. 문자열 배열 선언
        String[] cars = new String[3];

        // 출력
        // 배열에 값이 할당 안되서 null값으로 나옴
        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }

        System.out.println("----------------------");

        // 자동차 모델명
        cars[0] = "Sonata";
        cars[1] = "Tesla-S";
        cars[2] = "Bulldozer";

        // 선언과 동시에 초기화
        String[] cars1 = {"Sonata", "Tesla-S", "Bulldozer"};

        // 특정 Index의 Value를 변경
        cars1[1] = "Tesla-X";

        // 순서대로 출력
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars1[i]);
        }

        System.out.println("----------------------");

        // 향상된 for문(범위기반) - for(자료형 변수 : 배열이름){}
        // 자료형 변수 >> '자료형' '변수' : 배열명
        // 자료형 > 타입(int, string...), 변수 -> 변수명 임의지정, 배열이름 -> 설정한 배열이름
        // 배열의 이름을 car로 재지정?
        for(String car : cars1){
            System.out.println(car);
        }

    }

}
