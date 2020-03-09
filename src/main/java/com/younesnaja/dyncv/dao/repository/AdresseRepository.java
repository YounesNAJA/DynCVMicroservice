package com.younesnaja.dyncv.dao.repository;

import com.younesnaja.dyncv.dao.domain.impl.Adresse;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.math.BigInteger;

@RepositoryRestResource(exported=true, path="adresses")
public interface AdresseRepository extends StandardRepository<Adresse, BigInteger> {

}
