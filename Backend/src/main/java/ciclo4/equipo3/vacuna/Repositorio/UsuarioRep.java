package ciclo4.equipo3.vacuna.Repositorio;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;

import ciclo4.equipo3.vacuna.Modelos.usuario;

public interface UsuarioRep extends MongoRepository <usuario, String> {
    
    ArrayList <usuario> findByPriNombre(String PriNombre);

    ArrayList <usuario> findByPriApellido(String priApellido);
}
