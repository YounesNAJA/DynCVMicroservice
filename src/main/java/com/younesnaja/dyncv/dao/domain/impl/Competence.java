package com.younesnaja.dyncv.dao.domain.impl;

import java.util.List;

public class Competence {

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
