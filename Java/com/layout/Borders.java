/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.com.layout;
import java.awt.Color;
import javax.swing.border.BevelBorder;

/**
 *
 * @author prashant
 */
public class Borders {
    public Borders(){
        
    }
    public BevelBorder setField(){
     BevelBorder be=new BevelBorder(0, Color.lightGray, Color.gray);
     return be;   
    }
}
