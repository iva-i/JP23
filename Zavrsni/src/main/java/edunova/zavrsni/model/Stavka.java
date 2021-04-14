/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.zavrsni.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Skec
 */
@Entity
public class Stavka extends Entitet{

    @ManyToOne
    @NotNull(message = "Obavezan unos proizvoda!")
    private Proizvod proizvod;
    @ManyToOne
    @NotNull(message = "Obavezan unos računa!")
    private Racun racun;
    private BigDecimal kolicina;
    private BigDecimal cijena;

    public Proizvod getProizvod() {
        return proizvod;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public Racun getRacun() {
        return racun;
    }

    public void setRacun(Racun racun) {
        this.racun = racun;
    }

    public BigDecimal getKolicina() {
        return kolicina;
    }

    public void setKolicina(BigDecimal kolicina) {
        this.kolicina = kolicina;
    }

    /**
     * Metoda sama računa iznos!
     */
    public BigDecimal getCijena() {
        return proizvod.getCijena().multiply(this.kolicina);
    }  

    @Override
    public String toString() {
        return proizvod.getNaziv();
    }
    
    
    
    
}
