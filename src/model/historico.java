package model;

public class historico {
    private String userId;
    private String dispId;
    private String data;
    private String id;

    public historico(String userName, String dispName, String data, String id) {
        this.userId = userName;
        this.dispId = dispName;
        this.data = data;
        this.id = id;
    }    

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userName) {
        this.userId = userName;
    }

    public String getDispId() {
        return dispId;
    }

    public void setDispId(String dispName) {
        this.dispId = dispName;
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
