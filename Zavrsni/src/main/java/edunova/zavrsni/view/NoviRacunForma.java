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
import java.text.SimpleDateFormat;
import java.util.Date;
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
        postaviDatum();
        
        try {
            obradaRacun.create();
        } catch (ZavrsniRadException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getPoruka());
        }
        
        obradaStavka = new ObradaStavka();  
        obradaKupac = new ObradaKupac();
        
        lblBrojRacuna.setText(obradaRacun.getEntitet().getSifra().toString());
        
        setTitle(Aplikacija.NASLOV_APP + " | Djelatnik: " + Aplikacija.djelatnik.getIme());
        
        txtUkupno.setEditable(false);
        setDefaultCloseOperation(NoviRacunForma.DO_NOTHING_ON_CLOSE);
        new Vrijeme().start();
    }
    
        private class Vrijeme extends Thread{
        
        private SimpleDateFormat df = new SimpleDateFormat("dd. MMMM YYYY. HH:mm:ss");

        @Override
        public void run() {
            while (true) {                
                lblVrijeme.setText(df.format(new Date()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
            }
        }
        
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
        jScrollPane2 = new javax.swing.JScrollPane();
        lstStavkeRacuna = new javax.swing.JList<>();
        btnDodajStavku = new javax.swing.JButton();
        btnObrisiStavku = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtKolicina = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblBrojRacuna = new javax.swing.JLabel();
        txtPronadiKupca = new javax.swing.JTextField();
        btnTraziKupca = new javax.swing.JButton();
        btnPrikaziSveKupce = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstKupci = new javax.swing.JList<>();
        btnPostaviiKupca = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtRabat = new javax.swing.JTextField();
        txtUkupno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblKupacPostavljen = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblKupac = new javax.swing.JLabel();
        btnPovecaj = new javax.swing.JButton();
        btnSmanji = new javax.swing.JButton();
        btnPotvrdi = new javax.swing.JButton();
        lblSlika = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        lblVrijeme = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);

        lstSviProizvodi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(lstSviProizvodi);

        txtPronadiProizvod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPronadiProizvod.setText("Pronađi proizvod");
        txtPronadiProizvod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPronadiProizvodMouseClicked(evt);
            }
        });

        btnTraziProizvod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTraziProizvod.setText("Traži");
        btnTraziProizvod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziProizvodActionPerformed(evt);
            }
        });

        btnPrikaziSveProizvode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPrikaziSveProizvode.setText("Prikaži sve proizvode");
        btnPrikaziSveProizvode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrikaziSveProizvodeActionPerformed(evt);
            }
        });

        lstStavkeRacuna.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(lstStavkeRacuna);

        btnDodajStavku.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDodajStavku.setText("Dodaj →");
        btnDodajStavku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajStavkuActionPerformed(evt);
            }
        });

        btnObrisiStavku.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnObrisiStavku.setText("← Obriši");
        btnObrisiStavku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiStavkuActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Proizvodi računa:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Ukupno:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Količina:");

        txtKolicina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtKolicina.setText("1");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Broj računa: ");

        lblBrojRacuna.setBackground(new java.awt.Color(255, 0, 0));
        lblBrojRacuna.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBrojRacuna.setText("   ");

        txtPronadiKupca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPronadiKupca.setText("Pronađi kupca");
        txtPronadiKupca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPronadiKupcaMouseClicked(evt);
            }
        });

        btnTraziKupca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTraziKupca.setText("Traži");
        btnTraziKupca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziKupcaActionPerformed(evt);
            }
        });

        btnPrikaziSveKupce.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPrikaziSveKupce.setText("Prikaži sve kupce");
        btnPrikaziSveKupce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrikaziSveKupceActionPerformed(evt);
            }
        });

        lstKupci.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(lstKupci);

        btnPostaviiKupca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPostaviiKupca.setText("Postavi kupca");
        btnPostaviiKupca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostaviiKupcaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Rabat:");

        txtRabat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRabat.setText("0");

        txtUkupno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("kn");

        lblKupacPostavljen.setForeground(new java.awt.Color(255, 0, 0));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Kupac:");

        lblKupac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblKupac.setText("[kupac nije postavljen]");

        btnPovecaj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPovecaj.setText("+");
        btnPovecaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPovecajActionPerformed(evt);
            }
        });

        btnSmanji.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSmanji.setText("-");
        btnSmanji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSmanjiActionPerformed(evt);
            }
        });

        btnPotvrdi.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnPotvrdi.setText("Potvrdi");
        btnPotvrdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotvrdiActionPerformed(evt);
            }
        });

        lblSlika.setIcon(new javax.swing.ImageIcon("D:\\Users\\Skec\\Desktop\\shopping-cart-loaded.png")); // NOI18N

        jToolBar1.setRollover(true);

        lblVrijeme.setText("vrijeme");
        jToolBar1.add(lblVrijeme);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPotvrdi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblKupacPostavljen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(718, 718, 718))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtPronadiKupca, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnTraziKupca, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnPrikaziSveKupce, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addComponent(btnPostaviiKupca, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRabat, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnPrikaziSveProizvode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPronadiProizvod, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTraziProizvod, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBrojRacuna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnSmanji)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtKolicina, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnPovecaj))
                                            .addComponent(btnDodajStavku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnObrisiStavku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(lblSlika)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUkupno, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblKupac, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(18, Short.MAX_VALUE))))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPronadiKupca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPronadiProizvod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTraziProizvod)
                            .addComponent(jLabel4)
                            .addComponent(lblBrojRacuna)
                            .addComponent(jLabel7)
                            .addComponent(lblKupac))
                        .addComponent(btnTraziKupca)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPrikaziSveKupce)
                            .addComponent(btnPrikaziSveProizvode, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSmanji)
                            .addComponent(txtKolicina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPovecaj))
                        .addGap(84, 84, 84)
                        .addComponent(btnDodajStavku)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnObrisiStavku)
                        .addGap(18, 18, 18)
                        .addComponent(lblSlika, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtUkupno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(jLabel5)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btnPostaviiKupca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRabat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(btnPotvrdi)
                .addGap(18, 18, 18)
                .addComponent(lblKupacPostavljen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrikaziSveProizvodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrikaziSveProizvodeActionPerformed
        
        ucitajSveProizvode();        
    }//GEN-LAST:event_btnPrikaziSveProizvodeActionPerformed

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
        postaviCijenu();
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
        
        if (obradaStavka.getEntitet() == null || obradaStavka.getEntitet().getSifra() == null) {
            JOptionPane.showMessageDialog(rootPane, "Prvo odaberite stavku");
            return;
        }
        
        Racun racun = obradaRacun.getEntitet();
        List<Stavka> stavke = racun.getStavke();
        stavke.remove(lstStavkeRacuna.getSelectedValue());
        
        try {
            obradaStavka.delete();
            obradaRacun.update();
        } catch (ZavrsniRadException e) {
            JOptionPane.showMessageDialog(rootPane, e.getPoruka());
        }
        
        ucitajProizvodeRacuna();
        postaviCijenu();
    }//GEN-LAST:event_btnObrisiStavkuActionPerformed

    private void btnPostaviiKupcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostaviiKupcaActionPerformed
        
        postaviKupcaNaRacun();
    }//GEN-LAST:event_btnPostaviiKupcaActionPerformed

    private void btnSmanjiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSmanjiActionPerformed
        
        if(Integer.parseInt(txtKolicina.getText()) == 1){
            JOptionPane.showMessageDialog(rootPane, "Količina je 1. Ne može se umanjiti.");
        }else{
            txtKolicina.setText(String.valueOf(Integer.parseInt(txtKolicina.getText())-1));
        }
    }//GEN-LAST:event_btnSmanjiActionPerformed

    private void btnPovecajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPovecajActionPerformed
        
        txtKolicina.setText(String.valueOf(Integer.parseInt(txtKolicina.getText())+1));
    }//GEN-LAST:event_btnPovecajActionPerformed

    private void btnPotvrdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotvrdiActionPerformed
        
        if(provjeriRacun()){
            JOptionPane.showMessageDialog(rootPane, "Za platiti: " + txtUkupno.getText());
            dispose();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Upozorenje (nema stavki) - račun neće bit spremljen!");
            dispose();
        }
    }//GEN-LAST:event_btnPotvrdiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajStavku;
    private javax.swing.JButton btnObrisiStavku;
    private javax.swing.JButton btnPostaviiKupca;
    private javax.swing.JButton btnPotvrdi;
    private javax.swing.JButton btnPovecaj;
    private javax.swing.JButton btnPrikaziSveKupce;
    private javax.swing.JButton btnPrikaziSveProizvode;
    private javax.swing.JButton btnSmanji;
    private javax.swing.JButton btnTraziKupca;
    private javax.swing.JButton btnTraziProizvod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblBrojRacuna;
    private javax.swing.JLabel lblKupac;
    private javax.swing.JLabel lblKupacPostavljen;
    private javax.swing.JLabel lblSlika;
    private javax.swing.JLabel lblVrijeme;
    private javax.swing.JList<Kupac> lstKupci;
    private javax.swing.JList<Stavka> lstStavkeRacuna;
    private javax.swing.JList<Proizvod> lstSviProizvodi;
    private javax.swing.JTextField txtKolicina;
    private javax.swing.JTextField txtPronadiKupca;
    private javax.swing.JTextField txtPronadiProizvod;
    private javax.swing.JTextField txtRabat;
    private javax.swing.JTextField txtUkupno;
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
        obradaRacun.getEntitet().getStavke().add(entitet);
        
    }

    private void postaviDjelatnikaNaRacun() {        
        var entitet = obradaRacun.getEntitet();
        entitet.setDjelatnik(Aplikacija.djelatnik);
    }

    private void ucitajProizvodeRacuna() {
        
        List<Stavka> stavke = obradaRacun.getEntitet().getStavke();
        DefaultListModel<Stavka> m = new DefaultListModel<>();
        m.addAll(stavke);
        lstStavkeRacuna.setModel(m);     
    }

    private void ucitajSveKupce() {
        
        DefaultListModel<Kupac> m = new DefaultListModel<>();
        m.addAll(obradaKupac.getPodaci());
        lstKupci.setModel(m);
    }

    private void postaviCijenu() {
        
        // loše osmišljeno
        
        List<Stavka> stavke = obradaRacun.getEntitet().getStavke();
        
        double cj = 0;
        double cijenaProizvoda = 0;
        
        for(int i = 0; i < stavke.size(); i++){
            cijenaProizvoda = stavke.get(i).getKolicina().doubleValue() *  
                    stavke.get(i).getProizvod().getCijena().doubleValue();
            cj += cijenaProizvoda;
        }
        
        double rabat = 1;
        
        if(provjeriRabat()){
            rabat = Double.parseDouble(txtRabat.getText());
        }
        
        if(rabat != 0){
            rabat = 100 - rabat;
            rabat /= 100;
            cj *= rabat;
        }
        
        String uk = String.format("%.2f",cj);
        
        txtUkupno.setText(uk);        
        
    }

    private boolean provjeriRabat(){
        
        BigDecimal rabat = new BigDecimal(Double.valueOf(txtRabat.getText()));
        boolean ispravan = false;
        
        if(rabat.longValue() < 0 || rabat.longValue() > 80){
            JOptionPane.showMessageDialog(rootPane, "Rabat neispravan!");
        }else{
            var entitet = obradaRacun.getEntitet();
            entitet.setRabat(rabat);
            ispravan = true;
        }
        
        return ispravan;
    }

    private boolean provjeriRacun() {
        
        List<Stavka> stavke = obradaRacun.getEntitet().getStavke();
        boolean racunOK = true;
        
        if(stavke.size() == 0){
            racunOK = false;
            try {
                obradaRacun.delete();
            } catch (ZavrsniRadException ex) {
                ex.printStackTrace();
            }
        }
        
        return racunOK;
    }

    private void postaviKupcaNaRacun() {
                
        try {
            if (lstKupci.getSelectedValue().getSifra() == null) {
                JOptionPane.showMessageDialog(rootPane, "Prvo odaberite kupca");
            }else{
                var entitet = obradaRacun.getEntitet();
                entitet.setKupac(lstKupci.getSelectedValue());
                lblKupacPostavljen.setText("Kupac postavljen!");
                lblKupac.setText(obradaRacun.getEntitet().getKupac().toString());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Prvo odaberite kupca");
        }
        
    }

    private void postaviDatum() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy. HH:mm:ss");
        Date date = new Date();

        String frmtdDate = dateFormat.format(date);
        
        obradaRacun.getEntitet().setDatumKreiranja(frmtdDate);
    }

}
