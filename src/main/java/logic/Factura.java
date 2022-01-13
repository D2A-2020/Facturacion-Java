
package logic;
import static grafica.FormPrincipal.listaP;


public class Factura {
    private Productos venta;
    private Fecha realizada;
    private Empleado vendedor;
    private Cliente comprador;
    

    public Factura() {
        venta = new Productos();
        realizada = new Fecha();
        vendedor = new Empleado();
        comprador = new Cliente();
    }

    public Factura(Productos venta, Fecha realizada, Empleado vendedor, Cliente comprador) {
        this.venta = venta;
        this.realizada = realizada;
        this.vendedor = vendedor;
        this.comprador = comprador;
        
    }
    //mismo constructor pero sin intruducir una fecha
    public Factura(Productos venta, Empleado vendedor, Cliente comprador) {
        this.venta = venta;
        this.vendedor = vendedor;
        this.comprador = comprador;
        
    }
////____________Getters_________________________________________
    public Productos getVenta() {
        return venta;
    }

    public Fecha getRealizada() {
        return realizada;
    }

    public Empleado getVendedor() {
        return vendedor;
    }

    public Cliente getComprador() {
        return comprador;
    
    }
////____________Setters_________________________________________
    public void setVenta(Productos venta) {
        this.venta = venta;
    }

    public void setRealizada(Fecha realizada) {
        this.realizada = realizada;
    }

    public void setVendedor(Empleado vendedor) {
        this.vendedor = vendedor;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

   //______Especificos____________________________________________________________
    
    public double impuestoIva(){
        double impuestoIVA=  venta.costoTotal()*0.22; //iva es 22%                    
        return impuestoIVA;
    }
    public double subTotal(){
        double subTotal=venta.costoTotal();
        return subTotal;
    }
    public double totalVenta(){
        return subTotal()+impuestoIva();
    }

    @Override
    public String toString() {
        return  "________________________________________________\n"+
                " _-_-_-_-_-_-_-_-_-_FACTURA_-_-_-_-_-_-_-_-_-_\n"+
                "________________________________________________"+
                "\n\n \t\t...(venta)...\n" + venta +
                "\n_____________...(fin venta)..._____________\n\n"+
                "\n realizada=" + realizada +
                "\n vendedor=" + vendedor +
                "\n------------------------"+
                "\n comprador=" + comprador +
                "\n------------------------"+
                "\n impuesto IVA=" + impuestoIva()+ //devuelve lo que retorna el metodo al realizarse
                "\n subtotal=" + subTotal()+
                "\n------------------------"+
                "\n total venta=" + totalVenta()+
                "\n\n_____________...(fin factura)..._____________\n\n";
                
        
    }

    
    
}
