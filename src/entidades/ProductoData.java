/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import vistas.Principal;
import java.util.HashSet;
import java.util.TreeSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ProductoData {

    public ProductoData() {
    }
   

    
    public void agregarProducto(Producto prod){
       if (Principal.getLista().add(prod)){
          JOptionPane.showMessageDialog(null,"producto agregado ");
        }
          else {
          JOptionPane.showMessageDialog(null,"producto No agregado ");
        }
    }
    public void modificarProducto(Producto prod){
    boolean esta=false;
    for( Producto p: Principal.getLista()){
     if  (prod.getCodigo()==p.getCodigo()){
         p.setDescripcion(prod.getDescripcion());
         p.setPrecio(prod.getPrecio());
         p.setRubro(prod.getRubro());
         p.setStock(prod.getStock());
         Principal.getLista().add(p);
         esta=true;
         break;
     }
     
   }
    if (!esta){
     JOptionPane.showMessageDialog(null, "El producto con ese codigo no Existe");
    }
    
    }
    
    public Producto buscarProducto(int codigo){
    Producto prod= new Producto();
    prod=null;
    for( Producto p: Principal.getLista()){
     if  (codigo==p.getCodigo()){
         prod=p;            
     }
   }
    
   return prod;
    }
    
    public void eliminarProd(Producto prod){
    
    for( Producto p: Principal.getLista()){
     if  (prod.getCodigo()==p.getCodigo()){
         Principal.getLista().remove(prod);
         JOptionPane.showMessageDialog(null,"producto eliminado!!! ");
     
     }
    
    }
    
}
}