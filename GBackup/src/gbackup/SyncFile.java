/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gbackup;

import java.io.File;

/**
 *
 * @author pradyumnadas
 */
class SyncFile {
    
    File source;
    File destination;
    RSyncOpt syncOptions;

    public File getSource() {
        return source;
    }

    public void setSource(File source) {
        this.source = source;
    }

    public File getDestination() {
        return destination;
    }

    public void setDestination(File destination) {
        this.destination = destination;
    }
    
}
