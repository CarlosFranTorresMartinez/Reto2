package view;

/**
 *
 * @author ctmar
 */
public class CalculadoraCienV extends javax.swing.JFrame {

    public CalculadoraCienV() {
        initComponents();
    }

    public void getText(String number) {
        txtPantalla.setText(txtPantalla.getText() + number);
    }

    public boolean existPoint(String number) {
        boolean result;
        result = false;

        for (int i = 0; i < number.length(); i++) {
            if (number.substring(i, i + 1).equals(".")) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            if (numero % x == 0) {
                return false;
            }
        }

        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btnResultado = new javax.swing.JButton();
        btnDecimal = new javax.swing.JButton();
        btnAC = new javax.swing.JButton();
        txtPantalla = new javax.swing.JTextField();
        txtPantalla2 = new javax.swing.JTextField();
        btnPrimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(46, 57, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn9.setBackground(new java.awt.Color(46, 57, 81));
        btn9.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        btn9.setForeground(new java.awt.Color(102, 255, 204));
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_dark.png"))); // NOI18N
        btn9.setText("9");
        btn9.setAlignmentY(0.0F);
        btn9.setBorder(null);
        btn9.setBorderPainted(false);
        btn9.setContentAreaFilled(false);
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed_dark.png"))); // NOI18N
        btn9.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_dark.png"))); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 57, -1));

        btn0.setBackground(new java.awt.Color(46, 57, 81));
        btn0.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        btn0.setForeground(new java.awt.Color(102, 255, 204));
        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_dark.png"))); // NOI18N
        btn0.setText("0");
        btn0.setAlignmentY(0.0F);
        btn0.setBorder(null);
        btn0.setBorderPainted(false);
        btn0.setContentAreaFilled(false);
        btn0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed_dark.png"))); // NOI18N
        btn0.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_dark.png"))); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 57, -1));

        btn7.setBackground(new java.awt.Color(46, 57, 81));
        btn7.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        btn7.setForeground(new java.awt.Color(102, 255, 204));
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_dark.png"))); // NOI18N
        btn7.setText("7");
        btn7.setAlignmentY(0.0F);
        btn7.setBorder(null);
        btn7.setBorderPainted(false);
        btn7.setContentAreaFilled(false);
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed_dark.png"))); // NOI18N
        btn7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_dark.png"))); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 57, -1));

        btn5.setBackground(new java.awt.Color(46, 57, 81));
        btn5.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        btn5.setForeground(new java.awt.Color(102, 255, 204));
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_dark.png"))); // NOI18N
        btn5.setText("5");
        btn5.setAlignmentY(0.0F);
        btn5.setBorder(null);
        btn5.setBorderPainted(false);
        btn5.setContentAreaFilled(false);
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed_dark.png"))); // NOI18N
        btn5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_dark.png"))); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 57, -1));

        btn6.setBackground(new java.awt.Color(36, 44, 68));
        btn6.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        btn6.setForeground(new java.awt.Color(102, 255, 204));
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_dark.png"))); // NOI18N
        btn6.setText("6");
        btn6.setAlignmentY(0.0F);
        btn6.setBorder(null);
        btn6.setBorderPainted(false);
        btn6.setContentAreaFilled(false);
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.setMargin(null);
        btn6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed_dark.png"))); // NOI18N
        btn6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_dark.png"))); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 57, -1));

        btn4.setBackground(new java.awt.Color(46, 57, 81));
        btn4.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        btn4.setForeground(new java.awt.Color(102, 255, 204));
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_dark.png"))); // NOI18N
        btn4.setText("4");
        btn4.setAlignmentY(0.0F);
        btn4.setBorder(null);
        btn4.setBorderPainted(false);
        btn4.setContentAreaFilled(false);
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed_dark.png"))); // NOI18N
        btn4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_dark.png"))); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 57, -1));

        btn8.setBackground(new java.awt.Color(46, 57, 81));
        btn8.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        btn8.setForeground(new java.awt.Color(102, 255, 204));
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_dark.png"))); // NOI18N
        btn8.setText("8");
        btn8.setAlignmentY(0.0F);
        btn8.setBorder(null);
        btn8.setBorderPainted(false);
        btn8.setContentAreaFilled(false);
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed_dark.png"))); // NOI18N
        btn8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_dark.png"))); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 57, -1));

        btn3.setBackground(new java.awt.Color(46, 57, 81));
        btn3.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        btn3.setForeground(new java.awt.Color(102, 255, 204));
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_dark.png"))); // NOI18N
        btn3.setText("3");
        btn3.setAlignmentY(0.0F);
        btn3.setBorder(null);
        btn3.setBorderPainted(false);
        btn3.setContentAreaFilled(false);
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed_dark.png"))); // NOI18N
        btn3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_dark.png"))); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 57, -1));

        btn1.setBackground(new java.awt.Color(46, 57, 81));
        btn1.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(102, 255, 204));
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_dark.png"))); // NOI18N
        btn1.setText("1");
        btn1.setAlignmentY(0.0F);
        btn1.setBorder(null);
        btn1.setBorderPainted(false);
        btn1.setContentAreaFilled(false);
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed_dark.png"))); // NOI18N
        btn1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_dark.png"))); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 57, -1));

        btn2.setBackground(new java.awt.Color(46, 57, 81));
        btn2.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        btn2.setForeground(new java.awt.Color(102, 255, 204));
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_dark.png"))); // NOI18N
        btn2.setText("2");
        btn2.setAlignmentY(0.0F);
        btn2.setBorder(null);
        btn2.setBorderPainted(false);
        btn2.setContentAreaFilled(false);
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed_dark.png"))); // NOI18N
        btn2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_dark.png"))); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 57, -1));

        btnResultado.setBackground(new java.awt.Color(46, 57, 81));
        btnResultado.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        btnResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3_dark.png"))); // NOI18N
        btnResultado.setText("=");
        btnResultado.setAlignmentY(0.0F);
        btnResultado.setBorder(null);
        btnResultado.setBorderPainted(false);
        btnResultado.setContentAreaFilled(false);
        btnResultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResultado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed_dark.png"))); // NOI18N
        btnResultado.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3_pressed_dark.png"))); // NOI18N
        jPanel1.add(btnResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 57, -1));

