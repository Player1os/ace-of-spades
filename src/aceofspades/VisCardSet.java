/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aceofspades;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Wryxo
 */
public class VisCardSet {
    public Rectangle position;
    String setClass;
    
    /**
     * 
     * @param _x
     * @param _y
     * @param s 
     */
    public VisCardSet(int _x, int _y, String s) {
        position = new Rectangle(_x, _y, 50, 80);
        setClass = s;
    }
    
    /**
     * 
     * @param g 
     */
    public void draw(Graphics g){
        g.setColor(Color.BLACK);
        g.drawRect(position.x-1,position.y-1,51,81);
        try {
                BufferedImage back = ImageIO.read(new File("res/"+setClass+".jpg"));
                g.drawImage(back, position.x, position.y, null);
            } catch (IOException ex) {
                
            }
    }
    
    /**
     * 
     * @param _x
     * @param _y 
     */
    public void setPosition(int _x, int _y) {
        position.x = _x;
        position.y = _y;
    }
    
    /**
     * 
     * @return 
     */
    public int getXPos() {
        return position.x;
    }
    
    /**
     * 
     * @return 
     */
    public int getYPos() {
        return position.y;
    }
}
