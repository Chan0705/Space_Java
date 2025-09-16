package Math;

public class MyMathTest {

    public static void main(String[] args) {
        // 작성한 메서드 사용
        // static이 아닐때
//        MyMath math = new MyMath(); // 인스턴스 생성
//        System.out.println(math.abs(-6 ));
//

        // 메서드 사용 - 클래스로 직접 접근
        System.out.println("절대값은 " + MyMath.abs(-6)); // 6

    }
}
