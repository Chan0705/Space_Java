package Interface_0915.Lamda.interface_impl;

public class ConcatTest {

    public static void main(String[] args) {
        StringConcatImpl concat = new StringConcatImpl();

        String str1 = "Hello";
        String str2 = "World";

       // impl.strConcat("Hello", "World");

        concat.strConcat(str1, str2);

    }

}
