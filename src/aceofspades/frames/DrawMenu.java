/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aceofspades.frames;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author Wryxo
 */
public class DrawMenu implements DrawStrategy{
    Frame _frame;
    
    public Rectangle startButton;
    public Rectangle optionsButton;
    public Rectangle editorButton;
    public Rectangle quitButton;
    public boolean hoverOptionsButton;
    public boolean hoverStartButton;
    public boolean hoverEditorButton;
    public boolean hoverQuitButton;
    
    /**
     * 
     * @param f 
     */
    public DrawMenu (Frame f) {
        _frame = f;
        f.setBackground(Color.DARK_GRAY);
    }
    
    /**
     * 
     * @param g
     * @param width
     * @param height 
     */
    @Override
    public void draw(Graphics g, int width, int height) {
        
        /*
         * Main Menu Title
         */
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 26));
        g.drawString("Main Menu",width/2-73, 50);
        
        /*
         * Single Player Button
         */
        g.setFont(new Font("Arial", Font.PLAIN, 12));
        startButton = new Rectangle(width/2-50, 100, 100, 25);
        if (!hoverStartButton) {
            g.setColor(Color.GREEN);
        } else {
            g.setColor(Color.ORANGE);
        }
        g.fillRect(startButton.x, startButton.y, startButton.width, startButton.height);
        g.setColor(Color.BLACK);
        g.drawString("Single Player", startButton.x+20, startButton.y+17);
        
        /*
         * Options Button
         */
        optionsButton = new Rectangle(width/2-50, 150, 100, 25);
        if (!hoverOptionsButton) {
            g.setColor(Color.GREEN);
        } else {
            g.setColor(Color.ORANGE);
        }
        g.fillRect(optionsButton.x, optionsButton.y, optionsButton.width, optionsButton.height);
        g.setColor(Color.BLACK);
        g.drawString("Options", optionsButton.x+30, optionsButton.y+17);
                
        /*
         * Editor Button
         */
        editorButton = new Rectangle(width/2-50, 200, 100, 25);
        if (!hoverEditorButton) {
            g.setColor(Color.GREEN);
        } else {
            g.setColor(Color.ORANGE);
        }
        g.fillRect(editorButton.x, editorButton.y, editorButton.width, editorButton.height);
        g.setColor(Color.BLACK);
        g.drawString("Game Editor", editorButton.x+18, editorButton.y+17);
        
         /*
         * Quit Button
         */
        quitButton = new Rectangle(width/2-50, 250, 100, 25);
        if (!hoverQuitButton) {
            g.setColor(Color.GREEN);
        } else {
            g.setColor(Color.ORANGE);
        }
        g.fillRect(quitButton.x, quitButton.y, quitButton.width, quitButton.height);
        g.setColor(Color.BLACK);
        g.drawString("Quit Game", quitButton.x+18, quitButton.y+17);
        
        _frame.repaint();
    }
}
