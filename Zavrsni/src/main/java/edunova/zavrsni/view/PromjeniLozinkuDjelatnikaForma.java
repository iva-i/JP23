/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.zavrsni.view;

import edunova.zavrsni.controller.ObradaDjelatnik;
import edunova.zavrsni.model.Djelatnik;
import edunova.zavrsni.util.ZavrsniRadException;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Skec
 */

//TODO

public class PromjeniLozinkuDjelatnikaForma extends javax.swing.JFrame {

    private ObradaDjelatnik obrada;
    /**
     * Creates new form PromjeniLozinkuDjelatnikaForma
     */
    public PromjeniLozinkuDjelatnikaForma() {
        initComponents();
        obrada = new ObradaDjelatnik();
        setTitle(Aplikacija.NASLOV_APP + " | Djelatnik: " + Aplikacija.djelatnik.getIme());
        lblImeDjelatnika.setText(Aplikacija.djelatnik.getIme());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnPromjeniLozinku = new javax.swing.JButton();
        lblImeDjelatnika = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pswNovaLozinka = new javax.swing.JPasswordField();
        pswNovaLozinkaPotvrda = new javax.swing.JPasswordField();
        pswStaraLozinka = new javax.swing.JPasswordField();
        lblSlika = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Ime djelatnika:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Unesi staru lozinku:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Unesi novu lozinku:");

        btnPromjeniLozinku.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPromjeniLozinku.setText("Promjeni lozinku");
        btnPromjeniLozinku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniLozinkuActionPerformed(evt);
            }
        });

        lblImeDjelatnika.setBackground(new java.awt.Color(255, 0, 0));
        lblImeDjelatnika.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Potvrdi novu lozinku:");

        pswNovaLozinka.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        pswNovaLozinkaPotvrda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        pswStaraLozinka.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblSlika.setIcon(new javax.swing.ImageIcon("D:\\Users\\Skec\\Desktop\\store-icon2.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblSlika, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pswStaraLozinka)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(lblImeDjelatnika, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(pswNovaLozinka)
                    .addComponent(pswNovaLozinkaPotvrda)
                    .addComponent(btnPromjeniLozinku, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImeDjelatnika, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pswStaraLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pswNovaLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pswNovaLozinkaPotvrda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPromjeniLozinku)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSlika, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPromjeniLozinkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniLozinkuActionPerformed
        
        postaviVrijednostiNaEntitet();

        try {
            obrada.update();
        } catch (ZavrsniRadException e) {
            JOptionPane.showMessageDialog(rootPane, e.getPoruka());
        }
        
        JOptionPane.showMessageDialog(rootPane, "Lozinka promjenjena!");
        dispose();
    }//GEN-LAST:event_btnPromjeniLozinkuActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPromjeniLozinku;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblImeDjelatnika;
    private javax.swing.JLabel lblSlika;
    private javax.swing.JPasswordField pswNovaLozinka;
    private javax.swing.JPasswordField pswNovaLozinkaPotvrda;
    private javax.swing.JPasswordField pswStaraLozinka;
    // End of variables declaration//GEN-END:variables

    private void provjeri(){
        
        try{
            if(pswStaraLozinka.toString().isEmpty()){
                obradiGresku(pswStaraLozinka, "Obavezno stara lozinka!");
                return;
            }          

            if(pswNovaLozinka.toString().isEmpty()){
                obradiGresku(pswNovaLozinka, "Obavezno nova lozinka!");
                return;
            }
            
            if(pswNovaLozinkaPotvrda.toString().isEmpty()){
                obradiGresku(pswNovaLozinkaPotvrda, "Obavezno potvrda nove lozinke!");
                return;
            }
            
            if(!Arrays.equals(pswNovaLozinka.getPassword(), pswNovaLozinkaPotvrda.getPassword())){
                obradiGresku(pswNovaLozinka, "Nova lozinka se ne podudara!");
                return;
            }
            
            Djelatnik o = obrada.autoriziraj(Aplikacija.djelatnik.getIme(), pswStaraLozinka.getPassword());

            if(o == null){
                obradiGresku(pswStaraLozinka, "Ime i lozinka ne odgovaraju");
                return;
            } 

        }catch(Exception e){
            obradiGresku(pswStaraLozinka, "Krivi unos!");
        }
    }
    
    private void obradiGresku(JComponent komponenta, String poruka){
        komponenta.requestFocus();
        JOptionPane.showMessageDialog(rootPane, poruka);
    }
    
    private void postaviVrijednostiNaEntitet() {
        
        provjeri();
        
        char[] pass = pswNovaLozinka.getPassword();
        String s = new String(pass);
           
        try {
            Aplikacija.djelatnik.setSifraDjelatnika(BCrypt.hashpw(s, BCrypt.gensalt()));
        } catch (Exception e) {
            obradiGresku(pswNovaLozinka, "Greška - nova lozinka");
        } 
        
        obrada.setEntitet(Aplikacija.djelatnik);
        
        try {
            obrada.update();
        } catch (ZavrsniRadException e) {
            System.out.println(e.getMessage());
        }      
        
    }


}
