package com.drakonor.sos_sheet.resources;

import com.drakonor.sos_sheet.entities.Sheet;
import com.drakonor.sos_sheet.services.SheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sheet")
public class SheetResource {

    @Autowired
    private SheetService service;

    @GetMapping
    public ResponseEntity<List<Sheet>> findAll(){
        List<Sheet> sheets = service.findAll();
        return ResponseEntity.ok().body(sheets);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sheet> findById(@PathVariable String id){
        Sheet sheet = service.findById(id);
        return ResponseEntity.ok().body(sheet);
    }

}
