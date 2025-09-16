package Interface_0915.Lamda.interface_impl;


//구현
public class StringConcatImpl implements StringConcat {

    @Override
    public void strConcat(String str1, String str2) {
        System.out.println(str1 + "," + str2);
    }


}
