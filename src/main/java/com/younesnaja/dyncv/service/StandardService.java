package com.younesnaja.dyncv.service;

import com.younesnaja.dyncv.dao.domain.StandardDomainObject;
import com.younesnaja.dyncv.exception.client.FormationNotFoundException;

import java.math.BigInteger;

public interface StandardService<T extends StandardDomainObject> {

    /**
     *
     * @param id
     * @return
     * @throws FormationNotFoundException
     */
    public T getById(BigInteger id) throws FormationNotFoundException;

    /**
     * Get all formations
     * @return
     */
    public Iterable<T> getAll();
}
