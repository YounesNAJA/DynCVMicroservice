package com.younesnaja.dyncv.dao.repository;

import com.younesnaja.dyncv.dao.domain.impl.Client;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.math.BigInteger;

@RepositoryRestResource(exported=true, path="clients")
public interface ClientRepository extends StandardRepository<Client, BigInteger> {

}
