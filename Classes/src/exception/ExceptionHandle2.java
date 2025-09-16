package exception;

public class ExceptionHandle2 {

    public static void main(String[] args) {
        // 컴파일 예외 - 실행 전에 미리 알 수있는 예외

        try {
            Class.forName("java.lang.String"); // DB 연길 시 자주 사용
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("오류");
        }
    }

}
