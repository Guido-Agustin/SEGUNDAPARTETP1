/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unPaquete;

/**
 *
 * @author gabri
 * Clase Producto ---- Atributos (nombre, descripcion, precio, estado, tipo) 
----- metodos (mostrar
 */
public class Producto {
    
    String unNombre;
    String unaDescripcion;
    Float unPrecio;
    Boolean unEstado;
    String unTipo;
    
    public void mostrar(){
        System.out.println("Nombre " + unNombre + "\n Descripcion " + unaDescripcion );
        System.out.println("Tipo " + unTipo + "\n Precio " + unPrecio );
        
        if(unEstado == true){
            System.out.println("Disponible");
        }
        else{
            System.out.println("No Disponible");
        }
        
        
        
    }
    
}
