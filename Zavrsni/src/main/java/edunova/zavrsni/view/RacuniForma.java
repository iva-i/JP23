/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.zavrsni.view;

import edunova.zavrsni.controller.ObradaProizvod;
import edunova.zavrsni.controller.ObradaRacun;
import edunova.zavrsni.controller.ObradaStavka;
import edunova.zavrsni.model.Proizvod;
import edunova.zavrsni.model.Racun;
import javax.swing.DefaultListModel;

/**
 *
 * @author Skec
 */
public class RacuniForma extends javax.swing.JFrame {
    
    private ObradaProizvod obradaProizvod;
    private ObradaStavka obradaStavka;
    private ObradaRacun obradaRacun;
    
    /**
     * Creates new form RacuniForma
     */
    public RacuniForma() {
        initComponents();
        obradaRacun = new ObradaRacun();
        setTitle(Aplikacija.NASLOV_APP + " | Djelatnik: " + Aplikacija.djelatnik.getIme());
        ucitajRacune();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstPopisRacuna = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstStavkeOdabranogRacuna = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setViewportView(lstPopisRacuna);

        jScrollPane2.setViewportView(lstStavkeOdabranogRacuna);

        jLabel1.setText("Popis računa:");

        jLabel2.setText("Stavke odabranog računa: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<Racun> lstPopisRacuna;
    private javax.swing.JList<Proizvod> lstStavkeOdabranogRacuna;
    // End of variables declaration//GEN-END:variables

    private void ucitajRacune() {
        
        DefaultListModel<Racun> m = new DefaultListModel<>();

        m.addAll(obradaRacun.getPodaci());

        lstPopisRacuna.setModel(m);
    }
}