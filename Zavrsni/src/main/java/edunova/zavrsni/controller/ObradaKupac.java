/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.zavrsni.controller;

import edunova.zavrsni.model.Kupac;
import edunova.zavrsni.util.ZavrsniRadException;
import java.util.List;
import org.hibernate.CacheMode;

/**
 *
 * @author Skec
 */
public class ObradaKupac extends ObradaOsoba<Kupac>{
    
    @Override
    public List<Kupac> getPodaci() {
      List<Kupac> lista = session.createQuery("from Kupac").list();
      session.setCacheMode(CacheMode.IGNORE);
      return lista; 
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
