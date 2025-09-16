package Math;

// javad의 lang 패키지는 import 없이 그냥 사용
// Math class = 수학 관련 메서드

public class MathTest {

    // Math 클래스 메서드
    // static이 있는 메서드는 new로 인스턴스 선언을 하는 것이 아닌, class 명으로 접근함
    // 절대값 계산 - absolute
    public static void main(String[] args){
        int v1 = Math.abs(-4);
        System.out.println("절댓값: " + v1); // -4의 절댓값은 4

        System.out.println("----------------------");

        // 반올림 - round
        long v2 = Math.round(5.6);
        System.out.println("반올림: " + v2); // 6

        System.out.println("----------------------");

        // 올림 - ceil
        double v3 = Math.ceil(5.6);
        System.out.println("올림: " + v3); // 6.0

        System.out.println("----------------------");

        // 내림 - floor(실수)
        double v4 = Math.floor(5.6);
        System.out.println("내림: " + v4); // 5.0

        System.out.println("----------------------");

        // 두 수 중 작은 수 - min
        int v5 = Math.min(10, 20);
        System.out.println("작은 값: " + v5); // 10

        System.out.println("----------------------");

        // 무작위 수 0.0 <== rand < 1.0
        double rand = Math.random();
        System.out.println("무작위 수: " + rand);

        System.out.println("----------------------");

        // 동전 던지귀 - 앞/뒤
        // Math.random() * n => 0 ~ n-1개 중 1가지를 출력
        int coin = (int)(Math.random() * 2); // int로 강제 형변환, 0과 1중 1가지를 랜덤하게 출력
        System.out.println(coin);

        // 앞뒤 조건문
        if(coin == 0)
            System.out.println("앞");
        else
            System.out.println("뒤");

        System.out.println("----------------------");

        // 주사위 눈 : 1 ~ 6
        int dice = (int)(Math.random() * 6) + 1;
        System.out.println("주사위 눈:" + dice);

        System.out.println("----------------------");

        // 문자열 랜덤 추출
        String[] country = {"Korea", "USA", "Japan"};
        //System.out.println(country[index]); > index 번호에 있는 나라 명
        
        // 배열 내 나라 중 1개를 랜덤으로 출력
        int index = (int)(Math.random() * 3); // 3 => country.length로 대체 가능(배열의 전체 길이)
        System.out.println(country[index]);

        System.out.println("----------------------");
        
    }
}
