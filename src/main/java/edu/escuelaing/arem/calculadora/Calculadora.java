/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.calculadora;

import edu.escuelaing.arem.linkedList.LinkedList;

/**
 *
 * @author Juan David
 */
public class Calculadora {
    
    //Atributos
    
    private LinkedList lista;
    private double media;
    private double destandar;
    private double sumatoria;
    
    public double calcularSumatoria(){
        sumatoria = 0;
        for(int i=0; i<lista.size();i++){
            sumatoria = sumatoria + lista.getNumber(i);
        }
        return sumatoria;
    }
    
    /**
     * Metodo que permite el calcular la media de los valores dados.
     * @return Retorna la media de los valores dados.
     */
    public double calcularMedia(){
        media = calcularSumatoria()/lista.size();
        return media;
    }
    
    /**
     * Metodo que permite calcular la desviacion estandar de los valores dados.
     * @return Retorna la desviacion estandar de los valores dados.
     */
    public double calcularDesviacionEstandar(){
        
        return destandar;
    }
    
}
