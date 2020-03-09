package com.younesnaja.dyncv.dao.repository;

import com.younesnaja.dyncv.dao.domain.impl.Projet;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.math.BigInteger;

@RepositoryRestResource(exported=true, path="projets")
public interface ProjetRepository extends StandardRepository<Projet, BigInteger> {

}
