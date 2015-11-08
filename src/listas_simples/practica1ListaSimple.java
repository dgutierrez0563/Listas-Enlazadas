/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_simples;

import java.util.*;
import javax.swing.JOptionPane;


/**
 *
 * @author 68NK7
 */
public class practica1ListaSimple {

    public practica1 primero;
    
    public boolean esVacia(){
     if(primero==null){
         return true;
     }
     else{
         return false;
     }
     }
    public void insertar(String nombre, String cedula, int edad){
        practica1 temp=new practica1(nombre, cedula, edad);
        if (esVacia()){
            primero=temp;
    }
        else{
            primero.siguiente=temp;
            primero=temp;
        }
    }
    public void imprimir(){
    practica1 temp=primero;
    if(esVacia()){
        JOptionPane.showMessageDialog(null,"lista vacia".toUpperCase());
    }
    else{
        while(temp!=null){
            System.out.print("Nombre: "+temp.nombre+"\nCedula: "+temp.cedula+"\nEdad: "+temp.edad);
            System.out.println();
            temp=temp.siguiente;
        }
    }
    }
    public void eliminaNodo(){
        if(esVacia()){
            System.out.println("lista vacia".toUpperCase());
        }
        else{
            primero=primero.siguiente;
            //primero=null;
        }
    }
    public static void main(String []args){
        practica1ListaSimple instancia=new practica1ListaSimple();
        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        String nombre=JOptionPane.showInputDialog("Ingrese el nombre");//entrada.nextLine();
        String cedula=JOptionPane.showInputDialog("Ingres la cedula");
        System.out.print("Ingrese la edad: ");
        int edad=entrada.nextInt();
        instancia.insertar(nombre, cedula, edad);
        instancia.imprimir();
    
    }
}

