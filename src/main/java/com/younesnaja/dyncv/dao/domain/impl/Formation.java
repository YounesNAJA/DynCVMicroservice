package com.younesnaja.dyncv.dao.domain.impl;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Formation extends StandardDomainObjectImpl {

    private String etablissement;

    private String ville;

    private String diplome;

    private String option;

    private Date annee_debut;

    private Date annee_fin;

    public String getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(String etablissement) {
        this.etablissement = etablissement;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public Date getAnnee_debut() {
        return annee_debut;
    }

    public void setAnnee_debut(Date annee_debut) {
        this.annee_debut = annee_debut;
    }

    public Date getAnnee_fin() {
        return annee_fin;
    }

    public void setAnnee_fin(Date annee_fin) {
        this.annee_fin = annee_fin;
    }
}
