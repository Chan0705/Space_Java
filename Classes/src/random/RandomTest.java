package random;

import java.util.Random;

public class RandomTest {

    public static void main(String[] args) {
        // 난수 새성
        //1. Math.random()
        int n1 = (int)(Math.random() *2); // int 강제 형번환, 0 or 1
        System.out.println(n1);

        System.out.println("----------------------");

        // 2. random 클래스
        Random rnd = new Random();
//        System.out.println(rnd.nextInt());
        int n2 = rnd.nextInt(2);
        System.out.println(n2);

        System.out.println("----------------------");

        // 동전 던지기
        int coin = rnd.nextInt(2) + 1; // 1 or 2 출력
        if( coin == 1){
            System.out.println("앞");
        } else{
            System.out.println("뒤");
        }
        
    }
}
