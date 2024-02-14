/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comercialastocondor.inventario.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //MARCAMOS QUE USER SERA LA TABLA
public class user implements Serializable {
    
    @Id //MARCARA LA PRIMARY KEY PARA LA TABLA
    @GeneratedValue(strategy=GenerationType.AUTO) //GENERAR AUTOMATICAMENTE EL ID
    private int id_user;
    private String username;
    private String password;

    public user() {
    }
    
    public user(int id_user, String username, String password) {
        this.id_user = id_user;
        this.username = username;
        this.password = password;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
