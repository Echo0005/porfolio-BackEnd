package com.ap.ap.controller;

import com.ap.ap.models.Curso;
import com.ap.ap.services.CursoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/curso" )
public class CursoController
{
    private final CursoService cursoService;

    public CursoController(CursoService cursoService)
    {
        this.cursoService = cursoService;
    }

    @GetMapping( "/all" )
    public ResponseEntity<List<Curso>> obtenerCursos()
    {
        List<Curso> cursos = cursoService.buscarCurso();
        return new ResponseEntity<>(cursos, HttpStatus.OK);
    }

    @PutMapping( "/update" )
    public ResponseEntity<Curso> editarCurso( @RequestBody Curso curso )
    {
        Curso updateCurso = cursoService.editarCurso( curso );
        return new ResponseEntity<>( updateCurso, HttpStatus.OK );
    }

    @PostMapping( "/add" )
    public ResponseEntity<Curso> crearCurso( @RequestBody Curso curso )
    {
        Curso nuevoCurso = cursoService.addCurso(curso);
        return new ResponseEntity<>(nuevoCurso, HttpStatus.CREATED);
    }

    @DeleteMapping( "delete/{id}" )
    public ResponseEntity<?> borrarCurso( @PathVariable("id") Long id )
    {
        cursoService.borrarCurso(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
