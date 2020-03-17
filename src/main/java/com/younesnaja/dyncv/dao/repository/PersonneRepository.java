package com.younesnaja.dyncv.dao.repository;

import com.younesnaja.dyncv.dao.domain.impl.Personne;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.math.BigInteger;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RepositoryRestResource(exported=true, path="personnes")
public interface PersonneRepository extends StandardRepository<Personne, BigInteger> {

}
