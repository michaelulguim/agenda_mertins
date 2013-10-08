
package bean;


public class EstadoBEAN {
    private int cod_estado,cod_pais;
    private String sgl_estado,nom_estado;

    public EstadoBEAN(int cod_estado, int cod_pais, String sgl_estado, String nom_estado) {
        this.cod_estado = cod_estado;
        this.cod_pais = cod_pais;
        this.sgl_estado = sgl_estado;
        this.nom_estado = nom_estado;
    }

    public int getCod_estado() {
        return cod_estado;
    }

    public void setCod_estado(int cod_estado) {
        this.cod_estado = cod_estado;
    }

    public int getCod_pais() {
        return cod_pais;
    }

    public void setCod_pais(int cod_pais) {
        this.cod_pais = cod_pais;
    }

    public String getSgl_estado() {
        return sgl_estado;
    }

    public void setSql_estado(String sql_estado) {
        this.sgl_estado = sql_estado;
    }

    public String getNom_estado() {
        return nom_estado;
    }

    public void setNom_estado(String nom_estado) {
        this.nom_estado = nom_estado;
    }

    @Override
    public String toString() {
        return nom_estado;
    }
    
}
