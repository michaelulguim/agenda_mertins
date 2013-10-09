/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.CidadeBEAN;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.ConexaoBanco;


public class CidadeDAO {

    ConexaoBanco bd;
    private final int idEstado;

    public CidadeDAO(int idEstado) {
        bd = new ConexaoBanco();
        this.idEstado = idEstado;
    }
    
    public List<CidadeBEAN> listaTodos() throws SQLException{
        PreparedStatement stm;
        List<CidadeBEAN> lista = new ArrayList<>();
        String sql = "SELECT * FROM cidade WHERE cod_estado = ?";
      
        stm = bd.conecta().prepareStatement(sql);
        stm.setInt(1, this.idEstado);
       
        ResultSet rs = stm.executeQuery();
        while(rs.next()){
            CidadeBEAN cb = new CidadeBEAN(rs.getInt("cod_cidade"), rs.getInt("cod_estado"), rs.getString("nom_cidade"));
            lista.add(cb);
        }
        rs.close();
        stm.close();
        return lista;
       
    }
    
}
