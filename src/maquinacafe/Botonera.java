package maquinacafe;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Botonera {

    private final int cafe=0, te=1, chocolate=2;
    private final int mas=2;
    private final int menos=1;

    public static int selecAzu() {
        int x=Integer.parseInt(JOptionPane.showInputDialog("Quieres mas o menos azucar?"));
        int azucar=0;
//        if(x>=mas){
//            azucar=1;
//        }else azucar=0;
        return azucar;
    }

    public boolean elegirProducto(ArrayList<Producto> producto,boolean b) {
        int opcion;
        boolean productoSel=false;
        do {
            opcion=Integer.parseInt(JOptionPane.showInputDialog("1 = Cafe \n2 = Te \n3 = Chocolate\n0 = Salir"));
            switch (opcion) {
                case 1:
                    if (b==true) {
                        System.out.println(producto.get(cafe).toString());
                        return productoSel=true;
                        
                    }
                    else {
                        System.out.println(producto.get(cafe).getPrecio()+"€ Café");
                        return productoSel=false;
                    }
                case 2:
                    if (b==true) {
                        System.out.println(producto.get(te).toString());
                        return productoSel=true;
                        
                    }
                    else {
                        System.out.println(producto.get(te).getPrecio()+"€ Te");
                        return productoSel=false;
                    }
                case 3:
                    if (b==true) {
                        System.out.println(producto.get(chocolate).toString());
                        return productoSel=true;
                    }
                    else {
                        System.out.println(producto.get(chocolate).getPrecio()+"€ Chocolate");
                        return productoSel=false;
                    }
//                case 0:
//                    productoSel=false;
//                    break;
                

            }
        }while (opcion!=0);
        return productoSel;
    }
}