package CalculatorApp;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MyCalculator implements ActionListener {
    Double num1,num2,val;
    char ch;
    JFrame frame;
    JPanel panel;

    JTextField screen,result;
    Font font1= new Font("Arial",Font.BOLD,30);
    Font font2=new Font ("Arial",Font.BOLD,25);
    JButton btnOne=new JButton("1");
    JButton btnTwo=new JButton("2");
    JButton btnThree=new JButton("3");
    JButton btnFour=new JButton("4");
    JButton btnFive=new JButton("5");
    JButton btnSix=new JButton("6");
    JButton btnSeven=new JButton("7");
    JButton btnEight=new JButton("8");
    JButton btnNine=new JButton("9");
    JButton btnZero=new JButton("0");
    JButton btnEqual=new JButton("=");
    JButton btnDot=new JButton(".");
    JButton btnClear=new JButton("AC");
    JButton btnDelete=new JButton("DE");
    JButton btnPlus=new JButton("+");
    JButton btnMinus=new JButton("-");
    JButton btnMulti=new JButton("x");
    JButton btnDiv=new JButton("/");
    JButton btn2Zero=new JButton("00");
    JButton btnRem=new JButton("%");
    public MyCalculator(){

        frame=new JFrame();
        frame.setSize(400,550);
        frame.setTitle("CALCULATOR");
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        screen= new JTextField();
        screen.setBounds(20,25,350,60);
        screen.setFont(font1);
        screen.setHorizontalAlignment(screen.RIGHT);
        screen.setEditable(false);
        frame.add(screen);

        panel =new JPanel();
        panel.setBounds(20,110,350,390);
        panel.setLayout(new GridLayout(5,4));
        frame.add(panel);

        btnOne.setBackground(Color.WHITE);
        btnOne.setForeground(Color.BLACK);
        btnOne.setFont(font2);
        btnOne.setFocusable(false);

        btnTwo.setBackground(Color.WHITE);
        btnTwo.setForeground(Color.BLACK);
        btnTwo.setFont(font2);
        btnTwo.setFocusable(false);

        btnThree.setBackground(Color.WHITE);
        btnThree.setForeground(Color.BLACK);
        btnThree.setFont(font2);
        btnThree.setFocusable(false);

        btnFour.setBackground(Color.WHITE);
        btnFour.setForeground(Color.BLACK);
        btnFour.setFont(font2);
        btnFour.setFocusable(false);

        btnFive.setBackground(Color.WHITE);
        btnFive.setForeground(Color.BLACK);
        btnFive.setFont(font2);
        btnFive.setFocusable(false);

        btnSix.setBackground(Color.WHITE);
        btnSix.setForeground(Color.BLACK);
        btnSix.setFont(font2);
        btnSix.setFocusable(false);

        btnSeven.setBackground(Color.WHITE);
        btnSeven.setForeground(Color.BLACK);
        btnSeven.setFont(font2);
        btnSeven.setFocusable(false);

        btnEight.setBackground(Color.WHITE);
        btnEight.setForeground(Color.BLACK);
        btnEight.setFont(font2);
        btnEight.setFocusable(false);

        btnNine.setBackground(Color.WHITE);
        btnNine.setForeground(Color.BLACK);
        btnNine.setFont(font2);
        btnNine.setFocusable(false);

        btnZero.setBackground(Color.WHITE);
        btnZero.setForeground(Color.BLACK);
        btnZero.setFont(font2);
        btnZero.setFocusable(false);

        btnEqual.setBackground(Color.ORANGE);
        btnEqual.setForeground(Color.BLACK);
        btnEqual.setFont(font2);
        btnEqual.setFocusable(false);

        btnDot.setBackground(Color.WHITE);
        btnDot.setForeground(Color.BLACK);
        btnDot.setFont(font2);
        btnDot.setFocusable(false);

        btnClear.setBackground(Color.RED);
        btnClear.setForeground(Color.WHITE);
        btnClear.setFont(font2);
        btnClear.setFocusable(false);

        btnDelete.setBackground(Color.RED);
        btnDelete.setForeground(Color.WHITE);
        btnDelete.setFont(font2);
        btnDelete.setFocusable(false);

        btnPlus.setBackground(Color.ORANGE);
        btnPlus.setForeground(Color.BLACK);
        btnPlus.setFont(font2);
        btnPlus.setFocusable(false);

        btnMinus.setBackground(Color.ORANGE);
        btnMinus.setForeground(Color.BLACK);
        btnMinus.setFont(font2);
        btnMinus.setFocusable(false);

        btnMulti.setBackground(Color.ORANGE);
        btnMulti.setForeground(Color.BLACK);
        btnMulti.setFont(font2);
        btnMulti.setFocusable(false);

        btnDiv.setBackground(Color.RED);
        btnDiv.setForeground(Color.WHITE);
        btnDiv.setFont(font2);
        btnDiv.setFocusable(false);

        btn2Zero.setBackground(Color.WHITE);
        btn2Zero.setForeground(Color.BLACK);
        btn2Zero.setFont(font2);
        btn2Zero.setFocusable(false);

        btnRem.setBackground(Color.RED);
        btnRem.setForeground(Color.WHITE);
        btnRem.setFont(font2);
        btnRem.setFocusable(false);


        panel.add(btnClear);
        panel.add(btnDelete);
        panel.add(btnRem);
        panel.add(btnDiv);
        panel.add(btnSeven);
        panel.add(btnEight);
        panel.add(btnNine);
        panel.add(btnMulti);
        panel.add(btnFour);
        panel.add(btnFive);
        panel.add(btnSix);
        panel.add(btnMinus);
        panel.add(btnOne);
        panel.add(btnTwo);
        panel.add(btnThree);
        panel.add(btnPlus);
        panel.add(btn2Zero);
        panel.add(btnZero);
        panel.add(btnDot);
        panel.add(btnEqual);

        btnOne.addActionListener(this);
        btnTwo.addActionListener(this);
        btnThree.addActionListener(this);
        btnFour.addActionListener(this);
        btnFive.addActionListener(this);
        btnSix.addActionListener(this);
        btnSeven.addActionListener(this);
        btnEight.addActionListener(this);
        btnNine.addActionListener(this);
        btnClear.addActionListener(this);
        btnZero.addActionListener(this);
        btn2Zero.addActionListener(this);
        btnPlus.addActionListener(this);
        btnMinus.addActionListener(this);
        btnMulti.addActionListener(this);
        btnDiv.addActionListener(this);
        btnEqual.addActionListener(this);
        btnDot.addActionListener(this);
        btnClear.addActionListener(this);
        btnDelete.addActionListener(this);
        btnRem.addActionListener(this);

        frame.setLayout(null);
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        MyCalculator Afaz=new MyCalculator();

    }
    @Override
    public void actionPerformed(ActionEvent e){
        Object source=e.getSource();
        if(source==btnClear)
        {
            screen.setText("");
        }
        if(source==btnDelete)
        {
            String scr=screen.getText();
            screen.setText("");
            for(int i=0;i<scr.length()-1;i++)
            {
                screen.setText(screen.getText()+scr.charAt(i));
            }
        }
        if(source==btnOne)
        {
            screen.setText(screen.getText()+"1");
        }
        if(source==btnTwo)
        {
            screen.setText(screen.getText()+"2");
        }
        if(source==btnThree)
        {
            screen.setText(screen.getText()+"3");
        }
        if(source==btnFour)
        {
            screen.setText(screen.getText()+"4");
        }
        if(source==btnFive)
        {
            screen.setText(screen.getText()+"5");
        }
        if(source==btnSix)
        {
            screen.setText(screen.getText()+"6");
        }
        if(source==btnSeven)
        {
            screen.setText(screen.getText()+"7");
        }
        if(source==btnEight)
        {
            screen.setText(screen.getText()+"8");
        }
        if(source==btnNine)
        {
            screen.setText(screen.getText()+"9");
        }
        if(source==btnZero)
        {
            screen.setText(screen.getText()+"0");
        }
        if(source==btn2Zero)
        {
            screen.setText(screen.getText()+"00");
        }
        if(source==btnPlus)
        {
            //screen.setText(screen.getText());
            num1= Double.parseDouble(screen.getText());
            ch='+';
            screen.setText("");

        }
        if(source==btnMinus)
        {
            num1= Double.parseDouble(screen.getText());
            ch='-';
            screen.setText("");

        }
        if(source==btnMulti)
        {
            num1= Double.parseDouble(screen.getText());
            ch='*';
            screen.setText("");

        }
        if(source==btnDiv)
        {
            num1= Double.parseDouble(screen.getText());
            ch='/';
            screen.setText("");
        }
        if(source==btnDot)
        {
            if(screen.getText().contains("."))
                return;
            else
                screen.setText(screen.getText().concat("."));
        }
        if(source==btnRem)
        {
            num1= Double.parseDouble(screen.getText());
            ch='%';
            screen.setText("");
        }
        if(source==btnEqual)
        {
            try{

                num2 = Double.parseDouble(screen.getText());
                screen.setText("");
                switch (ch) {
                    case '+':
                        val = num1 + num2;
                        break;
                    case '-':
                        val = num1 - num2;
                        break;
                    case '*':
                        val = num1 * num2;
                        break;
                    case '/':
                        val = num1 / num2;
                        break;
                    case '%':
                        val = num1 % num2;
                        break;
                }
        }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null,"Error!");
                screen.setText("");
            }
            screen.setText(String.valueOf(val));
            num1=val;

        }

    }
}