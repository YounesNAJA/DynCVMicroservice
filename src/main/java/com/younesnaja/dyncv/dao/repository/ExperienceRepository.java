package com.younesnaja.dyncv.dao.repository;

import com.younesnaja.dyncv.dao.domain.impl.Experience;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.math.BigInteger;

@RepositoryRestResource(exported=true, path="experiences")
public interface ExperienceRepository extends StandardRepository<Experience, BigInteger> {

}
