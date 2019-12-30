
import com.mysql.jdbc.StandardSocketFactory;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class AdminEkranı extends javax.swing.JFrame {

    DefaultTableModel model;
    OtomasyonIsleri islemler = new OtomasyonIsleri();
    
    
    public AdminEkranı() {
        initComponents();
        model = (DefaultTableModel)doktorTablosu.getModel();
        doktorGoruntule();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        doktorTablosu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        yeni_d_soyisim = new javax.swing.JTextField();
        yeni_d_uzmanlik = new javax.swing.JTextField();
        doktorEkle = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        yeni_d_sifre = new javax.swing.JTextField();
        yeni_d_isim = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        d_ekle_mesaj = new javax.swing.JLabel();
        yeni_d_tc = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        d_s_tc = new javax.swing.JTextField();
        d_s_buton = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        d_g_ad = new javax.swing.JTextField();
        d_g_soyad = new javax.swing.JTextField();
        d_g_uzmanlik = new javax.swing.JTextField();
        d_g_sifre = new javax.swing.JTextField();
        d_güncelle = new javax.swing.JButton();
        d_g_yazi = new javax.swing.JLabel();
        d_g_tc = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        adminArama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        doktorTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TC", "İsim", "Soyisim", "Uzmanlık", "Sifre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        doktorTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doktorTablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(doktorTablosu);
        if (doktorTablosu.getColumnModel().getColumnCount() > 0) {
            doktorTablosu.getColumnModel().getColumn(0).setResizable(false);
            doktorTablosu.getColumnModel().getColumn(1).setResizable(false);
            doktorTablosu.getColumnModel().getColumn(2).setResizable(false);
            doktorTablosu.getColumnModel().getColumn(3).setResizable(false);
            doktorTablosu.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 464, 621, 151));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("DOKTOR LİSTESİ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 167, 26));

        jLabel4.setText("İsim :");

        jLabel5.setText("Soyisim :");

        jLabel6.setText("Uzmanlık :");

        doktorEkle.setText("EKLE");
        doktorEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doktorEkleActionPerformed(evt);
            }
        });

        jLabel8.setText("Şifre :");

        jLabel9.setText("T.C. Kimlik Numarası");

        d_ekle_mesaj.setText("  ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(d_ekle_mesaj)
                        .addGap(270, 270, 270))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(yeni_d_isim, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(yeni_d_tc, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(yeni_d_soyisim, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(yeni_d_uzmanlik, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(yeni_d_sifre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(doktorEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(yeni_d_tc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(yeni_d_isim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yeni_d_soyisim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yeni_d_uzmanlik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yeni_d_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(doktorEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)))
                .addComponent(d_ekle_mesaj)
                .addGap(35, 35, 35))
        );

        jTabbedPane1.addTab("      DOKTOR EKLEME     ", jPanel1);

        jLabel15.setText("T.C. Kimlik Numarası :");

        d_s_buton.setText("DOKTORU SİL");
        d_s_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_s_butonActionPerformed(evt);
            }
        });

        jLabel16.setText("SİLMEK İSTEDİĞİNİZ DOKTORUN T.C. KİMLİK NUMARASINI GİRİNİZ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(d_s_buton)
                            .addComponent(d_s_tc, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d_s_tc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addComponent(d_s_buton)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("     DOKTOR SİLME      ", jPanel2);

        jLabel10.setText("T.C. Kimlik Numarası :");

        jLabel11.setText("İsim :");

        jLabel12.setText("Soyisim :");

        jLabel13.setText("Uzmanlik :");

        jLabel14.setText("Sifre :");

        d_güncelle.setText("GÜNCELLE");
        d_güncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_güncelleActionPerformed(evt);
            }
        });

        d_g_yazi.setText("       ");

        d_g_tc.setText("T.C. ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(d_g_ad)
                    .addComponent(d_g_soyad)
                    .addComponent(d_g_sifre)
                    .addComponent(d_g_uzmanlik, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d_g_tc, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(d_güncelle))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(d_g_yazi)))
                .addGap(138, 138, 138))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(d_g_tc))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(d_g_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(d_g_yazi)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d_g_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(d_g_uzmanlik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(d_g_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(d_güncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
        );

        jTabbedPane1.addTab(" DOKTOR GÜNCELLE ", jPanel4);

        adminArama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminAramaActionPerformed(evt);
            }
        });
        adminArama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                adminAramaKeyReleased(evt);
            }
        });

        jLabel3.setText("Aramak İstediğiniz Kelimeyi Giriniz :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminArama, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminArama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("     ARAMA    ", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 115, 621, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setText("ADMİN PANELİ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 53, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\KAGE\\Documents\\NetBeansProjects\\JavaProje\\anahtar boyut 2.png")); // NOI18N
        jLabel17.setText("jLabel17");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 610, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void doktorArama(String ara){
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        
        doktorTablosu.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(ara));
        
    } 
    
    
    private void adminAramaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adminAramaKeyReleased
        String ara = adminArama.getText();
        
        doktorArama(ara);
    }//GEN-LAST:event_adminAramaKeyReleased

    private void doktorEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doktorEkleActionPerformed
        
        d_ekle_mesaj.setText("");
        
        String y_d_tc = yeni_d_tc.getText();
        String y_d_ad = yeni_d_isim.getText();
        String y_d_soyad = yeni_d_soyisim.getText();
        String y_d_uzmanlik = yeni_d_uzmanlik.getText();
        String y_d_sifre = yeni_d_sifre.getText();
        
        islemler.doktorEkle(y_d_tc, y_d_ad, y_d_soyad, y_d_uzmanlik, y_d_sifre);
        
        
        doktorGoruntule();
        
        d_ekle_mesaj.setText("Doktor Eklendi");
        
    
        
        
    }//GEN-LAST:event_doktorEkleActionPerformed

    private void doktorTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doktorTablosuMouseClicked
        
        int selectedrow = doktorTablosu.getSelectedRow();
        
        d_g_tc.setText(model.getValueAt(selectedrow, 0).toString());
        d_g_ad.setText(model.getValueAt(selectedrow, 1).toString());
        d_g_soyad.setText(model.getValueAt(selectedrow, 2).toString());
        d_g_uzmanlik.setText(model.getValueAt(selectedrow, 3).toString());
        d_g_sifre.setText(model.getValueAt(selectedrow, 4).toString());
        
        
    }//GEN-LAST:event_doktorTablosuMouseClicked

    private void d_güncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_güncelleActionPerformed
        
        String tc = d_g_tc.getText();
        String ad = d_g_ad.getText();
        String soyad = d_g_soyad.getText();
        String uzmanlik = d_g_uzmanlik.getText();
        String sifre = d_g_sifre.getText();
        
        int selectedrow = doktorTablosu.getSelectedRow();
        
        if (selectedrow == 1 ){
            
            if ( model.getRowCount()==0 ) {
                
                d_g_yazi.setText("Tablo şu anda boş!");
            }
            else{
                d_g_yazi.setText("Lütfen güncellenecek bir doktor seçiniz!");
            }
            
        }
        else{
            
            islemler.doktorGüncelle(tc, ad ,soyad, uzmanlik, sifre);
            doktorGoruntule();
            d_g_yazi.setText("Doktor başarıyla güncellendi");
        }
        
        
        
    }//GEN-LAST:event_d_güncelleActionPerformed

    private void d_s_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_s_butonActionPerformed
        
        String tc = d_s_tc.getText();
        
        islemler.doktorSil(tc );
        
        doktorGoruntule();
        
    }//GEN-LAST:event_d_s_butonActionPerformed

    private void adminAramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminAramaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminAramaActionPerformed

  
    public void doktorGoruntule(){
        
        model.setRowCount(0);
        ArrayList<Doktorlar> doktorlar1 = new ArrayList<Doktorlar>();
        
        doktorlar1 = islemler.doktorlarıGetir();
        
        if(doktorlar1 != null){
            
            for(Doktorlar doktor : doktorlar1){
                
                Object[] eklenecek = { doktor.getTc() ,doktor.getAd(), doktor.getSoyad(), doktor.getUzmanlık(), doktor.getSifre() };
                
                model.addRow(eklenecek);
            }
            
        
        
    }
    }
    
    
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
            java.util.logging.Logger.getLogger(AdminEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminEkranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adminArama;
    private javax.swing.JLabel d_ekle_mesaj;
    private javax.swing.JTextField d_g_ad;
    private javax.swing.JTextField d_g_sifre;
    private javax.swing.JTextField d_g_soyad;
    private javax.swing.JLabel d_g_tc;
    private javax.swing.JTextField d_g_uzmanlik;
    private javax.swing.JLabel d_g_yazi;
    private javax.swing.JButton d_güncelle;
    private javax.swing.JButton d_s_buton;
    private javax.swing.JTextField d_s_tc;
    private javax.swing.JButton doktorEkle;
    private javax.swing.JTable doktorTablosu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField yeni_d_isim;
    private javax.swing.JTextField yeni_d_sifre;
    private javax.swing.JTextField yeni_d_soyisim;
    private javax.swing.JTextField yeni_d_tc;
    private javax.swing.JTextField yeni_d_uzmanlik;
    // End of variables declaration//GEN-END:variables
}
