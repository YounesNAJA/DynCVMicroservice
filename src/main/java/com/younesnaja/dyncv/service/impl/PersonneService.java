package com.younesnaja.dyncv.service.impl;

import com.younesnaja.dyncv.dao.domain.impl.Formation;
import com.younesnaja.dyncv.dao.domain.impl.Personne;
import com.younesnaja.dyncv.dao.repository.PersonneRepository;
import com.younesnaja.dyncv.exception.client.FormationNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Optional;

@Service
public class PersonneService {
    private PersonneRepository personneRepository;

    public PersonneRepository getPersonneRepository() {
        return personneRepository;
    }

    @Autowired
    public void setPersonneRepository(PersonneRepository personneRepository) {
        this.personneRepository = personneRepository;
    }

    public Personne getById(BigInteger id) throws FormationNotFoundException {
        Optional<Personne> personne = personneRepository.findById(id);
        if(!personne.isPresent()){
            throw new FormationNotFoundException(id);
        } else {
            return personne.get();
        }
    }

    public Iterable getAll() {
        return personneRepository.findAll();
    }
}
