package JavaApplication;

public class Calculator extends javax.swing.JFrame {

    private double num;
    private char op;
    private double answer;

    public Calculator() {
        initComponents();

        disable();

    }

    public void disable() {

        Delete.setEnabled(false);
        NegPosOpButton.setEnabled(false);
        PiNumber.setEnabled(false);
        clearAll.setEnabled(false);
        divOpButton.setEnabled(false);
        eightButton.setEnabled(false);
        equalOpButton.setEnabled(false);
        factOpButton.setEnabled(false);
        fiveButton.setEnabled(false);
        floatButton.setEnabled(false);
        fourButton.setEnabled(false);
        calculator.setEnabled(false);
        calculation.setEnabled(false);
        multiOpButton.setEnabled(false);
        nineButton.setEnabled(false);
        oneButton.setEnabled(false);
        percentOpButton.setEnabled(false);
        sevenButton.setEnabled(false);
        showOp.setEnabled(false);
        sixButton.setEnabled(false);
        sqrtOpButton.setEnabled(false);
        subOpButton.setEnabled(false);
        sumOpButton.setEnabled(false);
        thePowerOfNum.setEnabled(false);
        threeButton.setEnabled(false);
        twoButton.setEnabled(false);
        zeroButton.setEnabled(false);

    }

    public void enable() {

        Delete.setEnabled(true);
        NegPosOpButton.setEnabled(true);
        PiNumber.setEnabled(true);
        clearAll.setEnabled(true);
        divOpButton.setEnabled(true);
        eightButton.setEnabled(true);
        equalOpButton.setEnabled(true);
        factOpButton.setEnabled(true);
        fiveButton.setEnabled(true);
        floatButton.setEnabled(true);
        fourButton.setEnabled(true);
        calculator.setEnabled(true);
        calculation.setEnabled(true);
        multiOpButton.setEnabled(true);
        nineButton.setEnabled(true);
        oneButton.setEnabled(true);
        percentOpButton.setEnabled(true);
        sevenButton.setEnabled(true);
        showOp.setEnabled(true);
        sixButton.setEnabled(true);
        sqrtOpButton.setEnabled(true);
        subOpButton.setEnabled(true);
        sumOpButton.setEnabled(true);
        thePowerOfNum.setEnabled(true);
        threeButton.setEnabled(true);
        twoButton.setEnabled(true);
        zeroButton.setEnabled(true);
    }

    private double factorial(double num) {

        // if the num is big and number is negative then it can't be solved..
        if (num < 0 || num > 170) {
            return -1;
        }

        // otherwise get factorial
        return num < 2 ? 1 : factorial(num - 1) * num;

    }

