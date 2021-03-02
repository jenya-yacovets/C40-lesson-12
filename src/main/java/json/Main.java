package json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

//        Генерация JSON
//        Student student = new Student(
//                5,
//                "Дима",
//                21
//        );
//        student.addMark(3);
//        student.addMark(9);
//        student.addMark(6);
//        student.addMark(8);
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        try {
//            objectMapper.writeValue(new File("student.json"), student);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Чтение JSON из файла
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Student student = objectMapper.readValue(new File("student.json"), Student.class);
            System.out.println(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
