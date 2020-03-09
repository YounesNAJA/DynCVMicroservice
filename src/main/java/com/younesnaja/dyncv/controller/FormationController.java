package com.younesnaja.dyncv.controller;


import com.younesnaja.dyncv.dao.domain.Formation;
import com.younesnaja.dyncv.service.FormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.math.BigInteger;

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

    @RequestMapping(path="formations/{id}", method=RequestMethod.GET, produces="application/hal+json")
    public Formation getFormationById(@PathVariable("id") BigInteger id) {
        return formationService.getFormationById(id);
    }
}
