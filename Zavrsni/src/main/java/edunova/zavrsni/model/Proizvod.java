/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.zavrsni.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Skec
 */
@Entity
public class Proizvod {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sifra;
    private String sifraProizvoda, naziv, proizvodac, opis, mjernaJedinica;
    private Boolean naStanju;
    private double cijena, kolicinaNaStanju;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getSifraProizvoda() {
        return sifraProizvoda;
    }

    public void setSifraProizvoda(String sifraProizvoda) {
        this.sifraProizvoda = sifraProizvoda;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getProizvodac() {
        return proizvodac;
    }

    public void setProizvodac(String proizvodac) {
        this.proizvodac = proizvodac;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getMjernaJedinica() {
        return mjernaJedinica;
    }

    public void setMjernaJedinica(String mjernaJedinica) {
        this.mjernaJedinica = mjernaJedinica;
    }

    public Boolean getNaStanju() {
        return naStanju;
    }

    public void setNaStanju(Boolean naStanju) {
        this.naStanju = naStanju;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public double getKolicinaNaStanju() {
        return kolicinaNaStanju;
    }

    public void setKolicinaNaStanju(double kolicinaNaStanju) {
        this.kolicinaNaStanju = kolicinaNaStanju;
    }
    
    
    
}
