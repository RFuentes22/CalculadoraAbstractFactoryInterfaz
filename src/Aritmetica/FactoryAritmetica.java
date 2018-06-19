/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetica;

import Conversor.Conversor;
import calculabo.AbstractFactory;

/**
 *
 * @author LN710Q
 */
public class FactoryAritmetica implements AbstractFactory{
    
    
    
    
    @Override
    public Aritmetica getAritmetica(String type){
        switch(type){
            case"+":
                return new Suma();
            case "-":
                return new Resta();
            case "*":
                return new Multiplicacion();
            case "/":
                return new Division();
        }
        return null;
    }

    @Override
    public Conversor getConversor(String type) {
        return null;
    }
    

}
