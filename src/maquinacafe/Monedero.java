package maquinacafe;

import javax.swing.JOptionPane;
import maquinacafe.Display;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Monedero {

    private static float credito, precio=1, cambio;

    public Monedero() {
    }

    public static float getCredito() {
        return credito;
    }

    public static void setCredito(float credito) {
        Monedero.credito=credito;
    }

    public static float getPrecio() {
        return precio;
    }

    public static void setPrecio(float precio) {
        Monedero.precio=precio;
    }

    public static float getCambio() {
        return cambio;
    }

    public static void setCambio(float cambio) {
        Monedero.cambio=cambio;
    }

    public static boolean inDinero(float dinero) {
        boolean b;
        if (dinero==precio) {
            System.out.println("Dinero exacto");
            return b=true;
        }
        else if (dinero>precio) {
            System.out.println("Elige producto y espere el cambio");
            return b=true;

        }
        else {
            cambio=precio-dinero;
            System.out.println("Dinero insuficiente\n Tiene que añadir : "+cambio);
            return b=false;
        }

    }

    public static float devolverDineroDeMas() {
        float total=0;
        if (credito>precio) {
            total=credito-precio;
        }
        return total;

    }
    public static float añadirMasDinero(){
        float mas=0;
        if(credito<precio){
            while(credito<precio){
            Display.mostrarCredito();
            mas=Float.parseFloat(JOptionPane.showInputDialog("Añada mas dinero"));
            credito=credito+mas;
            Display.mostrarCredito();
                    }
        }return credito;
    }

}
