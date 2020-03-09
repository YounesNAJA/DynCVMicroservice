package com.younesnaja.dyncv.dao.domain;

import org.springframework.data.annotation.Id;

import java.math.BigInteger;

public abstract class StandardDomainObject {
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
