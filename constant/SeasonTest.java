package constant;

import java.util.Scanner;

public class SeasonTest {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("계절을 입력하세요");
        String input = scanner.nextLine();

        System.out.println("test");

        Season season = null;

        switch (input){
            case "봄":
                season = Season.봄;
                break;
            case "여름":
                season = Season.여름;
                break;
            case "가을":
                season = Season.가을;
                break;
            case "겨울":
                season = Season.겨울;
                break;
            default:
                System.out.println("계절이 없습니다.");

        }
        System.out.println("현재 계절은 " + season + "입니다.");
    }
}
