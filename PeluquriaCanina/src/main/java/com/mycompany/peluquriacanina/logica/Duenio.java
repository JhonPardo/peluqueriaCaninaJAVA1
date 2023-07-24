
package com.mycompany.peluquriacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duenio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_Duenio;
    private String nombreDuenio;
    private String telefonoDuenio;

    public Duenio() {
    }

    public Duenio(int id_Duenio, String nombreDuenio, String telefonoDuenio) {
        this.id_Duenio = id_Duenio;
        this.nombreDuenio = nombreDuenio;
        this.telefonoDuenio = telefonoDuenio;
    }

    public int getId_Duenio() {
        return id_Duenio;
    }

    public void setId_Duenio(int id_Duenio) {
        this.id_Duenio = id_Duenio;
    }

    public String getNombre() {
        return nombreDuenio;
    }

    public void setNombre(String nombre) {
        this.nombreDuenio = nombre;
    }

    public String getTelefonoDuenio() {
        return telefonoDuenio;
    }

    public void setTelefonoDuenio(String telefonoDuenio) {
        this.telefonoDuenio = telefonoDuenio;
    }
    
    
    
}
