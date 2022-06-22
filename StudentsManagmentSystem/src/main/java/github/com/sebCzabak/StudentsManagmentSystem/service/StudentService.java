package github.com.sebCzabak.StudentsManagmentSystem.service;

import github.com.sebCzabak.StudentsManagmentSystem.exception.UserNotFoundException;
import github.com.sebCzabak.StudentsManagmentSystem.model.Student;
import github.com.sebCzabak.StudentsManagmentSystem.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public Student addStudent(Student student){
        student.setStudentCode(UUID.randomUUID().toString());
        return studentRepository.save(student);
    }
    public List<Student> findAllStudents(){
        return studentRepository.findAll();
    }
    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }
    public void deleteStudent(Long id){
        studentRepository.deleteStudentById(id);
    }
    public Student findStudentById(Long id){
       return studentRepository.findStudentById(id)
               .orElseThrow(()->new UserNotFoundException("User with ID "+id + " was not found."));
    }
}
