/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janela;

import javax.swing.JFrame;


public class Janela {

    
    public static void main(String[] args) {
        Janela1 app = new Janela1();       
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(300,200);
        app.setVisible(true);
    }
    
}
