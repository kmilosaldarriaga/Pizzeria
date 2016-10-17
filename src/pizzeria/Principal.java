/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.util.Scanner;

/**
 *
 * @author juan camilo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClientesRegistro cl=new ClientesRegistro();
        Scanner entradaEscaner = new Scanner(System.in);
        int cc = entradaEscaner.nextInt();
        cl.registroClienteNuevo(cc);
//        cl.imprimirClientesFrecuentes();
//        int cc=42868292;
//        cl.validarCF(cc);
//        if(cl.validarCF(cc) == true){
//            System.out.println("Existe");
//        }else
//        {
//            System.out.println("No Existe");
//        }
    }

}
