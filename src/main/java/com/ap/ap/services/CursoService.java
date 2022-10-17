package com.ap.ap.services;

import com.ap.ap.models.Curso;
import com.ap.ap.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CursoService
{
    private final CursoRepository cursoRepository;

    @Autowired
    public CursoService(CursoRepository cursoRepository)
    {
        this.cursoRepository = cursoRepository;
    }

    public Curso addCurso (Curso curso)
    {
        return cursoRepository.save(curso);
    }
    public List<Curso> buscarCurso()
    {
        return cursoRepository.findAll();
    }
    public Curso editarCurso(Curso curso)
    {
        return cursoRepository.save(curso);
    }
    public void borrarCurso(Long id)
    {
        cursoRepository.deleteById(id);
    }
}
