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
public class Profile {
    
    boolean autoSync;
    boolean deleteOrigFiles;
    File filterFile;
    String name;
    SyncFile file[];

    public boolean isAutoSync() {
        return autoSync;
    }

    public void setAutoSync(boolean autoSync) {
        this.autoSync = autoSync;
    }

    public boolean isDeleteOrigFiles() {
        return deleteOrigFiles;
    }

    public void setDeleteOrigFiles(boolean deleteOrigFiles) {
        this.deleteOrigFiles = deleteOrigFiles;
    }

    public File getFilterFile() {
        return filterFile;
    }

    public void setFilterFile(File filterFile) {
        this.filterFile = filterFile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SyncFile getSyncFile(int index){
        return file[index];
    }
    
    public void setSyncFile(int index, SyncFile f){
        file[index] = f;
    }
}