    public void calculations() {
        switch (op) {
            
            case '+': {
                try {
                    answer = num + Double.parseDouble(calculation.getText());
                } catch (Exception ex) { // if the text is empty then answer equals 0
                    answer = 0;
                }
                calculation.setText(Double.toString(answer));
                break;
            }
            
            
            case '-': {
                try {
                    answer = num - Double.parseDouble(calculation.getText());
                } catch (Exception ex) { // if the text is empty then answer equals 0
                    answer = 0;
                }
                calculation.setText(Double.toString(answer));
                break;
            }
            
            
            case 'x': {
                try {
                    answer = num * Double.parseDouble(calculation.getText());
                } catch (Exception ex) { // if the text is empty then answer equals 0
                    answer = 0;
                }
                calculation.setText(Double.toString(answer));
                break;

            }
            case '÷': {
                try {
                    answer = num / Double.parseDouble(calculation.getText());
                } catch (Exception ex) { // if the text is empty then answer equals 0
                    answer = 0;
                }
                calculation.setText(Double.toString(answer));
                break;

            }
            case '^': {
                try {
                    answer = Math.pow(num, Double.parseDouble(calculation.getText()));
                } catch (Exception ex) { // if the text is empty then answer equals 0
                    answer = 0;
                }
                calculation.setText(Double.toString(answer));
                break;

            }
            case '√': {
                try {
                    num = Double.parseDouble(calculation.getText().substring(1));
                    calculation.setText("");
                } catch (Exception ex) { // if the text is empty then answer equals 0
                    answer = 0;
                }
                showOp.setText("√" + num);
                answer = Math.sqrt(num);
                calculation.setText(Double.toString(answer));
                break;
            }
            case '%': {
                try {
                    // if the user added the % at the begining of the number
                    num = Double.parseDouble(calculation.getText().substring(1));
                    calculation.setText("");
                } catch (Exception ex) { // if the user added the % at the end of the number
                    num = Double.parseDouble(calculation.getText().substring(0, calculation.getText().length() - 1));
                }
                showOp.setText(num + "%");
                answer = num / 100;
                calculation.setText(Double.toString(answer));
                break;
            }
            case '!': {
                answer = factorial(num);
                if (answer == -1) { // if the number is bigger than 170 or a negative number or the number is not integer
                    calculation.setText("Error");
                    break;
                } else {
                    calculation.setText(Double.toString(answer));
                }
                break;
            }

        }

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calculator = new javax.swing.JPanel();
        calculation = new javax.swing.JTextField();
        equalOpButton = new javax.swing.JButton();
        multiOpButton = new javax.swing.JButton();
        oneButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        subOpButton = new javax.swing.JButton();
        sumOpButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        threeButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        thePowerOfNum = new javax.swing.JButton();
        divOpButton = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        clearAll = new javax.swing.JButton();
        NegPosOpButton = new javax.swing.JButton();
        floatButton = new javax.swing.JButton();
        sqrtOpButton = new javax.swing.JButton();
        percentOpButton = new javax.swing.JButton();
        factOpButton = new javax.swing.JButton();
        PiNumber = new javax.swing.JButton();
        showOp = new javax.swing.JLabel();
        onOffButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calculator.setBackground(new java.awt.Color(241, 209, 208));
        calculator.setAlignmentX(5.0F);
        calculator.setAlignmentY(0.0F);
        calculator.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calculation.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        calculation.setForeground(new java.awt.Color(248, 117, 170));
        calculation.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        calculation.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        calculation.setFocusable(false);
        calculator.add(calculation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 320, 70));

        equalOpButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        equalOpButton.setForeground(new java.awt.Color(251, 172, 204));
        equalOpButton.setText("=");
        equalOpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        equalOpButton.setFocusable(false);
        equalOpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalOpButtonActionPerformed(evt);
            }
        });
        calculator.add(equalOpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 130, 60));

        multiOpButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        multiOpButton.setForeground(new java.awt.Color(251, 172, 204));
        multiOpButton.setText("X");
        multiOpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        multiOpButton.setFocusable(false);
        multiOpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiOpButtonActionPerformed(evt);
            }
        });
        calculator.add(multiOpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 70, 60));

        oneButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        oneButton.setForeground(new java.awt.Color(248, 117, 170));
        oneButton.setText("1");
        oneButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        oneButton.setDoubleBuffered(true);
        oneButton.setFocusable(false);
        oneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneButtonActionPerformed(evt);
            }
        });
        calculator.add(oneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 60, 60));

        zeroButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        zeroButton.setForeground(new java.awt.Color(248, 117, 170));
        zeroButton.setText("0");
        zeroButton.setFocusable(false);
        zeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroButtonActionPerformed(evt);
            }
        });
        calculator.add(zeroButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 60, 60));

        subOpButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        subOpButton.setForeground(new java.awt.Color(251, 172, 204));
        subOpButton.setText("－");
        subOpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subOpButton.setFocusable(false);
        subOpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subOpButtonActionPerformed(evt);
            }
        });
        calculator.add(subOpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 70, 60));

        sumOpButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        sumOpButton.setForeground(new java.awt.Color(251, 172, 204));
        sumOpButton.setText("+");
        sumOpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sumOpButton.setFocusable(false);
        sumOpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumOpButtonActionPerformed(evt);
            }
        });
        calculator.add(sumOpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 70, 60));

        twoButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        twoButton.setForeground(new java.awt.Color(248, 117, 170));
        twoButton.setText("2");
        twoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        twoButton.setDoubleBuffered(true);
        twoButton.setFocusPainted(false);
        twoButton.setFocusable(false);
        twoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoButtonActionPerformed(evt);
            }
        });
        calculator.add(twoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 60, 60));

        threeButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        threeButton.setForeground(new java.awt.Color(248, 117, 170));
        threeButton.setText("3");
        threeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        threeButton.setDoubleBuffered(true);
        threeButton.setFocusPainted(false);
        threeButton.setFocusable(false);
        threeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeButtonActionPerformed(evt);
            }
        });
        calculator.add(threeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 60, 60));

        nineButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        nineButton.setForeground(new java.awt.Color(248, 117, 170));
        nineButton.setText("9");
        nineButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nineButton.setDoubleBuffered(true);
        nineButton.setFocusPainted(false);
        nineButton.setFocusable(false);
        nineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineButtonActionPerformed(evt);
            }
        });
        calculator.add(nineButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 60, 60));

        fourButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        fourButton.setForeground(new java.awt.Color(248, 117, 170));
        fourButton.setText("4");
        fourButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fourButton.setDoubleBuffered(true);
        fourButton.setFocusPainted(false);
        fourButton.setFocusable(false);
        fourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourButtonActionPerformed(evt);
            }
        });
        calculator.add(fourButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 60, 60));

        fiveButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        fiveButton.setForeground(new java.awt.Color(248, 117, 170));
        fiveButton.setText("5");
        fiveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fiveButton.setDoubleBuffered(true);
        fiveButton.setFocusPainted(false);
        fiveButton.setFocusable(false);
        fiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveButtonActionPerformed(evt);
            }
        });
        calculator.add(fiveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 60, 60));

        sixButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        sixButton.setForeground(new java.awt.Color(248, 117, 170));
        sixButton.setText("6");
        sixButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sixButton.setDoubleBuffered(true);
        sixButton.setFocusPainted(false);
        sixButton.setFocusable(false);
        sixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixButtonActionPerformed(evt);
            }
        });
        calculator.add(sixButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 60, 60));

        sevenButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        sevenButton.setForeground(new java.awt.Color(248, 117, 170));
        sevenButton.setText("7");
        sevenButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sevenButton.setDoubleBuffered(true);
        sevenButton.setFocusPainted(false);
        sevenButton.setFocusable(false);
        sevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenButtonActionPerformed(evt);
            }
        });
        calculator.add(sevenButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 60, 60));

        eightButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        eightButton.setForeground(new java.awt.Color(248, 117, 170));
        eightButton.setText("8");
        eightButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eightButton.setDoubleBuffered(true);
        eightButton.setFocusPainted(false);
        eightButton.setFocusable(false);
        eightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightButtonActionPerformed(evt);
            }
        });
        calculator.add(eightButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 60, 60));

        thePowerOfNum.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        thePowerOfNum.setForeground(new java.awt.Color(251, 172, 204));
        thePowerOfNum.setText("X^");
        thePowerOfNum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        thePowerOfNum.setFocusable(false);
        thePowerOfNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thePowerOfNumActionPerformed(evt);
            }
        });
        calculator.add(thePowerOfNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 70, 60));

        divOpButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        divOpButton.setForeground(new java.awt.Color(251, 172, 204));
        divOpButton.setText("÷");
        divOpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        divOpButton.setFocusable(false);
        divOpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divOpButtonActionPerformed(evt);
            }
        });
        calculator.add(divOpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 70, 60));

        Delete.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        Delete.setForeground(new java.awt.Color(251, 172, 204));
        Delete.setText("DEL");
        Delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Delete.setFocusable(false);
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        calculator.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 70, 60));

        clearAll.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        clearAll.setForeground(new java.awt.Color(251, 172, 204));
        clearAll.setText("AC");
        clearAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearAll.setFocusable(false);
        clearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllActionPerformed(evt);
            }
        });
        calculator.add(clearAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 70, 60));

        NegPosOpButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        NegPosOpButton.setForeground(new java.awt.Color(251, 172, 204));
        NegPosOpButton.setText("-");
        NegPosOpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NegPosOpButton.setFocusable(false);
        NegPosOpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NegPosOpButtonActionPerformed(evt);
            }
        });
        calculator.add(NegPosOpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 70, 60));

        floatButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        floatButton.setForeground(new java.awt.Color(248, 117, 170));
        floatButton.setText(".");
        floatButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        floatButton.setFocusable(false);
        floatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floatButtonActionPerformed(evt);
            }
        });
        calculator.add(floatButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 60, 60));

        sqrtOpButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        sqrtOpButton.setForeground(new java.awt.Color(251, 172, 204));
        sqrtOpButton.setText("√");
        sqrtOpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sqrtOpButton.setFocusable(false);
        sqrtOpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtOpButtonActionPerformed(evt);
            }
        });
        calculator.add(sqrtOpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 60, 60));

        percentOpButton.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        percentOpButton.setForeground(new java.awt.Color(251, 172, 204));
        percentOpButton.setText("%");
        percentOpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        percentOpButton.setFocusable(false);
        percentOpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentOpButtonActionPerformed(evt);
            }
        });
        calculator.add(percentOpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 60, 60));

        factOpButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        factOpButton.setForeground(new java.awt.Color(251, 172, 204));
        factOpButton.setText("!");
        factOpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        factOpButton.setFocusable(false);
        factOpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factOpButtonActionPerformed(evt);
            }
        });
        calculator.add(factOpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 60, 60));

        PiNumber.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        PiNumber.setForeground(new java.awt.Color(248, 117, 170));
        PiNumber.setText("π");
        PiNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PiNumber.setFocusable(false);
        PiNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PiNumberActionPerformed(evt);
            }
        });
        calculator.add(PiNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 70, 60));

        showOp.setForeground(new java.awt.Color(248, 117, 170));
        calculator.add(showOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 70, 30));

        onOffButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        onOffButton.setForeground(new java.awt.Color(248, 117, 170));
        onOffButton.setText("On");
        onOffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onOffButtonActionPerformed(evt);
            }
        });
        calculator.add(onOffButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 30));

        getContentPane().add(calculator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

// ON BUTTON--------------------------------------------------------------------  
    private void onOffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onOffButtonActionPerformed

        if (onOffButton.isSelected()) { // if the user pressed on then
            enable(); // enable all buttons
        } else { // else if the user turned it off or didn't press the on button
            disable(); // disable all buttons
            calculation.setText(""); // and reset text field
        }
    }//GEN-LAST:event_onOffButtonActionPerformed
