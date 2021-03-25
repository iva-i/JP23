/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.zavrsni.util;

import com.github.javafaker.Faker;
import edunova.zavrsni.controller.ObradaKupac;
import edunova.zavrsni.model.Kupac;

/**
 *
 * @author Skec
 */
public class Test {
    
    public static void main(String[] args) {
        
        Faker faker = new Faker();
        ObradaKupac ok = new ObradaKupac();
        Kupac k;
        for(int i = 0; i < 10; i++){
            k = new Kupac();
            k.setIme(faker.name().firstName());
            k.setPrezime(faker.name().lastName());
            k.setAdresa(faker.address().toString());
            k.setNazivFirme(faker.company().toString());
            
            ok.setEntitet(k);
            
            try {
                ok.create();
            } catch (ZavrsniRadException e) {
                System.out.println(e.getPoruka());
            }

        }
    }
}
