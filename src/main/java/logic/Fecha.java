/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.io.Serializable;

/**
 *
 * @author David
 */
public class Fecha implements Serializable{
    private int dia,mes,ano;
    private String cadenaFecha;
    
    public Fecha(){ //constructor vacio, inicializa todo en null o 0
    }
    public Fecha(int d,int m, int a){ //constructor especifico
        dia=d;
        mes=m;
        ano=a;
    }
        
    //-----------------------------
    public void setDia(int d){
        dia=d;
    }
    
    public int getDia(){
        return dia;
    }
    //-----------------------------
    public void setMes(int m){
        mes=m;
    }
    
    public int getMes(){
        return mes;
    }
    //-----------------------------
    public void setAno(int a){
        ano=a;
    }
    
    public int getAno(){
        return ano;
    }
    //------------............-----------------
    
    //------------............-----------------
    public String toString(){
        
        cadenaFecha = dia + " | " + mes + " | " + ano;
      
       return cadenaFecha;
    }
    
}
    
