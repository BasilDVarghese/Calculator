import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame
{
    JLabel l1,l2,l3,l4,l5;
    JButton b1;
    Font myFont1 = new Font("Serif", Font.BOLD, 25);
    Font font= new Font("Courier", Font.PLAIN, 20);
    Font font2= new Font("Monospaced", Font.ITALIC, 20);

    MyFrame()
    {
        setTitle("Calculator");
        setSize(1000,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.lightGray);


        l1= new JLabel("This Calculator is Made By:");
        l1.setBounds(100,0,900,400);
        l1.setFont(myFont1);
        add(l1);
        l2= new JLabel("Basil D. Varghese\t\t\tA2305220161");
        l2.setBounds(100,40,900,400);
        l2.setFont(font);
        this.add(l2);
        l3= new JLabel("Hardik Gulati\t\t\t\t\t\t\tA2305220163");
        l3.setBounds(100,60,900,400);
        l3.setFont(font);
        this.add(l3);
        l4= new JLabel("Ritvik Rana\t\t\t\t\t\t\t\t\tA2305220164");
        l4.setBounds(100,80,900,400);
        l4.setFont(font);
        this.add(l4);
        l5= new JLabel("Anisha Sharma\t\t\t\t\t\t\tA2305220165");
        l5.setBounds(100,100,900,400);
        l5.setFont(font);
        this.add(l5);

        b1= new JButton("Press Button to Proceed");
        b1.setBounds(300,320,400,100);
        b1.setFont(font2);
        this.add(b1);

        b1.addActionListener(new Calc());

        setVisible(true);
    }
}

class Calc extends JFrame implements ActionListener {

    JLabel l1;
    JLabel l2;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    JTextArea t1;
    JTextArea t2;
    JTextArea t3;

    Font myFont1 = new Font("Serif", Font.BOLD, 25);
    Font font= new Font("Courier", Font.PLAIN, 15);
    Font font2= new Font("Monospaced", Font.ITALIC, 15);


    Calc(){
        l1= new JLabel("First Number");
        l1.setFont(font);
        l2= new JLabel("Second Number");
        l2.setFont(font);
        b1= new JButton("+");
        b2= new JButton("-");
        b3= new JButton("x");
        b4= new JButton("/");
        b5= new JButton("Sin");
        b6= new JButton("Cos");
        b7= new JButton("Tan");
        b8= new JButton("Cosec");
        b9= new JButton("Sec");
        b10= new JButton("Cot");

        t1= new JTextArea();
        t2= new JTextArea();
        t3= new JTextArea();

        this.setTitle("Simple Calculator");
        this.setSize(500,500);
        this.setLayout(null);

        this.add(l1);
        l1.setBounds(70,37,200,40);
        this.add(t1);
        t1.setBounds(300,50,100,20);
        this.add(l2);
        l2.setBounds(70,100,200,50);
        this.add(t2);
        t2.setBounds(300,115,100,20);
        this.add(b1);
        b1.setBounds(30,200,100,50);
        this.add(b2);
        b2.setBounds(140,200,100,50);
        this.add(b3);
        b3.setBounds(250,200,100,50);
        this.add(b4);
        b4.setBounds(360,200,100,50);
        this.add(b5);
        b5.setBounds(35,250,70,50);
        this.add(b6);
        b6.setBounds(105,250,70,50);
        this.add(b7);
        b7.setBounds(175,250,70,50);
        this.add(b8);
        b8.setBounds(245,250,70,50);
        this.add(b9);
        b9.setBounds(315,250,70,50);
        this.add(b10);
        b10.setBounds(385,250,70,50);

        this.add(t3);
        t3.setBounds(35,330,420,100);



        b1.addActionListener(new Add());
        b2.addActionListener(new Sub());
        b3.addActionListener(new Mul());
        b4.addActionListener(new Div());
        b5.addActionListener(new Sin());
        b6.addActionListener(new Cos());
        b7.addActionListener(new Tan());
        b8.addActionListener(new Sec());
        b9.addActionListener(new Cosec());
        b10.addActionListener(new Cot());

    }

    class Add implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            float a,b,c;

            a= Float.parseFloat(t1.getText());
            b= Float.parseFloat(t2.getText());

            c=a+b;

            t3.setText("Sum ="+c);
        }
    }
    class Sub implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            float a,b,c;

            a= Float.parseFloat(t1.getText());
            b= Float.parseFloat(t2.getText());

            c=a-b;

            t3.setText("Difference ="+c);
        }
    }
    class Mul implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            float a,b,c;

            a= Float.parseFloat(t1.getText());
            b= Float.parseFloat(t2.getText());

            c=a*b;

            t3.setText("Product ="+c);
        }
    }
    class Div implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            float a,b,c;

            a= Float.parseFloat(t1.getText());
            b= Float.parseFloat(t2.getText());

            c=a/b;

            t3.setText("Division ="+c);
        }
    }

    class Sin implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            double a,b,c;

            a= Float.parseFloat(t1.getText());


            c= Math.sin(a);
            System.out.print(c);

            t3.setText("Sin ="+c);
        }
    }

    class Cos implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            double a,b,c;

            a= Float.parseFloat(t1.getText());


            c= Math.cos(a);
            System.out.print(c);

            t3.setText("Cos ="+c);
        }
    }

    class Tan implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            double a,b,c;

            a= Float.parseFloat(t1.getText());


            c= Math.tan(a);
            System.out.print(c);

            t3.setText("Tan ="+c);
        }
    }

    class Sec implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            double a,b,c;

            a= Float.parseFloat(t1.getText());


            c= 1.0/Math.sin(a);
            System.out.print(c);

            t3.setText("Sec ="+c);
        }
    }

    class Cosec implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            double a,b,c;

            a= Float.parseFloat(t1.getText());


            c= 1/Math.cos(a);
            System.out.print(c);

            t3.setText("Cosec ="+c);
        }
    }

    class Cot implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            double a,b,c;

            a= Float.parseFloat(t1.getText());


            c= 1.0/Math.tan(a);
            System.out.print(c);

            t3.setText("Cot ="+c);
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Calc c = new Calc();
        c.setVisible(true);
    }
}

public class Calculator {
    public static void main(String[] args) {
        MyFrame Frame = new MyFrame();
    }

}
