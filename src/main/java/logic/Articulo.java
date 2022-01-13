
package logic;

import java.io.Serializable;


public class Articulo implements Serializable{
    
    private int codigo, unidades;
    private String nombre;
    private double precioCosto;
    
   
   

    
    public Articulo(){
        
    }

    public Articulo(int codigo, String nombre, double precioCosto, int unidades) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioCosto = precioCosto;
        this.unidades=unidades;
    }
    
    
    //_____________________
    
    public int getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public double getPrecioCosto(){
        
        return precioCosto;
    }
    public int getUnidades(){
        return unidades;
    } 
     
    //_________________________________________________________
     
    public void setCodigo(int cod){
        this.codigo=cod;
    }
    public void setNombre(String nom){
        this.nombre=nom; 
    }
    public void setPrecioCosto(double preC){
        this.precioCosto=preC;
    }
    public void setUnidades(int unidades){
        this.unidades=unidades;
    }
    //__________________________________________________________

    public double precioVenta(){
        return precioCosto + precioCosto * 0.2; //el valor + el 20 %
    }
        public boolean estaVencido(Fecha f){
        return false;
    }

    
    public String toString() {
        return "Articulo :\n" + " codigo=" + codigo +
                "\n nombre=" + nombre +
                "\n precioCosto=" + precioCosto +
                "\n unidades=" + unidades ;
    }
   
      
    
    
}
