package com.jurkiewicz.grzegorz.GradeBook.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class KlasaGrupa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer year;
    private String name;
    @ManyToMany
    List<Subject> subjectList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
