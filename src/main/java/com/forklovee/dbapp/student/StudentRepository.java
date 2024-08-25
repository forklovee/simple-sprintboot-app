package com.forklovee.dbapp.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// Data Access Layer
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // Basic SQL query...
    // ?1 means get first argument from method.
    // Whatever query returns is the return value.
    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);

}
