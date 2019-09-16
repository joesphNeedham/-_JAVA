package MethodReference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceTest {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",10);
        Student student2 = new Student("lisi",90);
        Student student3 = new Student("wangwu",50);
        Student student4 = new Student("zhaoliu",40);

        List<Student> students = Arrays.asList(student1,student2,student3,student4);
//        students.sort((studentParam1,studentParam2) ->Student.compareStudentByScore(studentParam1, studentParam2));
//        students.forEach(student -> System.out.println(student.getScore()));
//
//        students.sort(Student::compareStudentByScore);
        StudentComparator studentComparator = new StudentComparator();

        students.sort(studentComparator::compareStudentByName);
        students.forEach(student -> System.out.println(student.getName()
        ));
    }
}
