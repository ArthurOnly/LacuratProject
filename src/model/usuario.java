package model;

public class usuario {

    String nome;
    String telefone;
    String turma;
    String observações;
    String ID;
    
    public usuario(String nome, String telefone, String turma, String observações, String ID) {
        this.nome = nome;
        this.telefone = telefone;
        this.turma = turma;
        this.observações = observações;
        this.ID = ID;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getObservações() {
        return observações;
    }

    public void setObservações(String observações) {
        this.observações = observações;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
        
}
