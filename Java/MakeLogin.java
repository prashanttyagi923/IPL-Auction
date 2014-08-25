/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import javax.swing.*;
/**
 *
 * @author prashant
 */
public class MakeLogin {
    private String id;
    private String pass;
    public MakeLogin(){
        
    }
    public void setID(String id){
        this.id=id;
    }
    public void setPass(String pass){
        this.pass=pass;
    }
    public String getID(){
        return this.id;
    }
    public String getPass(){
        return this.pass;
    }
    public String authenticate(){
        if(this.id.equals(null)||this.pass.equals(null)||this.id.equalsIgnoreCase("")||this.pass.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Please fill the id and password");
        }
        return null;
    }
}
