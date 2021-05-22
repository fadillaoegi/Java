
package project_uas_pd_19410100076;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fuck_Boy
 */
public class Project_Uas_PD_19410100076 extends javax.swing.JFrame {
    
//  Deklarasi untuk auto input ketika memilih comboBox  
    private String hargaTampil = null, total, total2;
    
//    Deklarasi Variabel untuk masuk Ke Table
    private String Nama, Jk, Mdw, Mdp, Pw, Pp, Member ;
    private int   Hmrw, Hmrp, Hpw, Hpp, diskon, total1 = 0, total0 = 0, diskon2;
    
//    Membuat Tampungan sementara Untuk input Ke Table  
    private DefaultTableModel model;
    Object[] databarber;
    
    public Project_Uas_PD_19410100076() {
        initComponents();
    }
    

//    Menampilkan data di Table_Barber
    public void menampilkan () {
        
        model = (DefaultTableModel) table_barber.getModel();
        
//        Mengisi Baris Model
        databarber = new Object [] {Nama, Jk, Mdw, Mdp, Pw, Pp, Member,
                                 Hmrw, Hmrp, Hpw, Hpp, total,total2};
        
        model.addRow(databarber);
    }
    
//    Membersihkan Histori Inputan
    public void clearhistory () {
        
//        TExt Field
        Tf_nama.setText(null);
        Tf_hmrw.setText(null);
        Tf_hmrp.setText(null);
        Tf_hpw.setText (null);
        Tf_hpp.setText (null);
        Tf_total.setText(null);
        Tf_total2.setText(null);
        
//        Radio Button
        buttonGroup1.clearSelection();

//        Combo Box
        Cb_cewek.setSelectedItem("-");
        Cb_cowok.setSelectedItem("-");
        Cb_pcewek.setSelectedItem("-");
        Cb_pcowok.setSelectedItem("-");

//        Check Box
        Cek_member.setSelected(false);

        
    }
    
//    Method Untuk Insert
    public void insert () {
        
        //        Input Data ke Table
      String Hpw2, Hpp2;
//        Text Field
        Nama = Tf_nama.getText();
        Hpw2 = Integer.toString(Hpw);
        Hpw2 = Tf_hpw.getText();
        Hpp2 = Integer.toString(Hpp);
        Hpp2 = Tf_hpp.getText();
        
//        Radio Button
        if (Rb_l.isSelected()) {
            
            Jk = Rb_l.getText().toString();
            
        } else {
            Jk = Rb_p.getText().toString();
        }
        
//        Combo Box
         Mdw =  Cb_cewek.getSelectedItem().toString();
         Mdp = Cb_cowok.getSelectedItem() .toString();
         Pw = Cb_pcewek.getSelectedItem() .toString();
         Pp = Cb_pcowok.getSelectedItem() .toString();
         
//        Check Box
        if (Cek_member.isSelected()) {
            
            Member = "iya, (5%)";
            
        } else {
            
            Member = "Tidak, (0%)";
            
        }
        
        
        menampilkan();
        clearhistory();
        
        popup1();
        
    }
    
//    Method Untuk Delete Data
    public void delete () {
        
        try {
            
            int SelectedRowIndex = table_barber.getSelectedRow();
            model.removeRow(SelectedRowIndex);
            
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null, ex);
        }
        popup2();
        clearhistory();
        
    }
    
