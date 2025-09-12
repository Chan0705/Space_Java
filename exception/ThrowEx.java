package exception;

// Throw new + 예외 클래스(메세지)
//=> 오류 발생 시, 메세지 내용이 출력

public class ThrowEx {

    public static void main(String[] args) {
        
        // 나이 검사 프로그램
        
        // 1. 나이가 음수인 경우 , 2. 미성년자 거절
        try{
        checkAge(18);
        } catch (IllegalArgumentException e){
            System.out.println("예외 발생: " + e.getMessage()); //
        } catch (ArithmeticException e){
            System.out.println("예외 발생: " + e.getMessage());
        }
    }

    // 나이 검사 메서드
    public static void checkAge(int age){
        if (age < 0){
            throw new IllegalArgumentException("나이는 음수가 될 수 없음");
        } else if(age < 18){
            throw new ArithmeticException("미성년자 불가");
        } else{
            System.out.println("통과");
        }
    }
}
