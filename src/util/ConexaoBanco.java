
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexaoBanco {
 private Connection conexao; 

    public ConexaoBanco() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexaoBanco.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }
    }

    public Connection conecta() {
        try {
            this.conexao = DriverManager.getConnection("jdbc:postgresql://localhost/agenda_mertins", "postgres", "1");
            return conexao;
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBanco.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }

    public void close() {
        try {
            this.conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
