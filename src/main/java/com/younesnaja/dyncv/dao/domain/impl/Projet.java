package com.younesnaja.dyncv.dao.domain.impl;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Projet extends StandardDomainObjectImpl {
    private String nom;
    private String description;
    private List<String> taches;
    private List<String> technologies;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTaches() {
        return taches;
    }

    public void setTaches(List<String> taches) {
        this.taches = taches;
    }

    public List<String> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<String> technologies) {
        this.technologies = technologies;
    }
}
