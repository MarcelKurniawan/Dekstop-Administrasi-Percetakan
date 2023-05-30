/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import control.PegawaiDAO;
import control.RoleDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import model.Pegawai;
import model.Role;

/**
 *
 * @author MSI
 */
public class panelPegawai extends javax.swing.JPanel implements ListSelectionListener{
    PegawaiDAO daoPeg;
    RoleDAO daoRole;
    private Pegawai pegawai;
    List<Role> dataRole;
    DefaultTableModel dataPeg;
    
    public panelPegawai() {
        initComponents();
        daoPeg = new PegawaiDAO();
        daoRole = new RoleDAO();
        dataPeg = (DefaultTableModel) tabelPeg.getModel();
        reset();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPeg = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        agama = new javax.swing.JComboBox<>();
        id = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        tempat = new javax.swing.JTextField();
        telp = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        status = new javax.swing.JComboBox<>();
        lahir = new com.toedter.calendar.JDateChooser();
        masuk = new com.toedter.calendar.JDateChooser();
        del = new javax.swing.JButton();
        save = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jenis = new javax.swing.JComboBox<>();
        rules = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(37, 150, 190));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        tabelPeg.setForeground(new java.awt.Color(51, 51, 255));
        tabelPeg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Pegawai", "ID Role", "Nama", "Tanggal Lahir", "Tempat Lahir", "No Telp", "Alamat", "Tanggal Masuk", "Status", "Agama", "Jenis Kelamin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelPeg);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 621;
        gridBagConstraints.ipady = 623;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 13, 12);
        add(jScrollPane1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kelola Data Pegawai");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 106, 0, 0);
        add(jLabel1, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(37, 150, 190));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kelola Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Role ID");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No Telp");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tanggal Lahir");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nama");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tempat Lahir");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Alamat");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tanggal Masuk");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Status");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Agama");

        agama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Hindu", "Buddha", "Konghucu", "Katholik", "Kristen Protestan" }));

        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aktif", "Tidak Aktif" }));

        del.setText("Delete");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Jenis Kelamin");

        jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));

        rules.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nama, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(id)
                            .addComponent(rules, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tempat)
                            .addComponent(telp)
                            .addComponent(alamat)
                            .addComponent(lahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(masuk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jenis, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(agama, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rules, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tempat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(telp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(masuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(del)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reset)
                .addContainerGap(234, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.ipady = 221;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 12, 13, 0);
        add(jPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        save();
    }//GEN-LAST:event_saveActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        delete();
    }//GEN-LAST:event_delActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        reset();
    }//GEN-LAST:event_resetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> agama;
    private javax.swing.JTextField alamat;
    private javax.swing.JButton del;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jenis;
    private com.toedter.calendar.JDateChooser lahir;
    private com.toedter.calendar.JDateChooser masuk;
    private javax.swing.JTextField nama;
    private javax.swing.JButton reset;
    private javax.swing.JComboBox<String> rules;
    private javax.swing.JButton save;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTable tabelPeg;
    private javax.swing.JTextField telp;
    private javax.swing.JTextField tempat;
    // End of variables declaration//GEN-END:variables
    private void save() {
        if (pegawai.getIdPegawai() == null) {
            pegawai.setIdPegawai(id.getText().trim());
            pegawai.setRoleId(dataRole.get(rules.getSelectedIndex()));
            pegawai.setNamaPegawai(nama.getText().trim());
            pegawai.setTglLahir(lahir.getDate());
            pegawai.setTempatLahir(tempat.getText().trim());
            pegawai.setTelpPegawai(telp.getText().trim());
            pegawai.setAlamatPegawai(alamat.getText().trim());
            pegawai.setTanggalMasuk(masuk.getDate());
            pegawai.setStatusPegawai(status.getSelectedItem().toString());
            pegawai.setAgama(agama.getSelectedItem().toString());
            pegawai.setDataJenisKelamin(jenis.getSelectedItem().toString());
            if (daoPeg.insertData(pegawai)) {
                JOptionPane.showMessageDialog(this, "Data Pegawai berhasil ditambah!", "Information Message", 1);
                reset();
            } else {
                JOptionPane.showMessageDialog(this, "Data Pegawai gagal ditambah!", "Warning Message", 2);
            } 
        } else {
            pegawai.setIdPegawai(id.getText().trim());
            pegawai.setRoleId(dataRole.get(rules.getSelectedIndex()));
            pegawai.setNamaPegawai(nama.getText().trim());
            pegawai.setTglLahir(lahir.getDate());
            pegawai.setTempatLahir(tempat.getText().trim());
            pegawai.setTelpPegawai(telp.getText().trim());
            pegawai.setAlamatPegawai(alamat.getText().trim());
            pegawai.setTanggalMasuk(masuk.getDate());
            pegawai.setStatusPegawai(status.getSelectedItem().toString());
            pegawai.setAgama(agama.getSelectedItem().toString());
            pegawai.setDataJenisKelamin(jenis.getSelectedItem().toString());
            if (daoPeg.updateData(pegawai)) {
                JOptionPane.showMessageDialog(this, "Data Pegawai berhasil diubah!", "Information Message", 1);
                reset();
            } else {
            JOptionPane.showMessageDialog(this, "Data Pegawai gagal diubah!", "Warning Message", 2);
            } 
        }
    }
  
    private void delete() {
        if (pegawai.getIdPegawai() == null) {
            JOptionPane.showMessageDialog(this, "Data Pegawai tidak ada!", "Warning Message", 2);
        } else if (pegawai.getPemesananList().isEmpty()) {
            if (JOptionPane.showConfirmDialog(this, "Apakah Anda akan menghapus Data Pegawai?", "Confirmation Delete", 2, 3) == 0) {
                if (daoPeg.deleteData(pegawai)) {
                    JOptionPane.showMessageDialog(this, "Data Pegawai berhasil dihapus!", "Information Message", 1);
                    reset();
                } else {
                    JOptionPane.showMessageDialog(this, "Data Pegawai gagal dihapus!", "Warning Message", 2);
                } 
            } else {
                JOptionPane.showMessageDialog(this, "Data Pegawai batal dihapus!", "Information Message", 1);
            } 
        } else {
            JOptionPane.showMessageDialog(this, "Data Pegawai tidak dapat dihapus!", "Warning Message", 2);
        } 
    }
    
    public void reset() {
        pegawai = new Pegawai();
        id.setText("");
        listRole();
        rules.setSelectedIndex(0);
        nama.setText("");
        lahir.setDate(null);
        tempat.setText("");
        telp.setText("");
        alamat.setText("");
        masuk.setDate(null);
        status.setSelectedIndex(0);
        agama.setSelectedIndex(0);
        jenis.setSelectedIndex(0);
        ShowPegawaiList();
        save.setText("save");
    }
    
    private void ShowPegawaiList() {
        tabelPeg.getSelectionModel().removeListSelectionListener(this);
        dataPeg.getDataVector().removeAllElements();
        for (Pegawai b : daoPeg.getAllData()) {
            dataPeg.addRow(new Object[]{
                b.getIdPegawai(),
                b.getRoleId(),
                b.getNamaPegawai(),
                b.getTglLahir(),
                b.getTempatLahir(),
                b.getTelpPegawai(),
                b.getAlamatPegawai(),
                b.getTanggalMasuk(),
                b.getStatusPegawai(),
                b.getAgama(),
                b.getDataJenisKelamin()
            });
        } 
        tabelPeg.getSelectionModel().addListSelectionListener(this);
    }
    
    public void valueChanged(ListSelectionEvent e) {
        if (e.getSource() == this.tabelPeg.getSelectionModel())
            try {
                pegawai = daoPeg.getData(Integer.parseInt(tabelPeg.getValueAt(tabelPeg.getSelectedRow(), 0).toString()));
                id.setText(pegawai.getIdPegawai().toString());
                rules.setSelectedItem(pegawai.getRoleId().getRoleId());
                nama.setText(pegawai.getNamaPegawai());
                lahir.setDate(pegawai.getTglLahir());
                tempat.setText(pegawai.getTempatLahir());
                telp.setText(pegawai.getTelpPegawai());
                alamat.setText(pegawai.getAlamatPegawai());
                masuk.setDate(pegawai.getTanggalMasuk());
                status.setSelectedItem(pegawai.toString());
                agama.setSelectedItem(pegawai.toString());
                jenis.setSelectedItem(pegawai.toString());
                save.setText("Update");
            } catch (Exception exception) {} 
    }
    
        public void listRole() {
        dataRole = daoRole.getAllData();
        String[] data = new String[dataRole.size()];
        for (int i = 0; i < data.length; i++)
            data[i] = ((Role)dataRole.get(i)).getRoleId().isEmpty() ? "-" : ((Role)dataRole.get(i)).getRoleId(); 
            rules.setModel(new DefaultComboBoxModel<>(data));
    }
}
