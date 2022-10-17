package com.ap.ap.services;

import com.ap.ap.models.Educacion;
import com.ap.ap.repository.EducacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EducacionService
{
    private final EducacionRepository educacionRepository;

    @Autowired
    public EducacionService(EducacionRepository educacionRepository)
    {
        this.educacionRepository = educacionRepository;
    }

    public Educacion addEducacion (Educacion educacion)
    {
        return educacionRepository.save(educacion);
    }
    public List<Educacion> buscarEducaciones()
    {
        return educacionRepository.findAll();
    }
    public Educacion editarEducacion(Educacion educacion)
    {
        return educacionRepository.save(educacion);
    }
    public void borrarEducacion(Long id)
    {
        educacionRepository.deleteById(id);
    }

}
