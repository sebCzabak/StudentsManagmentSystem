package github.com.sebCzabak.StudentsManagmentSystem.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String name;
    private String email;
    private String classTitle;
    private String phone;
    private String imgUrl;
    private studentClass studentClass;
    private String studentCode;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", classTitle='" + classTitle + '\'' +
                ", phone='" + phone + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", studentClass=" + studentClass +
                ", studentCode='" + studentCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(email, student.email) && Objects.equals(classTitle, student.classTitle) && Objects.equals(phone, student.phone) && Objects.equals(imgUrl, student.imgUrl) && studentClass == student.studentClass && Objects.equals(studentCode, student.studentCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, classTitle, phone, imgUrl, studentClass, studentCode);
    }
}
