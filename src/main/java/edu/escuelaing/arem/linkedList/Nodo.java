/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.linkedList;

/**
 *
 * @author juan.navarro
 */
public class Nodo {
    
    //Atributos
    private double valor;
    private Nodo anterior;
    private Nodo siguiente;
    
    public Nodo (double valor, Nodo anterior, Nodo siguiente){
        this.valor = valor;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }
    
    /**
     * Metodo que retorna que valor que se encuentra en el indice.
     * @return Retorna el valor del nodo.
     */
    public double getValor(){
        return valor;
    }
    
    /**
     * Metodo que permite cambiar el valor almacenado en el indice.
     * @param valor Es el nuevo valor que va a almacenar el nodo.
     */
    public void setValor(double valor){
        this.valor = valor; 
    }
    
    /**
     * Metodo que permite consultar el nodo anterior al el.
     * @return Retorna el nodo anterior a el.
     */
    public Nodo getAnterior(){
        return anterior;
    }
    
    /**
     * Metodo que permite cambiar cual es el nodo anterior a el.
     * @param anterior Es el nuevo nodo anterior a el.
     */
    public void setAnterior(Nodo anterior){
        this.anterior = anterior;
    }
    
    /**
     * Metodo que permite consultar el nodo siguiente a el.
     * @return Retorna el nodo siguiente a el.
     */
    public Nodo getSiguiente(){
        return siguiente;
    }
    
    /**
     * Metodo que permite cambiar cual es el nodo siguiente a el.
     * @param siguiente Es el nuevo nodo siguiente a el.
     */
    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
    
}
