import java.util.Scanner;

// 사용자 입력처리
    // scanner 클래스
    // 정수입력 시 : nextInt()
    // 문자입력 시 : next(), nextLine()
public class InputTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("あなたのお名前は何ですか？");
        String name = scanner.nextLine();

        System.out.print("あなたのとしは何ですか？");
        int age = scanner.nextInt();

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);

    }
}
