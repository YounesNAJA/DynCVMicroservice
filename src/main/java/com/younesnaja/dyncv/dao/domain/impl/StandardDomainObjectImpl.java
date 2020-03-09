package com.younesnaja.dyncv.dao.domain.impl;

import com.younesnaja.dyncv.dao.domain.StandardDomainObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Resource;
import java.math.BigInteger;

@Document
public abstract class StandardDomainObjectImpl implements StandardDomainObject {
    @Id
    protected BigInteger id;

    protected boolean active;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }
}
