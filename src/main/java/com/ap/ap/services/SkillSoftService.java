package com.ap.ap.services;

import com.ap.ap.models.SkillSoft;
import com.ap.ap.repository.SkillSoftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SkillSoftService
{
    private final SkillSoftRepository skillSoftRepository;

    @Autowired
    public SkillSoftService(SkillSoftRepository skillSoftRepository)
    {
        this.skillSoftRepository = skillSoftRepository;
    }

    public SkillSoft addSkillSoft (SkillSoft skillSoft)
    {
        return skillSoftRepository.save(skillSoft);
    }
    public List<SkillSoft> buscarSkillSofts()
    {
        return skillSoftRepository.findAll();
    }
    public SkillSoft editarSkillSoft(SkillSoft skillSoft)
    {
        return skillSoftRepository.save(skillSoft);
    }
    public void borrarSkillSoft(Long id)
    {
        skillSoftRepository.deleteById(id);
    }
}
