package com.younesnaja.dyncv.controller;

import com.younesnaja.dyncv.service.impl.LangueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.BasePathAwareController;

@BasePathAwareController
public class LangueController {
    private LangueService langueService;

    public LangueService getLangueService() {
        return langueService;
    }

    @Autowired
    public void setLangueService(LangueService langueService) {
        this.langueService = langueService;
    }
}
