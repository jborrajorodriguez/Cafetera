package maquinacafe;

import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Display {
    
    public float dineroIN(){
        float dinero=Float.parseFloat(JOptionPane.showInputDialog("Introduce el dinero"));
        return dinero;
    }
    
    public void productoAcabado(boolean a){
        if(a==true){
            JOptionPane.showMessageDialog(null,"Retire Producto");
        }else{System.out.println("Esperando");}
    }

}
