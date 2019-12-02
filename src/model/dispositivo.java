package model;

public class dispositivo {

    private String nome;
    private String id;
    private String observacoes;
    private Double tempoDeUso;
    private boolean status;
    
    public dispositivo(String nome, String id, String observacoes, Double tempoDeUso, boolean status) {
        this.nome = nome;
        this.id = id;
        this.observacoes = observacoes;
        this.tempoDeUso = tempoDeUso;
        this.status = status;
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

    public String getID() {
        return id;
    }

    public void setIdentificador(String identificador) {
        this.id = identificador;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }       

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public String convertTime(){
        if (tempoDeUso<1){
            return (int)Math.floor(tempoDeUso*60)+" seg";
        }
        if(tempoDeUso>=1 && tempoDeUso<60){
            double seconds = ((tempoDeUso-Math.floor(tempoDeUso))*60);
            return (int)Math.floor(tempoDeUso) + " min e "+(int)(Math.floor(seconds))+" seg";
        }
        if(tempoDeUso>=60 && tempoDeUso<1440){
            double minutes = (Math.floor(tempoDeUso)-60);
            double horas = tempoDeUso/60;
            return (int)Math.floor(horas) + " h e "+(int)(Math.floor(minutes))+" min";
        }
        if(tempoDeUso>=1440){
            double dias = tempoDeUso/1440;            
            double horas = (tempoDeUso/60)-(24*Math.floor(dias));            
            return (int)Math.floor(dias) + " dia(s) e "+(int)(Math.floor(horas))+" h";
        }
        return "";
    }
}
