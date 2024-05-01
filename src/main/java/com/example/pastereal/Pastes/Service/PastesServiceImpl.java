/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.pastereal.Pastes.Service;

import com.example.pastereal.Pastes.Entity.Pastes;
import com.example.pastereal.Pastes.Repository.PastesRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.NotFound;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author crazm
 */
@Service
public class PastesServiceImpl implements PasteService{

    private final PastesRepository pastesRepository;

    public PastesServiceImpl(PastesRepository pastesRepository) {
        this.pastesRepository = pastesRepository;
    }
    
    
    
    @Override
    public List<Pastes> findAll() {
        return this.pastesRepository.findAllPastesByEliminadoFalse();
    }

    @Override
    public Pastes findById(Long id) {
        return pastesRepository.findById(id).get();
    }

    @Override
    public Pastes save(Pastes pastes) {
        return this.pastesRepository.save(pastes);
    }

    @Override
    public Pastes update(Long id, Pastes pastes) {
        
        Pastes toUpdate = pastesRepository.findById(id).get();
            
            toUpdate.setPastes(pastes.getPastes());
            toUpdate.setExistencia(pastes.getExistencia());
            toUpdate.setHorneados(pastes.getHorneados());
            toUpdate.setMaltratados(pastes.getMaltratados());
            toUpdate.setCosto(pastes.getCosto());
            
            return pastesRepository.save(toUpdate);
            
    }

    @Override
    public Pastes deleted(Long id) {
      
           Pastes toDelete = pastesRepository.findById(id).get();
            
         toDelete.setEliminado(true);
            
            return pastesRepository.save(toDelete);
    }
}
