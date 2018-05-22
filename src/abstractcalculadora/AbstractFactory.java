/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractcalculadora;

import FactoryOperaciones.FactoryOperaciones;
import GUI.Gui;

/**
 *
 * @author LN710Q
 */
public interface AbstractFactory {
   
   FactoryOperaciones getOperaciones(String type);
   new Gui().setVisible(true);
}
