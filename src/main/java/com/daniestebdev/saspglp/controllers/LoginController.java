package com.daniestebdev.saspglp.controllers;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Named("loginController")
@ViewScoped
@Getter
@Setter
public class LoginController implements Serializable {

    private String usuario;

    @PostConstruct
    public void init() {
        usuario = "";
    }
}
