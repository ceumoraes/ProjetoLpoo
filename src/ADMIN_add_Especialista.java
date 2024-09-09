/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Usuário
 */
public class ADMIN_add_Especialista extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public ADMIN_add_Especialista() {
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
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Paciente_tag = new javax.swing.JLabel();
        Paciente_nome_tag = new javax.swing.JLabel();
        nome_input = new javax.swing.JTextField();
        CPF_nome_tag = new javax.swing.JLabel();
        CPF_input = new javax.swing.JFormattedTextField();
        RG_nome_tag = new javax.swing.JLabel();
        RG_input = new javax.swing.JFormattedTextField();
        nascimento_nome_tag = new javax.swing.JLabel();
        nascimento_input = new javax.swing.JFormattedTextField();
        sangue_nome_tag = new javax.swing.JLabel();
        sangue_input = new javax.swing.JTextField();
        telefone_input = new javax.swing.JFormattedTextField();
        telefone_nome_tag = new javax.swing.JLabel();
        Rua_nome_tag = new javax.swing.JLabel();
        Rua_input = new javax.swing.JTextField();
        bairro_input = new javax.swing.JTextField();
        Bairro_nome_tag = new javax.swing.JLabel();
        Numero_nome_tag = new javax.swing.JLabel();
        Numero_input = new javax.swing.JTextField();
        CEP_input = new javax.swing.JFormattedTextField();
        CEP_nome_tag = new javax.swing.JLabel();
        complemento_input = new javax.swing.JTextField();
        complemento_nome_tag = new javax.swing.JLabel();
        Paciente_nome_tag1 = new javax.swing.JLabel();
        nome_input2 = new javax.swing.JTextField();
        Paciente_nome_tag2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        confirma_bttn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        SisFisio_topname = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

        jPanel3.setBackground(new java.awt.Color(226, 234, 252));
        jPanel3.setMaximumSize(new java.awt.Dimension(118, 380));

        Paciente_tag.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Paciente_tag.setText("Paciente");

        Paciente_nome_tag.setText("Nome");

