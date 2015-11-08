/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_dobles;

/**
 *
 * @author 68NK7
 */
public class practica1Doble {
    public practica1 primero;
    public boolean esVacia(){
    if(primero==null){
        return true;
    }
    else{
        return false;
    }
    }
    void inserteNodo(String nombre, String apellido){
    practica1 temp=new practica1(nombre, apellido);
    if(esVacia()){
        primero=temp;
    }
    else{
       temp.siguiente=primero;
       primero.anterior=temp;
       primero=temp;
    }
    }
    void eliminarNodo(){
        practica1 temp=primero;
        if(esVacia()){
            System.out.println("lista vacia");
        }
        else{
            primero=primero.siguiente;
            primero.anterior=null;
        }
    }
    void buscar(String dato){
        if(primero.nombre==dato){
            System.out.println(primero.nombre);
        }
        else{
            practica1 temp=primero;
            while(temp.nombre!=null){
                if(temp.nombre==dato){
                    
                }
            }
        }
    }
}
