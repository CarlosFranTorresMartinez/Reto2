package view;

import controller.CalcBasicC;

public class CalcBasicV extends javax.swing.JFrame {

    public CalcBasicV() {
        initComponents();
    }

    String memoria1;
    String memoria2;
    String signo;

    CalcBasicC controller = new CalcBasicC();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnDecimal = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnPorcentaje = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        txtPantalla2 = new javax.swing.JTextField();
        txtPantalla1 = new javax.swing.JTextField();
        btnDividir1 = new javax.swing.JButton();
        btnPotenciaN = new javax.swing.JButton();
        btnPotenciaCuadrada = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnAC = new javax.swing.JButton();
        btnPrimo = new javax.swing.JButton();
        btnPerfecto = new javax.swing.JButton();
        btnPrimo2 = new javax.swing.JButton();
        btnFibonacci = new javax.swing.JButton();
        btnFactorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(35, 41, 49));
        jPanel1.setForeground(new java.awt.Color(35, 41, 49));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn1.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        btn1.setForeground(new java.awt.Color(102, 255, 102));
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark1.png"))); // NOI18N
        btn1.setText("1");
        btn1.setBorder(null);
        btn1.setBorderPainted(false);
        btn1.setContentAreaFilled(false);
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark2.png"))); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        btn2.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        btn2.setForeground(new java.awt.Color(102, 255, 102));
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark1.png"))); // NOI18N
        btn2.setText("2");
        btn2.setBorder(null);
        btn2.setBorderPainted(false);
        btn2.setContentAreaFilled(false);
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark2.png"))); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        btn3.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        btn3.setForeground(new java.awt.Color(102, 255, 102));
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark1.png"))); // NOI18N
        btn3.setText("3");
        btn3.setBorder(null);
        btn3.setBorderPainted(false);
        btn3.setContentAreaFilled(false);
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark2.png"))); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        btn4.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        btn4.setForeground(new java.awt.Color(102, 255, 102));
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark1.png"))); // NOI18N
        btn4.setText("4");
        btn4.setBorder(null);
        btn4.setBorderPainted(false);
        btn4.setContentAreaFilled(false);
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark2.png"))); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        btn5.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        btn5.setForeground(new java.awt.Color(102, 255, 102));
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark1.png"))); // NOI18N
        btn5.setText("5");
        btn5.setBorder(null);
        btn5.setBorderPainted(false);
        btn5.setContentAreaFilled(false);
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark2.png"))); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        btn6.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        btn6.setForeground(new java.awt.Color(102, 255, 102));
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark1.png"))); // NOI18N
        btn6.setText("6");
        btn6.setBorder(null);
        btn6.setBorderPainted(false);
        btn6.setContentAreaFilled(false);
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark2.png"))); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        btn7.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        btn7.setForeground(new java.awt.Color(102, 255, 102));
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark1.png"))); // NOI18N
        btn7.setText("7");
        btn7.setBorder(null);
        btn7.setBorderPainted(false);
        btn7.setContentAreaFilled(false);
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark2.png"))); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        btn8.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        btn8.setForeground(new java.awt.Color(102, 255, 102));
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark1.png"))); // NOI18N
        btn8.setText("8");
        btn8.setBorder(null);
        btn8.setBorderPainted(false);
        btn8.setContentAreaFilled(false);
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark2.png"))); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        btn9.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        btn9.setForeground(new java.awt.Color(102, 255, 102));
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark1.png"))); // NOI18N
        btn9.setText("9");
        btn9.setBorder(null);
        btn9.setBorderPainted(false);
        btn9.setContentAreaFilled(false);
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark2.png"))); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        btnDecimal.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        btnDecimal.setForeground(new java.awt.Color(102, 255, 102));
        btnDecimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark3_Signs.png"))); // NOI18N
        btnDecimal.setText(".");
        btnDecimal.setBorder(null);
        btnDecimal.setBorderPainted(false);
        btnDecimal.setContentAreaFilled(false);
        btnDecimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDecimal.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark1.png"))); // NOI18N
        btnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecimalActionPerformed(evt);
            }
        });
        jPanel1.add(btnDecimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        btnRestar.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        btnRestar.setForeground(new java.awt.Color(102, 255, 102));
        btnRestar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark3_Signs.png"))); // NOI18N
        btnRestar.setText("-");
        btnRestar.setBorder(null);
        btnRestar.setBorderPainted(false);
        btnRestar.setContentAreaFilled(false);
        btnRestar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRestar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark1.png"))); // NOI18N
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        btn0.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        btn0.setForeground(new java.awt.Color(102, 255, 102));
        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark1.png"))); // NOI18N
        btn0.setText("0");
        btn0.setBorder(null);
        btn0.setBorderPainted(false);
        btn0.setContentAreaFilled(false);
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark2.png"))); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        btnCalcular.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(102, 255, 102));
        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark3_Signs.png"))); // NOI18N
        btnCalcular.setText("=");
        btnCalcular.setBorder(null);
        btnCalcular.setBorderPainted(false);
        btnCalcular.setContentAreaFilled(false);
        btnCalcular.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCalcular.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark1.png"))); // NOI18N
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        btnPorcentaje.setFont(new java.awt.Font("Courier New", 1, 25)); // NOI18N
        btnPorcentaje.setForeground(new java.awt.Color(102, 255, 102));
        btnPorcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark3_Signs.png"))); // NOI18N
        btnPorcentaje.setText("%");
        btnPorcentaje.setBorder(null);
        btnPorcentaje.setBorderPainted(false);
        btnPorcentaje.setContentAreaFilled(false);
        btnPorcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPorcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark1.png"))); // NOI18N
        btnPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentajeActionPerformed(evt);
            }
        });
        jPanel1.add(btnPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 70, -1));

        btnMultiplicar.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        btnMultiplicar.setForeground(new java.awt.Color(102, 255, 102));
        btnMultiplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark3_Signs.png"))); // NOI18N
        btnMultiplicar.setText("*");
        btnMultiplicar.setBorder(null);
        btnMultiplicar.setBorderPainted(false);
        btnMultiplicar.setContentAreaFilled(false);
        btnMultiplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMultiplicar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark1.png"))); // NOI18N
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMultiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        btnSuma.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(102, 255, 102));
        btnSuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark3_Signs.png"))); // NOI18N
        btnSuma.setText("+");
        btnSuma.setBorder(null);
        btnSuma.setBorderPainted(false);
        btnSuma.setContentAreaFilled(false);
        btnSuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSuma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark1.png"))); // NOI18N
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));

        txtPantalla2.setEditable(false);
        txtPantalla2.setBackground(new java.awt.Color(35, 41, 49));
        txtPantalla2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        txtPantalla2.setForeground(new java.awt.Color(102, 255, 102));
        txtPantalla2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtPantalla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 580, 40));

        txtPantalla1.setEditable(false);
        txtPantalla1.setBackground(new java.awt.Color(35, 41, 49));
        txtPantalla1.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        txtPantalla1.setForeground(new java.awt.Color(102, 255, 102));
        txtPantalla1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtPantalla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 82));

        btnDividir1.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        btnDividir1.setForeground(new java.awt.Color(102, 255, 102));
        btnDividir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark3_Signs.png"))); // NOI18N
        btnDividir1.setText("/");
        btnDividir1.setBorder(null);
        btnDividir1.setBorderPainted(false);
        btnDividir1.setContentAreaFilled(false);
        btnDividir1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDividir1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark1.png"))); // NOI18N
        btnDividir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividir1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDividir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        btnPotenciaN.setFont(new java.awt.Font("Courier New", 1, 25)); // NOI18N
        btnPotenciaN.setForeground(new java.awt.Color(102, 255, 102));
        btnPotenciaN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark3_Signs.png"))); // NOI18N
        btnPotenciaN.setText("x^x");
        btnPotenciaN.setBorder(null);
        btnPotenciaN.setBorderPainted(false);
        btnPotenciaN.setContentAreaFilled(false);
        btnPotenciaN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPotenciaN.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark1.png"))); // NOI18N
        btnPotenciaN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaNActionPerformed(evt);
            }
        });
        jPanel1.add(btnPotenciaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 70, -1));

        btnPotenciaCuadrada.setFont(new java.awt.Font("Courier New", 1, 25)); // NOI18N
        btnPotenciaCuadrada.setForeground(new java.awt.Color(102, 255, 102));
        btnPotenciaCuadrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark3_Signs.png"))); // NOI18N
        btnPotenciaCuadrada.setText("x^2");
        btnPotenciaCuadrada.setBorder(null);
        btnPotenciaCuadrada.setBorderPainted(false);
        btnPotenciaCuadrada.setContentAreaFilled(false);
        btnPotenciaCuadrada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPotenciaCuadrada.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark1.png"))); // NOI18N
        btnPotenciaCuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaCuadradaActionPerformed(evt);
            }
        });
        jPanel1.add(btnPotenciaCuadrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 70, -1));

        btnC.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        btnC.setForeground(new java.awt.Color(102, 255, 102));
        btnC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark3_Signs.png"))); // NOI18N
        btnC.setText("C");
        btnC.setBorder(null);
        btnC.setBorderPainted(false);
        btnC.setContentAreaFilled(false);
        btnC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnC.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark1.png"))); // NOI18N
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        jPanel1.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        btnAC.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        btnAC.setForeground(new java.awt.Color(102, 255, 102));
        btnAC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark3_Signs.png"))); // NOI18N
        btnAC.setText("AC");
        btnAC.setBorder(null);
        btnAC.setBorderPainted(false);
        btnAC.setContentAreaFilled(false);
        btnAC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAC.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark1.png"))); // NOI18N
        btnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACActionPerformed(evt);
            }
        });
        jPanel1.add(btnAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        btnPrimo.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnPrimo.setForeground(new java.awt.Color(102, 255, 102));
        btnPrimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark3_Signs.png"))); // NOI18N
        btnPrimo.setText("Primo");
        btnPrimo.setBorder(null);
        btnPrimo.setBorderPainted(false);
        btnPrimo.setContentAreaFilled(false);
        btnPrimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrimo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark1.png"))); // NOI18N
        btnPrimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimoActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 70, -1));

        btnPerfecto.setFont(new java.awt.Font("Courier New", 1, 10)); // NOI18N
        btnPerfecto.setForeground(new java.awt.Color(102, 255, 102));
        btnPerfecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark3_Signs.png"))); // NOI18N
        btnPerfecto.setText("Perfecto");
        btnPerfecto.setBorder(null);
        btnPerfecto.setBorderPainted(false);
        btnPerfecto.setContentAreaFilled(false);
        btnPerfecto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPerfecto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark1.png"))); // NOI18N
        btnPerfecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfectoActionPerformed(evt);
            }
        });
        jPanel1.add(btnPerfecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 70, -1));

        btnPrimo2.setFont(new java.awt.Font("Courier New", 1, 10)); // NOI18N
        btnPrimo2.setForeground(new java.awt.Color(102, 255, 102));
        btnPrimo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark3_Signs.png"))); // NOI18N
        btnPrimo2.setText("Capicua");
        btnPrimo2.setBorder(null);
        btnPrimo2.setBorderPainted(false);
        btnPrimo2.setContentAreaFilled(false);
        btnPrimo2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrimo2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark1.png"))); // NOI18N
        btnPrimo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimo2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrimo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 70, -1));

        btnFibonacci.setFont(new java.awt.Font("Courier New", 1, 10)); // NOI18N
        btnFibonacci.setForeground(new java.awt.Color(102, 255, 102));
        btnFibonacci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark3_Signs.png"))); // NOI18N
        btnFibonacci.setText("Fibonacci");
        btnFibonacci.setBorder(null);
        btnFibonacci.setBorderPainted(false);
        btnFibonacci.setContentAreaFilled(false);
        btnFibonacci.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFibonacci.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark1.png"))); // NOI18N
        btnFibonacci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFibonacciActionPerformed(evt);
            }
        });
        jPanel1.add(btnFibonacci, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 70, -1));

        btnFactorial.setFont(new java.awt.Font("Courier New", 1, 10)); // NOI18N
        btnFactorial.setForeground(new java.awt.Color(102, 255, 102));
        btnFactorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark3_Signs.png"))); // NOI18N
        btnFactorial.setText("Factorial");
        btnFactorial.setBorder(null);
        btnFactorial.setBorderPainted(false);
        btnFactorial.setContentAreaFilled(false);
        btnFactorial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFactorial.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ButtonDark1.png"))); // NOI18N
        btnFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactorialActionPerformed(evt);
            }
        });
        jPanel1.add(btnFactorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        controller.getText("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        controller.getText("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        controller.getText("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        controller.getText("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        controller.getText("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        controller.getText("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        controller.getText("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        controller.getText("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        controller.getText("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        controller.getText("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecimalActionPerformed
        controller.btnDecimal();
    }//GEN-LAST:event_btnDecimalActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        if (!txtPantalla1.getText().equals("")) {
            memoria1 = txtPantalla1.getText();
            signo = "+";
            txtPantalla1.setText("");
        }
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        String resultado;
        memoria2 = txtPantalla1.getText();
        if (!memoria2.equals("")) {
            resultado = controller.calculos(memoria1, memoria2, signo);
            txtPantalla2.setText(resultado);
        }

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        if (!txtPantalla1.getText().equals("")) {
            memoria1 = txtPantalla1.getText();
            signo = "-";
            txtPantalla1.setText("");
        }
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        if (!txtPantalla1.getText().equals("")) {
            memoria1 = txtPantalla1.getText();
            signo = "*";
            txtPantalla1.setText("");
        }
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentajeActionPerformed
        if (!txtPantalla1.getText().equals("")) {
            memoria1 = txtPantalla1.getText();
            signo = "%";
            txtPantalla1.setText("");
        }
    }//GEN-LAST:event_btnPorcentajeActionPerformed

    private void btnDividir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividir1ActionPerformed
        if (!txtPantalla1.getText().equals("")) {
            memoria1 = txtPantalla1.getText();
            signo = "/";
            txtPantalla1.setText("");
        }
    }//GEN-LAST:event_btnDividir1ActionPerformed

    private void btnPotenciaNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaNActionPerformed
        if (!txtPantalla1.getText().equals("")) {
            memoria1 = txtPantalla1.getText();
            signo = "^";
            txtPantalla1.setText("");
        }
    }//GEN-LAST:event_btnPotenciaNActionPerformed

    private void btnPotenciaCuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaCuadradaActionPerformed
        if (!txtPantalla1.getText().equals("")) {
            memoria1 = txtPantalla1.getText();
            signo = "^2";
            txtPantalla1.setText("");
        }
    }//GEN-LAST:event_btnPotenciaCuadradaActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        String cadena;
        cadena = txtPantalla1.getText();

        if (cadena.length() > 0) {
            cadena = cadena.substring(0, cadena.length() - 1);
            txtPantalla1.setText(cadena);
        }
    }//GEN-LAST:event_btnCActionPerformed

    private void btnACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACActionPerformed
        String cadena;
        String cadena2;
        cadena = txtPantalla1.getText();
        cadena2 = txtPantalla2.getText();

        if (cadena.length() > 0 || cadena2.length() > 0) {
            cadena = cadena.substring(0, cadena.length() - cadena.length());
            cadena2 = cadena2.substring(0, cadena2.length() - cadena2.length());
            txtPantalla1.setText(cadena);
            txtPantalla2.setText(cadena2);
        }
    }//GEN-LAST:event_btnACActionPerformed

    private void btnPrimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimoActionPerformed
        if (controller.esPrimo(txtPantalla1.getText())) {
            txtPantalla2.setText("Primo");
            txtPantalla1.setText("");
        } else {
            txtPantalla2.setText("No es primo");
            txtPantalla1.setText("");
        }
    }//GEN-LAST:event_btnPrimoActionPerformed

    private void btnPerfectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfectoActionPerformed
        if (controller.esPerfecto(txtPantalla1.getText())) {
            txtPantalla2.setText("Es perfecto");
            txtPantalla1.setText("");
        } else {
            txtPantalla2.setText("No es perfecto");
            txtPantalla1.setText("");
        }
    }//GEN-LAST:event_btnPerfectoActionPerformed

    private void btnPrimo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimo2ActionPerformed
        if (controller.esCapicua(txtPantalla1.getText())) {
            txtPantalla2.setText("Es capicua");
            txtPantalla1.setText("");
        } else {
            txtPantalla2.setText("No es capicua");
            txtPantalla1.setText("");
        }
    }//GEN-LAST:event_btnPrimo2ActionPerformed

    private void btnFibonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFibonacciActionPerformed
        String tamaño = txtPantalla1.getText();

        for (int i = 0; i < Integer.valueOf(tamaño); i++) {
            txtPantalla2.setText(txtPantalla2.getText() + controller.fibonacci(i) + " ");
        }
    }//GEN-LAST:event_btnFibonacciActionPerformed

    private void btnFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFactorialActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new CalcBasicV().setVisible(true);
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
    public static javax.swing.JButton btnC;
    public static javax.swing.JButton btnCalcular;
    public static javax.swing.JButton btnDecimal;
    public static javax.swing.JButton btnDividir1;
    public static javax.swing.JButton btnFactorial;
    public static javax.swing.JButton btnFibonacci;
    public static javax.swing.JButton btnMultiplicar;
    public static javax.swing.JButton btnPerfecto;
    public static javax.swing.JButton btnPorcentaje;
    public static javax.swing.JButton btnPotenciaCuadrada;
    public static javax.swing.JButton btnPotenciaN;
    public static javax.swing.JButton btnPrimo;
    public static javax.swing.JButton btnPrimo2;
    public static javax.swing.JButton btnRestar;
    public static javax.swing.JButton btnSuma;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField txtPantalla1;
    public static javax.swing.JTextField txtPantalla2;
    // End of variables declaration//GEN-END:variables
}
