package exception;



public class ExceptionHandle1 {

    // 문자열의 길이(크기)를 확인하는 함수(printLength) 생성
    public static void printLength(String data) {
        int len = data.length();
        System.out.println("문자 수: " + len);
    }

    public static void main(String[] args) {
    // 실행 예외 처리 - try.catch ==> 실행했을 때, 오류발생
        System.out.println("[프로그램 시작]\n");

        try {
            printLength("hi"); // 문자열 길이 확인하는 함수
            printLength(null); // NullPointException
        }
        catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("입력 오류");
        }

        System.out.println("[프로그램 종료]\n");
    }
}
