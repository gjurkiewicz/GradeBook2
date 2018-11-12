package com.jurkiewicz.grzegorz.GradeBook.model;


import javax.persistence.*;

@Entity
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer grade;
    private String typeGrade;
    @Lob
    private String comment;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Subject subject;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getTypeGrade() {
        return typeGrade;
    }

    public void setTypeGrade(String typeGrade) {
        this.typeGrade = typeGrade;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