//    Method Edit
    
    public void edit () {
        
        DefaultTableModel model = (DefaultTableModel) table_barber.getModel();
        
        if ( table_barber.getSelectedRowCount() == 1 ) {
            
//            Edi Bagian Radio Button
            if (Rb_l.isSelected()) {
                
                Jk = Rb_l.getText().toString();
                
            } else {
                
                Jk = Rb_p.getText().toString();
                
            }
            
//            String hmrw2;

//            Edit Bagian Text Field
            Nama = Tf_nama.getText();
//            Hmrw = Tf_hmrw.getText();
    
//            Edit Radio Button
            
        if ((model.getValueAt(table_barber.getSelectedRow(), 1).toString()).equals("Pria")) {
            
            Rb_l.setSelected(true);
            
        } else {
            
            Rb_p.setSelected(true);
        }

//            Edit Combo Box
                    
             Mdw = Cb_cewek.getSelectedItem().toString();
             Mdp = Cb_cowok.getSelectedItem().toString();
             Pw  = Cb_pcewek.getSelectedItem().toString();
             Pp  = Cb_pcowok.getSelectedItem().toString();

            
            
            
//            Select semua data untuk edit Data
            model.setValueAt( Nama, table_barber.getSelectedRow(), 0);
            model.setValueAt( Jk, table_barber.getSelectedRow(), 1);
            model.setValueAt( Mdw, table_barber.getSelectedRow(), 2);
            model.setValueAt( Mdp, table_barber.getSelectedRow(), 3);
            model.setValueAt( Pw, table_barber.getSelectedRow(), 4);
            model.setValueAt( Pp, table_barber.getSelectedRow(), 5);
            model.setValueAt( Member, table_barber.getSelectedRow(), 6);
            model.setValueAt( Hmrw, table_barber.getSelectedRow(), 7);
            model.setValueAt( Hmrp, table_barber.getSelectedRow(), 9);
            model.setValueAt( Hpw, table_barber.getSelectedRow(), 10);
            model.setValueAt( Hpp, table_barber.getSelectedRow(), 11);
            model.setValueAt( total, table_barber.getSelectedRow(), 12);
            model.setValueAt( total2, table_barber.getSelectedRow(), 13);
            
        }
        
            
        
    }
    
//    Method PoP Up
    public void popup1 () {
        
        JOptionPane.showMessageDialog(this, "Data Tersimpan Di table !");
        
    }
    
    public void popup2 () {
        
        JOptionPane.showMessageDialog(null, "Data deleted !");
        
    }
    
    public void popup3 () {
        
        JOptionPane.showMessageDialog(null, "Data Updated !");
        
    }
    
