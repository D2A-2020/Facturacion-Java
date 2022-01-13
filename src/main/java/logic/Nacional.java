/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;


/**
 *
 * @author David
 */
public class Nacional extends Articulo {
    
    private boolean subsidiado; //mantiene precio venta original
    private String departamento;

    public Nacional() {
    }

    public Nacional(boolean subsidiado, String departameto, int codigo, String nombre, double precioCosto, Fecha vencimiento, int unidades) {
        super(codigo, nombre, precioCosto, unidades);
        this.subsidiado = subsidiado;
        this.departamento = departameto;
    }
    
    

   

    //..................................
    
    public boolean getSubsidiado() {
        return subsidiado;
    }

    public String getDepartameto() {
        return departamento;
    }
    
    //............................

    public void setSubsidiado(boolean subsidiado) {
        this.subsidiado = subsidiado;
    }

    public void setDepartamento(String departameto) {
        this.departamento = departameto;
    }
    //......................................

     public double precioVenta(){
        double venta = super.precioVenta(); //con subsdio mantiene precio original
        
        
        if(subsidiado==false){ 
            if(departamento=="Montevideo"){ //departamento.equals("Montevideo")
                venta= venta*1.15;
            } else{// es del interior 
                venta= venta* 1.10; //favorece a los productos del interior
            }
        }
        
        
        return venta;
    }
     
    @Override
    public String toString() {
        return super.toString() + "\n  Caracteristicas\n  de Nacional: \n   subsidiado=" + subsidiado 
                                + "\n   departameto=" + departamento 
                                + "\n   precioVenta: " + precioVenta();
    }
    
    

    
   

    }
    
    
    

