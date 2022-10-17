package com.ap.ap.controller;

import com.ap.ap.models.Login;
import com.ap.ap.services.LoginService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/login" )
public class LoginController
{
    private final LoginService loginService;

    public LoginController(LoginService loginService)
    {
        this.loginService = loginService;
    }

    @GetMapping( "/all" )
    public ResponseEntity<List<Login>> obtenerLogin()
    {
        List<Login> login = loginService.buscarLogin();
        return new ResponseEntity<>(login, HttpStatus.OK);
    }

    @PutMapping( "/update" )
    public ResponseEntity<Login> editarLogin( @RequestBody Login login )
    {
        Login updateLogin = loginService.editarLogin( login );
        return new ResponseEntity<>( updateLogin, HttpStatus.OK );
    }

    @PostMapping( "/add" )
    public ResponseEntity<Login> crearLogin( @RequestBody Login login )
    {
        Login nuevoLogin = loginService.addLogin(login);
        return new ResponseEntity<>(nuevoLogin, HttpStatus.CREATED);
    }

    @DeleteMapping( "delete/{id}" )
    public ResponseEntity<?> borrarLogin( @PathVariable("id") Long id )
    {
        loginService.borrarLogin(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
