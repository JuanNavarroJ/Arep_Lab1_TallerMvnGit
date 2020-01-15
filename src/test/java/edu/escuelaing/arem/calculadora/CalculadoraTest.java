/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.calculadora;

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
        assertTrue(cal.calcularMedia() == 638.9);
    }
    
    @Test
    public void deberiaSacarLaDesviacionEstandar() {
        Calculadora cal = new Calculadora();
        assertTrue(cal.calcularDesviacionEstandar() == 625.6339806770231);
    }

}
