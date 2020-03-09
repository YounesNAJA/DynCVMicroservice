package com.younesnaja.dyncv.service.impl;

import com.younesnaja.dyncv.dao.domain.StandardDomainObject;
import com.younesnaja.dyncv.exception.client.FormationNotFoundException;
import com.younesnaja.dyncv.service.StandardService;

import java.math.BigInteger;

public abstract class StandardServiceImpl<T extends StandardDomainObject> implements StandardService {

    @Override
    public abstract T getById(BigInteger id) throws FormationNotFoundException;

    @Override
    public abstract Iterable<T> getAll();
}
