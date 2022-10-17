package com.ap.ap.services;

import com.ap.ap.models.Proyecto;
import com.ap.ap.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProyectoService
{
    private final ProyectoRepository proyectoRepository;

    @Autowired
    public ProyectoService(ProyectoRepository proyectoRepository)
    {
        this.proyectoRepository = proyectoRepository;
    }

    public Proyecto addProyecto (Proyecto proyecto)
    {
        return proyectoRepository.save(proyecto);
    }
    public List<Proyecto> buscarProyectos()
    {
        return proyectoRepository.findAll();
    }
    public Proyecto editarProyecto(Proyecto proyecto)
    {
        return proyectoRepository.save(proyecto);
    }
    public void borrarProyecto(Long id)
    {
        proyectoRepository.deleteById(id);
    }
}
