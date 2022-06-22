package github.com.sebCzabak.StudentsManagmentSystem.repository;

import github.com.sebCzabak.StudentsManagmentSystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteStudentById(Long id);

    Optional<Student> findStudentById(Long id);
}
