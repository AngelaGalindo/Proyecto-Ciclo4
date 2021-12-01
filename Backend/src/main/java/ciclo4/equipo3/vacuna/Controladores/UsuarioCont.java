package ciclo4.equipo3.vacuna.Controladores;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ciclo4.equipo3.vacuna.Modelos.usuario;
import ciclo4.equipo3.vacuna.Servicios.UsuarioServ;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/usuario")
public class UsuarioCont {
    @Autowired
    UsuarioServ UsuarioServ;

    @GetMapping()
    public ArrayList<usuario> obtenerUsuarios(){
        return  UsuarioServ.obtenerUsuarios();
    }

    @PostMapping()
    public usuario guardarUsuario(@RequestBody usuario usuario){
        return UsuarioServ.guardarUsuario(usuario);
    }
    
    @DeleteMapping(path = "/{id}")
    public String eliminarUsuarioPorId(@PathVariable("id") String numId){
        boolean resultadoEliminar=this.UsuarioServ.eliminarusuario(numId);
        if (resultadoEliminar){
            return "Se eliminó el usuario con id: "+numId;
        }else{
            return "No se pudo eliminar el usuario con el id: "+numId;
        }
    }
    
    @GetMapping(path = "/{id}")
    public Optional<usuario> obtenerUsuarioPorId(@PathVariable("id") String numId){
        return this.UsuarioServ.obtenerUsuarioPorId(numId);
    }
}
