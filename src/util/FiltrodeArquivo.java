/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author ulguim
 */
public class FiltrodeArquivo extends FileFilter {

    @Override
    public boolean accept(File f) {
        return f.getName().toLowerCase().endsWith(".jpg") || f.isDirectory();
    }

    @Override
    public String getDescription() {
       return "Arquivos de imagem(.jpg)";
    }
    
}
