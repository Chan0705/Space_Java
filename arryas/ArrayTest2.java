package arryas;

public class ArrayTest2 {

    public static void main(String[] args) {

        // 배열의 크기가 4인 정수형 배열 선언
        int[] nums = new int[4];

        // 출력
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
        // 배열 갑 할당 x => null
        System.out.println("----------------------");

        // 값 입력
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;

        // 범위기반 for 문으로 출력
        for(int num : nums){
            System.out.println(num);
        }
        System.out.println("----------------------");

        // 계산
        System.out.println(nums[0] + nums[1]);

        int total = 0; // 합계

        total = total + nums[0];
        total = total + nums[1];
        total = total + nums[2];
        total = total + nums[3];
        System.out.println(total);
        System.out.println("----------------------");

        // for문으로 total
        for(int i = 0; i < nums.length; i++){
            total = total + nums[i]; // total = total + nums[i];
        }
        System.out.println("합계: " + total);
        System.out.println("----------------------");
        
        // 평균값 계산
        float average;
        average = (float) total / nums.length; // total의 타입을 int > float로 타입 형변환

        System.out.println("평균: " + average );
    }
}
