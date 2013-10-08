
package bean;

public class PaisBEAN {
    private int id;
    private String sql_pais,pais;

    public PaisBEAN(int id, String sql_pais, String pais) {
        this.id = id;
        this.sql_pais = sql_pais;
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSql_pais() {
        return sql_pais;
    }

    public void setSql_pais(String sql_pais) {
        this.sql_pais = sql_pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return pais ;
    }

}
