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
    
    private static LinkedList lista;
    private double media;
    private double dEstandar;
    private double sumatoria;
    private double sumatoriaDEstandar;
    
    public Calculadora(){
        lista = new LinkedList();
    }
    
    /**
     * Metodo que calcula la sumatoria de todos los elementos de la linkedList
     * @param lista
     * @return Retorna la suma de todos los elementos de la linkedList
     */
    private double calcularSumatoria(LinkedList lista){
        sumatoria = 0;
        for(int i=0; i<lista.size();i++){
            sumatoria = sumatoria + lista.get(i).getValor();
        }
        return sumatoria;
    }
    
    /**
     * Metodo que permite calcular la sumatoria de la diferencia entre cada elemento de la linkedList y su media al cuadrado.
     * @param lista
     * @return Retorna la sumatoria de la diferencia entre cada elemento de la linkedList y su media al cuadrado.
     */
    private double calcularSumatoriaDEstandar(LinkedList lista){
        sumatoriaDEstandar = 0;
        for(int i=0; i<lista.size();i++){
            sumatoriaDEstandar = sumatoriaDEstandar + Math.pow(lista.get(i).getValor() - media , 2);
        }
        return sumatoriaDEstandar;
    }
    
    /**
     * Metodo que permite el calcular la media de los valores dados.
     * @param lista
     * @return Retorna la media de los valores dados.
     */
    public double calcularMedia(LinkedList lista){
        media = 0;
        media = calcularSumatoria(lista)/lista.size();
        return media;
    }
    
    /**
     * Metodo que permite calcular la desviacion estandar de los valores dados.
     * @param lista
     * @return Retorna la desviacion estandar de los valores dados.
     */
    public double calcularDesviacionEstandar(LinkedList lista){
        dEstandar = 0;
        calcularMedia(lista);
        calcularSumatoriaDEstandar(lista);
        dEstandar = Math.sqrt(sumatoriaDEstandar/(lista.size()-1));
        return dEstandar;
    }
    
}
