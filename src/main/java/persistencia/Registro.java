/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;
import java.io.*;
import logic.Productos;

/**
 *
 * @author Jose
 */
public class Registro {
    
    private String path;
    private static Registro instancia;
    
    
    private Registro() {
        path = "productos.dat";
    }
    
    public static Registro getInstancia() {
        if(instancia == null) {
            instancia = new Registro();
        }
        return instancia;
    }
    
    public void setArchivo(Productos p) {
        try {
            // Abro el archivo
            FileOutputStream f = new FileOutputStream(path);
            ObjectOutputStream o = new ObjectOutputStream(f);
            
            // Actualizo la informacion en el archivo
            o.writeObject(p);
            //Cierro el archivo
            f.close();
            o.close();
        } catch(Exception ex) {
            System.err.println(ex);
        }
    }
    
    public Productos getArchivo() {
        Productos p = new Productos();
        
        try {
            System.out.println("a");
            FileInputStream f = new  FileInputStream(path);
            System.out.println("b");
            ObjectInputStream o = new ObjectInputStream(f);
            System.out.println("c");
            // Actualizo la informacion en el archivo
            p = (Productos) o.readObject();
            
            //System.out.println(p);
            
            o.close();
            f.close();
        } catch(Exception ex) {
            System.err.println("Se genera el archivo productos.dat");
        }
        return p;
    }
    
    public void eliminarLista(){
        
    }
}
