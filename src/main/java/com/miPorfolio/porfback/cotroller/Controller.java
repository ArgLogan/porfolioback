package com.miPorfolio.porfback.cotroller;

import com.miPorfolio.porfback.model.Persona;
import com.miPorfolio.porfback.model.Skill;
import com.miPorfolio.porfback.model.Study;
import com.miPorfolio.porfback.service.IPersonaService;
import com.miPorfolio.porfback.service.ISkillService;
import com.miPorfolio.porfback.service.IStudyService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jj_roma
 */

@RestController
public class Controller {
    
    @Autowired IPersonaService persoServ;
    @Autowired IStudyService estServ;
    @Autowired ISkillService habilServ;
    
//--------------------------- PERSONA ------------------------------  
    @PostMapping("/new/persona")
    public void agregarPersona(@RequestBody Persona pers){
       persoServ.crearPersona(pers);
    }
    @GetMapping("/ver/personas")
    @ResponseBody    
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona ( @PathVariable Long id){
        persoServ.borrarPersona(id);
    }
//-----------------------------------------------------------------------
   

//----------------------------STUDY---------------------------------------
    @PostMapping("/study/new")
    public void agregaStudy(@RequestBody Study estudio ){
        estServ.crearStudy(estudio);
    } 
    @GetMapping("/study/ver")
    @ResponseBody    
    public List<Study> verStudys(){
        return estServ.verStudys();
    }
    @DeleteMapping ("/study/delete/{id}")
    public void borrarStudy ( @PathVariable Long id){
        estServ.borrarStudy(id);
    }
    @PostMapping("/study/update")
    public void acualizaStudy(@RequestBody Study estudio ){
        estServ.actualizaStudy(estudio);
    } 
      
    
//----------------------------------------------------------------------    


//-------------------------SKILS-------------------------------------------
    @PostMapping("/skill/new")
    public void agregaSkill(@RequestBody Skill habilidad ){
        habilServ.crearSkill(habilidad);
    } 
    @GetMapping("/skill/ver")
    @ResponseBody    
    public List<Skill> verStkills(){
        return habilServ.verSkills();
    }
    @DeleteMapping ("/skill/delete/{id}")
    public void borrarSkill ( @PathVariable Long id){
        habilServ.borrarSkill(id);
    }
    @PostMapping("/skill/update")
    public void acualizaSkill(@RequestBody Skill habilidad ){
        habilServ.actualizaSkill(habilidad);
    } 






//-------------------------------------------------------------------------
    
}
