package com.ap.ap.services;

import com.ap.ap.models.Login;
import com.ap.ap.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LoginService
{
    private final LoginRepository loginRepository;

    @Autowired
    public LoginService(LoginRepository loginRepository)
    {
        this.loginRepository = loginRepository;
    }

    public Login addLogin (Login login)
    {
        return loginRepository.save(login);
    }
    public List<Login> buscarLogin()
    {
        return loginRepository.findAll();
    }
    public Login editarLogin(Login login)
    {
        return loginRepository.save(login);
    }
    public void borrarLogin(Long id)
    {
        loginRepository.deleteById(id);
    }
}
