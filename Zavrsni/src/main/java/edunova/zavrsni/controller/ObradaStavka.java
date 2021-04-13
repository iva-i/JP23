/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.zavrsni.controller;

import edunova.zavrsni.model.Proizvod;
import edunova.zavrsni.model.Racun;
import edunova.zavrsni.model.Stavka;
import edunova.zavrsni.util.ZavrsniRadException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Skec
 */
public class ObradaStavka extends Obrada<Stavka>{

    @Override
    public List<Stavka> getPodaci() {
        return session.createQuery("from Stavka").list(); 
    }
    
    public List<Stavka> getPodaci(String uvjet) {
        return session.createQuery("from Stavka s "
                + " where concat(s.racun) "
                + " = :uvjet")
                .setParameter("uvjet", uvjet)
                .setMaxResults(50)
                .list();
    }
    
    public List<Proizvod> getStavkeRacuna(String brojRacuna){   
        
//         List<Racun> racuni =  session.createQuery("from Racun where sifra = :brojRacuna")
//            .setParameter("brojRacuna", Long.parseLong(brojRacuna))
//            .list();
//         
//         List<Proizvod> proizvodi = new ArrayList<>();
//         
//         for(Racun racun : racuni){
//             for(Stavka stavka : racun.getStavke()){
//                 proizvodi.add(stavka.getProizvod());
//             }
//         }
//         
//         return proizvodi;    

        return null;
         
    }
    
    /**
     * select p.sifra
from proizvod p
inner join stavka s
on proizvod_sifra ps
inner join racun r
on s.racun_sifra = r.sifra; 
     *  
     */
//    }

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
