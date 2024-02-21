import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
    boolean OperatorClicked=false;
    int l;
    String multi,divi,plus,sub;
    JFrame jf;
    JLabel displayLabel;
    JButton seven,eight,nine,four,five,six,one,two,three,zero,multiplication,division,subtract,addition,equalto,dot,clear;

    public Calculator(){
        jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(400,100);

        displayLabel=new JLabel();
        displayLabel.setBounds(30, 50, 540, 40);
        displayLabel.setBackground(Color.BLACK);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.WHITE);
        jf.add(displayLabel);


        seven=new JButton("7");
        seven.setBounds(30,130,80,80);
        seven.setFont(new Font("Arial",Font.PLAIN,50));
        seven.addActionListener(this);
        jf.add(seven);

        eight=new JButton("8");
        eight.setBounds(130,130,80,80);
        eight.addActionListener(this);
        eight.setFont(new Font("Arial",Font.PLAIN,50));
        jf.add(eight);

        nine=new JButton("9");
        nine.setBounds(230,130,80,80);
        nine.addActionListener(this);
        nine.setFont(new Font("Arial",Font.PLAIN,50));
        jf.add(nine);

        
        four=new JButton("4");
        four.setBounds(30,230,80,80);
        four.addActionListener(this);
        four.setFont(new Font("Arial",Font.PLAIN,50));
        jf.add(four);

        five=new JButton("5");
        five.setBounds(130,230,80,80);
        five.addActionListener(this);
        five.setFont(new Font("Arial",Font.PLAIN,50));
        jf.add (five);

        six=new JButton("6");
        six.setBounds(230,230,80,80);
        six.addActionListener(this);
        six.setFont(new Font("Arial",Font.PLAIN,50));
        jf.add(six);

        one=new JButton("1");
        one.setBounds(30,330,80,80);
        one.addActionListener(this);
        one.setFont(new Font("Arial",Font.PLAIN,50));
        jf.add(one);

        two=new JButton("2");
        two.setBounds(130,330,80,80);
        two.addActionListener(this);
        two.setFont(new Font("Arial",Font.PLAIN,50));
        jf.add (two);

        three=new JButton("3");
        three.setBounds(230,330,80,80);
        three.addActionListener(this);
        three.setFont(new Font("Arial",Font.PLAIN,50));
        jf.add(three);

        dot=new JButton(".");
        dot.setBounds(30,430,80,80);
        dot.addActionListener(this);
        dot.setFont(new Font("Arial",Font.PLAIN,50));
        jf.add(dot);

        zero=new JButton("0");
        zero.setBounds(130,430,80,80);
        zero.addActionListener(this);
        zero.setFont(new Font("Arial",Font.PLAIN,50));
        jf.add(zero);

        equalto=new JButton("=");
        equalto.setBounds(230,430,80,80);
        equalto.addActionListener(this);
        equalto.setFont(new Font("Arial",Font.PLAIN,50));
        jf.add(equalto);

        division=new JButton("/");
        division.setBounds(330,130,80,80);
        division.addActionListener(this);
        division.setFont(new Font("Arial",Font.PLAIN,50));
        jf.add(division);


        multiplication=new JButton("X");
        multiplication.setBounds(330,230,80,80);
        multiplication.addActionListener(this);
        multiplication.setFont(new Font("Arial",Font.PLAIN,50));
        jf.add(multiplication);

        subtract=new JButton("-");
        subtract.setBounds(330,330,80,80);
        subtract.addActionListener(this);
        subtract.setFont(new Font("Arial",Font.PLAIN,50));
        jf.add(subtract);

        addition=new JButton("+");
        addition.setBounds(330,430,80,80);
        addition.addActionListener(this);
        addition.setFont(new Font("Arial",Font.PLAIN,50));
        jf.add(addition);

        clear=new JButton("clear");
        clear.setBounds(430,430,80,80);
        clear.addActionListener(this);
        clear.setFont(new Font("Arial",Font.PLAIN,20));
        jf.add(clear);




        

        

        
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Calculator();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==seven){
            if(OperatorClicked){
                displayLabel.setText("7");
                OperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"7");
            }
            

        }else if(e.getSource()==eight){
            if(OperatorClicked){
                displayLabel.setText("8");
                OperatorClicked=false;
            }else{
            displayLabel.setText(displayLabel.getText()+"8");
            }
        
        }else if(e.getSource()==nine){
            if(OperatorClicked){
                displayLabel.setText("9");
                OperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"9");
            }
        
        }else if(e.getSource()==six){
            if(OperatorClicked){
                displayLabel.setText("6");
                OperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"6");
            }
        
        }else if(e.getSource()==four){
            if(OperatorClicked){
                displayLabel.setText("4");
                OperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"4");
            }
        
        }else if(e.getSource()==five){
            if(OperatorClicked){
                displayLabel.setText("5");
                OperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"5");
            }
        
        }else if(e.getSource()==one){
            if(OperatorClicked){
                displayLabel.setText("1");
                OperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"1");
            }
        
        }else if(e.getSource()==two){
            if(OperatorClicked){
                displayLabel.setText("2");
                OperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"2");
            }
        
        }else if(e.getSource()==three){
            if(OperatorClicked){
                displayLabel.setText("3");
                OperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"3");
            }

        }else if(e.getSource()==zero){
            if(OperatorClicked){
                displayLabel.setText("0");
                OperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"0");
            }
        
        }else if(e.getSource()==multiplication){
            OperatorClicked=true;
            l=3;
            multi=displayLabel.getText();
           
        
        }else if(e.getSource()==division){
            OperatorClicked=true;
            l=2;
            divi=displayLabel.getText();
            
        
        }else if(e.getSource()==addition){
            OperatorClicked=true;
            l=1;
            plus=displayLabel.getText();
            
        
        }else if(e.getSource()==subtract){
            OperatorClicked=true;
            l=0;
            sub=displayLabel.getText();
            
        
        }else if(e.getSource()==equalto){
             
             if(l==0){
                 sub();
             }else if(l==1){
                 plus();
             }else if(l==2){
                 divis();
             } 
            else if(l==3){
                multip();
            }
        



            



        
        }else if(e.getSource()==dot){
            displayLabel.setText(displayLabel.getText()+".");
        }else if(e.getSource()==clear){
            displayLabel.setText("");
        }
        
        
        
    }void plus(){
        String newValue=displayLabel.getText();
        float OldValueF=Float.parseFloat(plus);
        float newValueF=Float.parseFloat(newValue);
        float result=OldValueF+newValueF;
        displayLabel.setText(result+"")
        ;

    }
void sub(){
    String f=displayLabel.getText();
            float d=Float.parseFloat(sub);
            float s=Float.parseFloat(f);
            float result1=d-s;
            displayLabel.setText(result1+"");
}void divis(){
    String div=displayLabel.getText();
    float a=Float.parseFloat(divi);
    float s=Float.parseFloat(div);
    float result2=a/s;
    displayLabel.setText(result2+"");
}void multip(){
    String mult=displayLabel.getText();
    float a=Float.parseFloat(multi);
    float s=Float.parseFloat(mult);
    float result3=a*s;
    displayLabel.setText(result3+"");
}

}


