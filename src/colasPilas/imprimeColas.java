/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colasPilas;

import java.util.Scanner;

/**
 *
 * @author 68NK7
 */
public class imprimeColas {
    public static void main(String []args){
   
        Colas instancia=new Colas(2);
        Scanner ent=new Scanner(System.in);
        String respuesta;
        do{
        System.out.println("Ingrese el numero de la cola");
        int numero=ent.nextInt();
        instancia.enColar(numero);
      
        System.out.println("Desea cntinuar: ");
        respuesta=ent.nextLine();
        }
        while(respuesta=="y" ||respuesta=="Y");
    System.out.println("Desea eliminar una cola");
    String respu=ent.next();
    if(respu=="Y"||respu=="y"){
        instancia.desColar();
    }
    System.out.println("Desea imprimir");
    }
    
}
