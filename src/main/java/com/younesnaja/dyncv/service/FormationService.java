package com.younesnaja.dyncv.service;

import com.younesnaja.dyncv.dao.domain.Formation;
import com.younesnaja.dyncv.dao.repository.FormationRepository;
import com.younesnaja.dyncv.exception.client.FormationNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Optional;

@Service
public class FormationService {
    private FormationRepository formationRepository;

    @Autowired
    public void setFormationRepository(FormationRepository formationRepository) {
        this.formationRepository = formationRepository;
    }

    public FormationRepository getFormationRepository() {
        return formationRepository;
    }

    /**
     * Get formation by ID
     * @param id
     * @return
     * @throws FormationNotFoundException
     */
    public Formation getFormationById(BigInteger id) throws FormationNotFoundException{
        Optional<Formation> formation = formationRepository.findById(id);
        if(!formation.isPresent()){
            throw new FormationNotFoundException(id);
        } else {
            return formation.get();
        }
    }

    /**
     * Get all formations
     * @return
     */
    public Iterable<Formation> getAllFormation(){
       return formationRepository.findAll();
    }
}
