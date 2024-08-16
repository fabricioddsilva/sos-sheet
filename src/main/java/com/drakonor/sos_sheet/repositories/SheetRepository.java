package com.drakonor.sos_sheet.repositories;

import com.drakonor.sos_sheet.entities.Sheet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SheetRepository extends MongoRepository<Sheet, String> {
}
