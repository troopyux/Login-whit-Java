/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comercialastocondor.inventario.persistencia;

import comercialastocondor.inventario.logica.user;
import java.util.List;

/**
 *
 * @author aaron
 */
public class persistenceController {
    
    userJpaController userJPA = new userJpaController();

    public List<user> traerUsuario() {
        
        // ES COMO HACER LA QUERY SELECT * FROM USER
        return userJPA.finduserEntities();
        
    }
    
    
    
}
