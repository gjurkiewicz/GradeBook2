package com.jurkiewicz.grzegorz.GradeBook.repository;

import com.jurkiewicz.grzegorz.GradeBook.model.Grade;
import com.jurkiewicz.grzegorz.GradeBook.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
