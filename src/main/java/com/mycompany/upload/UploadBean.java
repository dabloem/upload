/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.upload;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author x076507
 */
@ManagedBean
@RequestScoped
public class UploadBean {

    private File file;
    /**
     * Creates a new instance of UploadBean
     */
    public UploadBean() {
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
    
    public void submit() {
        Logger.getLogger(UploadBean.class.getName()).log(Level.INFO, "message {0}", file.length());
    }
}
