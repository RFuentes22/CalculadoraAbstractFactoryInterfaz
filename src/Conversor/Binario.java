/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

/**
 *
 * @author LN710Q
 */
public class Binario implements Conversor{

    @Override
    public String Convertir(int var) {
        return Integer.toBinaryString(var);
    }
    
    
}
