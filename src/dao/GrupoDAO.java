package dao;

import bean.GrupoBEAN;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.ConexaoBanco;

public class GrupoDAO {

    ConexaoBanco bd;

    public GrupoDAO() {
        this.bd = new ConexaoBanco();
    }

    public List<GrupoBEAN> listaTodos() throws SQLException {
        PreparedStatement stm;
        List<GrupoBEAN> lista = new ArrayList<>();
        String sql = "SELECT * FROM grupo";
        try (Statement st = bd.conecta().createStatement(); 
                ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                GrupoBEAN cr;
                cr = new GrupoBEAN(rs.getInt("id_grupo"), rs.getString("nom_grupo"));
                lista.add(cr);
            }
        }
        return lista;
    }
}
