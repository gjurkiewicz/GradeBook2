package com.jurkiewicz.grzegorz.GradeBook.controller;

import com.jurkiewicz.grzegorz.GradeBook.model.KlasaGrupa;
import com.jurkiewicz.grzegorz.GradeBook.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GradeController {
@Autowired
    GradeBookRepository gradeBookRepository;
@Autowired
    KlasaGrupaRepository klasaGrupaRepository;
@Autowired
    StudentRepository studentRepository;
@Autowired
    SubjectRepository subjectRepository;
@Autowired
    TeacherRepository teacherRepository;


}

