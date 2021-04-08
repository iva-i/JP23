/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.zavrsni.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Skec
 */
@Entity
public class Racun extends Entitet{
    
    @ManyToOne
    @NotNull(message = "Obavezan unos djelatnika!")
    private Djelatnik djelatnik;
    @ManyToOne
    private Kupac kupac;
    private BigDecimal rabat;
    
    @OneToMany(mappedBy = "racun")
    private List<Stavka> stavke = new ArrayList<>();

    public List<Stavka> getStavke() {
        return stavke;
    }

    public void setStavke(List<Stavka> stavke) {
        this.stavke = stavke;
    }

    public Djelatnik getDjelatnik() {
        return djelatnik;
    }

    public void setDjelatnik(Djelatnik djelatnik) {
        this.djelatnik = djelatnik;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public BigDecimal getRabat() {
        return rabat;
    }

    public void setRabat(BigDecimal rabat) {
        this.rabat = rabat;
    }   
    
}
