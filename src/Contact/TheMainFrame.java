/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Contact;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Abdelrahman
 */
public class TheMainFrame extends javax.swing.JFrame {
    DefaultTableModel model ;
    File f;
    public static int numberOfContacts;
    /**
     * Creates new form TheMainFrame
     */
    public TheMainFrame() {
        initComponents();
        ImageIcon img = new ImageIcon ("src/Resources/contacts.png");
        setIconImage(img.getImage());
        setTitle("Phone Book");
        model = (DefaultTableModel) Table.getModel();
        Table.setAutoCreateRowSorter(true); // sort the table
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        infoPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        emailLable = new javax.swing.JLabel();
        phoneLable = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        contactLable = new javax.swing.JLabel();
        noOfConLable = new javax.swing.JLabel();
        Counter = new javax.swing.JLabel();
        addLable = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        deleteLabel = new javax.swing.JLabel();
        clearLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        changeButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        ScrollPaneTable = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(50, 50, 52));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(50, 50, 52));

        infoPanel.setBackground(new java.awt.Color(50, 50, 52));
        infoPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        infoPanel.setOpaque(false);

        nameLabel.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("NAME");

        emailLable.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        emailLable.setForeground(new java.awt.Color(255, 255, 255));
        emailLable.setText("EMAIL");

        phoneLable.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        phoneLable.setForeground(new java.awt.Color(255, 255, 255));
        phoneLable.setText("PHONE");

        nameTextField.setBackground(new java.awt.Color(50, 50, 52));
        nameTextField.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        nameTextField.setForeground(new java.awt.Color(255, 255, 255));
        nameTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        nameTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nameTextField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        nameTextField.setSelectionColor(new java.awt.Color(0, 102, 153));
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        emailTextField.setBackground(new java.awt.Color(50, 50, 52));
        emailTextField.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        emailTextField.setForeground(new java.awt.Color(255, 255, 255));
        emailTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        emailTextField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        phoneTextField.setBackground(new java.awt.Color(50, 50, 52));
        phoneTextField.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        phoneTextField.setForeground(new java.awt.Color(255, 255, 255));
        phoneTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        phoneTextField.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(phoneLable)
                        .addGap(43, 43, 43)
                        .addComponent(phoneTextField))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailLable)
                            .addComponent(nameLabel))
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infoPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(infoPanelLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(nameTextField)))))
                .addGap(27, 27, 27))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLable))
                .addGap(27, 27, 27)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLable))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        contactLable.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        contactLable.setForeground(new java.awt.Color(255, 255, 255));
        contactLable.setText("CONTACTS");

        noOfConLable.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        noOfConLable.setForeground(new java.awt.Color(255, 255, 255));
        noOfConLable.setText("NUMBER OF CONTACTS");

        Counter.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        Counter.setForeground(new java.awt.Color(255, 255, 255));
        Counter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Counter.setText("0");

        addLable.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        addLable.setForeground(new java.awt.Color(255, 255, 255));
        addLable.setText("ADD");

        deleteButton.setBackground(new java.awt.Color(50, 50, 52));
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/delete.png"))); // NOI18N
        deleteButton.setBorder(null);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        deleteLabel.setBackground(new java.awt.Color(50, 50, 52));
        deleteLabel.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        deleteLabel.setForeground(new java.awt.Color(255, 255, 255));
        deleteLabel.setText("DELETE");

        clearLabel.setBackground(new java.awt.Color(50, 50, 52));
        clearLabel.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        clearLabel.setForeground(new java.awt.Color(255, 255, 255));
        clearLabel.setText("CLEAR");

        addButton.setBackground(new java.awt.Color(50, 50, 52));
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/add-group.png"))); // NOI18N
        addButton.setBorder(null);
        addButton.setOpaque(true);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        changeButton.setBackground(new java.awt.Color(50, 50, 52));
        changeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/exit.png"))); // NOI18N
        changeButton.setBorder(null);
        changeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(50, 50, 52));
        clearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/eraser.png"))); // NOI18N
        clearButton.setBorder(null);
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        Table.setBackground(new java.awt.Color(50, 50, 52));
        Table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Table.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        Table.setForeground(new java.awt.Color(255, 255, 255));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "EMAIL", "PHONE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Table.setOpaque(false);
        Table.setSelectionForeground(new java.awt.Color(255, 255, 255));
        Table.getTableHeader().setReorderingAllowed(false);
        ScrollPaneTable.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setResizable(false);
            Table.getColumnModel().getColumn(0).setPreferredWidth(60);
            Table.getColumnModel().getColumn(1).setResizable(false);
            Table.getColumnModel().getColumn(2).setResizable(false);
            Table.getColumnModel().getColumn(2).setPreferredWidth(25);
        }

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(contactLable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(changeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(noOfConLable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Counter, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(addButton)
                                        .addGap(46, 46, 46)
                                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(addLable)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(deleteLabel)))
                                .addGap(33, 33, 33)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(clearLabel)
                                    .addComponent(clearButton)))
                            .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ScrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contactLable, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deleteButton)
                                    .addComponent(clearButton))
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clearLabel)
                                    .addComponent(deleteLabel)))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(addButton)
                                .addGap(18, 18, 18)
                                .addComponent(addLable, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(noOfConLable)
                            .addComponent(Counter, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ScrollPaneTable, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int index = Table.getSelectedRow();
        if (index <0) {
            JOptionPane.showMessageDialog(this, "Please Select a Row","Error Message",JOptionPane.ERROR_MESSAGE);
        }else{
            model.removeRow(index);
            numberOfContacts--;
        Counter.setText(numberOfContacts+"");
        }
                
                
             
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if (checkInfo()) {
            Client client = new Client (nameTextField.getText().trim(),phoneTextField.getText().trim(),emailTextField.getText().trim());
            
            if (!client.flag()) {
               JOptionPane.showMessageDialog(this, client.getMessege(),"Error Message",JOptionPane.ERROR_MESSAGE); 
            }else{
                addToTable(client);
            }
        }else{
            JOptionPane.showMessageDialog(this, "You have to fill the fields to ba able to Add the contact","Error Message",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void changeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_changeButtonActionPerformed
    public boolean checkInfo() {
        return !nameTextField.getText().isEmpty() &&
               !emailTextField.getText().isEmpty() &&
               !phoneTextField.getText().isEmpty() ;
    }
    public void addToTable(Client c){
        model.addRow(new Object []{c.getName(),c.getemail(),c.getPhone()});
        numberOfContacts++;
        Counter.setText(numberOfContacts+"");
        clear();
    }
        
        
    

    public void clear(){
        nameTextField.setText("");
        phoneTextField.setText("");
        emailTextField.setText("");
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TheMainFrame().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Counter;
    private javax.swing.JScrollPane ScrollPaneTable;
    private javax.swing.JTable Table;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel addLable;
    private javax.swing.JButton changeButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel clearLabel;
    private javax.swing.JLabel contactLable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel deleteLabel;
    private javax.swing.JLabel emailLable;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel noOfConLable;
    private javax.swing.JLabel phoneLable;
    private javax.swing.JTextField phoneTextField;
    // End of variables declaration//GEN-END:variables
}
