/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author USER
 */
public class Hangman extends JPanel  implements ActionListener{
    public int x;
    public int y;
    public double z,p,h;
    private final Timer timer;
    public double v;
    public Hangman() {
        this.v=30;
        this.x=30;
        this.y=30;
        this.timer=new Timer (20,this);
        this.timer.start();
        this.z=30;
        this.p=30;
        this.h=30;
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.PINK);
        g.drawOval(5, 500, 30, 20);
        g.setColor(new Color(200,200,20));//color lineas
        g.drawLine(60, 10, 60, 400);//linea vertical
        g.drawLine(47, 10, 100, 10);//linea horizontal
        g.drawLine(100, 10, (int) (this.v+80), this.y+40);//linea de la que cuelga la persona
        g.setColor(new Color(10,10,10));//color del torso
        g.drawOval((int) (this.v+65),this.y+10,30,30);//cabeza
        
        g.drawLine((int) (this.v+80), this.y+40,(int) this.z+80, this.y+50);//cuello
        Polygon torso=new Polygon();
        torso.addPoint((int) (this.v+65), this.y+50);
        torso.addPoint((int) (this.v+95), this.y+50);           // torso
        torso.addPoint((int) (this.z+95), this.y+100);
        torso.addPoint((int) (this.z+65), this.y+100);
        g.fillPolygon(torso);
        g.setColor(Color.BLUE);
        Polygon poligono= new Polygon();
        poligono.addPoint((int) (this.z+65), this.y+100);
        poligono.addPoint((int) (this.z+80), this.y+100);
        poligono.addPoint((int) (this.p+77), this.y+170);       //piernas
        poligono.addPoint((int) (this.p+65), this.y+170);
        g.fillPolygon(poligono);
         Polygon poligon= new Polygon();
        poligon.addPoint((int) (this.z+80), this.y+100);
        poligon.addPoint((int) (this.z+95), this.y+100);
        poligon.addPoint((int) (this.p+93), this.y+170);          //piernas
        poligon.addPoint((int) (this.p+83), this.y+170);
        g.fillPolygon(poligon);
        g.setColor(new Color(255,200,200));
         Polygon brazoDerecho= new Polygon();
        brazoDerecho.addPoint((int) (this.v+54), this.y+50);
        brazoDerecho.addPoint((int) (this.v+65), this.y+50);
        brazoDerecho.addPoint((int) (this.h+62), this.y+100);       //brazo
        brazoDerecho.addPoint((int) (this.h+57), this.y+100);
        g.fillPolygon(brazoDerecho);
        Polygon brazo= new Polygon();
        brazo.addPoint((int) (this.v+95), this.y+50);
        brazo.addPoint((int) (this.v+106), this.y+50);       //brazo
        brazo.addPoint((int) (this.h+102), this.y+100);
        brazo.addPoint((int) (this.h+95), this.y+100);
        g.fillPolygon(brazo);
        g.fillOval((int) (this.p+65), this.y+170, 15, 15);
        g.fillOval((int) (this.p+80), this.y+170, 15, 15);
        
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.x+=1;
        this.y+=1;
        
        double radianes= (double) Math.toRadians(x);
        y=(int) (30*Math.cos(radianes));
        v= (40* Math.sin(radianes));
        z=((45* Math.sin(radianes)));
        h=(42*Math.sin(radianes));
        p=(50*Math.sin(radianes));
        
        if (y<0){            
            this.y+=1;        
        double radianes1= (double) Math.toRadians(x);
        y=(int) (-30*Math.cos(radianes1));
        v= (40* Math.sin(radianes1));
        z=((45* Math.sin(radianes1)));
        h=(42*Math.sin(radianes1));
        p=(50*Math.sin(radianes1));            
        }        
        System.out.println( Math.cos(radianes));
        
        repaint();
        
       
          
      
        
    }
    

   
    }