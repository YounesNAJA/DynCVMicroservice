package com.younesnaja.dyncv.service;

import com.younesnaja.dyncv.dao.domain.StandardDomainObject;
import com.younesnaja.dyncv.exception.client.PersonneNotFoundException;

import java.math.BigInteger;

public interface StandardService<T extends StandardDomainObject> {

    /**
     *
     * @param id
     * @return
     * @throws PersonneNotFoundException
     */
    public T getById(BigInteger id) throws PersonneNotFoundException;

    /**
     * Get all formations
     * @return
     */
    public Iterable<T> getAll();
}
