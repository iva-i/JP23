/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.zavrsni.rad;

import edunova.zavrsni.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Skec
 */
public class Start {
    
    public static void main(String[] args) {
        
        Session s = HibernateUtil.getSession();
        
    }
    
}
