package com.jurkiewicz.grzegorz.GradeBook.repository;


import com.jurkiewicz.grzegorz.GradeBook.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeBookRepository extends JpaRepository <Grade, Long>{
}
