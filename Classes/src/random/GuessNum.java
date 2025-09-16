package random;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {

        //입력클래스 호출
        Scanner scanner = new Scanner(System.in); // in => 입력


        //랜덤 클래스 호출
        Random random = new Random();


        // 컴퓨터의 난수 발생 (1~30)
        int num = random.nextInt(30) + 1; // 1~30 난수

        // 무한 반복문 생성
        while (true) {
            try {
                System.out.println("숫자 입력");
                int guessNum = Integer.parseInt(scanner.nextLine()); // 사용자의 숫자 입력
//            int guessNum = scanner.nextInt();

                if (guessNum < 1 || guessNum > 30) {
                    System.out.println("1~30까지의 숫자를 입력하세요");
                } // 유효성 검사 조건문을 if에 넣는 것이 좋음
                else if (guessNum == num) {
                    System.out.println("suc");
                    break;
                } else if (guessNum > num) {
                    System.out.println("too big");
                } else {
                    System.out.println("too small");
                }
            } catch (NumberFormatException e) {
                System.out.println("유효한 숫자를 입력하세요");
            }

        }
        scanner.close(); // 입출력 종료
        // while 반복문 안에 들어가있어서 첫 입력 후 강제종료되었음
    }
}