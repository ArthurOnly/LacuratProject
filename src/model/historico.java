package model;

public class historico {
    private String userName;
    private String dispName;
    private String data;
    private String id;

    public historico(String userName, String dispName, String data, String id) {
        this.userName = userName;
        this.dispName = dispName;
        this.data = data;
        this.id = id;
    }    

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDispName() {
        return dispName;
    }

    public void setDispName(String dispName) {
        this.dispName = dispName;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
