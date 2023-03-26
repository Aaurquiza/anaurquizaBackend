
package com.portfolio.ana.Interface;

import com.portfolio.ana.Enthy.Persona;
import java.util.List;


public interface IPersonaService {
    //ptraer persona//
    public List<Persona> getPersona();
    
    //guardar objeto tipo persona//
    
    public void savePersona(Persona persona);
    
            //eliminar un objeto//
            
    public void deletePersona(Long id);
    
    //buscar persona por id//
    
    public Persona findPersona(Long id);
            
}
