/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

/**
 *
 * @author 68NK7
 */
public class colas {
     int longitud=-1;
    int capacidad=0;
    int []array;
    public colas (int tamano){
    array=new int[tamano];
    capacidad=tamano;
    }
    public boolean esVacia(){
        if(longitud==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void insertar(int dato){
        if(longitud+1<capacidad){
            longitud++;
            array[longitud]=dato;
        }
        else{
            System.out.println("cola vacia");
        }
    }
    void eliminar(){
        int tem=-1;
        if(esVacia()){
            System.out.println("cola vacia");
        }
        else{
            tem=array[0];
            for(int e=0;e<=longitud;e++){
                array[e-1]=array[e];
            }
            array[longitud]=-1;
            capacidad--;
        }
    }
    void imprimir(){
        if(esVacia()){
            System.out.println("cola vacia");
        }
        else{
            for(int x=0;x<=longitud;x++){
                System.out.println(array[longitud]);
            }
        }
    }
}
