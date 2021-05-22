

import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.StringTokenizer;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows 10
 */
public class gui extends javax.swing.JFrame {

    String pilihan = "", nama, tipekamar, waktupembayaran, tipebayar;

    //variabel untuk menampung hasil input
    Integer hargakamar, jmlbyr, jumlahbayar1, jumlahbayar2, uangbayar, kembalian, kembalian_dp, kembalian1, dp, sisabayar;

    //perlu buat tabel model utk menyimpan data sementara sbelum direalisasikan ke Jtable
    private DefaultTableModel model;
    Object[] data; //spy jd public

    public gui() {
        initComponents();
    }

    //method untuk tampil data di jtable
    public void tampil() {
        //realisasi antara table model dan jtable
        model = (DefaultTableModel) tabel_penyimpanan.getModel();
        //untuk mengisi baris tabel(objek berisi variabel yg digunakan untuk input)
        data = new Object[]{nama, pilihan, hargakamar, waktupembayaran, tipebayar, jumlahbayar2, kembalian_dp, kembalian, kembalian1, sisabayar};

        model.addRow(data);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb_tipekamar = new javax.swing.JComboBox<>();
        jtf_nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rb_bulanan = new javax.swing.JRadioButton();
        rb_tahunan = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtf_hargakamar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtf_jumlahbayar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtf_kembalian = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rb_lunas = new javax.swing.JRadioButton();
        rb_dp = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jtf_uangbayar = new javax.swing.JTextField();
        btn_jumlahbayar = new javax.swing.JButton();
        btn_jumlahkembalian = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jtf_dp = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtf_sisabayar = new javax.swing.JTextField();
        btn_sisabayar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_penyimpanan = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(52, 73, 94));

        jPanel1.setBackground(new java.awt.Color(52, 73, 94));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nama Penyewa");

        cb_tipekamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kamar Mandi Luar  + AC", "Kamar Mandi Dalam+AC", "Kamar Mandi Luar  (Non AC)", "Kamar Mandi Dalam(Non AC)" }));
        cb_tipekamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tipekamarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pilih Tipe Kamar");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Waktu Pembayaran");

        rb_bulanan.setBackground(new java.awt.Color(52, 73, 94));
        buttonGroup1.add(rb_bulanan);
        rb_bulanan.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rb_bulanan.setText("Bulanan");
        rb_bulanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_bulananActionPerformed(evt);
            }
        });

        rb_tahunan.setBackground(new java.awt.Color(52, 73, 94));
        buttonGroup1.add(rb_tahunan);
        rb_tahunan.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rb_tahunan.setText("Tahunan");
        rb_tahunan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_tahunanActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Program Penyewaan Kos Dian");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Harga Kamar Pilihan");

        jtf_hargakamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_hargakamarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Jumlah Bayar");

        jtf_jumlahbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_jumlahbayarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Jumlah Kembalian");

        jtf_kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_kembalianActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipe Pembayaran");

        rb_lunas.setBackground(new java.awt.Color(52, 73, 94));
        buttonGroup2.add(rb_lunas);
        rb_lunas.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rb_lunas.setText("Lunas");
        rb_lunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_lunasActionPerformed(evt);
            }
        });

        rb_dp.setBackground(new java.awt.Color(52, 73, 94));
        buttonGroup2.add(rb_dp);
        rb_dp.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rb_dp.setText("DP");
        rb_dp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_dpActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Uang yang dibayarkan");

        jtf_uangbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_uangbayarActionPerformed(evt);
            }
        });

        btn_jumlahbayar.setText("Hitung Jumlah Bayar");
        btn_jumlahbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jumlahbayarActionPerformed(evt);
            }
        });

        btn_jumlahkembalian.setText("Hitung Jumlah Kembalian");
        btn_jumlahkembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jumlahkembalianActionPerformed(evt);
            }
        });

        btn_update.setText("Update Data");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_hapus.setText("Hapus Data");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_simpan.setText("Simpan Data");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Dp yang ingin dibayar");

        jtf_dp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_dpActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Sisa Uang yang belum terbayar");

        jtf_sisabayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_sisabayarActionPerformed(evt);
            }
        });

        btn_sisabayar.setText("Sisa Bayar");
        btn_sisabayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sisabayarActionPerformed(evt);
            }
        });

        jButton1.setText("tambah data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(119, 119, 119)
                        .addComponent(rb_bulanan, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(109, 109, 109)))
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(105, 105, 105)
                            .addComponent(jtf_dp, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtf_uangbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(rb_tahunan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(rb_lunas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rb_dp, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jtf_jumlahbayar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtf_hargakamar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cb_tipekamar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jtf_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtf_kembalian, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                                .addComponent(jtf_sisabayar)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_simpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_jumlahbayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_jumlahkembalian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_sisabayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(386, 386, 386))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_update))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtf_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_tipekamar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_hapus))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_hargakamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_simpan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(14, 14, 14)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rb_bulanan)
                                .addComponent(rb_tahunan)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_dp, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(rb_lunas)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButton1)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtf_jumlahbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_jumlahbayar)))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtf_dp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_uangbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtf_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_jumlahkembalian)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtf_sisabayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sisabayar))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        tabel_penyimpanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Penyewa", "Tipe Kamar", "Harga Kamar", "Waktu Bayar", "Tipe Bayar", "Jumlah Bayar", "Dp ", "Uang yang dibayarkan", "kembalian", "Sisa bayar"
            }
        ));
        tabel_penyimpanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_penyimpananMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_penyimpanan);

        jScrollPane3.setViewportView(jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_hargakamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_hargakamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_hargakamarActionPerformed

    private void rb_tahunanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_tahunanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_tahunanActionPerformed

    private void rb_bulananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_bulananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_bulananActionPerformed

    private void btn_jumlahbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jumlahbayarActionPerformed
        jumlahbayar1 = Integer.parseInt(jtf_hargakamar.getText());
        //if klik bulanan maka * 1 kalo tahunan maka * 12
        if (rb_bulanan.isSelected()) {
            jumlahbayar2 = jumlahbayar1 * 1;
            //waktupembayaran = "Bulanan";
            //waktupembayaran = rb_bulanan.getText().toString();
        } else {
            jumlahbayar2 = jumlahbayar1 * 12;

        }

        jtf_jumlahbayar.setText("" + Integer.toString(jumlahbayar2));

    }//GEN-LAST:event_btn_jumlahbayarActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabel_penyimpanan.getModel();
