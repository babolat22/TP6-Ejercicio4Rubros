/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Admin
 */
public class Producto implements Comparable<Producto>{
    private int codigo;
    private String descripcion;
    private double precio;
    private String rubro;
    private int stock;

    public Producto() {
    }

    public Producto(int codigo, String descripcion, double precio, String rubro, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.rubro = rubro;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", rubro=" + rubro + ", stock=" + stock + '}';
    }
 
public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Producto p) {
       return codigo-p.codigo;
    }
    
    
}
