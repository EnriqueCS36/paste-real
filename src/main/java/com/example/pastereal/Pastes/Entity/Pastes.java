/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.pastereal.Pastes.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author crazm
 */

@Entity
@Table(name = "pastes")
public class Pastes implements  Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pastes")
    private Long id;
    
    @Column(name = "paste")
    private String pastes;
    
    @Column(name = "existencia")
    private Long existencia;
    
    @Column(name = "horneados")
    private Long horneados;
    
    @Column(name = "maltratados")
    private Long maltratados;
    
    @Column(name = "costo")
    private Double costo;
    
    @Column(name = "eliminado")
    private boolean eliminado = false; 

    public Pastes() {
    }

    public Pastes(Long id, String pastes, Long existencia, Long horneados, Long maltratados, Double costo) {
        this.id = id;
        this.pastes = pastes;
        this.existencia = existencia;
        this.horneados = horneados;
        this.maltratados = maltratados;
        this.costo = costo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPastes() {
        return pastes;
    }

    public void setPastes(String pastes) {
        this.pastes = pastes;
    }

    public Long getExistencia() {
        return existencia;
    }

    public void setExistencia(Long existencia) {
        this.existencia = existencia;
    }

    public Long getHorneados() {
        return horneados;
    }

    public void setHorneados(Long horneados) {
        this.horneados = horneados;
    }

    public Long getMaltratados() {
        return maltratados;
    }

    public void setMaltratados(Long maltratados) {
        this.maltratados = maltratados;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    
}
