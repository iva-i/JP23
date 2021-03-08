/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.zavrsni.controller;

import edunova.zavrsni.model.Stavka;
import edunova.zavrsni.util.ZavrsniRadException;
import java.util.List;

/**
 *
 * @author Skec
 */
public class ObradaStavka extends Obrada<Stavka>{

    @Override
    public List<Stavka> getPodaci() {
        return session.createQuery("from Stavka").list(); 
    }

    @Override
    protected void kontrolaCreate() throws ZavrsniRadException {
       
    }

    @Override
    protected void kontrolaUpdate() throws ZavrsniRadException {
        
    }

    @Override
    protected void kontrolaDelete() throws ZavrsniRadException {
        
    }
    
}
