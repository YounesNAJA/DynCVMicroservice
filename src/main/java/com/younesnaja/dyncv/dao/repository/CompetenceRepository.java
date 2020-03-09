package com.younesnaja.dyncv.dao.repository;

import com.younesnaja.dyncv.dao.domain.Competence;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.math.BigInteger;
import java.util.Optional;

@RepositoryRestResource(exported=true, path="competences")
public interface CompetenceRepository extends PagingAndSortingRepository<Competence, BigInteger> {

    @RestResource(path = "id", rel = "id")
    Optional<Competence> findById(@Param("id") BigInteger id);

/*    @RestResource(path = "active", rel = "active")
    List<Competence> findAllByActive(@Param("active") boolean active);*/
}
