package ciclo4.equipo3.vacuna.Modelos;

import java.sql.Date;

public class Vacuna {
    public String dosis;
    public String nomVacuna;
    public String tuvoCovid;
    public Date fechaVacuna;
    
    public Vacuna() {
    }

    public Vacuna(String dosis, String nomVacuna, String tuvoCovid, Date fechaVacuna) {
        this.dosis = dosis;
        this.nomVacuna = nomVacuna;
        this.tuvoCovid = tuvoCovid;
        this.fechaVacuna = fechaVacuna;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getNomVacuna() {
        return nomVacuna;
    }

    public void setNomVacuna(String nomVacuna) {
        this.nomVacuna = nomVacuna;
    }

    public String getTuvoCovid() {
        return tuvoCovid;
    }

    public void setTuvoCovid(String tuvoCovid) {
        this.tuvoCovid = tuvoCovid;
    }

    public Date getFechaVacuna() {
        return fechaVacuna;
    }

    public void setFechaVacuna(Date fechaVacuna) {
        this.fechaVacuna = fechaVacuna;
    }

    
}