//    Method Untuk Calculate Pria
    public void CalculatePria () {
        
        Hmrp = Integer.parseInt(Tf_hmrp.getText());
        Hpp = Integer.parseInt(Tf_hpp.getText());
        
        total0 = Hmrp + Hpp;
        
        
        if (Cek_member.isSelected()) {
            
            diskon2 = total0*5/100;
            int tdp = total0 - diskon2;
            total2 = String.valueOf(tdp);
            
        } else {
            
            total2 = String.valueOf(total0);
            
        }
        
        Tf_total2.setText(total2);
        
        
    }
    
    public void CalculateWanita () {
        
        Hmrw = Integer.parseInt(Tf_hmrw.getText());
        Hpw = Integer.parseInt(Tf_hpw.getText());
        
        
        total1 = Hmrw + Hpw;
        
        
        if (Cek_member.isSelected()) {
            
            diskon = total1*5/100;
            int td = total1 - diskon;
            total = String.valueOf(td);
            
        } else {
            
            
            total = String.valueOf(total1);
            
        }
        
        Tf_total.setText(total);
        
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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        N_l = new javax.swing.JLabel();
        J_l = new javax.swing.JLabel();
        M_l = new javax.swing.JLabel();
        T_l = new javax.swing.JLabel();
        P_l = new javax.swing.JLabel();
        Tf_nama = new javax.swing.JTextField();
        Rb_l = new javax.swing.JRadioButton();
        Cb_cewek = new javax.swing.JComboBox<>();
        Rb_p = new javax.swing.JRadioButton();
        Cb_cowok = new javax.swing.JComboBox<>();
        Cb_pcewek = new javax.swing.JComboBox<>();
        Cb_pcowok = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Tf_hmrw = new javax.swing.JTextField();
        Tf_hpp = new javax.swing.JTextField();
        Edit = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Insert = new javax.swing.JButton();
        Cek_member = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        Tf_total = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Tf_hmrp = new javax.swing.JTextField();
        Tf_hpw = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Tf_total2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_barber = new javax.swing.JTable();

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("KING_BARBERSHOP");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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
        setBackground(new java.awt.Color(0, 0, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        jTextField1.setBackground(new java.awt.Color(0, 0, 153));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("KING QUEEN BARBERSHOP");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(377, 377, 377))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        N_l.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        N_l.setForeground(new java.awt.Color(255, 255, 255));
        N_l.setText("Nama Pelanggan");

        J_l.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        J_l.setForeground(new java.awt.Color(255, 255, 255));
        J_l.setText("Jenis Kelamin");

        M_l.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        M_l.setForeground(new java.awt.Color(255, 255, 255));
        M_l.setText("Model Rambut");

        T_l.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        T_l.setForeground(new java.awt.Color(255, 255, 255));
        T_l.setText("Tambahan Produk");

        P_l.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        P_l.setForeground(new java.awt.Color(255, 255, 255));
        P_l.setText("Punya Member ?");

        Tf_nama.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        Rb_l.setBackground(new java.awt.Color(204, 0, 0));
        buttonGroup1.add(Rb_l);
        Rb_l.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        Rb_l.setForeground(new java.awt.Color(255, 255, 255));
        Rb_l.setText("Pria");

        Cb_cewek.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Cb_cewek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Blunt Bob", "Korean Bob", "Sosis", "Shaggy Bob", "Bonding" }));
        Cb_cewek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cb_cewekActionPerformed(evt);
            }
        });

        Rb_p.setBackground(new java.awt.Color(204, 0, 0));
        buttonGroup1.add(Rb_p);
        Rb_p.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        Rb_p.setForeground(new java.awt.Color(255, 255, 255));
        Rb_p.setText("Wanita");

        Cb_cowok.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Cb_cowok.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "ToBlok", "Drop Fade", "UnderCut", "Top Knot", "Botak" }));
        Cb_cowok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cb_cowokActionPerformed(evt);
            }
        });

        Cb_pcewek.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Cb_pcewek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Minyak kemiri", "Pedicure", "Masker spirulina", "Lipstik", "Shampo Lidah buaya" }));
        Cb_pcewek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cb_pcewekActionPerformed(evt);
            }
        });

        Cb_pcowok.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Cb_pcowok.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Minyak kemiri", "Pomade wak doyok", "Pomade smith", "Pomade TM", "Pomade suavecito" }));
        Cb_pcowok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cb_pcowokActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Harga Model Rambut Wanita");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Harga Produk Pria");

        Tf_hmrw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_hmrwActionPerformed(evt);
            }
        });

        Edit.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Edit.setText("Edit_Data");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Delete.setText("Delete_Data");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Insert.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Insert.setText("Insert_Data");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        Cek_member.setBackground(new java.awt.Color(204, 0, 0));
        Cek_member.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        Cek_member.setForeground(new java.awt.Color(255, 255, 255));
        Cek_member.setText("Ya");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total Pembayaran Wanita");

        Tf_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_totalActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Harga Model Rambut Pria");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Harga Produk Wanita");

        Tf_hmrp.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Tf_hmrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_hmrpActionPerformed(evt);
            }
        });

        Tf_hpw.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Tf_hpw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_hpwActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Wanita");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Pria");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Wanita");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Pria");

        jButton1.setText("Calculate Wanita");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Calculate Pria  ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Tf_total2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Tf_total2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_total2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Total Pembayaran Pria  ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(N_l)
                                .addComponent(J_l)
                                .addComponent(M_l)
                                .addComponent(T_l)
                                .addComponent(P_l))
                            .addGap(48, 48, 48)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel9)
                                        .addComponent(Cek_member))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Cb_pcewek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                            .addComponent(Cb_cewek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(45, 45, 45)))
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18)
                                            .addComponent(Cb_cowok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(jLabel10)
                                            .addGap(16, 16, 16)
                                            .addComponent(Cb_pcowok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addGap(85, 85, 85)
                                            .addComponent(jButton1)
                                            .addGap(46, 46, 46)
                                            .addComponent(jButton2))))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(Rb_l)
                                    .addGap(18, 18, 18)
                                    .addComponent(Rb_p))
                                .addComponent(Tf_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(27, 27, 27)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel6))
                                    .addGap(56, 56, 56)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Tf_hpw, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Tf_hpp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(34, 34, 34)
                                        .addComponent(Tf_hmrp, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(Tf_hmrw, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(403, 403, 403)
                            .addComponent(Edit)
                            .addGap(18, 18, 18)
                            .addComponent(Delete)
                            .addGap(18, 18, 18)
                            .addComponent(Insert)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(Tf_total, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Tf_total2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(207, 207, 207)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(260, 260, 260))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(N_l)
                    .addComponent(Tf_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Tf_hmrw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(J_l)
                        .addComponent(Rb_p)
                        .addComponent(Rb_l)
                        .addComponent(Tf_hmrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Cb_cewek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(Tf_hpw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Cb_cowok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Tf_hpp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(M_l)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cb_pcowok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cb_pcewek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(T_l))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(P_l)
                            .addComponent(Cek_member))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tf_total2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tf_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11))
                .addGap(3, 3, 3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edit)
                    .addComponent(Delete)
                    .addComponent(Insert))
                .addGap(25, 25, 25))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        table_barber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        table_barber.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama_Pelanggan", "Jenis_Kelamin", "Model_Rambut_Wanita", "Model_Rambut_Pria", "Produk_Wanita", "Produk_Pria", "Member", "Harga_Mr_Wanita", "Harga_Mr_Pria", "Harga_Produk Pria", "Harga_Produk Wanita", "Total_p_Wanita", "Total_P_Pria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_barber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_barberMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_barber);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void Tf_hmrwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_hmrwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_hmrwActionPerformed

    private void Cb_pcewekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cb_pcewekActionPerformed
        // TODO add your handling code here:
        hargaTampil = (String) Cb_pcewek.getSelectedItem();
        switch (hargaTampil) {
            
            case "-" :
                
               Hpw = 0;
                
                break;
            
            case "Minyak kemiri" :
                
               Hpw = 200000;
                
                break;
                
            case "Pedicure" :
                
                Hpw = 500000;
                
                break;
            
            case "Masker spirulina" :
                
                Hpw = 300000;
                
                break;  
                
            case "Lipstik" :
                
                Hpw = 350000;
                
                break;  
                
            case "Shampo Lidah buaya" :
                
                Hpw = 400000;
                
                break;    
                
                
        }
        Tf_hpw.setText(Integer.toString(Hpw));
        
    }//GEN-LAST:event_Cb_pcewekActionPerformed

    private void Tf_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_totalActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        // TODO add your handling code here:
        
        insert ();

    }//GEN-LAST:event_InsertActionPerformed

    private void Cb_cewekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cb_cewekActionPerformed
        // TODO add your handling code here:
        hargaTampil = (String) Cb_cewek.getSelectedItem();
        switch (hargaTampil) {
            
            case "-" :
                
               Hmrw = 0;
                
                break;
            
            case "Blunt Bob" :
                
               Hmrw = 50000;
                
                break;
                
            case "Korean Bob" :
                
                Hmrw = 100000;
                
                break;
            
            case "Sosis" :
                
                Hmrw = 150000;
                
                break;  
                
            case "Shaggy Bob" :
                
                Hmrw = 250000;
                
                break;  
                
            case "Bonding" :
                
                Hmrw = 300000;
                
                break;    
                
                
        }
        Tf_hmrw.setText(Integer.toString(Hmrw));
        
    }//GEN-LAST:event_Cb_cewekActionPerformed

    private void Tf_hpwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_hpwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_hpwActionPerformed

    private void Tf_hmrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_hmrpActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_Tf_hmrpActionPerformed

    private void Cb_cowokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cb_cowokActionPerformed
        // TODO add your handling code here:
        
        hargaTampil = (String) Cb_cowok.getSelectedItem();
        switch (hargaTampil) {
            
            case "-" :
                
               Hmrp = 0;
                
                break;
            
            case "ToBlok" :
                
               Hmrp = 100000;
                
                break;
                
            case "Drop Fade" :
                
                Hmrp = 120000;
                
                break;
            
            case "UnderCut" :
                
                Hmrp = 30000;
                
                break;  
                
            case "Top Knot" :
                
                Hmrp = 35000;
                
                break;  
                
            case "Botak" :
                
                Hmrp = 40000;
                
                break;    
                
                
        }
        Tf_hmrp.setText(Integer.toString(Hmrp));
        
    }//GEN-LAST:event_Cb_cowokActionPerformed

    private void Cb_pcowokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cb_pcowokActionPerformed
        // TODO add your handling code here:
        
        hargaTampil = (String) Cb_pcowok.getSelectedItem();
        switch (hargaTampil) {
            
            case "-" :
                
               Hpp = 0;
                
                break;
            
            case "Minyak kemiri" :
                
               Hpp = 100000;
                
                break;
                
            case "Pomade wak doyok" :
                
                Hpp = 170000;
                
                break;
            
            case "Pomade smith" :
                
                Hpp = 70000;
                
                break;  
                
            case "Pomade TM" :
                
                Hpp = 95000;
                
                break;  
                
            case "Pomade suavecito" :
                
                Hpp = 55000;
                
                break;    
                
                
        }
        Tf_hpp.setText(Integer.toString(Hpp));
        
    }//GEN-LAST:event_Cb_pcowokActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        
        delete();
        
    }//GEN-LAST:event_DeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
       
        CalculateWanita ();
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        CalculatePria();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
        
        edit();
        popup3 ();
        
    }//GEN-LAST:event_EditActionPerformed

    private void Tf_total2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_total2ActionPerformed
        // TODO add your handling code here:
