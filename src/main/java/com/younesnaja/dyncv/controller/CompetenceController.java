package com.younesnaja.dyncv.controller;


import com.younesnaja.dyncv.dao.domain.Competence;
import com.younesnaja.dyncv.dao.domain.Formation;
import com.younesnaja.dyncv.service.CompetenceService;
import com.younesnaja.dyncv.service.FormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.math.BigInteger;

@BasePathAwareController
public class CompetenceController {
    private CompetenceService competenceService;

    @Autowired
    public void setCompetenceService(CompetenceService competenceService) {
        this.competenceService = competenceService;
    }

    public CompetenceService getCompetenceService() {
        return competenceService;
    }


    @RequestMapping(path="competences/{id}", method=RequestMethod.GET, produces="application/hal+json")
    public Competence getCompetenceById(@PathVariable("id") BigInteger id) {
        return competenceService.getCompetenceById(id);
    }
}
