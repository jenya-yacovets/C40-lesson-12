package json;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private int age;
    private List<Integer> marks;

    public Student(int id, String name, int age, List<Integer> marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = new ArrayList<>();
    }

    public Student() {
        this.marks = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }

    public void addMark(int mark) {
        marks.add(mark);
    }
}
