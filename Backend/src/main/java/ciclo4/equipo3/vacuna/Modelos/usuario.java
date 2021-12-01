package ciclo4.equipo3.vacuna.Modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class usuario {
    @Id
    public String numId;
    public String tipoIdentificacion;
    public String priNombre;
    public String segNombre;
    public String priApellido;
    public String segApellido;
    public String edad;
    public String sexo;
    public String telefono;
    public String correo;
    public Vacuna infVacuna;
    
    public usuario() {
    }

    public usuario(String numId, String tipoIdentificacion, String priNombre, String segNombre, String priApellido,
            String segApellido, String edad, String sexo, String telefono, String correo, Vacuna infVacuna) {
        this.numId = numId;
        this.tipoIdentificacion = tipoIdentificacion;
        this.priNombre = priNombre;
        this.segNombre = segNombre;
        this.priApellido = priApellido;
        this.segApellido = segApellido;
        this.edad = edad;
        this.sexo = sexo;
        this.telefono = telefono;
        this.correo = correo;
        this.infVacuna = infVacuna;
    }

    public String getNumId() {
        return numId;
    }

    public void setNumId(String numId) {
        this.numId = numId;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getPriNombre() {
        return priNombre;
    }

    public void setPriNombre(String priNombre) {
        this.priNombre = priNombre;
    }

    public String getSegNombre() {
        return segNombre;
    }

    public void setSegNombre(String segNombre) {
        this.segNombre = segNombre;
    }

    public String getPriApellido() {
        return priApellido;
    }

    public void setPriApellido(String priApellido) {
        this.priApellido = priApellido;
    }

    public String getSegApellido() {
        return segApellido;
    }

    public void setSegApellido(String segApellido) {
        this.segApellido = segApellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Vacuna getInfVacuna() {
        return infVacuna;
    }

    public void setInfVacuna(Vacuna infVacuna) {
        this.infVacuna = infVacuna;
    }

    
}
