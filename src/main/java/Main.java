import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Генерация XML
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
//        Student student2 = new Student(
//                7,
//                "Витя",
//                19
//        );
//        student2.addMark(9);
//        student2.addMark(10);
//
//        List<Student> list = new ArrayList<>();
//        list.add(student);
//        list.add(student2);
//        StudentsWrapper studentsWrapper = new StudentsWrapper(list);
//
//        try {
//            JAXBContext context = JAXBContext.newInstance(StudentsWrapper.class, Student.class);
//            Marshaller marshaller = context.createMarshaller();
//            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//            marshaller.marshal(studentsWrapper, new File("student.xml"));
//        } catch (JAXBException e) {
//            e.printStackTrace();
//        }

//        Чтение из XML
        try {
            JAXBContext context = JAXBContext.newInstance(StudentsWrapper.class, Student.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            StudentsWrapper students = (StudentsWrapper) unmarshaller.unmarshal(new File("student.xml"));
            System.out.println(students);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
