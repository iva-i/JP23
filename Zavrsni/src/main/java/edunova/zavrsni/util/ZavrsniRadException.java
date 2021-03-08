/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.zavrsni.util;

/**
 *
 * @author Skec
 */
public class ZavrsniRadException extends Exception{
    
    private String poruka;
    
    public ZavrsniRadException(String poruka){
        super();
        if(poruka!=null && poruka.length()>2 && poruka.endsWith(", ")){
            this.poruka = poruka.substring(0,poruka.length()-2);
    }else{
        this.poruka=poruka;
        }
        this.poruka=poruka;
    }

    public String getPoruka() {
        return poruka;
    }
    
    
}
