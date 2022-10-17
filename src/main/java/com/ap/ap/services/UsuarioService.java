package com.ap.ap.services;

import com.ap.ap.exception.UserNotFoundException;
import com.ap.ap.models.Usuario;
import com.ap.ap.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UsuarioService
{
    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService ( UsuarioRepository usuarioRepository )
    {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario addUser (Usuario usuario)
    {
        return usuarioRepository.save(usuario);
    }
    public List<Usuario> buscarUsuarios()
    {
        return usuarioRepository.findAll();
    }
    public Usuario editarUsuario(Usuario usuario)
    {
        return usuarioRepository.save(usuario);
    }
    public void borrarUsuario(Long id)
    {
        usuarioRepository.deleteById(id);
    }
    public Usuario buscarUsuarioPorId(Long id)
    {
        return usuarioRepository.findById(id).orElseThrow(() -> new UserNotFoundException("usuario no encontrado"));
    }
}
