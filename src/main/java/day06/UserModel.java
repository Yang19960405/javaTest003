package day06;

public class UserModel {
    private String userName;
    private String userPass;
    private String tureName;
    private String rode;

    public UserModel(){

    }

    public UserModel(String userName,String userPass,String tureName,String rode){
        this.rode=rode;
        this.tureName=tureName;
        this.userName=userName;
        this.userPass=userPass;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getTureName() {
        return tureName;
    }

    public void setTureName(String tureName) {
        this.tureName = tureName;
    }

    public String getRode() {
        return rode;
    }

    public void setRode(String rode) {
        this.rode = rode;
    }
}
