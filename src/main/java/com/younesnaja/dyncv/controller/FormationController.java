package com.younesnaja.dyncv.controller;


import com.younesnaja.dyncv.service.impl.FormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.BasePathAwareController;

@BasePathAwareController
public class FormationController {
    private FormationService formationService;

    @Autowired
    public void setFormationService(FormationService formationService) {
        this.formationService = formationService;
    }

    public FormationService getFormationService() {
        return formationService;
    }

/*    @RequestMapping(path="formations/{id}", method=RequestMethod.GET, produces="application/hal+json")
    public Formation getFormationById(@PathVariable("id") BigInteger id) {
        return formationService.getFormationById(id);
    }*/
}
