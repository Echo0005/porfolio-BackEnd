package com.ap.ap.controller;

import com.ap.ap.models.Usuario;
import com.ap.ap.services.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/usuario" )
public class UsuarioController
{
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService)
    {
        this.usuarioService = usuarioService;
    }

    @GetMapping( "/id/{id}" )
    public ResponseEntity<Usuario> obtenerUsuario( @PathVariable( "id" ) Long id )
    {
        Usuario usuario = usuarioService.buscarUsuarioPorId(id);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }
    
    @GetMapping( "/all" )
    public ResponseEntity<List<Usuario>> obtenerUsuario()
    {
        List<Usuario> usuario = usuarioService.buscarUsuarios();
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

    @PutMapping( "/update" )
    public ResponseEntity<Usuario> editarUsuario( @RequestBody Usuario usuario )
    {
        Usuario updateUsuario = usuarioService.editarUsuario( usuario );
        return new ResponseEntity<>( updateUsuario, HttpStatus.OK );
    }

    @PostMapping( "/add" )
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario )
    {
        Usuario nuevoUsuario = usuarioService.addUser(usuario);
        return new ResponseEntity<>(nuevoUsuario, HttpStatus.CREATED);
    }
}
