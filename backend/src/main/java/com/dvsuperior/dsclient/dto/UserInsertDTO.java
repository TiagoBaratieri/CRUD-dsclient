package com.dvsuperior.dsclient.dto;

import com.dvsuperior.dsclient.services.validation.UserInsertValid;

@UserInsertValid
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
