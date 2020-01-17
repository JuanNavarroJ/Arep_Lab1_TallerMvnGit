/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.linkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Juan David
 */
public class LinkedList implements List {
    
    //Atributos
    
    private int size;
    private Nodo nodoPrimero;
    private Nodo nodoUltimo;
    private int posicion;
    
    public LinkedList (){
        this.size = 0;
        this.posicion = 0;
    }
    
    /**
     * Metodo que permite agregar un nodo.
     * @param nodo
     */
    public void agregarNodo(Nodo nodo){
        if(nodoPrimero.equals(null)){
            this.nodoPrimero = nodo;
            size += 1;
            posicion +=1;
            if(nodoUltimo.equals(null)){
                this.nodoUltimo = nodo;
            }
        }else{
            
            nodoPrimero.setSiguiente(nodo);
            this.nodoUltimo = nodo;
            size += 1;
            posicion +=1;
        }
    }
    
    /**
     * Metodo que permite eliminar un nodo.
     */
    public void eliminarNodo(){
        
    }
    
    /**
     * Medoto que permite cambiar al siguiente nodo.
     */
    public void siguienteNodo(){
        
    }
    
    /**
     * Metodo que permite cambiar al nodo anterior.
     */
    public void anteriorNodo(){
        
    }
    
    /**
     * Metodo que permite obtener el tamaño de la linked list
     * @return Retorna el tamaño de la lista
     */
    public int size(){
        return size;
    }
    
    /**
     * Metodo que permite obtener el numero que se encuentra en un indece dado.
     * @param index Es el indice en el cual se quiere buscar dentro de la linked list.
     * @return Retorna el numero ubicado en el indice dado.
     */
    public Nodo get(int index){
        return null;
    }

    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean add(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object set(int index, Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void add(int index, Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object[] toArray(Object[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean addAll(int index, Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ListIterator listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ListIterator listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
