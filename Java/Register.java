/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import project.com.layout.*;
/**
 *
 * @author prashant
 */
public class Register extends JDialog implements ActionListener{
  private JLabel label1=new JLabel("UserName");
  private JLabel label2=new JLabel("Password");
  private JLabel label3=new JLabel("Email ID");
  private JLabel label4=new JLabel("Name");
  private JLabel label5=new JLabel();
  private JTextField text1=new JTextField(20);
  private JTextField text2=new JTextField(20);
  private JTextField text3=new JTextField(20);
  private JTextField text4=new JTextField(20);
  private JPanel registerPanel=new JPanel();
  public Register(Frame owner){
      super( owner, true );
        setContentPane(setPanel());
        System.out.println("we are here");
  }
  public Container setPanel(){
      Dimension minDim=new Dimension(400,200);
      Dimension dim=new Dimension(30,30);
      // registerPanel.setVisible(true);
      
      
       GroupLayout layout = new GroupLayout(registerPanel);
      try {
     Grouper grup=new Grouper(registerPanel); 
     grup.setComp(label1, 1, 1);
     grup.setComp(text1, 1, 2);
     registerPanel=grup.setLayout();
      } catch(Exception ex){
          System.out.println("exception is " +ex);
      }
      registerPanel.setVisible(true);
      registerPanel.setMinimumSize(minDim);
      return registerPanel;
  }
  @Override
  public void actionPerformed(ActionEvent e){
      
  }
}
