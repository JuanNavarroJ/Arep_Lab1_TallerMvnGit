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
        
        Nodo n1 = new Nodo(186.0,0,null,null);
        lista.add(n1);
        Nodo n2 = new Nodo(699.0,0,null,null);
        lista.add(n2);
        Nodo n3 = new Nodo(132.0,0,null,null);
        lista.add(n3);
        Nodo n4 = new Nodo(272.0,0,null,null);
        lista.add(n4);
        Nodo n5 = new Nodo(291.0,0,null,null);
        lista.add(n5);
        Nodo n6 = new Nodo(331.0,0,null,null);
        lista.add(n6);
        Nodo n7 = new Nodo(199.0,0,null,null);
        lista.add(n7);
        Nodo n8 = new Nodo(1890.0,0,null,null);
        lista.add(n8);
        Nodo n9 = new Nodo(788.0,0,null,null);
        lista.add(n9);
        Nodo n10 = new Nodo(1601.0,0,null,null);
        lista.add(n10);
        
        
        assertTrue(true);
        assertTrue(cal.calcularMedia(lista) == 638.9);
    }
    
    @Test
    public void deberiaSacarLaDesviacionEstandar() {
        Calculadora cal = new Calculadora();
        LinkedList lista = new LinkedList();
        Nodo n1 = new Nodo(186.0,0,null,null);
        lista.add(n1);
        Nodo n2 = new Nodo(699.0,0,null,null);
        lista.add(n2);
        Nodo n3 = new Nodo(132.0,0,null,null);
        lista.add(n3);
        Nodo n4 = new Nodo(272.0,0,null,null);
        lista.add(n4);
        Nodo n5 = new Nodo(291.0,0,null,null);
        lista.add(n5);
        Nodo n6 = new Nodo(331.0,0,null,null);
        lista.add(n6);
        Nodo n7 = new Nodo(199.0,0,null,null);
        lista.add(n7);
        Nodo n8 = new Nodo(1890.0,0,null,null);
        lista.add(n8);
        Nodo n9 = new Nodo(788.0,0,null,null);
        lista.add(n9);
        Nodo n10 = new Nodo(1601.0,0,null,null);
        lista.add(n10);
        
        assertTrue(cal.calcularDesviacionEstandar(lista) == 625.6339806770231);
    }

}