//------------------------------------------------------------------------------

// BUTTONS OF THE NUMBERS IN THE CALCULATOR AND POINT---------------------------
    private void oneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneButtonActionPerformed

        calculation.setText(calculation.getText() + "1");

    }//GEN-LAST:event_oneButtonActionPerformed

    private void twoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoButtonActionPerformed

        calculation.setText(calculation.getText() + "2");

    }//GEN-LAST:event_twoButtonActionPerformed

    private void threeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeButtonActionPerformed

        calculation.setText(calculation.getText() + "3");

    }//GEN-LAST:event_threeButtonActionPerformed

    private void fourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourButtonActionPerformed

        calculation.setText(calculation.getText() + "4");

    }//GEN-LAST:event_fourButtonActionPerformed

    private void fiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveButtonActionPerformed

        calculation.setText(calculation.getText() + "5");

    }//GEN-LAST:event_fiveButtonActionPerformed

    private void sixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixButtonActionPerformed

        calculation.setText(calculation.getText() + "6");

    }//GEN-LAST:event_sixButtonActionPerformed

    private void sevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenButtonActionPerformed

        calculation.setText(calculation.getText() + "7");
    }//GEN-LAST:event_sevenButtonActionPerformed

    private void eightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightButtonActionPerformed

        calculation.setText(calculation.getText() + "8");

    }//GEN-LAST:event_eightButtonActionPerformed

    private void nineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineButtonActionPerformed

        calculation.setText(calculation.getText() + "9");

    }//GEN-LAST:event_nineButtonActionPerformed

    private void zeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroButtonActionPerformed

        calculation.setText(calculation.getText() + "0");

    }//GEN-LAST:event_zeroButtonActionPerformed

    private void floatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floatButtonActionPerformed

        calculation.setText(calculation.getText() + ".");

    }//GEN-LAST:event_floatButtonActionPerformed
//------------------------------------------------------------------------------

