package com.ap.ap.controller;

import com.ap.ap.models.SkillSoft;
import com.ap.ap.services.SkillSoftService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/skills/soft" )
public class SkillSoftController
{
    private final SkillSoftService skillSoftService;

    public SkillSoftController(SkillSoftService skillSoftService)
    {
        this.skillSoftService = skillSoftService;
    }

    @GetMapping( "/all" )
    public ResponseEntity<List<SkillSoft>> obtenerSkillSoft()
    {
        List<SkillSoft> skillSofts = skillSoftService.buscarSkillSofts();
        return new ResponseEntity<>(skillSofts, HttpStatus.OK);
    }

    @PutMapping( "/update" )
    public ResponseEntity<SkillSoft> editarSkillSoft( @RequestBody SkillSoft skillSoft )
    {
        SkillSoft updateSkillSoft = skillSoftService.editarSkillSoft( skillSoft );
        return new ResponseEntity<>( updateSkillSoft, HttpStatus.OK );
    }

    @PostMapping( "/add" )
    public ResponseEntity<SkillSoft> crearSkillSoft( @RequestBody SkillSoft skillSoft )
    {
        SkillSoft nuevaSkillSoft = skillSoftService.addSkillSoft(skillSoft);
        return new ResponseEntity<>(nuevaSkillSoft, HttpStatus.CREATED);
    }

    @DeleteMapping( "delete/{id}" )
    public ResponseEntity<?> borrarSkillSoft( @PathVariable("id") Long id )
    {
        skillSoftService.borrarSkillSoft(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
