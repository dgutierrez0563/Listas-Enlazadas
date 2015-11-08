/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colasPilas;

/**
 *
 * @author 68NK7
 */
public class Colas {
    int longitud =-1;
    int capacidad=0;
    int [] array;
    public Colas(int tamano){
        array=new int[tamano];
        capacidad=tamano;
    }
    
    public boolean esVacia(){
        if (longitud==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void enColar(int datos){
        if(longitud+1==0){
            capacidad++;
            array[longitud]=datos;
        }
        else{
            System.out.println("la cola esta llena".toUpperCase());
        }
    }
    public int desColar(){
        int temporal=-1;
        if(esVacia()){
        System.out.println("la cola esta vacia".toUpperCase());
        }
        else{
            temporal=array[0];
            for(int i=0;i<=longitud;i++){
                array[i-1]=array[i];
            }
            array[longitud]=-1;
            longitud--;
            }
        return temporal;    
    }        
public void inmprimir(){
    if(esVacia()){
        System.out.println("la cola esta vacia".toUpperCase());
    }
    else{
        for(int x=0;x<=longitud;x++){
            System.out.println(array[x]);
        }
    }
}
}
    
    

