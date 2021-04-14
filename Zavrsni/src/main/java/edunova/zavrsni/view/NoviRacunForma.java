/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.zavrsni.view;

import edunova.zavrsni.controller.ObradaKupac;
import edunova.zavrsni.controller.ObradaProizvod;
import edunova.zavrsni.controller.ObradaRacun;
import edunova.zavrsni.controller.ObradaStavka;
import edunova.zavrsni.model.Kupac;
import edunova.zavrsni.model.Proizvod;
import edunova.zavrsni.model.Racun;
import edunova.zavrsni.model.Stavka;
import edunova.zavrsni.util.ZavrsniRadException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Skec
 */
public class NoviRacunForma extends javax.swing.JFrame {
    
    private ObradaProizvod obradaProizvod;
    private ObradaRacun obradaRacun;
    private ObradaStavka obradaStavka;
    private ObradaKupac obradaKupac;

    /**
     * Creates new form NoviRacunForma
     */
    public NoviRacunForma() {
        initComponents();
        obradaProizvod = new ObradaProizvod();
        obradaRacun = new ObradaRacun();
        Racun racun = new Racun();
        obradaRacun.setEntitet(racun);
        
        postaviDjelatnikaNaRacun();
        
        try {
            obradaRacun.create();
        } catch (ZavrsniRadException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getPoruka());
        }
        
        obradaStavka = new ObradaStavka();  
        obradaKupac = new ObradaKupac();
        
        lblBrojRacuna.setText(obradaRacun.getEntitet().getSifra().toString());
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        lstSviProizvodi = new javax.swing.JList<>();
        txtPronadiProizvod = new javax.swing.JTextField();
        btnTraziProizvod = new javax.swing.JButton();
        btnPrikaziSveProizvode = new javax.swing.JButton();
        btnPotvrdi = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstStavkeRacuna = new javax.swing.JList<>();
        btnDodajStavku = new javax.swing.JButton();
        btnObrisiStavku = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUkupnaCijena = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtKolicina = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblBrojRacuna = new javax.swing.JLabel();
        txtPronadiKupca = new javax.swing.JTextField();
        btnTraziKupca = new javax.swing.JButton();
        btnPrikaziSveKupce = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstKupci = new javax.swing.JList<>();
        btnOdaberiKupca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setViewportView(lstSviProizvodi);

