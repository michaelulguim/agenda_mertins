
package dao;

import bean.ProfissaoBEAN;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.ConexaoBanco;


public class ProfissaoDAO {
    ConexaoBanco bd = new ConexaoBanco();
    static PreparedStatement stm = null;

    public List<ProfissaoBEAN> listaTodos() throws SQLException {
        List<ProfissaoBEAN> lista = new ArrayList<>();
        String sql = "SELECT * FROM profissao";
        Statement st = bd.conecta().createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            ProfissaoBEAN cr = new ProfissaoBEAN(rs.getInt("id"), rs.getString("nome"));
            lista.add(cr);
        }
        rs.close();
        st.close();
        return lista;
    }     

}
