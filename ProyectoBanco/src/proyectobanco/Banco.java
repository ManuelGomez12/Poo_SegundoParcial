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
public class Banco {
    private Cliente titular []= new Cliente[20];
    private String Nombre;
    private String Direccion;
    private int Suscursal;
    private int n;
    
    public Banco(String Nombre, String Direccion, int Sucursal, int n){
    this.Nombre=Nombre;
    this.Direccion=Direccion;
    this.Suscursal=Sucursal;
    this.n=0;
    
    }
    public void Alta(Cliente P){
        if(n<20){
            titular[n]=P;
            n++;
        }
        else
        {
            System.out.println("No hay espacio suficiente");
        }
    }
    
    public void MostrarDatos(){
        int dato;
        Scanner Obj1=new Scanner(System.in);
        System.out.println("introduce el ID. del cliente");
        dato=Obj1.nextInt();
        for (int i=0;i<n;i++){
            if(i==dato){
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
            }
        }
    }
    
    
        
    
    
    
    public void setN(int n) {
        this.n = n;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getSuscursal() {
        return Suscursal;
    }

    public void setSuscursal(int Suscursal) {
        this.Suscursal = Suscursal;
    }
}

