/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.zavrsni.util;

import edunova.zavrsni.controller.ObradaDjelatnik;
import edunova.zavrsni.model.Djelatnik;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Skec
 */
public class KreirajDjelatnika {
    
    public static void main(String[] args) {
        
//        Djelatnik djelatnik1 = new Djelatnik();
//        djelatnik1.setIme("Iva");
//        djelatnik1.setSifraDjelatnika(BCrypt.hashpw("1234", BCrypt.gensalt()));
//        
          ObradaDjelatnik oo = new ObradaDjelatnik();
//        oo.setEntitet(djelatnik1);
//        
//        try {
//            oo.create();
//        } catch (ZavrsniRadException e) {
//            System.out.println(e.getMessage());
//        }
        
        Djelatnik djelatnik2 = new Djelatnik();
        djelatnik2.setIme("djelatnik");
        djelatnik2.setSifraDjelatnika(BCrypt.hashpw("1234", BCrypt.gensalt()));
        
        oo.setEntitet(djelatnik2);
        
        try {
            oo.create();
        } catch (ZavrsniRadException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
