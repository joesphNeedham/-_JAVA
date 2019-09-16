package Java8_Practical.com.tanbo.demo.Chapter2_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExcuteRound {
    public static void main(String[] args) throws IOException{
        String oneLine =processFile((BufferedReader b) -> b.readLine());
        System.out.println(oneLine);
    }

    @FunctionalInterface
    public interface BufferedReaderProcessor{
        // 1. 注意接口是不接受参数的
        // 2. 接口中的抽象方法一定是Public的。
        // 3. 有些接口是不需要单独拿出来，就在一个类中就可以了。
        public String process(BufferedReader b) throws IOException;
    }

    // 使用可能会抛出异常的接口的时候，继续将这个异常抛出
    private static String processFile(BufferedReaderProcessor p) throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader("D:\\BaiduNetdiskDownload\\Java 8实战\\ShengSiYuan_Java_Series\\shengsiyuan\\JAVA_SE\\src\\Java8_Practical\\com\\tanbo\\demo\\Chapter2_3\\Java8_Practical\\com\\tanbo\\Resource\\data.txt"))) {
            return p.process(br);
        }
    }
}
