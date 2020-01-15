/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.calculadora;

//import edu.escuelaing.arem.linkedList.LinkedList;

import java.util.*; 

/**
 *
 * @author Juan David
 */
public class Calculadora {
    
    //Atributos
    
    private LinkedList lista1;
    private ArrayList<Double> lista = new ArrayList<Double>( );
    private double media;
    private double dEstandar;
    private double sumatoria;
    private double sumatoriaDEstandar;
    
    public Calculadora(){
        lista.add(186.0);
        lista.add(699.0);
        lista.add(132.0);
        lista.add(272.0);
        lista.add(291.0);
        lista.add(331.0);
        lista.add(199.0);
        lista.add(1890.0);
        lista.add(788.0);
        lista.add(1601.0);
    }
    
    /**
     * Metodo que calcula la sumatoria de todos los elementos de la linkedList
     * @return Retorna la suma de todos los elementos de la linkedList
     */
    private double calcularSumatoria(){
        sumatoria = 0;
        for(int i=0; i<lista.size();i++){
            sumatoria = sumatoria + lista.get(i);
        }
        return sumatoria;
    }
    
    /**
     * Metodo que permite calcular la sumatoria de la diferencia entre cada elemento de la linkedList y su media al cuadrado.
     * @return Retorna la sumatoria de la diferencia entre cada elemento de la linkedList y su media al cuadrado.
     */
    private double calcularSumatoriaDEstandar(){
        sumatoriaDEstandar = 0;
        for(int i=0; i<lista.size();i++){
            sumatoriaDEstandar = sumatoriaDEstandar + Math.pow(lista.get(i) - media , 2);
        }
        return sumatoriaDEstandar;
    }
    
    /**
     * Metodo que permite el calcular la media de los valores dados.
     * @return Retorna la media de los valores dados.
     */
    public double calcularMedia(){
        media = 0;
        media = calcularSumatoria()/lista.size();
        return media;
    }
    
    /**
     * Metodo que permite calcular la desviacion estandar de los valores dados.
     * @return Retorna la desviacion estandar de los valores dados.
     */
    public double calcularDesviacionEstandar(){
        dEstandar = 0;
        calcularMedia();
        calcularSumatoriaDEstandar();
        dEstandar = Math.sqrt(sumatoriaDEstandar/(lista.size()-1));
        return dEstandar;
    }
    
}
