/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comercialastocondor.inventario.logica;

import comercialastocondor.inventario.persistencia.persistenceController;
import java.util.List;

/**
 *
 * @author aaron
 */
public class controller {
    
    persistenceController persisControll;

    public controller() {
        persisControll = new persistenceController();
    }
    
    public String validateUser(String user, String password) {
        
        String message = "";
        List<user> listUser = persisControll.traerUsuario();
        
        for(user usu : listUser){
            if(usu.getUsername().equals(user)){
                if(usu.getPassword().equals(password)){
                    message = "Login Successful";
                    break;
                }else{
                    message = "Incorrect password";
                    break;
                }
            }else{
                message = "User not found";
            }
        }
        
        return message;
    }    
    
}
