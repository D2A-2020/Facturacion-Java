/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.Scanner;


/**
 *  
 * @author David
 */
public class Persona {
   private int CI;
   private String apellido;
   
   
   Persona(){
      
   }

    Persona(int CI, String apellido ) {
        this.CI = CI;
        this.apellido=apellido;
   
    }
   
   
 
   public String getApellido(){
       return this.apellido;
   }
    public int getCI(){
       return this.CI;
   }
    
   //_____________________________________________________________
    
   public void setApellido(String apellido){
       this.apellido=apellido;
   }
   public void setCI(int ci){
       this.CI=ci;
   }

    @Override
    public String toString() {
        return "P: " + "CI=" + CI + ", apellido=" + apellido;
    }
   
  
}
