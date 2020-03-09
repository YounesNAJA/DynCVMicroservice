package com.younesnaja.dyncv.dao.repository;

import com.younesnaja.dyncv.dao.domain.impl.Personne;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.math.BigInteger;

@RepositoryRestResource(exported=true, path="personnes")
public interface PersonneRepository extends StandardRepository<Personne, BigInteger> {

}
