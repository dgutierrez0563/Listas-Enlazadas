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
public class practica1 {
    public String nombre;
    public String apellido;
    public practica1 siguiente=null;
    public practica1 anterior=null;
    public practica1(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }
}
