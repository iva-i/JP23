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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Skec
 */
@Entity
public class Proizvod extends Entitet{
    
    @NotNull(message = "Naziv je obavezan unos! (not null)")
    @NotEmpty(message = "Naziv je obavezan unos!")
    private String naziv;
    private String proizvodac;
    private String opis;
    private BigDecimal cijena;
    private BigDecimal kolicinaNaStanju;

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

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public BigDecimal getKolicinaNaStanju() {
        return kolicinaNaStanju;
    }

    public void setKolicinaNaStanju(BigDecimal kolicinaNaStanju) {
        this.kolicinaNaStanju = kolicinaNaStanju;
    }

    @Override
    public String toString() {
        if(getNaziv()==null || getNaziv().trim().isEmpty()){
            return "[Naziv nije definiran]";
        }
        return getNaziv() + ", " + getCijena().toString();
    }
    
    
    
}
