package com.younesnaja.dyncv.controller;


import com.younesnaja.dyncv.service.impl.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.BasePathAwareController;

@BasePathAwareController
public class PersonneController {
    private PersonneService personneService;

    public PersonneService getPersonneService() {
        return personneService;
    }

    @Autowired
    public void setPersonneService(PersonneService personneService) {
        this.personneService = personneService;
    }

    /*    @RequestMapping(path="formations/{id}", method=RequestMethod.GET, produces="application/hal+json")
    public Formation getFormationById(@PathVariable("id") BigInteger id) {
        return formationService.getFormationById(id);
    }*/
}
