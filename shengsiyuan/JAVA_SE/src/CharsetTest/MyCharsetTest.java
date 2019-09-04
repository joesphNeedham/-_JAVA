package CharsetTest;

/**
 * @program: JavaSePractice
 * @description:
 * @author: TanBo
 * @create: 2019-08-05 13:21
 **/
import java.io.*;
import java.nio.charset.Charset;

public class MyCharsetTest{
    public static void main(String[] args) throws Exception{
        Person p1 = new Person(20,"zhangsan",4.55);
        Person p2 = new Person(50,"lisi",4.67);
        Person p3 = new Person(10,"wangwu",17.78);

        //FileOutputStream 是文件字节输出流
        FileOutputStream fos = new FileOutputStream("person.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(p1);
        oos.writeObject(p2);
        oos.writeObject(p3); //写入的对象被存为一个二进制的对象

        oos.close();
        System.out.println("----------------");
        FileInputStream fis = new FileInputStream("person.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Person p ;

        for(int i=0; i<3;i++){
            p=(Person) ois.readObject();
            // 由于name是transient类型，因此没有被存到文件，在读的时候就会读不出来。
            System.out.println(p.age + "," + p.name + "," + p.height);
        }
        ois.close();

    }


}




class Person implements Serializable{
    int age;

    transient String name;

    double height;

    public Person(int age, String name, double height){
        this.age = age;
        this.name = name;
        this.height = height;
    }
}