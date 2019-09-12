package Java8_Practical.com.tanbo.demo.Chapter2_3;

import java.util.ArrayList;
import java.util.List;

public class AppleFilter {
    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple:inventory){
            if ("green".equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }


//    public static <T> List<T> filter(List<T> list, ApplePredicate<T> p){
//        //1. 通过抽象List类型，可以对不同类型的对象进行处理。
//        //2. 通过定义某个接口，可以采用不同的策略方法。
//        List<T> result = new ArrayList<>();
//        for (T e: list){
//            if (p.test(e)){
//                result.add(e);
//            }
//        }
//        return result;
//    }




}


