package com.jurkiewicz.grzegorz.GradeBook.controller;


import com.jurkiewicz.grzegorz.GradeBook.model.Student;
import com.jurkiewicz.grzegorz.GradeBook.repository.GradeBookRepository;
import com.jurkiewicz.grzegorz.GradeBook.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    StudentRepository studentRepository;

    public MainController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

//    @GetMapping ("/")
//
//    public String getIndexPage(Model model) {
//        model.addAttribute("name", "test");
//        return "index";
//    }
}
