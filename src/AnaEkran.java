


public class AnaEkran extends javax.swing.JFrame {

    OtomasyonIsleri islemler = new OtomasyonIsleri();
    
    
    public AnaEkran() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        hastaButon1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        r_tc = new javax.swing.JTextField();
        r_isim = new javax.swing.JTextField();
        r_soyisim = new javax.swing.JTextField();
        r_telefon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        r_saat = new javax.swing.JComboBox<>();
        buton_randevu = new javax.swing.JButton();
        h_mesaj = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        d_tc_yazialani = new javax.swing.JTextField();
        d_sifre_Yazialani = new javax.swing.JPasswordField();
        d_yanlisGiris = new javax.swing.JLabel();
        d_girisButonu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        adminYaziAlani = new javax.swing.JTextField();
        adminParolaAlani = new javax.swing.JPasswordField();
        admin_giris = new javax.swing.JButton();
        admin_yanlisGiris = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(476, 250));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hastaButon1.setMaximumSize(new java.awt.Dimension(476, 250));
        hastaButon1.setMinimumSize(new java.awt.Dimension(105, 144));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("T.C. Kimlik Numarası :");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel6.setText("İsim :");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel9.setText("Soyisim :");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel12.setText("Telefon :");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        jPanel5.add(r_tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 202, -1));
        jPanel5.add(r_isim, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 202, -1));
        jPanel5.add(r_soyisim, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 110, 200, -1));
        jPanel5.add(r_telefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 202, -1));

        jLabel2.setText("SAAT:");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 87, -1));

        r_saat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00", "9:15", "9:30", "9:45", "10:00", "10:15", "10:30", "10:45", "11:00", "11:15", "11:30", "11:45", "12:00", "12:15", "13:30", "13:45", "14:00", "14:15", "14:30", "14:45", "15:00", "15:15", "15:30", "15:45", "16:00", "16:15", "16:30", "16:45" }));
        jPanel5.add(r_saat, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 180, -1, -1));

        buton_randevu.setText("RANDEVU AL");
        buton_randevu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_randevuActionPerformed(evt);
            }
        });
        jPanel5.add(buton_randevu, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 226, -1, -1));

        h_mesaj.setForeground(new java.awt.Color(255, 0, 51));
        jPanel5.add(h_mesaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 267, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\KAGE\\Documents\\NetBeansProjects\\JavaProje\\yeni_logo.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 360));

        hastaButon1.addTab("              HASTA             ", jPanel5);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("T.C. Kimlik Numarası :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Şifre :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        jPanel2.add(d_tc_yazialani, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 199, -1));
        jPanel2.add(d_sifre_Yazialani, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 199, -1));

        d_yanlisGiris.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(d_yanlisGiris, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 145, 395, 21));

        d_girisButonu.setText("GİRİŞ");
        d_girisButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_girisButonuActionPerformed(evt);
            }
        });
        jPanel2.add(d_girisButonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 172, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\KAGE\\Documents\\NetBeansProjects\\JavaProje\\yeni_logo.jpg")); // NOI18N
        jLabel3.setText("jLabel1");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 360));

        hastaButon1.addTab("                                  DOKTOR                            ", jPanel2);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Kullanıcı Adı :");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 73, -1, -1));

        jLabel11.setText("Şifre :");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 111, -1, -1));
        jPanel4.add(adminYaziAlani, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 70, 200, -1));
        jPanel4.add(adminParolaAlani, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 108, 200, -1));

        admin_giris.setText("GİRİŞ");
        admin_giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_girisActionPerformed(evt);
            }
        });
        jPanel4.add(admin_giris, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 178, -1, -1));

        admin_yanlisGiris.setForeground(new java.awt.Color(255, 0, 51));
        jPanel4.add(admin_yanlisGiris, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 146, 367, 21));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\KAGE\\Documents\\NetBeansProjects\\JavaProje\\yeni_logo.jpg")); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 360));

        hastaButon1.addTab("              ADMİN             ", jPanel4);

        getContentPane().add(hastaButon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 610, 390));
        hastaButon1.getAccessibleContext().setAccessibleDescription("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("HASTANE OTOMASYONU");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 39, 277, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void d_girisButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_girisButonuActionPerformed
        d_yanlisGiris.setText("");
        
        String doktorTc =d_tc_yazialani.getText();
        String doktorParola = new String(d_sifre_Yazialani.getPassword());
        boolean doktorGiris = islemler.doktorGirisi(doktorTc, doktorParola);
        
        if(doktorGiris){
            
            doktorEkrani doktorekrani = new doktorEkrani();
            doktorekrani.setVisible(true);
            
            setVisible(false);
            
        }
        else{
            d_yanlisGiris.setText("GİRİŞ BAŞARISIZ LÜTFEN BİLGİLERİNİZİ KONTROL EDİNİZ");
        }
    }//GEN-LAST:event_d_girisButonuActionPerformed

    private void admin_girisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_girisActionPerformed
        
        admin_yanlisGiris.setText("");
        
        String adminAd =adminYaziAlani.getText();
        String adminParola = new String(adminParolaAlani.getPassword());
        boolean adminGiris = islemler.adminGirisi(adminAd,adminParola);
        
        if(adminGiris){
            AdminEkranı adminEkranı = new AdminEkranı();
            adminEkranı.setVisible(true);
            setVisible(false);
        }
        else{
            admin_yanlisGiris.setText("GİRİŞ BAŞARISIZ LÜTFEN BİLGİLERİNİZİ KONTROL EDİNİZ");
        }
        
    }//GEN-LAST:event_admin_girisActionPerformed

    private void buton_randevuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_randevuActionPerformed


        String tc = r_tc.getText();
        String ad = r_isim.getText();
        String soyad = r_soyisim.getText();
        String telefon = r_telefon.getText();
        String saat = r_saat.getSelectedItem().toString();
        
        islemler.hastaKayitEkle(saat, tc, ad, soyad, telefon);
        
        h_mesaj.setText("Randevu alındı!");
        
        r_tc.setText("");
        r_isim.setText("");
        r_soyisim.setText("");
        r_telefon.setText("");
        
        
    }//GEN-LAST:event_buton_randevuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField adminParolaAlani;
    private javax.swing.JTextField adminYaziAlani;
    private javax.swing.JButton admin_giris;
    private javax.swing.JLabel admin_yanlisGiris;
    private javax.swing.JButton buton_randevu;
    private javax.swing.JButton d_girisButonu;
    private javax.swing.JPasswordField d_sifre_Yazialani;
    private javax.swing.JTextField d_tc_yazialani;
    private javax.swing.JLabel d_yanlisGiris;
    private javax.swing.JLabel h_mesaj;
    private javax.swing.JTabbedPane hastaButon1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField r_isim;
    private javax.swing.JComboBox<String> r_saat;
    private javax.swing.JTextField r_soyisim;
    private javax.swing.JTextField r_tc;
    private javax.swing.JTextField r_telefon;
    // End of variables declaration//GEN-END:variables
}
