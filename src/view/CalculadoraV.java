package view;

import controller.CalculadoraBasicaC;

public class CalculadoraV extends javax.swing.JFrame {

    public CalculadoraV() {
        initComponents();
    }

    CalculadoraBasicaC controller = new CalculadoraBasicaC();

    String data1;
    String data2;
    String signo;

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
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnRaizCuadrada = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnPorcentaje = new javax.swing.JButton();
        txtPantalla = new javax.swing.JTextField();
        txtPantalla2 = new javax.swing.JTextField();
        btnC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 57, -1));

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
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 57, -1));

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
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 57, -1));

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
        jPanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 57, -1));

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
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 57, -1));

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
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 57, -1));

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
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 57, -1));

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
        jPanel1.add(btnDecimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 57, -1));

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
        jPanel1.add(btnAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 57, -1));

        btnSuma.setBackground(new java.awt.Color(46, 57, 81));
        btnSuma.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(102, 255, 204));
        btnSuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_dark.png"))); // NOI18N
        btnSuma.setText("+");
        btnSuma.setAlignmentY(0.0F);
        btnSuma.setBorder(null);
        btnSuma.setBorderPainted(false);
        btnSuma.setContentAreaFilled(false);
        btnSuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSuma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3_dark.png"))); // NOI18N
        btnSuma.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3_pressed_dark.png"))); // NOI18N
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 57, -1));

        btnResta.setBackground(new java.awt.Color(46, 57, 81));
        btnResta.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        btnResta.setForeground(new java.awt.Color(102, 255, 204));
        btnResta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_dark.png"))); // NOI18N
        btnResta.setText("-");
        btnResta.setAlignmentY(0.0F);
        btnResta.setBorder(null);
        btnResta.setBorderPainted(false);
        btnResta.setContentAreaFilled(false);
        btnResta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnResta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3_dark.png"))); // NOI18N
        btnResta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3_pressed_dark.png"))); // NOI18N
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        jPanel1.add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 57, -1));

        btnMultiplicacion.setBackground(new java.awt.Color(46, 57, 81));
        btnMultiplicacion.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        btnMultiplicacion.setForeground(new java.awt.Color(102, 255, 204));
        btnMultiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_dark.png"))); // NOI18N
        btnMultiplicacion.setText("*");
        btnMultiplicacion.setAlignmentY(0.0F);
        btnMultiplicacion.setBorder(null);
        btnMultiplicacion.setBorderPainted(false);
        btnMultiplicacion.setContentAreaFilled(false);
        btnMultiplicacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMultiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMultiplicacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3_dark.png"))); // NOI18N
        btnMultiplicacion.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3_pressed_dark.png"))); // NOI18N
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 57, -1));

        btnRaizCuadrada.setBackground(new java.awt.Color(46, 57, 81));
        btnRaizCuadrada.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        btnRaizCuadrada.setForeground(new java.awt.Color(102, 255, 204));
        btnRaizCuadrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_dark.png"))); // NOI18N
        btnRaizCuadrada.setText("√");
        btnRaizCuadrada.setAlignmentY(0.0F);
        btnRaizCuadrada.setBorder(null);
        btnRaizCuadrada.setBorderPainted(false);
        btnRaizCuadrada.setContentAreaFilled(false);
        btnRaizCuadrada.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRaizCuadrada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRaizCuadrada.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3_dark.png"))); // NOI18N
        btnRaizCuadrada.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3_pressed_dark.png"))); // NOI18N
        btnRaizCuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizCuadradaActionPerformed(evt);
            }
        });
        jPanel1.add(btnRaizCuadrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 57, -1));

        btnDividir.setBackground(new java.awt.Color(46, 57, 81));
        btnDividir.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        btnDividir.setForeground(new java.awt.Color(102, 255, 204));
        btnDividir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_dark.png"))); // NOI18N
        btnDividir.setText("/");
        btnDividir.setAlignmentY(0.0F);
        btnDividir.setBorder(null);
        btnDividir.setBorderPainted(false);
        btnDividir.setContentAreaFilled(false);
        btnDividir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDividir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDividir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3_dark.png"))); // NOI18N
        btnDividir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3_pressed_dark.png"))); // NOI18N
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });
        jPanel1.add(btnDividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 57, -1));

        btnPorcentaje.setBackground(new java.awt.Color(46, 57, 81));
        btnPorcentaje.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        btnPorcentaje.setForeground(new java.awt.Color(102, 255, 204));
        btnPorcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_dark.png"))); // NOI18N
        btnPorcentaje.setText("%");
        btnPorcentaje.setAlignmentY(0.0F);
        btnPorcentaje.setBorder(null);
        btnPorcentaje.setBorderPainted(false);
        btnPorcentaje.setContentAreaFilled(false);
        btnPorcentaje.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPorcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPorcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3_dark.png"))); // NOI18N
        btnPorcentaje.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3_pressed_dark.png"))); // NOI18N
        btnPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentajeActionPerformed(evt);
            }
        });
        jPanel1.add(btnPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 57, -1));

        txtPantalla.setEditable(false);
        txtPantalla.setBackground(new java.awt.Color(33, 43, 65));
        txtPantalla.setColumns(10);
        txtPantalla.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        txtPantalla.setForeground(new java.awt.Color(102, 255, 204));
        txtPantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPantalla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(33, 43, 65), new java.awt.Color(33, 43, 65), new java.awt.Color(33, 43, 65), new java.awt.Color(33, 43, 65)));
        jPanel1.add(txtPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 50));

        txtPantalla2.setEditable(false);
        txtPantalla2.setBackground(new java.awt.Color(33, 43, 65));
        txtPantalla2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        txtPantalla2.setForeground(new java.awt.Color(102, 255, 204));
        txtPantalla2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPantalla2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(33, 43, 65), new java.awt.Color(33, 43, 65), new java.awt.Color(33, 43, 65), new java.awt.Color(33, 43, 65)));
        jPanel1.add(txtPantalla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 290, 30));

        btnC.setBackground(new java.awt.Color(46, 57, 81));
        btnC.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        btnC.setForeground(new java.awt.Color(102, 255, 204));
        btnC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_dark.png"))); // NOI18N
        btnC.setText("C");
        btnC.setAlignmentY(0.0F);
        btnC.setBorder(null);
        btnC.setBorderPainted(false);
        btnC.setContentAreaFilled(false);
        btnC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnC.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3_dark.png"))); // NOI18N
        btnC.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3_pressed_dark.png"))); // NOI18N
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        jPanel1.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 57, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        controller.getText("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        controller.getText("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        controller.getText("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        controller.getText("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        controller.getText("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        controller.getText("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        controller.getText("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        controller.getText("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        controller.getText("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        controller.getText("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        String resultado;
        data2 = txtPantalla.getText();

        if (!data2.equals("")) {
            resultado = controller.calc(data1, data2, signo);
            txtPantalla2.setText(resultado);
        }
    }//GEN-LAST:event_btnResultadoActionPerformed

    private void btnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecimalActionPerformed
        String number;
        number = txtPantalla.getText();

        if (number.length() <= 0) {
            txtPantalla.setText("0.");
        } else {
            if (!controller.existPoint(txtPantalla.getText())) {
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

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        if (!txtPantalla.getText().equals("")) {
            data1 = txtPantalla.getText();
            signo = "-";
            txtPantalla.setText("");
        }
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        if (!txtPantalla.getText().equals("")) {
            data1 = txtPantalla.getText();
            signo = "*";
            txtPantalla.setText("");
        }
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnRaizCuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizCuadradaActionPerformed
        String resultado;
        if (!txtPantalla.getText().equals("")) {
            data1 = txtPantalla.getText();
            signo = "√";
            txtPantalla.setText("");
        }

        data2 = txtPantalla.getText();
        resultado = controller.calc(data1, data2, signo);
        txtPantalla2.setText(resultado);

    }//GEN-LAST:event_btnRaizCuadradaActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        if (!txtPantalla.getText().equals("")) {
            data1 = txtPantalla.getText();
            signo = "/";
            txtPantalla.setText("");
        }
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentajeActionPerformed
        if (!txtPantalla.getText().equals("")) {
            data1 = txtPantalla.getText();
            signo = "%";
            txtPantalla.setText("");
        }
    }//GEN-LAST:event_btnPorcentajeActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        String cadena;
        cadena = txtPantalla.getText();

        if (cadena.length() > 0) {
            cadena = cadena.substring(0, cadena.length() - 1);
            txtPantalla.setText(cadena);
        }
    }//GEN-LAST:event_btnCActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        if (!txtPantalla.getText().equals("")) {
            data1 = txtPantalla.getText();
            signo = "+";
            txtPantalla.setText("");
        }
    }//GEN-LAST:event_btnSumaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraV.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new CalculadoraV().setVisible(true);
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
    public static javax.swing.JButton btnDecimal;
    public static javax.swing.JButton btnDividir;
    public static javax.swing.JButton btnMultiplicacion;
    public static javax.swing.JButton btnPorcentaje;
    public static javax.swing.JButton btnRaizCuadrada;
    public static javax.swing.JButton btnResta;
    public static javax.swing.JButton btnResultado;
    public static javax.swing.JButton btnSuma;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField txtPantalla;
    public static javax.swing.JTextField txtPantalla2;
    // End of variables declaration//GEN-END:variables
}
