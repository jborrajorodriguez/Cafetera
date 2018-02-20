package maquinacafe;

import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Display {
    //private static float credito;
    /**
     * Metodo estatico dineroIN que devuelve un valor float.
     * @return un valor de tipo float.
     */
    public static float dineroIN(){
        Monedero.setCredito(Float.parseFloat(JOptionPane.showInputDialog("Introduce el dinero")));
        return Monedero.getCredito();
    }
    /**
     * Metodo productoAcabado que recibe un boolean.
     * Si el boolean es verdadero devuelve un mesaje y si es falso devuelve otro.
     * @param a de tipo boolean.
     */
    public void productoAcabado(boolean a){
        if(a==true){
            JOptionPane.showMessageDialog(null,"Retire Producto");
        }else{System.out.println("....");}
    }
    /**
     * Metodo estatico visualizarVueltaCompletado que recibe un valor de tipo float y no devuelve nada.
     * @param a de tipo float
     */
    public static void visualizarVueltaCompletado(float a){
        JOptionPane.showMessageDialog(null,"Aqui tiene su vuelta "+a+" €");
    }
    /**
     * Metodo estatico mostrarCredito que no recibe nada y devuelve un valor de tipo float
     * @return un valor de tipo float.
     */
    public static float mostrarCredito(){
        JOptionPane.showMessageDialog(null,"Actualmente hay "+Monedero.getCredito());
        return Monedero.getCredito();
    }

}
