/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Laura
 */
public class Clientes {

    int cedula = 0;
    String nombre = "";

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }
    HashMap<Integer, String> clientesFrec = new HashMap<Integer, String>();

    public void imprimirClientesFrecuentes() {

        Iterator it = clientesFrec.keySet().iterator();

        while (it.hasNext()) {

            Integer cedula = (Integer) it.next();

            System.out.println("Cedula: " + cedula);

            System.out.println("Nombre: " + clientesFrec.get(cedula));
        }
    }
    public boolean validarCF(int cedula){
        
        if(clientesFrec.containsKey(cedula)){
            return true;
        }else{
            return false;
        }       
        
    }
    
    public void agregarCliente(int cedula,String nombre){
        clientesFrec.put(cedula, nombre);
        clientesFrecuentes();
        imprimirClientesFrecuentes();
    }
    public void clientesFrecuentes(){
        clientesFrec.put(1128274683, "Laura Velez");
        clientesFrec.put(1128386930, "Camilo Saldarriaga");
        clientesFrec.put(71363495, "Alex Sanchez");
    }
}
