package com.younesnaja.dyncv.service.impl;

import com.younesnaja.dyncv.dao.domain.impl.Formation;
import com.younesnaja.dyncv.dao.repository.FormationRepository;
import com.younesnaja.dyncv.exception.client.FormationNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Optional;

@Service
public class FormationService extends StandardServiceImpl<Formation> {
    private FormationRepository formationRepository;

    @Autowired
    public void setFormationRepository(FormationRepository formationRepository) {
        this.formationRepository = formationRepository;
    }

    public FormationRepository getFormationRepository() {
        return formationRepository;
    }

    @Override
    public Formation getById(BigInteger id) throws FormationNotFoundException {
        Optional<Formation> formation = formationRepository.findById(id);
        if(!formation.isPresent()){
            throw new FormationNotFoundException(id);
        } else {
            return formation.get();
        }
    }

    @Override
    public Iterable getAll() {
        return formationRepository.findAll();
    }
}
