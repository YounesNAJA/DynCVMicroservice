package com.younesnaja.dyncv.service;

import com.younesnaja.dyncv.dao.domain.Competence;
import com.younesnaja.dyncv.dao.repository.CompetenceRepository;
import com.younesnaja.dyncv.exception.client.FormationNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Optional;

@Service
public class CompetenceService {
    private CompetenceRepository competenceRepository;

    public CompetenceRepository getCompetenceRepository() {
        return competenceRepository;
    }

    @Autowired
    public void setCompetenceRepository(CompetenceRepository competenceRepository) {
        this.competenceRepository = competenceRepository;
    }

    /**
     * Get formation by ID
     * @param id
     * @return
     * @throws FormationNotFoundException
     */
    public Competence getCompetenceById(BigInteger id) throws FormationNotFoundException{
        Optional<Competence> competence = competenceRepository.findById(id);
        if(!competence.isPresent()){
            throw new FormationNotFoundException(id);
        } else {
            return competence.get();
        }
    }

    /**
     * Get all formations
     * @return
     */
    public Iterable<Competence> getAllCompetence(){
       return competenceRepository.findAll();
    }
}
