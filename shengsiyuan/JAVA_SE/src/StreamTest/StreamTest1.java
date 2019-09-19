package StreamTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {
    public static void main(String[] args) {
        //流的创建
        Stream stream1 = Stream.of("hello","world","hello world");

        String[] myArray = new String[]{"hello","world","hello world"};

        Stream stream2 = Stream.of(myArray);

        List<String> list = Arrays.asList(myArray);
        Stream stream3 = list.stream(); //通过集合创建了流
    }
}
