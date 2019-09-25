package StreamUsage;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class flatMapTest {
    public static void main(String[] args) {
        //flatMap将一个流中的每个值都换成另外一个流，然后把所有的流连接起来成为一个流；
        List<String> words = Arrays.asList("Java 8", "Lambdas", "In", "Action");
        String[] arrayOfWords = {"Goodbye", "World"};
//        String[] words = {"Hello","World"};
//        System.out.println(Arrays.stream(words));
        words.stream().map(word->word.split(""))
                      .map(Arrays::stream)
                      .distinct()
                      .collect(toList()).forEach(System.out::println);

        words.stream().map(word->word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(toList()).forEach(System.out::println);

    }
}
