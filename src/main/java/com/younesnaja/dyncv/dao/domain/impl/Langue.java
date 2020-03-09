package com.younesnaja.dyncv.dao.domain.impl;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Langue extends StandardDomainObjectImpl {

    private String nom;

    private String niveau;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
}
