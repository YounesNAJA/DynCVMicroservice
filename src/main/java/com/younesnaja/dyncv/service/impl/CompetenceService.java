package com.younesnaja.dyncv.service.impl;

import com.younesnaja.dyncv.dao.domain.impl.Competence;
import com.younesnaja.dyncv.dao.repository.CompetenceRepository;
import com.younesnaja.dyncv.exception.client.FormationNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Optional;

@Service
public class CompetenceService extends StandardServiceImpl<Competence> {
    private CompetenceRepository competenceRepository;

    public CompetenceRepository getCompetenceRepository() {
        return competenceRepository;
    }

    @Autowired
    public void setCompetenceRepository(CompetenceRepository competenceRepository) {
        this.competenceRepository = competenceRepository;
    }

    @Override
    public Competence getById(BigInteger id) throws FormationNotFoundException {
        Optional<Competence> competence = competenceRepository.findById(id);
        if(!competence.isPresent()){
            throw new FormationNotFoundException(id);
        } else {
            return competence.get();
        }
    }

    @Override
    public Iterable getAll() {
        return competenceRepository.findAll();
    }
}