        txtPronadiProizvod.setText("Pronađi proizvod");
        txtPronadiProizvod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPronadiProizvodMouseClicked(evt);
            }
        });

        btnTraziProizvod.setText("Traži");
        btnTraziProizvod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziProizvodActionPerformed(evt);
            }
        });

        btnPrikaziSveProizvode.setText("Prikaži sve proizvode");
        btnPrikaziSveProizvode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrikaziSveProizvodeActionPerformed(evt);
            }
        });

        btnPotvrdi.setText("Potvrdi");
        btnPotvrdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotvrdiActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(lstStavkeRacuna);

        btnDodajStavku.setText(">> Dodaj stavku >>");
        btnDodajStavku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajStavkuActionPerformed(evt);
            }
        });

        btnObrisiStavku.setText("<< Obriši stavku <<");
        btnObrisiStavku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiStavkuActionPerformed(evt);
            }
        });

        jLabel1.setText("Proizvodi računa:");

        jLabel2.setText("Ukupno:");

        lblUkupnaCijena.setText("jLabel3");

        jLabel3.setText("Količina:");

        txtKolicina.setText("1");

        jLabel4.setText("Broj računa: ");

        lblBrojRacuna.setText("   ");

        txtPronadiKupca.setText("Pronađi kupca");
        txtPronadiKupca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPronadiKupcaMouseClicked(evt);
            }
        });

        btnTraziKupca.setText("Traži");
        btnTraziKupca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziKupcaActionPerformed(evt);
            }
        });

        btnPrikaziSveKupce.setText("Prikaži sve kupce");
        btnPrikaziSveKupce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrikaziSveKupceActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(lstKupci);

        btnOdaberiKupca.setText("Postavi kupca");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPotvrdi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPrikaziSveKupce, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPronadiKupca, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTraziKupca, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnOdaberiKupca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnPrikaziSveProizvode, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnObrisiStavku, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKolicina, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDodajStavku)
                                    .addComponent(jLabel3))
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtPronadiProizvod, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTraziProizvod, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(174, 174, 174)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUkupnaCijena, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBrojRacuna)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPronadiProizvod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTraziProizvod)
                            .addComponent(txtPronadiKupca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTraziKupca))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblBrojRacuna))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPrikaziSveProizvode)
                        .addComponent(btnPrikaziSveKupce))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtKolicina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(84, 84, 84)
                                        .addComponent(btnDodajStavku)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnObrisiStavku)
                                        .addGap(76, 76, 76))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(lblUkupnaCijena)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnOdaberiKupca)))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPotvrdi)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrikaziSveProizvodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrikaziSveProizvodeActionPerformed
        
        ucitajSveProizvode();
        
    }//GEN-LAST:event_btnPrikaziSveProizvodeActionPerformed

    private void btnPotvrdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotvrdiActionPerformed
        
        //TODO
        
    }//GEN-LAST:event_btnPotvrdiActionPerformed

    private void btnTraziProizvodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziProizvodActionPerformed
        
        DefaultListModel<Proizvod> m = new DefaultListModel<>();
        m.addAll(obradaProizvod.getPodaci(txtPronadiProizvod.getText()));
        lstSviProizvodi.setModel(m);
    }//GEN-LAST:event_btnTraziProizvodActionPerformed

    private void txtPronadiProizvodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPronadiProizvodMouseClicked
        
        txtPronadiProizvod.setText("");
    }//GEN-LAST:event_txtPronadiProizvodMouseClicked

    private void btnDodajStavkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajStavkuActionPerformed
        
        Stavka stavka = new Stavka();
        obradaStavka.setEntitet(stavka);        
             
        postaviVrijednostiNaStavku();        
               
        try {
            obradaStavka.create();
            obradaRacun.update();
        } catch (ZavrsniRadException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getPoruka());
        }       
                     
        txtKolicina.setText("1");
        
        ucitajProizvodeRacuna();        
    }//GEN-LAST:event_btnDodajStavkuActionPerformed

    private void txtPronadiKupcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPronadiKupcaMouseClicked
        
        txtPronadiKupca.setText("");
    }//GEN-LAST:event_txtPronadiKupcaMouseClicked

    private void btnTraziKupcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziKupcaActionPerformed
        
        DefaultListModel<Kupac> m = new DefaultListModel<>();
        m.addAll(obradaKupac.getPodaci(txtPronadiKupca.getText()));
        lstKupci.setModel(m);
    }//GEN-LAST:event_btnTraziKupcaActionPerformed

    private void btnPrikaziSveKupceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrikaziSveKupceActionPerformed
        
        ucitajSveKupce();
    }//GEN-LAST:event_btnPrikaziSveKupceActionPerformed

    private void btnObrisiStavkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiStavkuActionPerformed
        
        // Treba doraditi, briše stavku i ako je odabrana na listi svih proizvoda
        
        if (obradaStavka.getEntitet() == null || obradaStavka.getEntitet().getSifra() == null) {
            JOptionPane.showMessageDialog(rootPane, "Prvo odaberite stavku");
            return;
        }

        try {
            obradaStavka.delete();
            ucitajProizvodeRacuna();
        } catch (ZavrsniRadException e) {
            JOptionPane.showMessageDialog(rootPane, e.getPoruka());
        }
    }//GEN-LAST:event_btnObrisiStavkuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajStavku;
    private javax.swing.JButton btnObrisiStavku;
    private javax.swing.JButton btnOdaberiKupca;
    private javax.swing.JToggleButton btnPotvrdi;
    private javax.swing.JButton btnPrikaziSveKupce;
    private javax.swing.JButton btnPrikaziSveProizvode;
    private javax.swing.JButton btnTraziKupca;
    private javax.swing.JButton btnTraziProizvod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBrojRacuna;
    private javax.swing.JLabel lblUkupnaCijena;
    private javax.swing.JList<Kupac> lstKupci;
    private javax.swing.JList<Proizvod> lstStavkeRacuna;
    private javax.swing.JList<Proizvod> lstSviProizvodi;
    private javax.swing.JTextField txtKolicina;
    private javax.swing.JTextField txtPronadiKupca;
    private javax.swing.JTextField txtPronadiProizvod;
    // End of variables declaration//GEN-END:variables

    private void ucitajSveProizvode() {
        
        DefaultListModel<Proizvod> m = new DefaultListModel<>();
        m.addAll(obradaProizvod.getPodaci());
        lstSviProizvodi.setModel(m);        
    }

    private void postaviVrijednostiNaStavku() {
        
        var entitet = obradaStavka.getEntitet();
        
        entitet.setProizvod(lstSviProizvodi.getSelectedValue());        
        entitet.setKolicina(new BigDecimal(txtKolicina.getText()));        
        entitet.setRacun(obradaRacun.getEntitet());
        
    }

    private void postaviDjelatnikaNaRacun() {
        
        var entitet = obradaRacun.getEntitet();
        entitet.setDjelatnik(Aplikacija.djelatnik);
    }

    private void ucitajProizvodeRacuna() {
        
//        List<Stavka> stavke = obradaRacun.getEntitet().getStavke();
//        List<Proizvod> proizvodi = new ArrayList<>();
//        
//        for(int i = 0; i < stavke.size(); i++){
//            proizvodi.add(stavke.get(i).getProizvod());
//        }
//        
//        DefaultListModel<Proizvod> m = new DefaultListModel<>();
//        m.addAll(proizvodi);
//        lstStavkeRacuna.setModel(m);
        
        
//        List<Stavka> stavke = obradaRacun.getEntitet().getStavke();
//        List<Proizvod> proizvodi = new ArrayList<>();
//        
//        for(Stavka stavka : stavke){
//            proizvodi.add(stavka.getProizvod());
//        }
//        
//        DefaultListModel<Proizvod> m = new DefaultListModel<>();
//        m.addAll(proizvodi);
//        lstStavkeRacuna.setModel(m);
        
        
//        DefaultListModel<Proizvod> m = new DefaultListModel<>();
//        if(m.getSize() == 0){
//            m.add(m.getSize(),obradaStavka.getEntitet().getProizvod());
//        }else{
//            m.add(m.getSize()+1,obradaStavka.getEntitet().getProizvod());
//        }
//        lstStavkeRacuna.setModel(m);       
    }

    private void ucitajSveKupce() {
        
        DefaultListModel<Kupac> m = new DefaultListModel<>();
        m.addAll(obradaKupac.getPodaci());
        lstKupci.setModel(m);
    }
}
