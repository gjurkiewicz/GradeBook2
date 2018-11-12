package com.jurkiewicz.grzegorz.GradeBook.repository;

import com.jurkiewicz.grzegorz.GradeBook.model.KlasaGrupa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KlasaGrupaRepository extends JpaRepository <KlasaGrupa, Long> {
}
