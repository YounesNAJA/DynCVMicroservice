package com.younesnaja.dyncv.dao.repository;

import com.younesnaja.dyncv.dao.domain.impl.Formation;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.math.BigInteger;

@RepositoryRestResource(exported=true, path="formations")
public interface FormationRepository extends StandardRepository<Formation, BigInteger> {

    @RestResource(path = "etablissement", rel = "")
    Formation findByEtablissementContaining(@Param("etablissement") String etablissement);

}
