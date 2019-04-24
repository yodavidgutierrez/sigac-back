package com.digitallab.sigac.repository.student;

import com.digitallab.sigac.commons.enums.IdentityType;
import com.digitallab.sigac.domain.model.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query("select s from Student s where s.documentNumber=:documentNumber and s.idType= :idType")
    Student findByDocumentNumberAndIdType(@Param("documentNumber") final Long id, @Param("idType")final IdentityType type);

}
