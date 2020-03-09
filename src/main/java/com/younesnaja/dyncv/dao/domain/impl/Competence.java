package com.younesnaja.dyncv.dao.domain.impl;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Competence extends StandardDomainObjectImpl {

    private String categorie;

    private List<String> elements;

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public List<String> getElements() {
        return elements;
    }

    public void setElements(List<String> elements) {
        this.elements = elements;
    }
}
