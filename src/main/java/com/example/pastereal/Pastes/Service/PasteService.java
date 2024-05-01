/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.pastereal.Pastes.Service;

import com.example.pastereal.Pastes.Entity.Pastes;
import java.util.List;

/**
 *
 * @author crazm
 */
public interface PasteService {
    
    List<Pastes> findAll();
    
    Pastes findById(Long id);
    
    Pastes save(Pastes pastes);

    Pastes update(Long id, Pastes pastes);
    
    Pastes deleted (Long id);
}
