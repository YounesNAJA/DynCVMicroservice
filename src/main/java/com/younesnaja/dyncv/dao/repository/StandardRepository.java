package com.younesnaja.dyncv.dao.repository;

import com.younesnaja.dyncv.dao.domain.impl.StandardDomainObjectImpl;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@CrossOrigin({"http://younesnaja.com", "https://younesnaja.com"})
@RepositoryRestResource(exported=false)
public interface StandardRepository<T extends StandardDomainObjectImpl, ID> extends PagingAndSortingRepository<T, BigInteger> {
    @RestResource(path = "id", rel = "id")
    Optional<T> findById(@Param("id") BigInteger id);

    @RestResource(path = "active", rel = "active")
    List<T> findAllByActive(@Param("active") boolean active);
}
