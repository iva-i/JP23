/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.zavrsni.util;

import com.github.javafaker.Faker;
import edunova.zavrsni.controller.ObradaKupac;
import edunova.zavrsni.model.Kupac;
import edunova.zavrsni.model.Proizvod;
import edunova.zavrsni.model.Stavka;
import java.math.BigDecimal;

/**
 *
 * @author Skec
 */
public class Test {
    
    public static void main(String[] args) {
        
//        Faker faker = new Faker();
//        ObradaKupac ok = new ObradaKupac();
//        Kupac k;
//        for(int i = 0; i < 20; i++){
//            k = new Kupac();
//            k.setIme(faker.name().firstName());
//            k.setPrezime(faker.name().lastName());
//            k.setAdresa(faker.address().streetAddress() + ", " + faker.address().city());
//            //k.setNazivFirme(faker.company().name());
//            
//            ok.setEntitet(k);
//            
//            try {
//                ok.create();
//            } catch (ZavrsniRadException e) {
//                System.out.println(e.getPoruka());
//            }
//
//        }
        
        // provjera radi li metoda getCijena - RADI

        Proizvod p = new Proizvod();
        p.setNaziv("proizv");
        p.setCijena(new BigDecimal(10));
        Stavka s = new Stavka();
        s.setProizvod(p);
        s.setKolicina(BigDecimal.TEN);
        
        //System.out.println(s.getCijena());
        
        p.setNaziv("drugi");
        
        //System.out.println(p.getNaziv());
        
    }
}
