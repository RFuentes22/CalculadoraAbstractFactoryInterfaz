/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryOperaciones;

import abstractcalculadora.AbstractFactory;

/**
 *
 * @author LN710Q
 */
public class FactoryOperaciones implements AbstractFactory{
      @Override
    public FactoryOperaciones getOperaciones(String type) {
        return null;
    }

    @Override
    public Operaciones getElfos(String type) {
        switch (type) {
            case "suma":
                return new suma();
            case "resta":
                return new resta();
            case "multiplicacion":
                return new multiplicacion();
            case "multiplicacion":
                return new multiplicacion();
                
        }
        return null;
    }
    
}
