/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

import UI.AddProfileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JFileChooser;

/**
 *
 * @author pradyumnadas
 */
public class OptionsPanelListener implements ActionListener {
    
    @Override
    public void actionPerformed(ActionEvent event){
        String actionCommand = event.getActionCommand();
        Properties prop = new Properties();
        try {
            prop.load(new FileReader("/home/pradyumnadas/GBackup/GBackup/src/resources/CommandStrings.properties"));
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(OptionsPanelListener.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e){
        }
        String some = prop.getProperty("addnewprofile");
        if(actionCommand.equals(some)){
            AddProfileDialog addProfileDg = new AddProfileDialog(gbackup.GBackup.mainWindow, true);
            addProfileDg.setVisible(true);
        }
    }
    
    public void createNewProfile(){
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        jfc.showDialog(jfc, "Select");
    }
}
