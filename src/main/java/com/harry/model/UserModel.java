package com.harry.model;


import com.harry.enums.Role;
import lombok.Data;

@Data
public class UserModel {

    private String username;
    private String password;
    private Role roleType;
}
