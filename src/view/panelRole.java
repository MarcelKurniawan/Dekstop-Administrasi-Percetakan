/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import control.RoleDAO;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import model.Role;

/**
 *
 * @author MSI
 */
public class panelRole extends javax.swing.JPanel implements ListSelectionListener{
    RoleDAO daoRole;
    private Role role;
    DefaultTableModel dataRole;
    
    public panelRole() {
        initComponents();
        daoRole = new RoleDAO();
        dataRole = (DefaultTableModel) tabelRole.getModel();
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
        tabelRole = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        desc = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        del = new javax.swing.JButton();
        res = new javax.swing.JButton();

        setBackground(new java.awt.Color(37, 150, 190));
        setLayout(new java.awt.GridBagLayout());

        tabelRole.setForeground(new java.awt.Color(51, 51, 255));
        tabelRole.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Role", "Desc"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelRole);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 411;
        gridBagConstraints.ipady = 408;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 30, 25);
        add(jScrollPane1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kelola Role Pegawai");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 219, 0, 0);
        add(jLabel1, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(37, 150, 190));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kelola Role", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Role");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Role Description");

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        del.setText("Delete");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        res.setText("Reset");
        res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(res, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(del, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(desc, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(del)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(res)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 238;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 12, 30, 0);
        add(jPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resActionPerformed
        reset();
    }//GEN-LAST:event_resActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        save();
    }//GEN-LAST:event_saveActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        delete();
    }//GEN-LAST:event_delActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton del;
    private javax.swing.JTextField desc;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton res;
    private javax.swing.JButton save;
    private javax.swing.JTable tabelRole;
    // End of variables declaration//GEN-END:variables
    private void save() {
        if (role.getRoleId() == null) {
            role.setRoleId(id.getText().trim());
            role.setRoleDesc(desc.getText().trim());;
            if (daoRole.insertData(role)) {
                JOptionPane.showMessageDialog(this, "Data Role berhasil ditambah!", "Information Message", 1);
                reset();
            } else {
                JOptionPane.showMessageDialog(this, "Data Role gagal ditambah!", "Warning Message", 2);
            } 
        } else {
            role.setRoleId(id.getText().trim());
            role.setRoleDesc(desc.getText().trim());;
            if (daoRole.updateData(role)) {
                JOptionPane.showMessageDialog(this, "Data Role berhasil diubah!", "Information Message", 1);
                reset();
            } else {
            JOptionPane.showMessageDialog(this, "Data Role gagal diubah!", "Warning Message", 2);
            } 
        }
    }
  
    private void delete() {
        if (role.getRoleId() == null) {
            JOptionPane.showMessageDialog(this, "Data Role tidak ada!", "Warning Message", 2);
        } else if (role.getPegawaiList().isEmpty()) {
            if (JOptionPane.showConfirmDialog(this, "Apakah Anda akan menghapus Data Role?", "Confirmation Delete", 2, 3) == 0) {
                if (daoRole.deleteData(role)) {
                    JOptionPane.showMessageDialog(this, "Data Role berhasil dihapus!", "Information Message", 1);
                    reset();
                } else {
                    JOptionPane.showMessageDialog(this, "Data Role gagal dihapus!", "Warning Message", 2);
                } 
            } else {
                JOptionPane.showMessageDialog(this, "Data Role batal dihapus!", "Information Message", 1);
            } 
        } else {
            JOptionPane.showMessageDialog(this, "Data Role tidak dapat dihapus!", "Warning Message", 2);
        } 
    }
    public void reset() {
        role = new Role();
        id.setText("");
        desc.setText("");
        ShowRoleList();
        save.setText("save");
    }
    
    private void ShowRoleList() {
        tabelRole.getSelectionModel().removeListSelectionListener(this);
        dataRole.getDataVector().removeAllElements();
        for (Role b : daoRole.getAllData()) {
            dataRole.addRow(new Object[]{
                b.getRoleId(),
                b.getRoleDesc()});
        } 
        tabelRole.getSelectionModel().addListSelectionListener(this);
    }
    
    public void valueChanged(ListSelectionEvent e) {
        if (e.getSource() == this.tabelRole.getSelectionModel())
            try {
                role = daoRole.getData(Integer.parseInt(tabelRole.getValueAt(tabelRole.getSelectedRow(), 0).toString()));
                id.setText(role.getRoleId().toString());
                desc.setText(role.getRoleDesc());
                save.setText("Update");
            } catch (Exception exception) {} 
    }
}
