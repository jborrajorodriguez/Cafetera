package maquinacafe;

import java.util.ArrayList;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Producto {

    private float precio;
    private int azucar=0;
    private String nombre;

    public Producto() {
    }

    public Producto(float precio,int azucar,String nombre) {
        this.precio=precio;
        this.azucar=azucar;
        this.nombre=nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio=precio;
    }

    public int getAzucar() {
        return azucar;
    }

    public void setAzucar(int azucar) {
        this.azucar=azucar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public void productos(int x,int azucar,ArrayList<Producto> lis) {
        lis.add(new Producto(1,azucar,"Cafe"));
        lis.add(new Producto(1,azucar,"Chocolate"));
        lis.add(new Producto(1,azucar,"Te"));

    }

    @Override
    public String toString() {
        return "Producto{"+"precio="+precio+", azucar="+azucar+", nombre="+nombre+'}';
    }

    public boolean elaborar(boolean b) {
        boolean productoAcabado;
        if (b==true) {
            System.out.println("Elaborando Producto\n*****\n*****\n*****\n*****\nProducto Elaborado");
            return productoAcabado=true;
        }
        else {
            return productoAcabado=false;
        }

    }

}