        btnDecimal.setBackground(new java.awt.Color(46, 57, 81));
        btnDecimal.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        btnDecimal.setForeground(new java.awt.Color(102, 255, 204));
        btnDecimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_dark.png"))); // NOI18N
        btnDecimal.setText(".");
        btnDecimal.setAlignmentY(0.0F);
        btnDecimal.setBorder(null);
        btnDecimal.setBorderPainted(false);
        btnDecimal.setContentAreaFilled(false);
        btnDecimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDecimal.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3_dark.png"))); // NOI18N
        btnDecimal.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3_pressed_dark.png"))); // NOI18N
        btnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecimalActionPerformed(evt);
            }
        });
        jPanel1.add(btnDecimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 57, -1));

        btnAC.setBackground(new java.awt.Color(46, 57, 81));
        btnAC.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        btnAC.setForeground(new java.awt.Color(102, 255, 204));
        btnAC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_dark.png"))); // NOI18N
        btnAC.setText("AC");
        btnAC.setAlignmentY(0.0F);
        btnAC.setBorder(null);
        btnAC.setBorderPainted(false);
        btnAC.setContentAreaFilled(false);
        btnAC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAC.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3_dark.png"))); // NOI18N
        btnAC.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3_pressed_dark.png"))); // NOI18N
        btnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACActionPerformed(evt);
            }
        });
        jPanel1.add(btnAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 57, -1));

        txtPantalla.setEditable(false);
        txtPantalla.setBackground(new java.awt.Color(33, 43, 65));
        txtPantalla.setColumns(10);
        txtPantalla.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        txtPantalla.setForeground(new java.awt.Color(102, 255, 204));
        txtPantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPantalla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(33, 43, 65), new java.awt.Color(33, 43, 65), new java.awt.Color(33, 43, 65), new java.awt.Color(33, 43, 65)));
        jPanel1.add(txtPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 50));

        txtPantalla2.setEditable(false);
        txtPantalla2.setBackground(new java.awt.Color(33, 43, 65));
        txtPantalla2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        txtPantalla2.setForeground(new java.awt.Color(102, 255, 204));
        txtPantalla2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPantalla2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(33, 43, 65), new java.awt.Color(33, 43, 65), new java.awt.Color(33, 43, 65), new java.awt.Color(33, 43, 65)));
        jPanel1.add(txtPantalla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 340, 30));

        btnPrimo.setBackground(new java.awt.Color(33, 43, 65));
        btnPrimo.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        btnPrimo.setForeground(new java.awt.Color(102, 255, 204));
        btnPrimo.setText("Primo?");
        btnPrimo.setBorderPainted(false);
        btnPrimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimoActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        getText("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        getText("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        getText("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        getText("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        getText("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        getText("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        getText("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        getText("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        getText("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        getText("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecimalActionPerformed
        String number;
        number = txtPantalla.getText();

        if (number.length() <= 0) {
            txtPantalla.setText("0.");
        } else {
            if (!existPoint(txtPantalla.getText())) {
                txtPantalla.setText(txtPantalla.getText() + ".");
            }
        }
    }//GEN-LAST:event_btnDecimalActionPerformed

    private void btnACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACActionPerformed
        String cadena;
        String cadena2;
        cadena = txtPantalla.getText();
        cadena2 = txtPantalla2.getText();

        if (cadena.length() > 0 || cadena2.length() > 0) {
            cadena = cadena.substring(0, cadena.length() - cadena.length());
            cadena2 = cadena2.substring(0, cadena2.length() - cadena2.length());
            txtPantalla.setText(cadena);
            txtPantalla2.setText(cadena2);
        }
    }//GEN-LAST:event_btnACActionPerformed

    private void btnPrimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimoActionPerformed
        String number;
        number = txtPantalla.getText();

        if (!esPrimo(Integer.valueOf(number))) {
            txtPantalla2.setText("Es primo.");
        } else {
            txtPantalla2.setText("No es primo.");
        }
    }//GEN-LAST:event_btnPrimoActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraCienV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraCienV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraCienV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraCienV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraCienV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btn0;
    public static javax.swing.JButton btn1;
    public static javax.swing.JButton btn2;
    public static javax.swing.JButton btn3;
    public static javax.swing.JButton btn4;
    public static javax.swing.JButton btn5;
    public static javax.swing.JButton btn6;
    public static javax.swing.JButton btn7;
    public static javax.swing.JButton btn8;
    public static javax.swing.JButton btn9;
    public static javax.swing.JButton btnAC;
    public static javax.swing.JButton btnDecimal;
    private javax.swing.JButton btnPrimo;
    public static javax.swing.JButton btnResultado;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField txtPantalla;
    public static javax.swing.JTextField txtPantalla2;
    // End of variables declaration//GEN-END:variables
}
