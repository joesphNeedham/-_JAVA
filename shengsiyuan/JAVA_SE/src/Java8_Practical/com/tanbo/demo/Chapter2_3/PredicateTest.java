package Java8_Practical.com.tanbo.demo.Chapter2_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
    /**
     * 通过使用 Predicate 接口
     * @param list 输入参数
     * @param p Predicate函数式接口的使用，用于接受一个参数，返回一个布尔值。
     * @param <T> 静态方法中的泛型使用。
     * @return
     */
    public static <T> List<T> filter(List<T> list, Predicate<T> p){
        List<T> results = new ArrayList<>();
        for (T s:list){
            if(!p.test(s)){
                results.add(s);
            }
        }
        return results;
    }

    public static void main(String[] args) {
        List<String> testInput= Arrays.asList("", "Córdoba", "La Plata");
        filter(testInput,String::isEmpty).forEach(System.out::println); //方法引用中类的实例方法
    }
}
