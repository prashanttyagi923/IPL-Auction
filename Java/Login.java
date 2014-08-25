/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import project.com.layout.Borders;
/**
 *
 * @author prashant
 */
public class Login extends JDialog implements ActionListener{
    private JTextField jtf=new JTextField(25);
    private JLabel jl1=new JLabel("Login ID");
    private JLabel jl2=new JLabel("Password");
    private JPasswordField jp=new JPasswordField(25);
     private JButton button=new JButton("Login");
    private JPanel loginPanel=new JPanel();
    /* public static void main(String[] args) {
         Login log=new Login();
         log.setPanel();
     } */
    
    public Login(Frame owner){
        super( owner, true );
        setContentPane(setPanel());
        System.out.println("we are here");
    } 
    private Container setPanel(){
    
    Dimension minDim=new Dimension(400,200);
     Dimension dim=new Dimension(30,30);
     Borders b=new Borders();
     loginPanel.setBorder(b.setField());
     jtf.setBorder(b.setField());
     jp.setBorder(b.setField());
     GroupLayout layout=new GroupLayout(loginPanel);
     loginPanel.setLayout(layout);
     layout.setAutoCreateGaps( true );
     layout.setAutoCreateContainerGaps(true);
     GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
     GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
  hGroup.addGroup(layout.createParallelGroup().addComponent(jl1).addComponent(jl2));
  hGroup.addGroup(layout.createParallelGroup().addComponent(jtf).addComponent(jp).addComponent(button));
 
  layout.setHorizontalGroup(hGroup);

 vGroup.addGroup(layout.createParallelGroup().addComponent(jl1).addComponent(jtf));
 vGroup.addGroup(layout.createParallelGroup().addComponent(jl2).addComponent(jp));
 vGroup.addGroup(layout.createParallelGroup().addComponent(button));
 layout.setVerticalGroup(vGroup);
loginPanel.setVisible(true);
loginPanel.setFocusable(true);
loginPanel.setMinimumSize(minDim);
button.addActionListener(this);
System.out.println(loginPanel.getUI());
return loginPanel;

//loginPanel.setResizable(false);
//loginPanel.setTitle("My Login");
    }
        public void actionPerformed(ActionEvent e) {
        String s=e.getActionCommand();
        if(s.equalsIgnoreCase("login"))   {
            MakeLogin log=new MakeLogin();
            log.setID(this.jtf.getText());
            log.setPass(this.jp.getText().toString());  // it should be getPassword
            String auth=log.authenticate();  
            
        } 
         System.out.println("loginaction "+s +" "+this.jtf.getText()+ " "+this.jp.getText().toString() );
    }
    
}
