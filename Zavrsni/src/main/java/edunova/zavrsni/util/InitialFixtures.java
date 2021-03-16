/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.zavrsni.util;

import edunova.zavrsni.model.Djelatnik;
import edunova.zavrsni.model.Proizvod;
import java.io.Serializable;
import java.math.BigDecimal;
import org.hibernate.Session;

/**
 *
 * @author Skec
 */
public class InitialFixtures {
    
    public static void start(){
        System.out.println("krecem izvoditi");
        
        Session s = HibernateUtil.getSession();
        s.beginTransaction();
        
        Djelatnik djelatnik1 = new Djelatnik();
        djelatnik1.setIme("Iva");
        
        s.save(djelatnik1);
        
        Proizvod cokolada1 = new Proizvod();
        cokolada1.setNaziv("Milka Oreo");
        cokolada1.setCijena(BigDecimal.valueOf(6.99));
        cokolada1.setKolicinaNaStanju(BigDecimal.ONE);
        
        s.save(cokolada1);
        
        Proizvod cokolada2 = new Proizvod();
        cokolada2.setNaziv("Dorina Keks");
        cokolada2.setCijena(BigDecimal.valueOf(5.99));
        cokolada2.setKolicinaNaStanju(BigDecimal.TEN);
        
        s.save(cokolada2);
        
       
        s.getTransaction().commit();
        
    }
    
}
