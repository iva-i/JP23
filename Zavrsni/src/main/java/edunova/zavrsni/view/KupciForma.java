/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.zavrsni.view;

import edunova.zavrsni.controller.ObradaKupac;
import edunova.zavrsni.model.Kupac;
import edunova.zavrsni.util.ZavrsniRadException;
import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Skec
 */
public class KupciForma extends javax.swing.JFrame {

    private ObradaKupac obrada;
    
    /**
     * Creates new form KupciForma
     */
    public KupciForma() {
        
        initComponents();
        obrada = new ObradaKupac();
        setTitle(Aplikacija.NASLOV_APP + " | Djelatnik: " + Aplikacija.djelatnik.getIme());
        ucitaj();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtImeKupca = new javax.swing.JTextField();
        txtPrezimeKupca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtOIB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNazivFirme = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAdresaKupca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnDodaj = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstKupci = new javax.swing.JList<>();
        btnOcistiPolja = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Ime kupca:");

        txtImeKupca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtImeKupcaKeyReleased(evt);
            }
        });

        txtPrezimeKupca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrezimeKupcaKeyReleased(evt);
            }
        });

        jLabel2.setText("Prezime kupca:");

        txtOIB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOIBKeyReleased(evt);
            }
        });

        jLabel3.setText("OIB:");

        txtNazivFirme.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNazivFirmeKeyReleased(evt);
            }
        });

        jLabel4.setText("Naziv firme:");

        jLabel5.setText("Adresa kupca:");

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        lstKupci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstKupciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstKupci);

        btnOcistiPolja.setText("Očisti polja");
        btnOcistiPolja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcistiPoljaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtImeKupca)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtPrezimeKupca)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtOIB)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtNazivFirme)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtAdresaKupca)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPromjeni, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(btnObrisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOcistiPolja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtImeKupca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrezimeKupca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOIB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNazivFirme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAdresaKupca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOcistiPolja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnObrisi)
                    .addComponent(btnPromjeni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed

        obrada.setEntitet(new Kupac());
        postaviVrijednostiNaEntitet();

        try {
            obrada.create();
            pocisti();
            ucitaj();
        } catch (ZavrsniRadException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getPoruka());
        }
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        
        if (obrada.getEntitet() == null || obrada.getEntitet().getSifra() == null) {
            JOptionPane.showMessageDialog(rootPane, "Prvo odaberite stavku");
            return;
        }

        try {
            obrada.delete();
            pocisti();
            ucitaj();
        } catch (ZavrsniRadException e) {
            JOptionPane.showMessageDialog(rootPane, e.getPoruka());
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed

        if (obrada.getEntitet() == null || obrada.getEntitet().getSifra() == null) {
            JOptionPane.showMessageDialog(rootPane, "Prvo odaberite stavku");
            return;
        }

        postaviVrijednostiNaEntitet();

        try {
            obrada.update();
            pocisti();
            ucitaj();
        } catch (ZavrsniRadException e) {
            JOptionPane.showMessageDialog(rootPane, e.getPoruka());
        }
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void lstKupciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstKupciValueChanged
       
        if (evt.getValueIsAdjusting()) {
            return;
        }
       
        if (lstKupci.getSelectedValue() == null) {
            return;
        }
        
        obrada.setEntitet(lstKupci.getSelectedValue());

        txtImeKupca.setText(obrada.getEntitet().getIme());
        
        if (obrada.getEntitet().getPrezime() != null) {
            txtPrezimeKupca.setText(obrada.getEntitet().getPrezime().toString());
        } else {
            txtPrezimeKupca.setText("");
        }
        
        if (obrada.getEntitet().getOib() != null) {
            txtOIB.setText(obrada.getEntitet().getOib().toString());
        } else {
            txtOIB.setText("");
        }
        
        try {
            txtNazivFirme.setText(obrada.getEntitet().getNazivFirme().toString());
        } catch (Exception e) {
            txtNazivFirme.setText("");
        }
        
        try {
            txtAdresaKupca.setText(obrada.getEntitet().getAdresa().toString());
        } catch (Exception e) {
            txtAdresaKupca.setText("");
        }
        
    }//GEN-LAST:event_lstKupciValueChanged

    private void txtImeKupcaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImeKupcaKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           txtPrezimeKupca.requestFocus();
        }
    }//GEN-LAST:event_txtImeKupcaKeyReleased

    private void txtPrezimeKupcaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrezimeKupcaKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           txtOIB.requestFocus();
        }
    }//GEN-LAST:event_txtPrezimeKupcaKeyReleased

    private void txtOIBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOIBKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           txtNazivFirme.requestFocus();
        }
    }//GEN-LAST:event_txtOIBKeyReleased

    private void txtNazivFirmeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNazivFirmeKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           txtAdresaKupca.requestFocus();
        }
    }//GEN-LAST:event_txtNazivFirmeKeyReleased

    private void btnOcistiPoljaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcistiPoljaActionPerformed
        pocisti();
    }//GEN-LAST:event_btnOcistiPoljaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnOcistiPolja;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Kupac> lstKupci;
    private javax.swing.JTextField txtAdresaKupca;
    private javax.swing.JTextField txtImeKupca;
    private javax.swing.JTextField txtNazivFirme;
    private javax.swing.JTextField txtOIB;
    private javax.swing.JTextField txtPrezimeKupca;
    // End of variables declaration//GEN-END:variables

    private void ucitaj() {
        
        DefaultListModel<Kupac> m = new DefaultListModel<>();

        m.addAll(obrada.getPodaci());

        lstKupci.setModel(m);
    }

    private void postaviVrijednostiNaEntitet() {
        
        var entitet = obrada.getEntitet();
        
        entitet.setIme(txtImeKupca.getText());
        
        try {
            entitet.setPrezime(txtPrezimeKupca.getText());
        } catch (Exception e) {
            entitet.setPrezime("");
        }
        
        try {
            entitet.setOib(txtOIB.getText());
        } catch (Exception e) {
            entitet.setOib("");
        }

        try {
            entitet.setNazivFirme(txtNazivFirme.getText());
        } catch (Exception e) {
            entitet.setNazivFirme("");
        }

        try {
            entitet.setAdresa(txtAdresaKupca.getText());
        } catch (Exception e) {
            entitet.setAdresa("");
        }
    }

    private void pocisti() {
        
        txtImeKupca.setText("");
        txtPrezimeKupca.setText("");
        txtOIB.setText("");
        txtNazivFirme.setText("");
        txtAdresaKupca.setText("");
    }
}
