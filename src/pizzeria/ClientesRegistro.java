/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class ClientesRegistro extends Clientes {

    int x = 10101010;
    Scanner entradaEscaner2 = new Scanner(System.in);

    public void registroClienteNuevo(int ced) {
        if (validarCF(ced) == false) {
            //String entradaTeclado = entradaEscaner.nextLine();            
            String nomb = entradaEscaner2.nextLine();
            agregarCliente(ced, nomb);
            
        }
    }

}
