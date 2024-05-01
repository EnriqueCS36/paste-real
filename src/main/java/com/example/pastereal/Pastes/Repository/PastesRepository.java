/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.pastereal.Pastes.Repository;

import com.example.pastereal.Pastes.Entity.Pastes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author crazm
 */
@Repository
public interface PastesRepository extends JpaRepository<Pastes, Long>{
   
   //@Query("SELECT p FROM Pastes p where p. = 'false' ")
    List<Pastes> findAllPastesByEliminadoFalse();
}
