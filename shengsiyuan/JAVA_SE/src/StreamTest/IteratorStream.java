package StreamTest;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IteratorStream {
    private static List<Dish>  dishes = Arrays.asList(new Dish("鲨鱼肉", false, 1000, Type.FISH),
                                                        new Dish("炒牛肉", false, 800, Type.MEAT),
                                                        new Dish("蔬菜沙拉", true, 400, Type.OTHER),
                                                        new Dish("酸菜鱼", false, 900, Type.FISH)
    );

    public static void main(String[] args) {
//        dishes.stream().map(Dish::getName).forEach(System.out::println);
        List<String> collect =dishes.stream().
                              filter(x->x.getCalories() > 600).
                              sorted(Comparator.comparing(Dish::getCalories).reversed()).map(Dish::getName).limit(2).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
