package constant;

//상수
// 한번 설정하면 프로그램이 종료되기 전까지 변경되지 않는 값, final 키워드로 설정

public class FinalEx {

    public static void main(String[] args) {

        //최소값 - 0, 최대값 + 100
        final int MAX_NUM = 100;
        final int MIN_NUM = 0;

        // MIN_NUM = 1; // final이 있기 때문에 밑에서 변수 변경 불가

        System.out.println(MIN_NUM);

        System.out.println("----------------------");

        // 원의 넓이 계산
        final double PI = 3.14;
        int radius = 5;

        // PI = 3.142419 ~~ => 수정 불가
        double area = PI * radius * radius;

        System.out.println("원의 넓이: " + area);

        //printf => 형식을 지정해서 출력
        System.out.printf("원의 넓이: %.3f\n", area);

        System.out.println("----------------------");
    }
}
