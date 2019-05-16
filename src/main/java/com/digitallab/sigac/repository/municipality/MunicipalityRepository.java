package com.digitallab.sigac.repository.municipality;

import com.digitallab.sigac.domain.model.entities.Municipality;
import com.digitallab.sigac.domain.model.entities.MunicipalityId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MunicipalityRepository extends JpaRepository<Municipality, MunicipalityId> {

    @Query("select m from Municipality m where m.id=:id")
    List<Municipality> findMunicipalitiesById_Department(@Param("id") MunicipalityId id);

}
