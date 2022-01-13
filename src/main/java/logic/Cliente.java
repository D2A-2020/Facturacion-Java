
package logic;


public class Cliente extends Persona{
    private boolean preferencial;

    public Cliente() {
    }


    public Cliente(boolean preferencial, int CI, String nombre) {
        super(CI, nombre);
        this.preferencial = preferencial;
    }

    public boolean isPreferencial() {
        return preferencial;
    }

    public void setPreferencial(boolean preferencial) {
        this.preferencial = preferencial;
    }

    @Override
    public String toString() {
        return super.toString()+"\n---Cliente: " + "preferencial=" + preferencial ;
    }

    
    
    
}
