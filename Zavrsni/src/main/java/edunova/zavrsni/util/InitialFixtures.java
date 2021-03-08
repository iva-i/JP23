/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.zavrsni.util;

import edunova.zavrsni.model.Djelatnik;
import edunova.zavrsni.model.Proizvod;
import org.hibernate.Session;

/**
 *
 * @author Skec
 */
public class InitialFixtures {
    
    public static void start(){
        
        Session s = HibernateUtil.getSession();
        s.beginTransaction();
        
        Djelatnik djelatnik1 = new Djelatnik();
        djelatnik1.setIme("Iva");
        djelatnik1.setPrezime("Ivezić");
        
        s.save(djelatnik1);
        
        Proizvod cokolada1 = new Proizvod();
        cokolada1.setCijena(6.99);
        cokolada1.setKolicinaNaStanju(100);
        cokolada1.setNaziv("Milka Oreo");
        
        s.save(cokolada1);
        
        Proizvod cokolada2 = new Proizvod();
        cokolada1.setCijena(5.99);
        cokolada1.setKolicinaNaStanju(50);
        cokolada1.setNaziv("Dorina Keks");
        
        s.save(cokolada2);
        
       
        s.getTransaction().commit();
        
    }
    
}
