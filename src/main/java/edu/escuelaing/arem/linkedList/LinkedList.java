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
public class LinkedList implements List<Nodo> {

    //Atributos
    private int size;
    private Nodo nodoPrimero;
    private Nodo nodoUltimo;

    public LinkedList() {
        this.size = 0;
    }

    /**
     * Metodo que permite obtener el tamaño de la linked list
     *
     * @return Retorna el tamaño de la lista
     */
    public int size() {
        return size;
    }

    /**
     * Metodo que permite obtener el numero que se encuentra en un indece dado.
     *
     * @param index Es el indice en el cual se quiere buscar dentro de la linked
     * list.
     * @return Retorna el numero ubicado en el indice dado.
     */
    public Nodo get(int index) {
        Nodo buscar = nodoPrimero;
        boolean encontrado = false;
        while (!encontrado) {
            if (buscar.getPosicion() == index) {
                encontrado = true;
            } else {
                buscar = buscar.getSiguiente();
            }
        }
        return buscar;
    }
    
    public Nodo getPrimerNodo(){
        return nodoPrimero;
    }
    
    public Nodo getUltimoNodo(){
        return nodoUltimo;
    }

    public boolean add(Nodo nodo) {
        if (nodoPrimero == null) {
            nodoPrimero = nodo;
            nodoUltimo = nodo;
            nodo.setPosicion(size);
            size += 1;

        } else {
            nodoUltimo.setSiguiente(nodo);
            nodo.setAnterior(nodoUltimo);
            nodo.setPosicion(size);
            nodoUltimo = nodo;
            size += 1;
        }
        return true;
    }
    
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Iterator<Nodo> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean addAll(Collection<? extends Nodo> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean addAll(int index, Collection<? extends Nodo> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Nodo set(int index, Nodo element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void add(int index, Nodo element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Nodo remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ListIterator<Nodo> listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ListIterator<Nodo> listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Nodo> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
