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
        ArrayList<Cliente> unObjetoCliente = new ArrayList<>();
        ArrayList<Encargado> unObjetoEncargado = new ArrayList<>();
        ArrayList<Empleado> unObjetoEmpleado = new ArrayList<>();
        
        Producto unProducto = new Producto();
        Producto unProducto2 = new Producto();
        Producto unProducto3 = new Producto();
        
        Cliente unCliente = new Cliente();
        Cliente unCliente2 = new Cliente();
        Cliente unCliente3 = new Cliente();
        
        Empleado unEmpleado = new Empleado();
        Empleado unEmpleado2 = new Empleado();
        Empleado unEmpleado3 = new Empleado();
        
        Encargado unEncargado = new Encargado();
        Encargado unEncargado2 = new Encargado();
        Encargado unEncargado3 = new Encargado();
        
        unCliente.unApellido = "Gonzalez";
        unCliente.unNombre = "Guidinho";
        unCliente.unMail = "guiaguon@gmail.com";
        unCliente.unaClave = 12345;
                
        unCliente2.unApellido = "Gonzalez2";
        unCliente2.unNombre = "Guidinho2";
        unCliente2.unMail = "guiaguon@gmail.com2";
        unCliente2.unaClave = 123452;
                
        unCliente3.unApellido = "Gonzalez3";
        unCliente3.unNombre = "Guidinho3";
        unCliente3.unMail = "guiaguon@gmail.com3";
        unCliente3.unaClave = 123453;
        
        unEncargado.unApellido = "GonzalezEEEEEEEEEEE";
        unEncargado.unNombre = "GuidinhoEEEEEEEEEEEEee";
        unEncargado.unMail = "guiaguon@gmail.comEEEEEEEEEEEE";
        unEncargado.unaClave = 12345555;
        
        unEncargado2.unApellido = "GonzalezEEEEEEEEEEE2";
        unEncargado2.unNombre = "GuidinhoEEEEEEEEEEEEee2";
        unEncargado2.unMail = "guiaguon@gmail.comEEEEEEEEEEEE2";
        unEncargado2.unaClave = 123455552;
        
        unEncargado3.unApellido = "GonzalezEEEEEEEEEEE3";
        unEncargado3.unNombre = "GuidinhoEEEEEEEEEEEEee3";
        unEncargado3.unMail = "guiaguon@gmail.comEEEEEEEEEEEE3";
        unEncargado3.unaClave = 123455553;
        
        unEmpleado.unApellido = "GonzalezTTTTTTTTTTTTT";
        unEmpleado.unNombre = "GuidinhoTTTTTTTTTTTT";
        unEmpleado.unMail = "guiaguon@gmail.comTTTTTTTTTTTTTt";
        unEmpleado.unaClave = 1234567;
        
        unEmpleado2.unApellido = "GonzalezTTTTTTTTTTTTT2";
        unEmpleado2.unNombre = "GuidinhoTTTTTTTTTTTT2";
        unEmpleado2.unMail = "guiaguon@gmail.comTTTTTTTTTTTTTt2";
        unEmpleado2.unaClave = 12345672;
        
        unEmpleado3.unApellido = "GonzalezTTTTTTTTTTTTT3";
        unEmpleado3.unNombre = "GuidinhoTTTTTTTTTTTT3";
        unEmpleado3.unMail = "guiaguon@gmail.comTTTTTTTTTTTTTt3";
        unEmpleado3.unaClave = 12345673;
        
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
       
        unObjetoCliente.add(unCliente);
        unObjetoCliente.add(unCliente2);
        unObjetoCliente.add(unCliente3);
        
        unObjetoEmpleado.add(unEmpleado);
        unObjetoEmpleado.add(unEmpleado2);
        unObjetoEmpleado.add(unEmpleado3);
        
        unObjetoEncargado.add(unEncargado);
        unObjetoEncargado.add(unEncargado2);
        unObjetoEncargado.add(unEncargado3);
        
        /*for(int bandera = 0 ; bandera < unObjetoProducto.size(); bandera++){
       
            unObjetoProducto.get(bandera).mostrar();
            
        }*/
        
        for(Producto i : unObjetoProducto ){
     
            i.mostrar();
            
        }
        
        for(Cliente i : unObjetoCliente ){
     
            i.mostrar();
            
        }
        
        for(Encargado i : unObjetoEncargado ){
     
            i.mostrar();
            
        }
        
        for(Empleado i : unObjetoEmpleado ){
     
            i.mostrar();
            
        }
        
        unProducto3.unTipo = "Plato Principal 3 CAMBIADO";
        unCliente3.unApellido = " CAMBIADO";
        unEmpleado3.unApellido = "CAMBIADO";
        unEncargado3.unApellido = "CAMBIADO";
        
        for(Producto i : unObjetoProducto ){
     
            i.mostrar();
            
        }
        
        for(Cliente i : unObjetoCliente ){
     
            i.mostrar();
            
        }
        
        for(Encargado i : unObjetoEncargado ){
     
            i.mostrar();
            
        }
        
        for(Empleado i : unObjetoEmpleado ){
     
            i.mostrar();
            
        }
        
        
    }
    
}
