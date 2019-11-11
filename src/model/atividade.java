package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import controller.interacFunctions;

public class atividade {
    private String usuario;
    private String usuarioID;
    private String dispositivo;
    private String dispositovID;
    private boolean automatic;        
    private String dataInicial;
    private String dataFinal; 
    private String id;
    interacFunctions inf = new interacFunctions();
    

    public atividade(String usuario, String usuarioID, String dispositivo, String dispositovID, boolean automatic, String dataInicial, String dataFinal, String id) {
        this.usuario = usuario;
        this.usuarioID = usuarioID;
        this.dispositivo = dispositivo;
        this.dispositovID = dispositovID;
        this.automatic = automatic;        
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.id = id;
    }
    
    public boolean isUnlimited(){
        if (dataInicial.equalsIgnoreCase(dataFinal)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(String usuarioID) {
        this.usuarioID = usuarioID;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getDispositovID() {
        return dispositovID;
    }

    public void setDispositovID(String dispositovID) {
        this.dispositovID = dispositovID;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }  
    
    public String getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
    }   
    
    public String dataToString(String d){
        String data[] = d.split(" ");
        return data[2]+"/"+data[1]+"/"+data[5]+" "+data[3];
    }
    
    public Date convertDate(String data) throws ParseException{
        SimpleDateFormat formato = new SimpleDateFormat("d/MM/yyyy HH:mm:ss");
        String[] dataIni = data.split(" ");         
        String[] hora = dataIni[3].split(":");        
        Date dataFormatada = formato.parse(dataIni[2]+"/"+dataIni[1]+"/"+dataIni[5]+" "+hora[0]+":"+hora[1]+":"+hora[2]);
        return dataFormatada;
    }
    
    public double minutesParsed(double parsed) throws ParseException{
        double init = convertDate(dataInicial).getTime();
        double finalTime = new Date().getTime();
        if (parsed<10000){
            return ((finalTime-init)/60000);
        }
        else{
            return ((convertDate(dataFinal).getTime()-init)/60000);
        }
    }   
     
    public boolean verifyEnd(){
        try{
            if (convertDate(getDataFinal()).before(new Date())){
                return true;
            } 
            else{
                return false;
            }
        }      
        catch (ParseException ex) {
            Logger.getLogger(atividade.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }       
    }
    
    public String formatedTime(){
        String[] finalTimeUnformated = dataFinal.split(" ");
        if(dataInicial.equals(dataFinal)){
            return "Ilimitado";
        }
        else{
            return finalTimeUnformated[1]+"/"+finalTimeUnformated[2]+"/"+finalTimeUnformated[5]+" às "+finalTimeUnformated[3];
        }        
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }
}
