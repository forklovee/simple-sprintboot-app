package com.forklovee.dbapp.student;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentByEmail = studentRepository
                .findStudentByEmail(student.getEmail());

        if (studentByEmail.isPresent()){
            throw new IllegalStateException("Student with this email already exits.");
        }

        studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        if (!studentRepository.existsById(id)){
            throw new IllegalStateException("Student with id "+id+" doesn't exist.");
        }
        studentRepository.deleteById(id);
    }

    @Transactional
    public void updateStudent(Long id, String firstName, String surname, String email) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(
                        "Student of id "+ id +" doesn't exist."
                ));

        if (firstName != null &&
                !firstName.isEmpty() &&
                !Objects.equals(student.getFirstName(), firstName)){
            student.setFirstName(firstName);
        }

        if (surname != null &&
                !surname.isEmpty() &&
                !Objects.equals(student.getSurname(), surname)){
            student.setSurname(surname);
        }

        if (email != null &&
                !email.isEmpty() &&
                !Objects.equals(student.getEmail(), email)){
            if(studentRepository.findStudentByEmail(email).isPresent()){
                throw new IllegalStateException("Email " + email + " is already used by another student.");
            }
            student.setEmail(email);
        }
    }
}
