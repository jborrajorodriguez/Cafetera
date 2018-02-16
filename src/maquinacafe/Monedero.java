package maquinacafe;

import maquinacafe.Display;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Monedero {

    private float credito, precio, cambio;

    public Monedero() {
    }

    public Monedero(float credito,float precio,float cambio) {
        this.credito=credito;
        this.precio=precio;
        this.cambio=cambio;
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito=credito;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio=precio;
    }

    public float getCambio() {
        return cambio;
    }

    public void setCambio(float cambio) {
        this.cambio=cambio;
    }

    public boolean inDinero(float dinero) {
        boolean b;
        if (dinero==1) {
            System.out.println("Dinero exacto");
            return b=true;
        }
        else if (dinero>1) {
            System.out.println("Elige producto y espere el cambio");
            return b=true;

        }
        else {
            cambio=1-dinero;
            System.out.println("Dinero insuficiente\n Tiene que añadir : "+cambio);
            return b=false;
        }
        

    }
    

}
