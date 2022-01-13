/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author David
 */
public class Productos implements Serializable{
    
    private ArrayList<Articulo> lista;
    
    //..........................................

    public Productos() {
        lista=new ArrayList<>();
    }
    //add contains remove get size tostring
    
    public void insertar(Articulo a){
        lista.add(a);
    }
    
    public void eliminar(Articulo a){
        lista.remove(a);
    }
    
    public boolean pertenece(Articulo a){
        boolean pertenece;
        if(lista.contains(a)==true){
            return true;
        }
        return false;
    }
    
    public Articulo devolver(int i){
        return lista.get(i);
    }
    
    public int cantidad(){
        return lista.size();
    }
    //...............ESPECIFICOS..........................
    
    public boolean isOcupado(int cod) {
        boolean ocupado=false;
        
        for(Articulo a:lista){
            
            if(a.getCodigo()==cod){
                ocupado=true;
            }
        }
        
        return ocupado;
        
    }
    
    public Articulo buscarPorCodigo(int codigo){
        for(Articulo actual :lista){
            if(actual.getCodigo()==codigo){
                return actual;
            }
         }
        Articulo a=new Articulo();
        a.setNombre("ARTICULO NO ENCONTRADO");
        return a;
    }
    
    //_________________________________________________
    
    public int contarImportados(){
        int cantImp=0;
        for(Articulo actual:lista){
            if(actual instanceof Importado){ //si el articulo actual es de clase importado
                cantImp++;
            }
        }
        return cantImp;
    }
    //_________________________________________________
    public void borrarTodos(){
        for(Articulo actual: lista){
            lista.remove(actual);
        }
    }
    
    //_________________________________________________
    
    public Articulo masCaro(){
        Articulo masCaro=lista.get(0);
        
        for(Articulo actual:lista){            
            if(actual.getPrecioCosto()>masCaro.getPrecioCosto()){ //calcula si el articulo actual tiene menos valor de venta q el siguiente
                masCaro=actual;
            }
        }//for
     
        return masCaro;
    }
    
    //_________________________________________________
    
    public double costoTotal(){  //todos los precioCosto sumados, de todos los articulos 
        double suma=0;
        for(Articulo actual:lista){
            suma += actual.getPrecioCosto();
        }
        
        return suma;
    }
    //_________________________________________________
    
    public String toString(){ //info de los ariculos,cantidad de articulos, y costo total
        
        //para la consola:
        System.out.println("________________________PRODUCTOS________________________\n\n\n"+
                "Cantidad de Articulos: "+lista.size()+  
                "\nCosto Total: "+costoTotal()+"\n");
        
        //para text areas:
        String cadena="";
        
                
        for(Articulo actual:lista){ //acumula toString de articulos
            cadena+=actual.toString()+"\n\n------ --------- ------\n\n";
        }
        
        
        
       
        return "________________________PRODUCTOS________________________\n\n\n"+
                "|-------------------         -------------------|"+
                "\n            Cantidad de Articulos: "+lista.size()+  
                "\n            Costo Total: "+costoTotal()+
                "\n|-------------------         -------------------|"+
                "\n\n"+
                cadena; 
    }

    
    
}
