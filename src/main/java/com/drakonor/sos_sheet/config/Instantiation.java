package com.drakonor.sos_sheet.config;

import com.drakonor.sos_sheet.entities.*;
import com.drakonor.sos_sheet.entities.enums.Execution;
import com.drakonor.sos_sheet.entities.enums.Job;
import com.drakonor.sos_sheet.entities.enums.MagicCategory;
import com.drakonor.sos_sheet.entities.enums.MagicStructure;
import com.drakonor.sos_sheet.repositories.SheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private SheetRepository repository;

    @Override
    public void run(String... args) throws Exception {

        repository.deleteAll();

        Sheet valdisnei = new Sheet(null, "Valdisnei", "Drakonor", Job.CASTER, "Esper", 3, 3, 6, 6, 40, 40, 60, 60, 6, 18, 13, 6, new AbilityScore(2, 3, 3, 2, 3, 5),
                new Skills(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1),
                5, 10, "Magic Body: Magia pra krl", "Sobrecarga explosão chacabum\n mas magia", "Gravity: Atrai pra krl", new Inventory(3, 10, Arrays.asList("Pau de Magia", "Roupa de Magia", "Acessório de Magia")),
                List.of(new Magic("Ressucitar Mickey", MagicStructure.NECROMANCY, MagicCategory.SPECIAL, Execution.FULL_ACTION, "Toque", "1", "Instantânea", "5 Aqua + 5 Aer +5 Ignio", 15)));

        repository.save(valdisnei);


    }
}
