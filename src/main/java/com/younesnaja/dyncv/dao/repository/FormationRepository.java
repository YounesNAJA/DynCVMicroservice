package com.younesnaja.dyncv.dao.repository;

import com.younesnaja.dyncv.dao.domain.Formation;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@RepositoryRestResource(exported=true, path="formations")
public interface FormationRepository extends PagingAndSortingRepository<Formation, BigInteger> {

    @RestResource(path = "id", rel = "id")
    Optional<Formation> findById(@Param("id") BigInteger id);

    @RestResource(path = "active", rel = "active")
    List<Formation> findAllByActive(@Param("active") boolean active);

    @RestResource(path = "etablissement", rel = "etablissement")
    Formation findByEtablissementContaining(@Param("etablissement") String etablissement);

}
