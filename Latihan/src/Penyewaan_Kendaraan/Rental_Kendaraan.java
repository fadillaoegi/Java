package Penyewaan_Kendaraan;


import java.io.IOException;
import javafx.scene.control.RadioButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Rental_Kendaraan extends javax.swing.JFrame {
    
    String nama, jenis, tipe, merk, lm_sewa, biaya, sewa, kembali, biaya_total;
    Integer biaya_hari, tot_biaya;
    
    private DefaultTableModel tabel;
    Object[] output;
    
    public Rental_Kendaraan() {
        initComponents();
    }
    
    public void isi_data(){
        DefaultTableModel tabel = (DefaultTableModel) data_sewa.getModel();
        
        output = new Object[]{nama, jenis, tipe, merk, lm_sewa, biaya, sewa, kembali, tot_biaya};
        
        tabel.addRow(output);
        
    }
    
    private void hapusdata() {
        nama_pel.setText(null);
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        merk_kend.setText(null);
        lama_sewa.setSelectedItem("");
        sewa_hari.setText(null);
        tgl_sewa.setText(null);
        tgl_kembali.setText(null);
        tot_biaya_sewa.setText(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        nama_pel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        merk_kend = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tgl_sewa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tgl_kembali = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        sewa_hari = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lama_sewa = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        tot_biaya_sewa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        data_sewa = new javax.swing.JTable();
        simpan = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        kend_mobil = new javax.swing.JRadioButton();
        kend_motor = new javax.swing.JRadioButton();
        manual_tipe = new javax.swing.JRadioButton();
        matic_tipe = new javax.swing.JRadioButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));

        nama_pel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_pelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Rental Kendaraan Oki");

        jLabel2.setText("Nama Pelanggan");

        jLabel3.setText("Jenis Kendaraan");

        jLabel4.setText("Tipe Kendaraan");

        jLabel6.setText("Merk Kendaraan");

        merk_kend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                merk_kendActionPerformed(evt);
            }
        });

        jLabel7.setText("Tanggal Sewa");

        tgl_sewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgl_sewaActionPerformed(evt);
            }
        });

        jLabel8.setText("Tanggal Kembali");

        tgl_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgl_kembaliActionPerformed(evt);
            }
        });

        jLabel9.setText("Biaya Sewa (Per Hari)");

        sewa_hari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sewa_hariActionPerformed(evt);
            }
        });

        jLabel10.setText("Lama Sewa");

        lama_sewa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 Hari", "7 Hari", "10 Hari", "14 Hari" }));
        lama_sewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lama_sewaActionPerformed(evt);
            }
        });

        jLabel11.setText("Total Biaya Sewa");

        tot_biaya_sewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tot_biaya_sewaActionPerformed(evt);
            }
        });

        data_sewa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Pelanggan", "Jenis Kendaraan", "Tipe Kendaraan", "Merk Kendaraan", "Lama Sewa", "Biaya Sewa (Per hari)", "Tanggal Sewa", "Tanggal Kembali", "Total Biaya Sewa"
            }
        ));
        data_sewa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                data_sewaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(data_sewa);

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        buttonGroup1.add(kend_mobil);
        kend_mobil.setText("Mobil");
        kend_mobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kend_mobilActionPerformed(evt);
            }
        });

        buttonGroup1.add(kend_motor);
        kend_motor.setText("Motor");

        buttonGroup2.add(manual_tipe);
        manual_tipe.setText("Manual");

        buttonGroup2.add(matic_tipe);
        matic_tipe.setText("Matic");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kend_mobil)
                                    .addComponent(manual_tipe))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(matic_tipe)
                                    .addComponent(kend_motor)))
                            .addComponent(nama_pel)
                            .addComponent(merk_kend, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(lama_sewa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(sewa_hari, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                    .addGap(37, 37, 37))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(32, 32, 32)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tot_biaya_sewa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tgl_sewa)
                                    .addComponent(tgl_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(376, 376, 376))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nama_pel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kend_mobil)
                            .addComponent(kend_motor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(manual_tipe)
                            .addComponent(matic_tipe))))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(merk_kend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lama_sewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(sewa_hari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tgl_sewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(tgl_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(tot_biaya_sewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan)
                    .addComponent(delete)
                    .addComponent(update))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nama_pelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_pelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_pelActionPerformed

    private void tgl_sewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgl_sewaActionPerformed
        
    }//GEN-LAST:event_tgl_sewaActionPerformed

    private void tgl_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgl_kembaliActionPerformed
        
    }//GEN-LAST:event_tgl_kembaliActionPerformed

    private void sewa_hariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sewa_hariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sewa_hariActionPerformed

    private void lama_sewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lama_sewaActionPerformed
        if (kend_mobil.isSelected()){
                    if (manual_tipe.isSelected()){
                        biaya_hari = 200000;
                    } else{
                        biaya_hari = 250000;
                    }
                } else {
                    if (manual_tipe.isSelected()){
                        biaya_hari = 100000;
                    } else{
                        biaya_hari = 150000;
                    }
                }
        
        biaya = String.valueOf(biaya_hari);
        sewa_hari.setText(biaya);
        
        lm_sewa = (String) lama_sewa.getSelectedItem();
        
        switch (lm_sewa){
            case "3 Hari":
                tot_biaya = biaya_hari * 3;
                break;
            case "7 Hari":
                tot_biaya = biaya_hari * 7;
                break;
            case "10 Hari":
                tot_biaya = biaya_hari * 10;
                break;
            case "14 Hari":
                tot_biaya = biaya_hari * 14;
                break;
        }
        
        biaya = String.valueOf(tot_biaya);
        tot_biaya_sewa.setText(biaya);
    }//GEN-LAST:event_lama_sewaActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        DefaultTableModel tabel = (DefaultTableModel) data_sewa.getModel();
        
        int hapus = data_sewa.getSelectedRow();
        tabel.removeRow(hapus);
        hapusdata();
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
       
        DefaultTableModel tabel = (DefaultTableModel) data_sewa.getModel();
        
        if (data_sewa.getSelectedRowCount()== 1){
            
            if (kend_mobil.isSelected()) {
                
                jenis = kend_mobil.getText().toString();
                
            } else {
                
                jenis = kend_motor.getText().toString();
                
            }
            
            if (manual_tipe.isSelected()){
                tipe = manual_tipe.getText().toString();
            } else {
                tipe = matic_tipe.getText().toString();
            }
            
            nama = nama_pel.getText();
            merk = merk_kend.getText();
            lm_sewa = (String) lama_sewa.getSelectedItem();
            biaya = sewa_hari.getText();
            sewa = tgl_sewa.getText();
            kembali = tgl_kembali.getText();
            biaya_total = tot_biaya_sewa.getText();
            
            tabel.setValueAt(nama, data_sewa.getSelectedRow(), 0);
            tabel.setValueAt(jenis, data_sewa.getSelectedRow(), 1);
            tabel.setValueAt(tipe, data_sewa.getSelectedRow(), 2);
            tabel.setValueAt(merk, data_sewa.getSelectedRow(), 3);
            tabel.setValueAt(lm_sewa, data_sewa.getSelectedRow(), 4);
            tabel.setValueAt(biaya, data_sewa.getSelectedRow(), 5);
            tabel.setValueAt(sewa, data_sewa.getSelectedRow(), 6);
            tabel.setValueAt(kembali, data_sewa.getSelectedRow(), 7);
            tabel.setValueAt(biaya_total, data_sewa.getSelectedRow(), 8);
            
            JOptionPane.showMessageDialog(null, "Data berhasil di update");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        nama = nama_pel.getText();
        
        if (kend_mobil.isSelected()) {
            jenis = kend_mobil.getText().toString();
        } else {
            jenis = kend_motor.getText().toString();
        }
        
        if (manual_tipe.isSelected()){
            tipe = manual_tipe.getText().toString();
        } else {
            tipe = matic_tipe.getText().toString();
        }
        
        merk = merk_kend.getText();
        lm_sewa = (String) lama_sewa.getSelectedItem();
        biaya = sewa_hari.getText();
        sewa = tgl_sewa.getText();
        kembali = tgl_kembali.getText();
        biaya_total = tot_biaya_sewa.getText();
        
        isi_data();
        hapusdata();
        
        JOptionPane.showMessageDialog(null, "Data berhasil di simpan");
    }//GEN-LAST:event_simpanActionPerformed

    private void data_sewaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data_sewaMouseClicked
        
        DefaultTableModel output = (DefaultTableModel) data_sewa.getModel();
        
        String dt_nama = output.getValueAt(data_sewa.getSelectedRow(), 0).toString();
        String dt_jenis = output.getValueAt(data_sewa.getSelectedRow(), 1).toString();
        String dt_tipe = output.getValueAt(data_sewa.getSelectedRow(), 2).toString();
        String dt_merk = output.getValueAt(data_sewa.getSelectedRow(), 3).toString();
        String dt_lama = output.getValueAt(data_sewa.getSelectedRow(), 4).toString();
        String dt_biayahari = output.getValueAt(data_sewa.getSelectedRow(), 5).toString();
        String dt_pinjam = output.getValueAt(data_sewa.getSelectedRow(), 6).toString();
        String dt_kembali = output.getValueAt(data_sewa.getSelectedRow(), 7).toString();
        String dt_totbiaya = output.getValueAt(data_sewa.getSelectedRow(), 8).toString();
        
        nama_pel.setText(dt_nama);
        merk_kend.setText(dt_merk);
        lama_sewa.setSelectedItem(dt_lama);
        sewa_hari.setText(dt_biayahari);
        tgl_sewa.setText(dt_pinjam);
        tgl_kembali.setText(dt_kembali);
        tot_biaya_sewa.setText(dt_totbiaya);
        
        //buttonGroup1.setSelected(true);
    }//GEN-LAST:event_data_sewaMouseClicked

    private void merk_kendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_merk_kendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_merk_kendActionPerformed

    private void tot_biaya_sewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tot_biaya_sewaActionPerformed

    }//GEN-LAST:event_tot_biaya_sewaActionPerformed

    private void kend_mobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kend_mobilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kend_mobilActionPerformed

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
            java.util.logging.Logger.getLogger(Rental_Kendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rental_Kendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rental_Kendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rental_Kendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rental_Kendaraan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTable data_sewa;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton kend_mobil;
    private javax.swing.JRadioButton kend_motor;
    private javax.swing.JComboBox<String> lama_sewa;
    private javax.swing.JRadioButton manual_tipe;
    private javax.swing.JRadioButton matic_tipe;
    private javax.swing.JTextField merk_kend;
    private javax.swing.JTextField nama_pel;
    private javax.swing.JTextField sewa_hari;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField tgl_kembali;
    private javax.swing.JTextField tgl_sewa;
    private javax.swing.JTextField tot_biaya_sewa;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
