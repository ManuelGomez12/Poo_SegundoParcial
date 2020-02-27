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
public class Persona {
    protected String Nombre;
    protected String Curp;
    protected String Direccion;
    protected int Edad;
    
    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        this.Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCurp() {
        return Curp;
    }

    public void setCurp(String Curp) {
        this.Curp = Curp;
    }
    
    public Persona(){
        Scanner Obj1= new Scanner(System.in);
        System.out.println("introdusca edad: ");
        System.out.println(this.Nombre);
        Nombre=Obj1.nextLine();
        System.out.println(this.Curp);
        Curp=Obj1.nextLine();
        System.out.println(this.Direccion);
        Direccion=Obj1.nextLine();
        System.out.println(this.Edad);
        Edad=Obj1.nextInt();
        
        
    }
}
