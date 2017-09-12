/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;
import javax.swing.JFrame;
/**
 *
 * @author Estudiante
 */
public class JavaApplication29 extends JFrame {
    
        public JavaApplication29() {
       initUI();
    }
    private void initUI() {
        add(new Board());
        setSize(1024, 512);
        setTitle("Ejercicio 0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }    
    
    
    
    
    public static void main(String[] args) {
               JavaApplication29 ex = new JavaApplication29();
                ex.setVisible(true);
    }
    
}
