/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.awt.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*; 
import static javax.swing.BorderFactory.*;
/**
 *
 * @author prashant
 */
public class IPL implements ActionListener{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f=new JFrame();

f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

f.setLayout(new BorderLayout());
Container c =f.getContentPane();
Dimension dim= new Dimension(200,60);
JMenuBar jb=new JMenuBar();
boolean b=true;
JWindow jw= new JWindow();
jw.setVisible(true);
JMenu jm=new JMenu("Register");
JMenuItem jmi1= new JMenuItem("Login");
JMenuItem jmi2= new JMenuItem("SignUp");
jm.add(jmi1);
jm.add(jmi2);
jmi1.addActionListener(new IPL());
jmi2.addActionListener(new IPL());
jm.setMaximumSize(dim);
jb.setMaximumSize(dim);
jb.add(jm);
c.add(jb,BorderLayout.WEST);
Rectangle bounds=new Rectangle(0,0,500,500);
Dimension minDim=new Dimension(300,300);
f.setMaximizedBounds(bounds);
f.setMinimumSize(minDim);

// below line fetch imageicon of given image path

ImageIcon imageic=new ImageIcon("uptu.jpg");

// we get the image from image icon

Image image=imageic.getImage();

// now we set image icon to frame
f.setIconImage(image);


f.setTitle("Hi .. ");
f.setVisible(true);
try {
UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
  } catch(Exception ex) {
   
   }

}
    @Override
    public void actionPerformed(ActionEvent e) {
String s=e.getActionCommand();
System.out.println(s+" hi");
if(s.equalsIgnoreCase("Login")) {
loginPage();
}
if(s.equalsIgnoreCase("signup")){
    registerPage();
}

}
public void loginPage() {
    JFrame f=new JFrame();
Login log=new Login(f);
log.pack();
log.setVisible(true);
 }
public void registerPage(){
    JFrame f=new JFrame();
    System.out.println("register");
    Register reg=new Register(f);
    reg.pack();
    reg.setVisible(true);
 }
}
