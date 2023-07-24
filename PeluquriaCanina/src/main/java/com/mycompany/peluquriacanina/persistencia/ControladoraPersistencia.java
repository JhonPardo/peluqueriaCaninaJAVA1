
package com.mycompany.peluquriacanina.persistencia;

import com.mycompany.peluquriacanina.logica.Duenio;
import com.mycompany.peluquriacanina.logica.Mascota;

public class ControladoraPersistencia {
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        
       duenioJpa.create(duenio);
       
       mascoJpa.create(masco);
    }
    
}
