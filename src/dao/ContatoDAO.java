package dao;

import bean.CidadeBEAN;
import bean.ContatoBEAN;
import bean.GrupoBEAN;
import bean.PaisBEAN;
import bean.ProfissaoBEAN;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import util.ConexaoBanco;

public class ContatoDAO {

    ConexaoBanco bd;

    public ContatoDAO() {
        bd = new ConexaoBanco();
    }
    

    public void inserir(ContatoBEAN contato) throws SQLException, ParseException {
        PreparedStatement stm;
        String sql = "INSERT INTO contato (nome,nascimento,id_profissao,id_cidade) VALUES (?,?,?,?,?,?)";

        stm = bd.conecta().prepareStatement(sql);
        stm.setString(1, contato.getNome());
        stm.setDate(2, (Date) contato.getData());
        stm.setInt(3, contato.getProf().getId());
        stm.setInt(4, contato.getCidade().getCod_cidade());
        stm.executeUpdate();
        bd.close();
    }

    public List<ContatoBEAN> localizar(ContatoBEAN contato, ProfissaoBEAN profissao) throws SQLException, ParseException {
        List<ContatoBEAN> lista = null;
        PreparedStatement stm;
        String sql = "SELECT *,p1.nome as nom_profissao "
                + "FROM contato as c1 LEFT JOIN profissao as p1 "
                + "ON c1.id_profissao = p1.id "
                + "LEFT JOIN  cidade as c2 ON c1.id_cidade = c2.cod_cidade  "
                + "INNER JOIN estado as e1 ON c2.cod_estado = e1.cod_estado "
                + "WHERE c1.nome LIKE ? OR p1.nome LIKE ?";

        System.out.println(sql);
        stm = bd.conecta().prepareStatement(sql);
        stm.setString(1, "%" + contato.getNome() + "%");
        stm.setString(2, "%" + profissao.getNome() + "%");
        ResultSet rs = stm.executeQuery();
        while (rs.next()) {
            ProfissaoBEAN prof = new ProfissaoBEAN(rs.getInt("id_profissao"), rs.getString("nom_profissao"));

            CidadeBEAN cid = new CidadeBEAN(rs.getInt("cod_cidade"), rs.getInt("id_estado"), rs.getString("nom_cidade"));

            GrupoBEAN grupo = new GrupoBEAN(rs.getInt("id_grupo"), rs.getString("nom_grupo"));

            ContatoBEAN cb = new ContatoBEAN(
                    rs.getString("nome"),
                    rs.getString("path_img"),
                    rs.getInt("id"),
                    rs.getDate("nascimento"),
                    cid,
                    prof,
                    grupo);
            
            lista.add(cb);
        }
        bd.close();
        return lista;
    }
}
