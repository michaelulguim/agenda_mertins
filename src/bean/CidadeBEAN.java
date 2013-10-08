/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;


public class CidadeBEAN {
    private int cod_cidade,cod_estado;
    private String nome_cidade;

    public CidadeBEAN(int cod_cidade, int cod_estado, String nome_cidade) {
        this.cod_cidade = cod_cidade;
        this.cod_estado = cod_estado;
        this.nome_cidade = nome_cidade;
    }

    public int getCod_cidade() {
        return cod_cidade;
    }

    public void setCod_cidade(int cod_cidade) {
        this.cod_cidade = cod_cidade;
    }

    public int getCod_estado() {
        return cod_estado;
    }

    public void setCod_estado(int cod_estado) {
        this.cod_estado = cod_estado;
    }

    public String getNome_cidade() {
        return nome_cidade;
    }

    public void setNome_cidade(String nome_cidade) {
        this.nome_cidade = nome_cidade;
    }

    @Override
    public String toString() {
        return nome_cidade ;
    }

    
}
