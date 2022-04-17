/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 94779
 */
public class Admin {
    private String userName;
    private String pswrd;
    private String email;
    
    private String defaultMail = "nethre.perera99@gmail.com";

    public Admin(String userName, String pswrd, String email) {
        this.userName = userName;
        this.pswrd = pswrd;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPswrd() {
        return pswrd;
    }

    public void setPswrd(String pswrd) {
        this.pswrd = pswrd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDefaultMail() {
        return defaultMail;
    }
}
