/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aceofspades;

import java.util.ArrayList;


/**
 *
 * @author Player1os
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*ArrayList<Integer> gg = new ArrayList<Integer>();
        
        gg.add(5);       
                
        System.out.println(gg.toString());
        
        LoadScript tmp = new LoadScript("nc.lua");        
        tmp.runScriptFunction("asdf", gg);        
        tmp.closeScript();
        
        System.out.println(gg.toString());*/
        
        
        Card tmp1 = new Card("as");
        Card tmp2 = new Card("ac");
        Card tmp3 = new Card("ad");
        Card tmp4 = new Card("ah");
        Card tmp5 = new Card("nc");
        
        System.out.println(tmp1.getZnak() + " of " + tmp1.getFarba());
        System.out.println(tmp2.getZnak() + " of " + tmp2.getFarba());
        System.out.println(tmp3.getZnak() + " of " + tmp3.getFarba());
        System.out.println(tmp4.getZnak() + " of " + tmp4.getFarba());
        System.out.println(tmp5.getZnak() + " of " + tmp5.getFarba());
        
            
        
        
          aceofspades.frames.Frame frame = new aceofspades.frames.Frame();

    }
}
