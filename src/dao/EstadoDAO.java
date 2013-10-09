package dao;

import bean.EstadoBEAN;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.ConexaoBanco;

public class EstadoDAO {

    private int id_pais;
    ConexaoBanco bd = new ConexaoBanco();
    static PreparedStatement stm = null;

    public EstadoDAO(int id_pais) throws SQLException {
        this.id_pais = id_pais;
    }

    public List<EstadoBEAN> listaTodos() throws SQLException {
        List<EstadoBEAN> lista = new ArrayList<>();
        String sql = "SELECT * FROM estado WHERE cod_pais = ?";
        stm = bd.conecta().prepareStatement(sql);
        stm.setInt(1, this.id_pais);
        ResultSet rs = stm.executeQuery();
        while (rs.next()) {
            EstadoBEAN cr = new EstadoBEAN(rs.getInt("cod_estado"), rs.getInt("cod_pais"), rs.getString("sgl_estado"), rs.getString("nom_estado"));
            //System.out.println(rs.getString("nom_pais"));
            lista.add(cr);
        }
        rs.close();
        stm.close();
        return lista;
    }
    /*
     String sql = "SELECT * FROM estado WHERE cod_pais = ?";
     stm = bd.conecta().prepareStatement(sql);
     stm.setInt(1, this.id_pais);
     stm.executeQuery();
     * */
}
