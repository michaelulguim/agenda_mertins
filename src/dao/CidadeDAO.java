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
    static PreparedStatement stm = null;
    private final int idCidade;

    public CidadeDAO(int id) {
        bd = new ConexaoBanco();
        this.idCidade = id;
    }
    
    public List<CidadeBEAN> listaTodos() throws SQLException{
        List<CidadeBEAN> lista = null;
        String sql = "SELECT * FROM cidade WHERE cod_estado = ?";
      
        stm = bd.conecta().prepareStatement(sql);
        stm.setInt(1, this.idCidade);
       
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
