/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.calculadora;

import edu.escuelaing.arem.linkedList.LinkedList;
import edu.escuelaing.arem.linkedList.Nodo;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Juan David
 */
public class CalculadoraTest {

    @Test
    public void deberiaSacarMedia() {
        Calculadora cal = new Calculadora();
        LinkedList lista = new LinkedList();
        assertTrue(cal.calcularMedia(lista) == 638.9);
    }
    
    @Test
    public void deberiaSacarLaDesviacionEstandar() {
        Calculadora cal = new Calculadora();
        LinkedList lista = new LinkedList();
        assertTrue(cal.calcularDesviacionEstandar(lista) == 625.6339806770231);
    }
    
    @Test
    public void deberiaCrearUnaLinkedList(){
        LinkedList lista = new LinkedList();
        Nodo n1 = new Nodo(186.0,null,null);
        lista.agregarNodo(n1);
        Nodo n2 = new Nodo(699.0,null,null);
        Nodo n3 = new Nodo(132.0,null,null);
        Nodo n4 = new Nodo(272.0,null,null);
        Nodo n5 = new Nodo(291.0,null,null);
        Nodo n6 = new Nodo(331.0,null,null);
        Nodo n7 = new Nodo(199.0,null,null);
        Nodo n8 = new Nodo(1890.0,null,null);
        Nodo n9 = new Nodo(788.0,null,null);
        Nodo n10 = new Nodo(1601.0,null,null);
        
    }

}
