
package dao;

import bean.PaisBEAN;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.ConexaoBanco;


public class PaisDAO {
    ConexaoBanco bd = new ConexaoBanco();
    static PreparedStatement stm = null;

    
    public List<PaisBEAN> listaTodos() throws SQLException {
        List<PaisBEAN> lista = new ArrayList<>();
        String sql = "SELECT * FROM pais ORDER BY nom_pais ASC";
        Statement st = bd.conecta().createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            PaisBEAN cr = new PaisBEAN(rs.getInt("cod_pais"),rs.getString("sgl_pais") ,rs.getString("nom_pais"));
            //System.out.println(rs.getString("nom_pais"));
            lista.add(cr);
        }
        rs.close();
        st.close();
        return lista;
    }
}
