package github.com.sebCzabak.StudentsManagmentSystem.service;

import github.com.sebCzabak.StudentsManagmentSystem.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/all")
    public ResponseEntity<List<Student>>getAllStudents(){
        List<Student>students =studentService.findAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id")Long id){
        Student student =studentService.findStudentById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Student>addStudent(@RequestBody Student student){
        Student newStudent = studentService.addStudent(student);
        return new ResponseEntity<>(newStudent,HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Student>updateStudent(@RequestBody Student student){
        Student updateStudent = studentService.updateStudent(student);
        return new ResponseEntity<>(updateStudent,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?>deleteStudent(@PathVariable("id")Long id){
        studentService.deleteStudent(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
