package ciclo4.equipo3.vacuna.Servicios;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ciclo4.equipo3.vacuna.Modelos.usuario;
import ciclo4.equipo3.vacuna.Repositorio.UsuarioRep;

@Service
public class UsuarioServ {
    @Autowired
    UsuarioRep UsuarioRep;

    public ArrayList<usuario> obtenerUsuarios(){
        return (ArrayList<usuario>) UsuarioRep.findAll();
    }

    public usuario guardarUsuario(usuario usuario){
        return UsuarioRep.save(usuario);

    }

    public boolean eliminarusuario(String numId){
        if(UsuarioRep.existsById(numId)){
            UsuarioRep.deleteById(numId);
            return true;
        }else{
            return false;
        }
    }

    public Optional<usuario> obtenerUsuarioPorId(String numId){
        return UsuarioRep.findById(numId);
    }

    public ArrayList <usuario> obtenerUsuarioPorNombre(String priNombre){
        return UsuarioRep.findByPriNombre(priNombre);
    }

     public ArrayList <usuario> obtenerporApellido(String priApellido){
        return UsuarioRep.findByPriApellido(priApellido);
    } 
}
