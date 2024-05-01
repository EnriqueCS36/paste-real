/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.pastereal.Pastes.Controller;

import com.example.pastereal.Pastes.Entity.Pastes;
import com.example.pastereal.Pastes.Service.PasteService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author crazm
 */
@RestController
public class PastesController {
    
    private final PasteService pasteService;

    public PastesController(PasteService pasteService) {
        this.pasteService = pasteService;
    }
        
    
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/pastes", method = RequestMethod.GET)
    public ResponseEntity<List<Pastes>> findAllPastes() {
        return ResponseEntity.status(HttpStatus.OK).body(pasteService.findAll());
    }
    
    
     @CrossOrigin(origins = "*")
    @RequestMapping(value = "/pastes/{id}", method = RequestMethod.GET)
    public ResponseEntity<Pastes> getById(@PathVariable long id) {
        return ResponseEntity.status(HttpStatus.OK).body(pasteService.findById(id));
    }
    
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/pastes", method = RequestMethod.POST)
    public ResponseEntity<?> created(@RequestBody Pastes pastes) {
        return ResponseEntity.status(HttpStatus.CREATED).body(pasteService.save(pastes));
    }
    
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/archivo/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> update(@RequestBody Pastes paste ,@PathVariable long id) {
        return ResponseEntity.status(HttpStatus.OK).body(pasteService.update(id, paste));
    }
    
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/pastes/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleted(@PathVariable long id) {
        return ResponseEntity.status(HttpStatus.OK).body(pasteService.deleted(id));
    }
}
