/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Antti Käyhkö
 */
@Entity
public class TilaMaksu extends MaksuTapahtuma{

    public TilaMaksu() {
    }
    
    @ManyToOne
    @JoinColumn(name="tilaID")
    private int tilaID;

    public int getTilaID() {
        return tilaID;
    }

    public void setTilaID(int tilaID) {
        this.tilaID = tilaID;
    }
    
}