        nome_input.setMaximumSize(new java.awt.Dimension(150, 22));
        nome_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_inputActionPerformed(evt);
            }
        });

        CPF_nome_tag.setText("CPF");

        try {
            CPF_input.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CPF_input.setMaximumSize(new java.awt.Dimension(150, 22));
        CPF_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPF_inputActionPerformed(evt);
            }
        });

        RG_nome_tag.setText("RG");

        try {
            RG_input.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        RG_input.setMaximumSize(new java.awt.Dimension(150, 22));
        RG_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RG_inputActionPerformed(evt);
            }
        });

        nascimento_nome_tag.setText("Data de Nascimento (dd/mm/y)");

        try {
            nascimento_input.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        nascimento_input.setMaximumSize(new java.awt.Dimension(150, 22));
        nascimento_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nascimento_inputActionPerformed(evt);
            }
        });

        sangue_nome_tag.setText("Tipo Sanguíneo");

        sangue_input.setMaximumSize(new java.awt.Dimension(150, 22));
        sangue_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sangue_inputActionPerformed(evt);
            }
        });

        try {
            telefone_input.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(+##) ## #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefone_input.setMaximumSize(new java.awt.Dimension(150, 22));
        telefone_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefone_inputActionPerformed(evt);
            }
        });

        telefone_nome_tag.setText("Telefone");

        Rua_nome_tag.setText("Rua");

        Rua_input.setMaximumSize(new java.awt.Dimension(150, 22));
        Rua_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rua_inputActionPerformed(evt);
            }
        });

        bairro_input.setMaximumSize(new java.awt.Dimension(150, 22));
        bairro_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairro_inputActionPerformed(evt);
            }
        });

        Bairro_nome_tag.setText("Bairro");

        Numero_nome_tag.setText("Número");

        Numero_input.setMaximumSize(new java.awt.Dimension(150, 22));
        Numero_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero_inputActionPerformed(evt);
            }
        });

        try {
            CEP_input.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CEP_input.setMaximumSize(new java.awt.Dimension(150, 22));
        CEP_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEP_inputActionPerformed(evt);
            }
        });

        CEP_nome_tag.setText("CEP");

        complemento_input.setMaximumSize(new java.awt.Dimension(150, 22));
        complemento_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complemento_inputActionPerformed(evt);
            }
        });

        complemento_nome_tag.setText("Complemento");

        Paciente_nome_tag1.setText("Especialidade");

        nome_input2.setMaximumSize(new java.awt.Dimension(150, 22));
        nome_input2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_input2ActionPerformed(evt);
            }
        });

        Paciente_nome_tag2.setText("CRM");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        confirma_bttn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        confirma_bttn.setText("CONFIRMA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(CPF_input, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CPF_nome_tag)
                    .addComponent(Rua_nome_tag)
                    .addComponent(Rua_input, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(RG_input, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RG_nome_tag)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Paciente_nome_tag1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(sangue_nome_tag)
                            .addComponent(sangue_input, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Paciente_nome_tag)
                            .addComponent(nome_input, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Paciente_tag)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(Numero_nome_tag)
                            .addComponent(Numero_input, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(complemento_nome_tag)
                            .addComponent(complemento_input, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirma_bttn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(nascimento_nome_tag)
                            .addComponent(nascimento_input, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bairro_nome_tag)
                            .addComponent(bairro_input, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(telefone_input, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefone_nome_tag)
                            .addComponent(CEP_input, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CEP_nome_tag)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(Paciente_nome_tag2)
                        .addComponent(nome_input2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Paciente_tag)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Paciente_nome_tag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Paciente_nome_tag1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Paciente_nome_tag2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome_input2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(nascimento_nome_tag)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nascimento_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(CPF_nome_tag)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CPF_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(RG_nome_tag)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(RG_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(sangue_nome_tag)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sangue_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(telefone_nome_tag)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telefone_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(Rua_nome_tag)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Rua_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(Numero_nome_tag)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Numero_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(complemento_nome_tag)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(complemento_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(CEP_nome_tag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CEP_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Bairro_nome_tag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bairro_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(confirma_bttn)
                .addGap(30, 30, 30))
        );

        jPanel4.setBackground(new java.awt.Color(255, 232, 228));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        SisFisio_topname.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        SisFisio_topname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SisFisio_topname.setText("SisFisio");

        back.setForeground(new java.awt.Color(102, 102, 102));
        back.setText("Voltar");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SisFisio_topname, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(289, 289, 289))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SisFisio_topname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nome_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_inputActionPerformed

    private void CPF_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPF_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPF_inputActionPerformed

    private void RG_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RG_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RG_inputActionPerformed

    private void nascimento_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nascimento_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nascimento_inputActionPerformed

    private void sangue_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sangue_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sangue_inputActionPerformed

    private void telefone_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefone_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefone_inputActionPerformed

    private void Rua_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rua_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rua_inputActionPerformed

    private void bairro_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairro_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bairro_inputActionPerformed

    private void Numero_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Numero_inputActionPerformed

    private void CEP_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEP_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CEP_inputActionPerformed

    private void complemento_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complemento_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_complemento_inputActionPerformed

    private void nome_input2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_input2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_input2ActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        ADMIN_menu admin_menu = new ADMIN_menu();
        this.dispose();
        admin_menu.setVisible(true);
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(StarterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StarterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StarterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StarterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StarterScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bairro_nome_tag;
    private javax.swing.JFormattedTextField CEP_input;
    private javax.swing.JLabel CEP_nome_tag;
    private javax.swing.JFormattedTextField CPF_input;
    private javax.swing.JLabel CPF_nome_tag;
    private javax.swing.JTextField Numero_input;
    private javax.swing.JLabel Numero_nome_tag;
    private javax.swing.JLabel Paciente_nome_tag;
    private javax.swing.JLabel Paciente_nome_tag1;
    private javax.swing.JLabel Paciente_nome_tag2;
    private javax.swing.JLabel Paciente_tag;
    private javax.swing.JFormattedTextField RG_input;
    private javax.swing.JLabel RG_nome_tag;
    private javax.swing.JTextField Rua_input;
    private javax.swing.JLabel Rua_nome_tag;
    private javax.swing.JLabel SisFisio_topname;
    private javax.swing.JLabel back;
    private javax.swing.JTextField bairro_input;
    private javax.swing.JTextField complemento_input;
    private javax.swing.JLabel complemento_nome_tag;
    private javax.swing.JButton confirma_bttn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JFormattedTextField nascimento_input;
    private javax.swing.JLabel nascimento_nome_tag;
    private javax.swing.JTextField nome_input;
    private javax.swing.JTextField nome_input2;
    private javax.swing.JTextField sangue_input;
    private javax.swing.JLabel sangue_nome_tag;
    private javax.swing.JFormattedTextField telefone_input;
    private javax.swing.JLabel telefone_nome_tag;
    // End of variables declaration//GEN-END:variables
}
