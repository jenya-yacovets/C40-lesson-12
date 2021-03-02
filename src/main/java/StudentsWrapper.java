import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "students")
public class StudentsWrapper {
    private List<Student> list;

    public StudentsWrapper(List<Student> list) {
        this.list = list;
    }

    public StudentsWrapper() {
        this.list = new ArrayList<>();
    }

    @XmlElement(name = "student")
    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "StudentsWrapper{" +
                "list=" + list +
                '}';
    }
}
