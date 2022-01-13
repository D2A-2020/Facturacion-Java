
package logic;
//un tipo de articulo
public class Importado extends Articulo {
    
    
    private double impuesto;
    private int anoImportacion;

    public Importado() {
    }

    public Importado(double impuesto, int anoImportacion, int codigo, String nombre, double precioCosto, Fecha vencimiento, int unidades) {
        super(codigo, nombre, precioCosto, unidades);
        this.impuesto = impuesto;
        this.anoImportacion = anoImportacion;
    }

    
    
   

  
    


    public double getImpuesto() {
        return impuesto;
    }
    //____________________________________
    
    public void setImpuestoAduana(double impuestoAduana) {
        this.impuesto = impuestoAduana;
    }
    //____________________________________
    
    public int getAnoImportacion() {
        return anoImportacion;
    }
    //____________________________________
    
    public void setAnoImportacion(int anoImportacion) {
        this.anoImportacion = anoImportacion;
    }

    //...........................................
    public double precioVenta(){
        double venta= super.precioVenta();
        
        if(this.anoImportacion<=2008){
            venta= venta + impuesto *1.8; //si es un articulo muy viejo aumenta el precio 80%
        }else{
            venta= venta + impuesto*2;  //si es reciente se cobra mas
        }
        
        
        return venta;
    }
    
    @Override
    public String toString() {
        return  super.toString()+"\n   Caracteristicas\n   de Importacion: " +
                "\n    impuestoAduana=" + impuesto
                + "\n    anoImportacion=" + anoImportacion +
                "\n    precio de venta: "+this.precioVenta() ;
    }   //super.toString trae todos los valores de la clase madre para no escribirlos de nuevo
    
    

    
}
