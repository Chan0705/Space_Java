package Interface_0915.Lamda;

public class MyFunk {
    public static void main(String[] args) {
        // 인터페이스의 인스턴스 생성
        LamDa fi;

        // 람다식으로 함수 구현
        // 매개변수가 없고, 이름이 없는 익명함수
//        fi = () -> {
//            String str = "Hello World";
//            System.out.println(str);
//        };
//
//        System.out.println("------------");

        // 중괄호 생략해서 한줄로 작성
        fi = () -> System.out.println("Hello World");


        //함수 실행
        fi.method();
    }
}
