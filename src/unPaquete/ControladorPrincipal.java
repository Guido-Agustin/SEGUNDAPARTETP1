/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unPaquete;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class ControladorPrincipal {
    
    public static void main(String[] args) {
        
        //PRODUCTO 
        
        ArrayList<Producto> unObjetoProducto = new ArrayList<>();
        
        Producto unProducto = new Producto();
        Producto unProducto2 = new Producto();
        Producto unProducto3 = new Producto();
        
        unProducto.unNombre = "Pepsi";
        unProducto.unaDescripcion= "Best gaseosa in the guorld";
        unProducto.unEstado = true;
        unProducto.unPrecio = 670.5f;
        unProducto.unTipo = "Plato Principal";
        
        unProducto2.unNombre = "Pepsi 2";
        unProducto2.unaDescripcion= "Best gaseosa in the guorld 2";
        unProducto2.unEstado = false;
        unProducto2.unPrecio = 670.52f;
        unProducto2.unTipo = "Plato Principal 2";
        
        unProducto3.unNombre = "Pepsi 3";
        unProducto3.unaDescripcion= "Best gaseosa in the guorld 3";
        unProducto3.unEstado = true;
        unProducto3.unPrecio = 670.53f;
        unProducto3.unTipo = "Plato Principal 3";
        
        unObjetoProducto.add(unProducto);
        unObjetoProducto.add(unProducto2);
        unObjetoProducto.add(unProducto3);
        
        /*for(int bandera = 0 ; bandera < unObjetoProducto.size(); bandera++){
       
            unObjetoProducto.get(bandera).mostrar();
            
        }*/
        
        for(Producto i : unObjetoProducto ){
     
            i.mostrar();
            
        }
        
        
        
    }
    
}
