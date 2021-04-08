/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.zavrsni.view;

import edunova.zavrsni.controller.ObradaRacun;
import edunova.zavrsni.model.Racun;
import edunova.zavrsni.util.ZavrsniRadException;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Skec
 */
public class IzbornikPokusajTreci extends javax.swing.JFrame {

    private ObradaRacun obradaRacun;
    
    /**
     * Creates new form IzbornikPokusajTreci
     */
    public IzbornikPokusajTreci() {
        initComponents();
        obradaRacun = new ObradaRacun();
        setTitle(Aplikacija.NASLOV_APP + " | Djelatnik: " + Aplikacija.djelatnik.getIme());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblProizvodi = new javax.swing.JLabel();
        lblKupci = new javax.swing.JLabel();
        btnKreirajNoviRacun = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblProizvodi.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        lblProizvodi.setText("Proizvodi");
        lblProizvodi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblProizvodiMouseReleased(evt);
            }
        });

        lblKupci.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        lblKupci.setText("Kupci");
        lblKupci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblKupciMouseReleased(evt);
            }
        });

        btnKreirajNoviRacun.setText("Kreiraj novi račun");
        btnKreirajNoviRacun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKreirajNoviRacunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKupci, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProizvodi, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKreirajNoviRacun, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(lblProizvodi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKupci, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(btnKreirajNoviRacun)
                .addGap(66, 66, 66))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblProizvodiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProizvodiMouseReleased
        new ProizvodiForma().setVisible(true);
    }//GEN-LAST:event_lblProizvodiMouseReleased

    private void lblKupciMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKupciMouseReleased
        new KupciForma().setVisible(true);
    }//GEN-LAST:event_lblKupciMouseReleased

    private void btnKreirajNoviRacunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKreirajNoviRacunActionPerformed
        
        obradaRacun.setEntitet(new Racun());
        
        postaviDjelatnikaNaRacun();
        
        try {
            obradaRacun.create();
        } catch (ZavrsniRadException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getPoruka());
        }
        
        new NoviRacunForma().setVisible(true);
    }//GEN-LAST:event_btnKreirajNoviRacunActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKreirajNoviRacun;
    private javax.swing.JLabel lblKupci;
    private javax.swing.JLabel lblProizvodi;
    // End of variables declaration//GEN-END:variables

    private void postaviDjelatnikaNaRacun() {
        
        var entitet = obradaRacun.getEntitet();
        
        entitet.setDjelatnik(Aplikacija.djelatnik);
        
    }
}
