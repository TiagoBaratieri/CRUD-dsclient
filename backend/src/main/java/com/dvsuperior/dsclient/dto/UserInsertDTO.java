package com.dvsuperior.dsclient.dto;

public class UserInsertDTO extends UserDTO{
    private static  final long serialVersionUID = 1l;

    private String password;

    public UserInsertDTO(){
        super();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
