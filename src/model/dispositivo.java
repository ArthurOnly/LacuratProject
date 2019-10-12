package model;

public class dispositivo {

    String nome;
    String identificador;
    String observacoes;
    Double tempoDeUso;    
    
    public dispositivo(String nome, String identificador, String observacoes, Double tempoDeUso) {
        this.nome = nome;
        this.identificador = identificador;
        this.observacoes = observacoes;
    } 
    
    public Double getTempoDeUso() {
        return tempoDeUso;
    }

    public void setTempoDeUso(Double tempoDeUso) {
        this.tempoDeUso = tempoDeUso;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }       
}
