


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator2 implements ActionListener {
 
    double number, answer;
    int calculation;

    JFrame jf;
    JLabel jlabel = new JLabel();
    JTextField textField = new JTextField();
   
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMultiplication = new JButton("x");
    JButton buttonDivision = new JButton("/");
    JButton buttonAdd = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonReciprocal = new JButton("1/x");
    JButton buttonSqrt = new JButton("\u221A");
    ;

    Calculator2() {
        prepareGUI();
        addComponents();
        addActionEvent();
    }

    public void prepareGUI() {
        jf = new JFrame();
        jf.setTitle("Calculator2.0");
        jf.setSize(310, 500);
        jf.getContentPane().setLayout(null);
        jf.getContentPane().setBackground(Color.black);
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents() {
        jlabel.setBounds(250, 0, 50, 50);
        jlabel.setForeground(Color.GRAY);
        jf.add(jlabel);

       
        textField.setBounds(10, 40, 270, 60); 
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        jf.add(textField);
        

       

        buttonSeven.setBounds(10, 230, 60, 40);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 25));
        jf.add(buttonSeven);

        buttonEight.setBounds(80, 230, 60, 40);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 25));
        jf.add(buttonEight);

        buttonNine.setBounds(150, 230, 60, 40);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 25));
        jf.add(buttonNine);

        buttonFour.setBounds(10, 290, 60, 40);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 25));
        jf.add(buttonFour);

        buttonFive.setBounds(80, 290, 60, 40);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 25));
        jf.add(buttonFive);

        buttonSix.setBounds(150, 290, 60, 40);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 25));
        jf.add(buttonSix);

        buttonOne.setBounds(10, 350, 60, 40);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 25));
        jf.add(buttonOne);

        buttonTwo.setBounds(80, 350, 60, 40);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 25));
        jf.add(buttonTwo);

        buttonThree.setBounds(150, 350, 60, 40);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 25));
        jf.add(buttonThree);

        buttonDot.setBounds(150, 400, 60, 40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 25));
        jf.add(buttonDot);

        buttonZero.setBounds(10, 400, 130, 40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 25));
        jf.add(buttonZero);

        buttonEqual.setBounds(220, 350, 60, 90);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 25));
        buttonEqual.setBackground(new Color(239, 188, 2));
        jf.add(buttonEqual);

        buttonDivision.setBounds(220, 110, 60, 40);
        buttonDivision.setFont(new Font("Arial", Font.BOLD, 25));
        buttonDivision.setBackground(new Color(239, 188, 2));
        jf.add(buttonDivision);

        buttonSqrt.setBounds(10, 170, 60, 40);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 18));
        jf.add(buttonSqrt);

        buttonMultiplication.setBounds(220, 230, 60, 40);
        buttonMultiplication.setFont(new Font("Arial", Font.BOLD, 25));
        buttonMultiplication.setBackground(new Color(239, 188, 2));
        jf.add(buttonMultiplication);

        buttonMinus.setBounds(220, 170, 60, 40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 25));
        buttonMinus.setBackground(new Color(239, 188, 2));
        jf.add(buttonMinus);

        buttonAdd.setBounds(220, 290, 60, 40);
        buttonAdd.setFont(new Font("Arial", Font.BOLD, 25));
        buttonAdd.setBackground(new Color(239, 188, 2));
        jf.add(buttonAdd);

        buttonSquare.setBounds(80, 170, 60, 40);
        buttonSquare.setFont(new Font("Arial", Font.BOLD, 25));
        jf.add(buttonSquare);

        buttonReciprocal.setBounds(150, 170, 60, 40);
        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 18));
        jf.add(buttonReciprocal);

        buttonDelete.setBounds(150, 110, 60, 40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        buttonDelete.setBackground(Color.magenta);
        buttonDelete.setForeground(Color.white);
        jf.add(buttonDelete);

        buttonClear.setBounds(80, 110, 60, 40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
        buttonClear.setBackground(Color.MAGENTA);
        buttonClear.setForeground(Color.white);
        jf.add(buttonClear);

    }

    public void addActionEvent() {
       
       
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDivision.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMultiplication.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);


    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
       
          if (source == buttonClear) {
           
            jlabel.setText("");
            textField.setText("");
        } else if (source == buttonDelete) {
          
            int length = textField.getText().length();
            int number = length - 1;


            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());

            }
            if (textField.getText().endsWith("")) {
                jlabel.setText("");
            }
        } else if (source == buttonZero) {
            if (textField.getText().equals("0")) {
                return;
            } else {
                textField.setText(textField.getText() + "0");
            }
        } else if (source == buttonOne) {
            textField.setText(textField.getText() + "1");
        } else if (source == buttonTwo) {
            textField.setText(textField.getText() + "2");
        } else if (source == buttonThree) {
            textField.setText(textField.getText() + "3");
        } else if (source == buttonFour) {
            textField.setText(textField.getText() + "4");
        } else if (source == buttonFive) {
            textField.setText(textField.getText() + "5");
        } else if (source == buttonSix) {
            textField.setText(textField.getText() + "6");
        } else if (source == buttonSeven) {
            textField.setText(textField.getText() + "7");
        } else if (source == buttonEight) {
            textField.setText(textField.getText() + "8");
        } else if (source == buttonNine) {
            textField.setText(textField.getText() + "9");
        } else if (source == buttonDot) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }

        } else if (source == buttonAdd) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            jlabel.setText(str + "+");
            calculation = 1;
        } else if (source == buttonMinus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            jlabel.setText(str + "-");
            calculation = 2;
        } else if (source == buttonMultiplication) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            jlabel.setText(str + "X");
            calculation = 3;
        } else if (source == buttonDivision) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            jlabel.setText(str + "/");
            calculation = 4;
        } else if (source == buttonSqrt) {
            number = Double.parseDouble(textField.getText());
            Double sqrt = Math.sqrt(number);
            textField.setText(Double.toString(sqrt));

        } else if (source == buttonSquare) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            double square = Math.pow(number, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
            jlabel.setText("(sqr)" + str);
        } else if (source == buttonReciprocal) {
            number = Double.parseDouble(textField.getText());
            double reciprocal = 1 / number;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
        } else if (source == buttonEqual) {
          
            switch (calculation) {
                case 1:
                    answer = number + Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    jlabel.setText("");
                    break;
                case 2:
                    answer = number - Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    jlabel.setText("");
                    break;
                case 3:
                    answer = number * Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    jlabel.setText("");
                    break;
                case 4:
                    answer = number / Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    jlabel.setText("");
                    break;

            }
        }


    }
    

    public void enable() {
       
    	textField.setEnabled(true);
        jlabel.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDivision.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonReciprocal.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonMultiplication.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonAdd.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonDot.setEnabled(true);

    }

    public void disable() {
       
        textField.setText("");
        jlabel.setText(" ");
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonDivision.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonReciprocal.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonMultiplication.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonAdd.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonDot.setEnabled(false);
    }
}
