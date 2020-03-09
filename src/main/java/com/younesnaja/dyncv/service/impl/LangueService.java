package com.younesnaja.dyncv.service.impl;

import com.younesnaja.dyncv.dao.domain.impl.Formation;
import com.younesnaja.dyncv.dao.domain.impl.Langue;
import com.younesnaja.dyncv.dao.repository.LangueRepository;
import com.younesnaja.dyncv.exception.client.FormationNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Optional;

@Service
public class LangueService extends StandardServiceImpl<Langue> {
    private LangueRepository langueRepository;

    public LangueRepository getLangueRepository() {
        return langueRepository;
    }

    @Autowired
    public void setLangueRepository(LangueRepository langueRepository) {
        this.langueRepository = langueRepository;
    }

    @Override
    public Langue getById(BigInteger id) throws FormationNotFoundException {

        Optional<Langue> langue = langueRepository.findById(id);
        if(!langue.isPresent()){
            throw new FormationNotFoundException(id);
        } else {
            return langue.get();
        }
    }

    @Override
    public Iterable<Langue> getAll() {
        return langueRepository.findAll();
    }
}
