import java.awt.*;  
import java.awt.event.*;  
public class TextFieldExample extends Frame implements ActionListener{  
    TextField tf1,tf2,tf3;  
    Button b1,b2;  
    int a = 0;
    TextFieldExample(){  
        tf1=new TextField();  
        tf1.setBounds(50,50,150,20);  
      
        tf3=new TextField();  
        tf3.setBounds(50,150,150,20);  
        tf3.setEditable(false);   
        b1=new Button("+");  
        b1.setBounds(50,200,50,50);  
       
        b1.addActionListener(this);  
     
        add(tf1);add(tf3);add(b1);
        setSize(900,900);  
        setLayout(null);  
        setVisible(true);  
    }         
    public void actionPerformed(ActionEvent e) {  
        String s1=tf1.getText();  
        int b=Integer.parseInt(s1);  
       
        int c=0;  
        if(e.getSource()==b1){  
            c=b;  
            a = c;
            repaint();
        }
        String result=String.valueOf(c);  
        tf3.setText(result);  
    }  
  

    public void paint(Graphics g) {   

    int radius = a/2;
    g.drawOval(230 - radius, 300 - radius, radius * 2, radius * 2);
    g.fillOval(230 - radius, 300 - radius, radius * 2, radius * 2);
    int x=  500; 
    int y =500;
     g.drawRect(x, y, a, a); 
    }

    public static void main(String[] args) {  
        new TextFieldExample();  
        
    }
}  
