package maquinacafe;

import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Display {
    //private static float credito;
    
    public static float dineroIN(){
        Monedero.setCredito(Float.parseFloat(JOptionPane.showInputDialog("Introduce el dinero")));
        return Monedero.getCredito();
    }
    
    public void productoAcabado(boolean a){
        if(a==true){
            JOptionPane.showMessageDialog(null,"Retire Producto");
        }else{System.out.println("Esperando");}
    }
    
    public static void visualizarVueltaCompletado(float a){
        JOptionPane.showMessageDialog(null,"Aqui tiene su vuelta "+a+" €");
    }
    
    public static float mostrarCredito(){
        JOptionPane.showMessageDialog(null,"Actualmente hay "+Monedero.getCredito());
        return Monedero.getCredito();
    }

}
