package com.ap.ap.services;

import com.ap.ap.models.Contacto;
import com.ap.ap.repository.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ContactoService
{
    private final ContactoRepository contactoRepository;

    @Autowired
    public ContactoService(ContactoRepository contactoRepository)
    {
        this.contactoRepository = contactoRepository;
    }

    public Contacto addContacto (Contacto contacto)
    {
        return contactoRepository.save(contacto);
    }
    public List<Contacto> buscarContactos()
    {
        return contactoRepository.findAll();
    }
    public Contacto editarContacto(Contacto contacto)
    {
        return contactoRepository.save(contacto);
    }
    public void borrarContacto(Long id)
    {
        contactoRepository.deleteById(id);
    }
}
