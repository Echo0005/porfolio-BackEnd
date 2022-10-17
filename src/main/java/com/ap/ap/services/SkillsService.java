package com.ap.ap.services;

import com.ap.ap.models.Skills;
import com.ap.ap.repository.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SkillsService
{
    private final SkillsRepository skillsRepository;

    @Autowired
    public SkillsService(SkillsRepository skillsRepository)
    {
        this.skillsRepository = skillsRepository;
    }

    public Skills addSkills (Skills skills)
    {
        return skillsRepository.save(skills);
    }
    public List<Skills> buscarSkills()
    {
        return skillsRepository.findAll();
    }
    public Skills editarSkills(Skills skills)
    {
        return skillsRepository.save(skills);
    }
    public void borrarSkills(Long id)
    {
        skillsRepository.deleteById(id);
    }
}
