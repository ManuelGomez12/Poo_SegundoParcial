/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobanco;
import java.util.Scanner;
/**
 *
 * @author Manuel Gomez
 */
public class Cliente extends Persona{
    private int Id_Cliente;
    //private Cuenta Cuenta;
    private String Usuario;
    private String Password;
    
    public Cliente(String Nombre, String Curp, String Direccion, int edad, String Usuario, String Password){
       super(Nombre,Curp,Direccion,Edad);
       this.Usuario=Usuario;
       this.Password=Password;
        
    }
}
