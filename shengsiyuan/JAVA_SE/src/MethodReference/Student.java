package MethodReference;

public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    private int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    public static int compareStudentByScore(Student student1, Student student2){
        return student1.getScore() - student2.getScore();
    }

    public static int compareStudentByName(Student student1, Student student2){
        return student1.getName().compareToIgnoreCase(student2.getName());
    }

}
