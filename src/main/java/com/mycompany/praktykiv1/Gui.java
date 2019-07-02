package com.mycompany.praktykiv1;

/**
 *
 * @author Grucha
 */
public class Gui extends javax.swing.JFrame {

    private final StringConverter converter = new StringConverter();
    private final PropertyList propertyList = new PropertyList();

    public Gui() {
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

        NInput = new javax.swing.JLabel();
        NOutput = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TInput = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TOutput = new javax.swing.JTextArea();
        C1 = new javax.swing.JCheckBox();
        Combo1 = new javax.swing.JComboBox<>();
        C2 = new javax.swing.JCheckBox();
        Combo2 = new javax.swing.JComboBox<>();
        Combo4 = new javax.swing.JComboBox<>();
        Suffix = new javax.swing.JTextField();
        Prefix = new javax.swing.JTextField();
        NSuffix = new javax.swing.JLabel();
        NPrefix = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        C3 = new javax.swing.JCheckBox();
        Combo3 = new javax.swing.JComboBox<>();
        C4 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NInput.setText("Input");

        NOutput.setText("Output");

        TInput.setColumns(20);
        TInput.setRows(5);
        jScrollPane1.setViewportView(TInput);

        TOutput.setColumns(20);
        TOutput.setRows(5);
        jScrollPane2.setViewportView(TOutput);

        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        Combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Private", "Public", "Protected" }));
        Combo1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Combo1ItemStateChanged(evt);
            }
        });
        Combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo1ActionPerformed(evt);
            }
        });
        Combo1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Combo1PropertyChange(evt);
            }
        });

        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        Combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "static" }));
        Combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo2ActionPerformed(evt);
            }
        });

        Combo4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Integer", "String", "BigDecimal", "Boolean", "Double", "Float", "Character" }));
        Combo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo4ActionPerformed(evt);
            }
        });

        Suffix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuffixActionPerformed(evt);
            }
        });

        NSuffix.setText("Suffix");

        NPrefix.setText("Prefix:");

        jButton1.setText("To_STATIC_FINAL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("toCamelCase");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        Combo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Final"}));

        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NInput)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NOutput)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(C1)
                        .addGap(18, 18, 18)
                        .addComponent(Combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(C2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(NSuffix)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Suffix, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(NPrefix))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(Combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(C3)
                                .addGap(18, 18, 18)
                                .addComponent(Combo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(C4)
                                .addGap(31, 31, 31)
                                .addComponent(Combo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                .addComponent(Prefix, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NInput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NOutput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(C3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(C2)
                                            .addComponent(Combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(C1))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(2, 2, 2))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Combo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4)))
                            .addComponent(Combo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Suffix, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Prefix, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NSuffix)
                            .addComponent(NPrefix))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addComponent(C4))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
//        converter.mod(C1.isSelected());
        propertyList.addSafe(new AdditionalProperty("checkbox1", C1.isSelected(), Combo1.getSelectedItem().toString()));


    }//GEN-LAST:event_C1ActionPerformed

    private void SuffixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuffixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SuffixActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String convetrToStatic = converter.convetrToStatic(TInput.getText(), propertyList);
        TOutput.setText(convetrToStatic);
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        propertyList.addSafe(new AdditionalProperty("checkbox2", C2.isSelected(), Combo2.getSelectedItem().toString()));
    }//GEN-LAST:event_C2ActionPerformed

    private void Combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo1ActionPerformed
        propertyList.addSafe(new AdditionalProperty("checkbox1", C1.isSelected(), Combo1.getSelectedItem().toString()));
    }//GEN-LAST:event_Combo1ActionPerformed

    private void Combo1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Combo1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo1PropertyChange

    private void Combo1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Combo1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo1ItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String toCamelCase = converter.toCamelCase(converter.convetrToStatic(TInput.getText(), propertyList));
        TOutput.setText(toCamelCase);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Combo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo4ActionPerformed

    private void Combo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo2ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        propertyList.addSafe(new AdditionalProperty("checkbox3", C1.isSelected(), Combo3.getSelectedItem().toString()));
     
    }//GEN-LAST:event_C3ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        propertyList.addSafe(new AdditionalProperty("checkbox4", C1.isSelected(), Combo4.getSelectedItem().toString()));
    }//GEN-LAST:event_C4ActionPerformed

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
            java.util.logging.Logger.getLogger(Gui.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox C1;
    private javax.swing.JCheckBox C2;
    private javax.swing.JCheckBox C3;
    private javax.swing.JCheckBox C4;
    private javax.swing.JComboBox<String> Combo1;
    private javax.swing.JComboBox<String> Combo2;
    private javax.swing.JComboBox<String> Combo3;
    private javax.swing.JComboBox<String> Combo4;
    private javax.swing.JLabel NInput;
    private javax.swing.JLabel NOutput;
    private javax.swing.JLabel NPrefix;
    private javax.swing.JLabel NSuffix;
    private javax.swing.JTextField Prefix;
    private javax.swing.JTextField Suffix;
    private javax.swing.JTextArea TInput;
    private javax.swing.JTextArea TOutput;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
