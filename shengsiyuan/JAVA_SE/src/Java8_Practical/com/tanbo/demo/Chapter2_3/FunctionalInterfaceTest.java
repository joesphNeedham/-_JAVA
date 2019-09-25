package Java8_Practical.com.tanbo.demo.Chapter2_3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalInterfaceTest {
    public static void test(List<String> list, Function<String, Integer> function){
        List<Integer>list1 = new ArrayList<>();
        for (String str:list){
            list1.add(function.apply(str));
        }
        list1.forEach(System.out::println);
    }

    public static void main(String[] args) {
        test(Arrays.asList("cris", "hello","abc"), String::length);
    }
}
