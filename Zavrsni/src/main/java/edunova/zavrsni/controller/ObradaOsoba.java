/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.zavrsni.controller;

import edunova.zavrsni.model.Osoba;
import edunova.zavrsni.util.ZavrsniRadException;
import java.util.List;
import org.hibernate.CacheMode;

/**
 *
 * @author Skec
 */
public abstract class ObradaOsoba<T extends Osoba> extends Obrada<T> {

//    @Override
//    public List<T> getPodaci() {
//        List<Osoba> lista =session.createQuery("from Proizvod").list();
//        session.setCacheMode(CacheMode.IGNORE);
//        return lista; 
//    }

    @Override
    protected void kontrolaCreate() throws ZavrsniRadException {
        kontrolaOIB();
    }

    @Override
    protected void kontrolaUpdate() throws ZavrsniRadException {
        kontrolaOIB();
    }

    @Override
    protected void kontrolaDelete() throws ZavrsniRadException {
        //TODO
    }
    
    private void kontrolaOIB() throws ZavrsniRadException{
        if(!oibValjan(entitet.getOib())){
            throw new ZavrsniRadException("OIB nije formalno ispravan");
        }
    }
    
    
    private boolean oibValjan(String oib){
        //https://regos.hr/app/uploads/2018/07/KONTROLA-OIB-a.pdf
        
        
        if (oib==null || oib.length() != 11) {
            return false;
        }

        try {
            Long.parseLong(oib);
        } catch (NumberFormatException e) {
            return false;
        }

        int a = 10;
        for (int i = 0; i < 10; i++) {
            a = a + Integer.parseInt(oib.substring(i, i + 1));
            a = a % 10;
            if (a == 0) {
                a = 10;
            }
            a *= 2;
            a = a % 11;
        }
        int kontrolni = 11 - a;
        if (kontrolni == 10) {
            kontrolni = 0;
        }
        return kontrolni == Integer.parseInt(oib.substring(10));

    }

    
}
