/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryOperaciones;

/**
 *
 * @author LN710Q
 */
public class Resta implements Operaciones {
     @Override
    public void operar(){}
    public int resta(int a,int b,int c){
          c=a-b;
          return c;
    }
}