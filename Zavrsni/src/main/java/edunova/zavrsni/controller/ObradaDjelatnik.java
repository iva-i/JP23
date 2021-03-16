/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.zavrsni.controller;

import edunova.zavrsni.model.Djelatnik;
import edunova.zavrsni.util.ZavrsniRadException;
import java.util.List;

/**
 *
 * @author Skec
 */
public class ObradaDjelatnik extends ObradaOsoba<Djelatnik>{

    @Override
    public List<Djelatnik> getPodaci() {
      return session.createQuery("from Djelatnik").list(); 
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
