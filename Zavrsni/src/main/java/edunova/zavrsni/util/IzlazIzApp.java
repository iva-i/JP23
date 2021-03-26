/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.zavrsni.util;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author Skec
 */
public class IzlazIzApp extends JFrame{
    
    public IzlazIzApp(){
        
      addWindowListener(new WindowAdapter()
      {
         public void windowClosing(WindowEvent e)
         {
           dispose();
           System.exit(0);
         }
      });
   }
    
}
