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

    public Djelatnik autoriziraj(String ime, char[] sifraDjelatnika){
       
        Djelatnik d = (Djelatnik)session
                .createQuery("from Djelatnik o where o.ime=:ime")
                .setParameter("ime", ime)
                .getSingleResult();
        if(d==null){
            return null;
        }
       // return BCrypt.checkpw(new String(lozinka),d.getSifra()) ? d : null;
        return null;
    }
   
    
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
