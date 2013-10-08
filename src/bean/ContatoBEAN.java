
package bean;

import java.util.Date;


public class ContatoBEAN {
    private String nome, pathImg;
    private int id;
    private Date data;
    private CidadeBEAN cidade;
    private ProfissaoBEAN prof;
    private GrupoBEAN grupo;

    public ContatoBEAN() {
        
    }

    public void setCidade(CidadeBEAN cidade) {
        this.cidade = cidade;
    }
    
    

    public CidadeBEAN getCidade() {
        return cidade;
    }

    public ContatoBEAN(String nome, String pathImg, int id, Date data, CidadeBEAN cidade, ProfissaoBEAN prof, GrupoBEAN grupo) {
        this.nome = nome;
        this.pathImg = pathImg;
        this.id = id;
        this.data = data;
        this.cidade = cidade;
        this.prof = prof;
        this.grupo = grupo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPathImg() {
        return pathImg;
    }

    public void setPathImg(String pathImg) {
        this.pathImg = pathImg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ProfissaoBEAN getProf() {
        return prof;
    }

    public void setProf(ProfissaoBEAN prof) {
        this.prof = prof;
    }

    public GrupoBEAN getGrupo() {
        return grupo;
    }

    public void setGrupo(GrupoBEAN grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return this.nome;
    }


        
}
