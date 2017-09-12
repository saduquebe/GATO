/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;
/**
 *
 * @author Estudiante
 */
public class Board extends JPanel implements ActionListener{
    
    private int x,y,numimagen=1;
    
    private int delay=25;
    private Timer timer;
        private int secuencia;
        public Board() {
        this.secuencia = 0;
        initBoard();
    }
    private void initBoard() {
        setBackground(Color.WHITE);
       
        timer = new Timer(delay, this);
        timer.start();
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
                Image fondo=loadImage("fondo.png");
        g.drawImage(fondo, 0, 0, this);
        g.setColor(Color.BLACK);
        Image gato= loadImage("cats.gif");
        g.drawImage(gato,x+20,350,((x+20)+132),(350+80),numimagen*132,0,(numimagen*132+132),80,null);
        Image banano = loadImage("52.png");
        g.drawImage(banano, 150, 350, this);


        
    }

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       x++;
       numimagen++;
       if(numimagen>=6){
           numimagen=1;
       }
       repaint();
    }
        public Image loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }
    }