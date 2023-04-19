/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package green;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author guerig
 */
public class Imagen extends JPanel{
    private Image imagen;
    
    public Imagen(String img){
        try{
            imagen = ImageIO.read(new File(img));
    
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.drawImage(imagen, 0, 0, this);
    }
}
