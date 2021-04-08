/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.zavrsni.controller;

import edunova.zavrsni.model.Proizvod;
import edunova.zavrsni.util.ZavrsniRadException;
import java.util.List;
import org.hibernate.CacheMode;

/**
 *
 * @author Skec
 */
public class ObradaProizvod extends Obrada<Proizvod>{

    @Override
    public List<Proizvod> getPodaci() {
        List<Proizvod> lista = session.createQuery("from Proizvod").list();
        session.setCacheMode(CacheMode.IGNORE);
        return lista; 
       
    }
    
    public List<Proizvod> getPodaci(String uvjet) {
        return session.createQuery("from Proizvod p "
                + " where concat(p.naziv) "
                + " like :uvjet order by p.naziv")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(50)
                .list();
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
