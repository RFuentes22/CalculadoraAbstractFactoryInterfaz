/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

import Aritmetica.Aritmetica;
import calculabo.AbstractFactory;

/**
 *
 * @author LN710Q
 */
public class FactoryConversor implements AbstractFactory{

    @Override
    public Aritmetica getAritmetica(String type) {
       return null;
    }

    @Override
    public Conversor getConversor(String type) {
        switch (type){
            case "b":
                return new Binario();
            case "h":
                return new Hexadecimal();
            case "o":
                return new Octa();
        }
        return null;
    }
    
}
