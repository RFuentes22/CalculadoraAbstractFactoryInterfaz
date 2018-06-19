/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculabo;

import Aritmetica.FactoryAritmetica;
import Conversor.FactoryConversor;

/**
 *
 * @author LN710Q
 */
public class operacionProducer {
     public static AbstractFactory getOperacion(String type){
        switch (type){
            case "o":
                return  new FactoryAritmetica();
            case "c":
                return new FactoryConversor();
        }
        return null;
    }
}
