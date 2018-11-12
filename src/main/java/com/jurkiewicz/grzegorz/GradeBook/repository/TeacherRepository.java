package com.jurkiewicz.grzegorz.GradeBook.repository;

import com.jurkiewicz.grzegorz.GradeBook.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
