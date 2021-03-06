/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chaidir;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

/**
 *
 * @author user
 */
public class DataNasabah extends javax.swing.JFrame {

    String nama;
    double gajipokok;
    double penghasilantambah;
    double bonus;

    /**
     * Creates new form DataNasabah
     */
    public DataNasabah() {
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

        jLabel1 = new javax.swing.JLabel();
        tabPengajuan = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        alamatTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mobileTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rumahTF = new javax.swing.JTextField();
        statusTF = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        namaTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dataNasabahBTN = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        tanggunganTF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        gajiPokokTF = new javax.swing.JTextField();
        statusSukses = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        penghasilanTmbhnTF = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        bonusTF = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        hargaBarangTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        uangMukaTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lamaKreditTF = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        sukuBungaTF = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        pengajuanKreditBTN = new javax.swing.JButton();
        PokokCicilan = new javax.swing.JLabel();
        bungaCicilan = new javax.swing.JLabel();
        totalKredit = new javax.swing.JLabel();
        cicilanPerbulan = new javax.swing.JLabel();
        penghasilanLabel = new javax.swing.JLabel();
        limitPinjaman = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        persetujuan = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        namaPengajuanLBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("APLIKASI PENGAJUAN KREDIT");

        jLabel3.setText("Alamat :");

        jLabel4.setText("Status :");

        jLabel5.setText("Telepon Mobile :");

        mobileTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileTFActionPerformed(evt);
            }
        });

        jLabel6.setText("Telepon Rumah :");

        statusTF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Menikah", "Belum Menikah" }));
        statusTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusTFActionPerformed(evt);
            }
        });

        jLabel2.setText("Nama :");

        namaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaTFActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel7.setText("Data Pribadi");

        dataNasabahBTN.setText("Submit");
        dataNasabahBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataNasabahBTNActionPerformed(evt);
            }
        });

        jLabel12.setText("Jumlah Tanggungan :");

        tanggunganTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggunganTFActionPerformed(evt);
            }
        });

        jLabel13.setText("Gaji Pokok :");

        jLabel17.setText("PenghasilanTambahan :");

        penghasilanTmbhnTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penghasilanTmbhnTFActionPerformed(evt);
            }
        });

        jLabel18.setText("Bonus :");

        bonusTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bonusTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(102, 102, 102)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(alamatTF)
                                    .addComponent(namaTF)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel13))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rumahTF)
                                    .addComponent(mobileTF)
                                    .addComponent(statusTF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tanggunganTF)
                                    .addComponent(gajiPokokTF)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bonusTF)
                                    .addComponent(penghasilanTmbhnTF)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(225, 225, 225)
                                .addComponent(statusSukses)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dataNasabahBTN))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel18)))
                        .addGap(0, 236, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alamatTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(statusTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rumahTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tanggunganTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gajiPokokTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(penghasilanTmbhnTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(bonusTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(statusSukses))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(dataNasabahBTN)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        tabPengajuan.addTab("Data Nasabah", jPanel2);

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel8.setText("Data Pengajuan");

        jLabel9.setText("Harga Barang :");

        hargaBarangTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaBarangTFActionPerformed(evt);
            }
        });

        jLabel10.setText("Uang muka :");

        uangMukaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uangMukaTFActionPerformed(evt);
            }
        });

        jLabel11.setText("Lama Kredit :");

        lamaKreditTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lamaKreditTFActionPerformed(evt);
            }
        });

        jLabel14.setText("Suku Bunga PerTahun :");

        sukuBungaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sukuBungaTFActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel15.setText("%");

        pengajuanKreditBTN.setText("Submit");
        pengajuanKreditBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengajuanKreditBTNActionPerformed(evt);
            }
        });

        PokokCicilan.setText("Pokok Cicilan : 0");

        bungaCicilan.setText("Bunga Cicilan :0");

        totalKredit.setText("Total Kredit : 0");

        cicilanPerbulan.setText("Cicilan Perbulan : 0");

        penghasilanLabel.setText("Penghasilan Bulanan :0");

        limitPinjaman.setText("Limit Pinjaman : 0");

        jLabel22.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel22.setText("Detail Hasil Cicilan");

        persetujuan.setText("YA/TIDAK");

        jLabel19.setText("Nama Nasabah :");

        namaPengajuanLBL.setText("nama");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hargaBarangTF)
                                    .addComponent(uangMukaTF)
                                    .addComponent(lamaKreditTF)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sukuBungaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(jLabel22))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bungaCicilan)
                                    .addComponent(PokokCicilan)
                                    .addComponent(totalKredit))
                                .addGap(93, 93, 93)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(penghasilanLabel)
                                    .addComponent(limitPinjaman)
                                    .addComponent(cicilanPerbulan)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(persetujuan))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addComponent(pengajuanKreditBTN))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(namaPengajuanLBL)))
                        .addGap(0, 131, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(namaPengajuanLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(hargaBarangTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uangMukaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lamaKreditTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(sukuBungaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pengajuanKreditBTN)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PokokCicilan)
                    .addComponent(cicilanPerbulan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bungaCicilan)
                    .addComponent(penghasilanLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalKredit)
                    .addComponent(limitPinjaman))
                .addGap(18, 18, 18)
                .addComponent(persetujuan)
                .addGap(14, 14, 14))
        );

        tabPengajuan.addTab("Pengajuan Kredit", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPengajuan)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(tabPengajuan))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mobileTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileTFActionPerformed

    private void namaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaTFActionPerformed

    private void statusTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusTFActionPerformed

    private void hargaBarangTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaBarangTFActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_hargaBarangTFActionPerformed

    private void lamaKreditTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lamaKreditTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lamaKreditTFActionPerformed

    private void uangMukaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uangMukaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uangMukaTFActionPerformed

    private void dataNasabahBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataNasabahBTNActionPerformed

        try {
            DecimalFormat df = new DecimalFormat("###,###.###");

            String nama = namaTF.getText();
            namaPengajuanLBL.setText(nama);

            double penghasilans = penghasilanBulanan();
            String penghasilan = df.format(penghasilans);
            penghasilanLabel.setText("Penghasilan PerBulan Rp. " + penghasilan);

            double limits = LimitPinjaman();
            String limit = df.format(limits);
            limitPinjaman.setText("Limit Pinjaman Rp. " + limit);

            JOptionPane.showMessageDialog(null, "Data berhasil di simpan");
            
            tabPengajuan.setSelectedIndex(WIDTH);

//            namaTF.setText(null);
//            alamatTF.setText(null);
//            mobileTF.setText(null);
//            rumahTF.setText(null);
//            tanggunganTF.setText(null);
//            gajiPokokTF.setText(null);
//            penghasilanTmbhnTF.setText(null);
//            bonusTF.setText(null);

        } catch (Exception e) {
            //statusSukses.setText("DATA HARUS DIISI SEMUA!");
            JOptionPane.showMessageDialog(rootPane, "DATA HARUS DIISI SEMUA");
        }

    }//GEN-LAST:event_dataNasabahBTNActionPerformed

    private void tanggunganTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggunganTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggunganTFActionPerformed

    private void sukuBungaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sukuBungaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sukuBungaTFActionPerformed

    private void pengajuanKreditBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengajuanKreditBTNActionPerformed
        try {
            DecimalFormat df = new DecimalFormat("###,###.###");

            double cicilan = pokokCicilan();
            String pokokcicilan = df.format(cicilan);
            PokokCicilan.setText("Pokok Cicilan Rp. " + pokokcicilan);

            double bunga = bungaCicilan();
            String bungacicilan = df.format(bunga);
            bungaCicilan.setText("Bunga Cicilan Rp. " + bungacicilan);

            double totalcredit = totalKredit();
            String totalkredit = df.format(totalcredit);
            totalKredit.setText("Total Kredit Rp. " + totalkredit);

            double cicilans = cicilanPerBulan();
            String cicilanperbulan = df.format(cicilans);
            cicilanPerbulan.setText("Cicilan PerBulan Rp. " + cicilanperbulan);
            
            double limits = LimitPinjaman();
            String limit = df.format(limits);
            limitPinjaman.setText("Limit Pinjaman Rp. " + limit);
         
            if(limits>cicilans){
                persetujuan.setText("Disetujui");
            } else{
                persetujuan.setText("Tidak Disetujui");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "DATA HARUS DIISI SEMUA");
        }
            
    }//GEN-LAST:event_pengajuanKreditBTNActionPerformed

    private void penghasilanTmbhnTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penghasilanTmbhnTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_penghasilanTmbhnTFActionPerformed

    private void bonusTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bonusTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bonusTFActionPerformed

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
            java.util.logging.Logger.getLogger(DataNasabah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataNasabah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataNasabah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataNasabah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataNasabah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PokokCicilan;
    private javax.swing.JTextField alamatTF;
    private javax.swing.JTextField bonusTF;
    private javax.swing.JLabel bungaCicilan;
    private javax.swing.JLabel cicilanPerbulan;
    private javax.swing.JButton dataNasabahBTN;
    private javax.swing.JTextField gajiPokokTF;
    private javax.swing.JTextField hargaBarangTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lamaKreditTF;
    private javax.swing.JLabel limitPinjaman;
    private javax.swing.JTextField mobileTF;
    private javax.swing.JLabel namaPengajuanLBL;
    private javax.swing.JTextField namaTF;
    private javax.swing.JButton pengajuanKreditBTN;
    private javax.swing.JLabel penghasilanLabel;
    private javax.swing.JTextField penghasilanTmbhnTF;
    private javax.swing.JLabel persetujuan;
    private javax.swing.JTextField rumahTF;
    private javax.swing.JLabel statusSukses;
    private javax.swing.JComboBox<String> statusTF;
    private javax.swing.JTextField sukuBungaTF;
    private javax.swing.JTabbedPane tabPengajuan;
    private javax.swing.JTextField tanggunganTF;
    private javax.swing.JLabel totalKredit;
    private javax.swing.JTextField uangMukaTF;
    // End of variables declaration//GEN-END:variables

    public double pokokCicilan() {
        String hargaBarang = hargaBarangTF.getText();
        double hargabarang = Double.parseDouble(hargaBarang);
        String uangMuka = uangMukaTF.getText();
        double uangmuka = Double.parseDouble(uangMuka);
        double pokokCicilan = hargabarang - uangmuka;

        return pokokCicilan;
    }

    public double bungaCicilan() {
        String sukuBunga = sukuBungaTF.getText();
        double sukubunga = Double.parseDouble(sukuBunga)/100.0;
        String lamaKredit = lamaKreditTF.getText();
        int lamakredit = Integer.parseInt(lamaKredit);
        double bungaCicilans = pokokCicilan() * sukubunga * (lamakredit / 12);

        return bungaCicilans;
    }

    public double totalKredit() {
        double totalKredits = pokokCicilan() + bungaCicilan();
        return totalKredits;
    }

    public double cicilanPerBulan() {
        String lamaKredit = lamaKreditTF.getText();
        int lamakredit = Integer.parseInt(lamaKredit);
        double cicilanPerBulan = totalKredit() / lamakredit;

        return cicilanPerBulan;
    }

    public double penghasilanBulanan() {
        String gajiPokok = gajiPokokTF.getText();
        double gajipokoks = Double.parseDouble(gajiPokok);
        String penghasilanTmbhn = penghasilanTmbhnTF.getText();
        double penghasilantambahs = Double.parseDouble(penghasilanTmbhn);
        String Bonus = bonusTF.getText();
        double bonuss = Double.parseDouble(Bonus);

        double penghasilanBulanan = gajipokoks + penghasilantambahs + bonuss;

        return penghasilanBulanan;
    }

    public double LimitPinjaman() {
        String Tanggungan = tanggunganTF.getText();
        int tanggungan = Integer.parseInt(Tanggungan);
        double LimitPinjaman = penghasilanBulanan() / (tanggungan + 1);

        return LimitPinjaman;
    }
    

}
