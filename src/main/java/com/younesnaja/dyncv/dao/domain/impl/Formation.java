package com.younesnaja.dyncv.dao.domain.impl;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Formation {

    private String etablissement;

    private String ville;

    private String diplome;

    private String option;

    @JsonFormat(pattern="yyyy")
    private Date anneeDebut;

    @JsonFormat(pattern="yyyy")
    private Date anneeFin;

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

    public Date getAnneeDebut() {
        return anneeDebut;
    }

    public void setAnneeDebut(Date anneeDebut) {
        this.anneeDebut = anneeDebut;
    }

    public Date getAnneeFin() {
        return anneeFin;
    }

    public void setAnneeFin(Date anneeFin) {
        this.anneeFin = anneeFin;
    }
}