//        Tf_total2.getText("0");
    }//GEN-LAST:event_Tf_total2ActionPerformed

    private void table_barberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_barberMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel Out = (DefaultTableModel) table_barber.getModel();
        
        
        String Nama   = Out.getValueAt(table_barber.getSelectedRow(), 0).toString();
        String Jk     = Out.getValueAt(table_barber.getSelectedRow(), 1).toString();
        String Mdw    = Out.getValueAt(table_barber.getSelectedRow(), 2).toString();
        String Mdp    = Out.getValueAt(table_barber.getSelectedRow(), 3).toString();
        String Pw     = Out.getValueAt(table_barber.getSelectedRow(), 4).toString();
        String Pp     = Out.getValueAt(table_barber.getSelectedRow(), 5).toString();
        String Member = Out.getValueAt(table_barber.getSelectedRow(), 6).toString();
        String Hmrw   = Out.getValueAt(table_barber.getSelectedRow(), 7).toString();
        String Hmrp   = Out.getValueAt(table_barber.getSelectedRow(), 8).toString();
        String Hpw    = Out.getValueAt(table_barber.getSelectedRow(), 9).toString();
        String Hpp    = Out.getValueAt(table_barber.getSelectedRow(), 10).toString();
        String total  = Out.getValueAt(table_barber.getSelectedRow(), 11).toString();
        String total2 = Out.getValueAt(table_barber.getSelectedRow(), 12).toString();
        
        Tf_nama.setText(Nama);
        Tf_hmrw.setText(Hmrw);
        Tf_hmrp.setText(Hmrp);
        Tf_hpw.setText (Hpw) ;
        Tf_hpp.setText  (Hpp);
        Tf_total.setText(total);
        Tf_total2.setText(total2);
        
        
    }//GEN-LAST:event_table_barberMouseClicked

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
            java.util.logging.Logger.getLogger(Project_Uas_PD_19410100076.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Project_Uas_PD_19410100076.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Project_Uas_PD_19410100076.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Project_Uas_PD_19410100076.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Project_Uas_PD_19410100076().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cb_cewek;
    private javax.swing.JComboBox<String> Cb_cowok;
    private javax.swing.JComboBox<String> Cb_pcewek;
    private javax.swing.JComboBox<String> Cb_pcowok;
    private javax.swing.JCheckBox Cek_member;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Insert;
    private javax.swing.JLabel J_l;
    private javax.swing.JLabel M_l;
    private javax.swing.JLabel N_l;
    private javax.swing.JLabel P_l;
    private javax.swing.JRadioButton Rb_l;
    private javax.swing.JRadioButton Rb_p;
    private javax.swing.JLabel T_l;
    private javax.swing.JTextField Tf_hmrp;
    private javax.swing.JTextField Tf_hmrw;
    private javax.swing.JTextField Tf_hpp;
    private javax.swing.JTextField Tf_hpw;
    private javax.swing.JTextField Tf_nama;
    private javax.swing.JTextField Tf_total;
    private javax.swing.JTextField Tf_total2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable table_barber;
    // End of variables declaration//GEN-END:variables
}
