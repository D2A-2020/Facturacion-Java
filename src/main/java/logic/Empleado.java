
package logic;




public class Empleado extends Persona{

    
    private Fecha antiguedad;
    private int categoria;
    private String pass;
    
    //______________________________________________________
    
   public Empleado() {
    }
    public Empleado(int CI, String apellido,Fecha antiguedad, int categoria) {
        super(CI, apellido);
        this.antiguedad = antiguedad;
        this.categoria = categoria;
    }

    public Empleado(Fecha antiguedad, int categoria, int CI, String apellido, String pass) {
        super(CI, apellido);
        this.antiguedad = antiguedad;
        this.categoria = categoria;
        this.pass=pass;
    }
    
    //_____________Setters_________________________________________

    public void setAntiguedad(Fecha antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    public void setPass(String pass){
        this.pass=pass;
    }

    ////____________Getters_________________________________________
    public Fecha getAntiguedad() {
        return antiguedad;
    }

    public int getCategoria() {
        return categoria;
    }
    public String getPass(){
        return pass;
    }
    //______________________________________________________
    
     @Override
    public String toString() {
        //no imprimo contrasena porque apareceria en el ticket
        return super.toString()+"\n---Empleado" + "antiguedad=" + antiguedad + ", categoria=" + categoria ;
    }
}
