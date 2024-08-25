package com.forklovee.dbapp.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    // Dependency injection
    // @Autowired - instantiates the studentService Service
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }

    //Path means that you input the id after the last slash,
    //it acts as the argument for the request
    //
    //ex. http://localhost:8080/api/v1/student/1
    @DeleteMapping(path = "{studentID}")
    public void deleteStudent(@PathVariable("studentID") Long Id){
        studentService.deleteStudent(Id);
    }
}
