package Interface_0915.Lamda.lamda2;

import Interface_0915.Lamda.interface_impl.StringConcat;

public class ConcatTest {

    public static void main(String[] args) {

        //인터페이스 인스턴스 생성
        StringConcat concat;

        String str1 = "집에";
        String str2 = "가고싶다";

        concat = (s1, s2) -> System.out.println(s1 + "," + s2);

        concat.strConcat(str1, str2);
    
    
    }

}
