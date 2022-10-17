package com.ap.ap.controller;

import com.ap.ap.models.Proyecto;
import com.ap.ap.services.ProyectoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/proyecto" )
public class ProyectoController
{
    private final ProyectoService proyectoService;

    public ProyectoController(ProyectoService proyectoService)
    {
        this.proyectoService = proyectoService;
    }

    @GetMapping( "/all" )
    public ResponseEntity<List<Proyecto>> obtenerProyectos()
    {
        List<Proyecto> proyectos = proyectoService.buscarProyectos();
        return new ResponseEntity<>(proyectos, HttpStatus.OK);
    }

    @PutMapping( "/update" )
    public ResponseEntity<Proyecto> editarProyecto( @RequestBody Proyecto proyecto )
    {
        Proyecto updateProyecto = proyectoService.editarProyecto( proyecto );
        return new ResponseEntity<>( updateProyecto, HttpStatus.OK );
    }

    @PostMapping( "/add" )
    public ResponseEntity<Proyecto> crearProyecto( @RequestBody Proyecto proyecto )
    {
        Proyecto nuevoProyecto = proyectoService.addProyecto(proyecto);
        return new ResponseEntity<>(nuevoProyecto, HttpStatus.CREATED);
    }

    @DeleteMapping( "delete/{id}" )
    public ResponseEntity<?> borrarProyecto( @PathVariable("id") Long id )
    {
        proyectoService.borrarProyecto(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
