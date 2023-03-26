
package com.portfolio.ana.Service;

import com.portfolio.ana.Enthy.Persona;
import com.portfolio.ana.Interface.IPersonaService;
import com.portfolio.ana.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository ; 
         
    @Override
    public List<Persona> getPersona() {
        return ipersonaRepository.findAll();
                }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
        
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
    return persona;
    }
      
    }
    
    