//        if (tabel_penyimpanan.getSelectedRowCount() == 1) {
//            
//
//            //set update
//            model.setValueAt(nama, tabel_penyimpanan.getSelectedRow(), 0);
//
//            JOptionPane.showMessageDialog(this, "Data Berhasil di update");
//        } else {
//            //if table empty
//            if (tabel_penyimpanan.getRowCount() == 0) {
//                JOptionPane.showMessageDialog(this, "Tabel tidak memiliki isi");
//            }else{
//                //if row not Selected
//                JOptionPane.showMessageDialog(this, "silakan pilih satu baris data untuk pembaruan");
//            }
//        }
             //String nama = jtf_nama.getText();
             
        if (tabel_penyimpanan.getSelectedRowCount()==1) {
            tipebayar = rb_lunas.getText().toString();
            //set update
            model.setValueAt(tipebayar, tabel_penyimpanan.getSelectedRow(), 4);
            JOptionPane.showMessageDialog(this, "Data Berhasil di update");
        } else {
            tipebayar = rb_dp.getText().toString();
            model.setValueAt(tipebayar, tabel_penyimpanan.getSelectedRow(), 4);
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
        }
cleardata();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void jtf_kembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_kembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_kembalianActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        nama = jtf_nama.getText();

        //radio button1
        if (rb_bulanan.isSelected()) {
            waktupembayaran = rb_bulanan.getText().toString();
        } else {
            waktupembayaran = rb_tahunan.getText().toString();
        }

        //radiobutton2
        if (rb_lunas.isSelected()) {
            tipebayar = rb_lunas.getText().toString();
        } else {
            tipebayar = rb_dp.getText().toString();
        }

        tampil();
        cleardata();
        JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan");
