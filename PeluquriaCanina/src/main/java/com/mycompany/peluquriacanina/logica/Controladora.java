
package com.mycompany.peluquriacanina.logica;

import com.mycompany.peluquriacanina.persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlpersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, String 
            observaciones, String alergico, String atenEsp, String nombreDuenio,
            String telefonoDuenio) {
        
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setTelefonoDuenio(telefonoDuenio);
        
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        masco.setObservaciones(observaciones);
        masco.setUnDuenio(duenio);
        
        controlpersis.guardar(duenio,masco);
    }
    
}
