package com.drakonor.sos_sheet.services;

import com.drakonor.sos_sheet.entities.Sheet;
import com.drakonor.sos_sheet.repositories.SheetRepository;
import com.drakonor.sos_sheet.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class SheetService {

    @Autowired
    private SheetRepository repository;

    public List<Sheet> findAll(){
        return repository.findAll();
    }

    public Sheet findById(String id){
        Optional<Sheet> sheet = repository.findById(id);
        if(sheet.isEmpty()){
            throw new ObjectNotFoundException("Ficha não encontrada");
        }
        return sheet.get();
    }
}
