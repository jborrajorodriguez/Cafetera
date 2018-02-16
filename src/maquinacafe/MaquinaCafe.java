package maquinacafe;

import java.util.ArrayList;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class MaquinaCafe {

    public static void main(String[] args) {
        Botonera boton=new Botonera();
        Display dis=new Display();
        Monedero mon=new Monedero();
        Producto pro=new Producto();
        ArrayList <Producto> nombreProducto=new ArrayList();
        nombreProducto.add(new Producto(1,1,"Café"));
        nombreProducto.add(new Producto(1,1,"Te"));
        nombreProducto.add(new Producto(1,1,"Chocolate"));
       
        
        //dis.productoAcabado(pro.elaborar(boton.elegirProducto(nombreProducto,mon.inDinero(dis.dineroIN()))));
        
        float f=Display.dineroIN();
       boolean aa=mon.inDinero(f);
        boolean bb=boton.elegirProducto(nombreProducto,aa,f);
        boolean cc=pro.elaborar(bb);
        dis.productoAcabado(cc);
        
    }

}