// Arithmetic Operations---------------------------------------------------------
    private void multiOpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiOpButtonActionPerformed

        
        try {
            num = Double.parseDouble(calculation.getText());
        } catch (Exception ex) {
            num = 0;
        }
        op = 'x';
        showOp.setText(num + "x");
        calculation.setText("");

    }//GEN-LAST:event_multiOpButtonActionPerformed

    private void divOpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divOpButtonActionPerformed

        
        try {
            num = Double.parseDouble(calculation.getText());
        } catch (Exception ex) {
            num = 0;
        }
        op = '÷';
        showOp.setText(num + "÷");
        calculation.setText("");

    }//GEN-LAST:event_divOpButtonActionPerformed

    private void subOpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subOpButtonActionPerformed

        
        try {
            num = Double.parseDouble(calculation.getText());
        } catch (Exception ex) {
            num = 0;
        }
        op = '-';
        showOp.setText(num + "-");
        calculation.setText("");

    }//GEN-LAST:event_subOpButtonActionPerformed

    private void sumOpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumOpButtonActionPerformed

        
        try {
            num = Double.parseDouble(calculation.getText());
        } catch (Exception ex) {
            num = 0;
        }
        op = '+';
        showOp.setText(num + "+");
        calculation.setText("");


    }//GEN-LAST:event_sumOpButtonActionPerformed

    private void thePowerOfNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thePowerOfNumActionPerformed

        
        try {
            num = Double.parseDouble(calculation.getText());
        } catch (Exception ex) {
            num = 0;
        }
        op = '^';
        showOp.setText(num + "^");
        calculation.setText("");

    }//GEN-LAST:event_thePowerOfNumActionPerformed
//------------------------------------------------------------------------------

// DELETE AND DELETE ALL TEXT IN TEXT FIELD-------------------------------------   
    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed

        String str = calculation.getText();

        if (str.length() != 0) { // if it's not empty then delete one char 
            str = str.substring(0, str.length() - 1);
            calculation.setText(str);
        }

    }//GEN-LAST:event_DeleteActionPerformed

    private void clearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAllActionPerformed

        calculation.setText("");
        showOp.setText("");
        num = 0;
        answer = 0;
        op = '\u0000';

    }//GEN-LAST:event_clearAllActionPerformed
//------------------------------------------------------------------------------

// OTHER------------------------------------------------------------------------    
    private void sqrtOpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrtOpButtonActionPerformed

        
        op = '√';
        calculation.setText("√" + calculation.getText());


    }//GEN-LAST:event_sqrtOpButtonActionPerformed

    private void percentOpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentOpButtonActionPerformed

        
        op = '%';
        calculation.setText(calculation.getText() + "%");

    }//GEN-LAST:event_percentOpButtonActionPerformed

    private void factOpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factOpButtonActionPerformed

        
        // in this calculator it only solves factorial of integer numbers
        try {
            num = Integer.parseInt(calculation.getText()); // first try if number is int
                op = '!';
                showOp.setText(num + "!");
                calculation.setText("");
        } catch (Exception ex) { // if its not then its either empty or a double number
            try {
                num = Double.parseDouble(calculation.getText()); // try if the number is not a double
                op = '!';
                showOp.setText(num + "!");
                calculation.setText("");
                num = -1;
            } catch (Exception ex2) { // then the text is empty so num equals 0
                num = 0;
                op = '!';
                showOp.setText(num + "!");
                calculation.setText("");
            }
        }



    }//GEN-LAST:event_factOpButtonActionPerformed

    private void NegPosOpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NegPosOpButtonActionPerformed

        // turn number to negative
        calculation.setText("-" + calculation.getText());

    }//GEN-LAST:event_NegPosOpButtonActionPerformed

    private void PiNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PiNumberActionPerformed

        calculation.setText(calculation.getText() + Math.PI);

    }//GEN-LAST:event_PiNumberActionPerformed
//------------------------------------------------------------------------------

// EQUAL TO SHOW RESULT---------------------------------------------------------
    private void equalOpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalOpButtonActionPerformed

        calculations();

    }//GEN-LAST:event_equalOpButtonActionPerformed
//------------------------------------------------------------------------------

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton NegPosOpButton;
    private javax.swing.JButton PiNumber;
    private javax.swing.JTextField calculation;
    private javax.swing.JPanel calculator;
    private javax.swing.JButton clearAll;
    private javax.swing.JButton divOpButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton equalOpButton;
    private javax.swing.JButton factOpButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton floatButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JButton multiOpButton;
    private javax.swing.JButton nineButton;
    private javax.swing.JToggleButton onOffButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JButton percentOpButton;
    private javax.swing.JButton sevenButton;
    private javax.swing.JLabel showOp;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton sqrtOpButton;
    private javax.swing.JButton subOpButton;
    private javax.swing.JButton sumOpButton;
    private javax.swing.JButton thePowerOfNum;
    private javax.swing.JButton threeButton;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables
}
