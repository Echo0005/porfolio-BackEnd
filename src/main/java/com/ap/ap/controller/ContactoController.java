package com.ap.ap.controller;

import com.ap.ap.models.Contacto;
import com.ap.ap.services.ContactoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/contacto" )
public class ContactoController
{
    private final ContactoService contactoService;

    public ContactoController(ContactoService contactoService)
    {
        this.contactoService = contactoService;
    }

    @GetMapping( "/all" )
    public ResponseEntity<List<Contacto>> obtenerContactos()
    {
        List<Contacto> contactos = contactoService.buscarContactos();
        return new ResponseEntity<>(contactos, HttpStatus.OK);
    }

    @PutMapping( "/update" )
    public ResponseEntity<Contacto> editarContacto( @RequestBody Contacto contacto )
    {
        Contacto updateContacto = contactoService.editarContacto( contacto );
        return new ResponseEntity<>( updateContacto, HttpStatus.OK );
    }

    @PostMapping( "/add" )
    public ResponseEntity<Contacto> crearContacto( @RequestBody Contacto educacion )
    {
        Contacto nuevaContacto = contactoService.addContacto(educacion);
        return new ResponseEntity<>(nuevaContacto, HttpStatus.CREATED);
    }

    @DeleteMapping( "delete/{id}" )
    public ResponseEntity<?> borrarContacto( @PathVariable("id") Long id )
    {
        contactoService.borrarContacto(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
