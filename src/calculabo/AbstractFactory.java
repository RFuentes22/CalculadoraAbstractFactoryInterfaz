/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculabo;

import Aritmetica.Aritmetica;
import Conversor.Conversor;

/**
 *
 * @author LN710Q
 */
public interface AbstractFactory {
    Aritmetica getAritmetica(String type);
    Conversor getConversor(String type);
    
}
