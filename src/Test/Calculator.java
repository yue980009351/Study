package Test;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class Calculator extends WindowAdapter implements ActionListener {
    private Frame f;
    private Label l1,l2,l3,l4;
    private Button b1,b2,b3,b4;
    private TextField t1,t2,t3;
    public Calculator(){
        f=new Frame("计算器");
        f.setSize(250,250);
        f.setLocation(300,300);
        f.setVisible(true);
        f.setLayout(null);

        l1=new Label("标准计算:");
        l1.setBounds(120,40,50,20);
        f.add(l1);

        l2=new Label("������1:");
        l2.setBounds(20,70,50,20);
        f.add(l2);
        t1=new TextField();
        t1.setBounds(70,70,50,20);
        f.add(t1);
        l3=new Label("������2:");
        l3.setBounds(20,90,50,20);
        f.add(l3);
        t2=new TextField();
        t2.setBounds(70,90,50,20);
        f.add(t2);

        l4=new Label("���:");
        l4.setBounds(30,150,50,20);
        f.add(l4);
        t3=new TextField();
        t3.setBounds(80,150,100,20);
        f.add(t3);


        b1=new Button("+");
        b1.setBounds(200,60,50,20);
        f.add(b1);
        b2=new Button("-");
        b2.setBounds(200,80,50,20);
        f.add(b2);
        b3=new Button("*");
        b3.setBounds(200,100,50,20);
        f.add(b3);
        b4=new Button("/");
        b4.setBounds(200,120,50,20);
        f.add(b4);
        f.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                // TODO Auto-generated method stub
                System.exit(0);
            }

        });
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Calculator();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        try{


            String op1=t1.getText();
            String op2=t2.getText();
            double result=0;
            if(e.getSource()==b1){
                result=Double.parseDouble(op1)+Double.parseDouble(op2);
            }else if(e.getSource()==b2){
                result=Double.parseDouble(op1)-Double.parseDouble(op2);
            }else if(e.getSource()==b3){
                result=Double.parseDouble(op1)*Double.parseDouble(op2);
            }else if(e.getSource()==b4){
                result=Double.parseDouble(op1)/Double.parseDouble(op2);
            }
            t3.setText(Double.toString(result));
        }catch(Exception ee)
        {
            JOptionPane.showMessageDialog(null, "Hello");
            t1.setText(null);
            t2.setText(null);
        }

    }

}