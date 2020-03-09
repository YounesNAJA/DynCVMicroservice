package com.younesnaja.dyncv.dao.domain.impl;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Resource;

@Document
public class Client extends StandardDomainObjectImpl {
    private String nom;
    private String ville;
    private String pays;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