// TODO add your handling code here:f
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void cb_tipekamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tipekamarActionPerformed
        pilihan = (String) cb_tipekamar.getSelectedItem();
        switch (pilihan) {
            case "Kamar Mandi Luar  + AC":
                hargakamar = 800000;
                break;
            case "Kamar Mandi Dalam+AC":
                hargakamar = 1000000;
                break;
            case "Kamar Mandi Luar  (Non AC)":
                hargakamar = 500000;
                break;
            case "Kamar Mandi Dalam(Non AC)":
                hargakamar = 600000;
                break;
        }
        jtf_hargakamar.setText("" + Integer.toString(hargakamar));

        // TODO add your handling code here:
    }//GEN-LAST:event_cb_tipekamarActionPerformed

    private void jtf_jumlahbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_jumlahbayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_jumlahbayarActionPerformed

    private void jtf_dpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_dpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_dpActionPerformed

    private void btn_jumlahkembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jumlahkembalianActionPerformed
        kembalian = Integer.parseInt(jtf_uangbayar.getText());
        jmlbyr = Integer.parseInt(jtf_jumlahbayar.getText());
        kembalian_dp = Integer.parseInt(jtf_dp.getText());
        //if klik bulanan maka * 1 kalo tahunan maka * 12
        if (rb_lunas.isSelected()) {
            kembalian1 = kembalian - jmlbyr;

        } else {
            kembalian1 = kembalian - kembalian_dp;

        }

        jtf_kembalian.setText("" + Integer.toString(kembalian1));
    }//GEN-LAST:event_btn_jumlahkembalianActionPerformed

    private void rb_lunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_lunasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_lunasActionPerformed

    private void jtf_sisabayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_sisabayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_sisabayarActionPerformed

    private void btn_sisabayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sisabayarActionPerformed
        kembalian_dp = Integer.parseInt(jtf_dp.getText());
        jmlbyr = Integer.parseInt(jtf_jumlahbayar.getText());
        //kembalian_dp = Integer.parseInt(jtf_dp.getText());
        //if klik bulanan maka * 1 kalo tahunan maka * 12
        if (rb_lunas.isSelected()) {
            sisabayar = 0;

        } else {
            sisabayar = jmlbyr - kembalian_dp;

        }

        jtf_sisabayar.setText("" + Integer.toString(sisabayar));

    }//GEN-LAST:event_btn_sisabayarActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabel_penyimpanan.getModel();

        //getSelected row index
        try {
            int SelectedRowIndex = tabel_penyimpanan.getSelectedRow();
            model.removeRow(SelectedRowIndex);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        JOptionPane.showMessageDialog(null, "DATA BERHASIL DIHAPUS");
        cleardata();

    }//GEN-LAST:event_btn_hapusActionPerformed

    private void tabel_penyimpananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_penyimpananMouseClicked
    DefaultTableModel model = (DefaultTableModel) tabel_penyimpanan.getModel();
    
        //set data to text filed when row is selected         
          String tbl_nama = model.getValueAt(tabel_penyimpanan.getSelectedRow(), 0).toString();
          String tbl_tipekamar = model.getValueAt(tabel_penyimpanan.getSelectedRow(), 1).toString();
          String tbl_hargakamar = model.getValueAt(tabel_penyimpanan.getSelectedRow(), 2).toString();
          String tbl_waktubayar = model.getValueAt(tabel_penyimpanan.getSelectedRow(), 3).toString();// 
          String tbl_tipebayar = model.getValueAt(tabel_penyimpanan.getSelectedRow(),4).toString();//
          String tbl_jumlahbayar = model.getValueAt(tabel_penyimpanan.getSelectedRow(),5).toString();
          String tbl_dp = model.getValueAt(tabel_penyimpanan.getSelectedRow(),6).toString();
          String tbl_uangyangdibayar = model.getValueAt(tabel_penyimpanan.getSelectedRow(),7).toString();
          String tbl_kembalian = model.getValueAt(tabel_penyimpanan.getSelectedRow(),8).toString();
          String tbl_sisabayar = model.getValueAt(tabel_penyimpanan.getSelectedRow(),9).toString();

       
        //set to txt field
        jtf_nama.setText(tbl_nama);
        cb_tipekamar.setSelectedItem(tbl_tipekamar);
        jtf_hargakamar.setText(tbl_hargakamar); 
//        buttonGroup1.clearSelection();//cara jadiin setext nya gimana 
//        buttonGroup2.clearSelection();//cara jadiin setext nya gimana
         jtf_jumlahbayar.setText(tbl_jumlahbayar);
         jtf_dp.setText(tbl_dp);
         jtf_uangbayar.setText(tbl_uangyangdibayar);
         jtf_kembalian.setText(tbl_kembalian);
         jtf_sisabayar.setText(tbl_sisabayar);

       
       
    }//GEN-LAST:event_tabel_penyimpananMouseClicked

    private void rb_dpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_dpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_dpActionPerformed

    private void jtf_uangbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_uangbayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_uangbayarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cleardata();

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(gui.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
            }
        });
    }

    private void cleardata() {
        jtf_nama.setText(null);
        jtf_hargakamar.setText(null);
        jtf_jumlahbayar.setText(null);
        jtf_dp.setText(null);
        jtf_uangbayar.setText(null);
        jtf_kembalian.setText(null);
        jtf_sisabayar.setText(null);

        cb_tipekamar.setSelectedItem("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();

    }

    private void hapusData() {
        tabel_penyimpanan.removeAll();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_jumlahbayar;
    private javax.swing.JButton btn_jumlahkembalian;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_sisabayar;
    private javax.swing.JButton btn_update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cb_tipekamar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtf_dp;
    private javax.swing.JTextField jtf_hargakamar;
    private javax.swing.JTextField jtf_jumlahbayar;
    private javax.swing.JTextField jtf_kembalian;
    private javax.swing.JTextField jtf_nama;
    private javax.swing.JTextField jtf_sisabayar;
    private javax.swing.JTextField jtf_uangbayar;
    private javax.swing.JRadioButton rb_bulanan;
    private javax.swing.JRadioButton rb_dp;
    private javax.swing.JRadioButton rb_lunas;
    private javax.swing.JRadioButton rb_tahunan;
    private javax.swing.JTable tabel_penyimpanan;
    // End of variables declaration//GEN-END:variables
}
