/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gbackup;

import UI.MainFrame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author pradyumnadas
 */
public class GBackup {
    
    public static JFrame mainWindow = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            //Logger.getLogger(GBackup.class.getName()).log(Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                mainWindow = new MainFrame();
                mainWindow.setVisible(true);
            }
        });
    }
}
