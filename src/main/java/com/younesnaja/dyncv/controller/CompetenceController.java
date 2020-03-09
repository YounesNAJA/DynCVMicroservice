package com.younesnaja.dyncv.controller;


import com.younesnaja.dyncv.service.impl.CompetenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.BasePathAwareController;

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


/*    @RequestMapping(path="competences/{id}", method=RequestMethod.GET, produces="application/hal+json")
    public Competence getCompetenceById(@PathVariable("id") BigInteger id) {
        return competenceService.getCompetenceById(id);
    }*/
}
