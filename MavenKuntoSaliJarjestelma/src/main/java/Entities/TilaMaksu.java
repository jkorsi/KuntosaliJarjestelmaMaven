/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Antti Käyhkö
 */
@Entity
@Table(name = "tilamaksut")
public class TilaMaksu extends MaksuTapahtuma{

    /**
     * Tilamaksu luokan konstruktori
     */
    public TilaMaksu() {
    }
    
    @ManyToOne(targetEntity = Tila.class)
    @JoinColumn(name="tilaID")
    private int tilaID;

    /**
     *  Hae tilan id
     * @return tilan id
     */
    public int getTilaID() {
        return tilaID;
    }

    /**
     * Aseta tilan id
     * @param tilaID tilan id
     */
    public void setTilaID(int tilaID) {
        this.tilaID = tilaID;
    }
    
}
