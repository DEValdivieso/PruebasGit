package pe.com.peru.main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pruebas {
    public static void main(String args []){
        BigDecimal uno=new BigDecimal(1);
        BigDecimal dos=new BigDecimal(0);

        System.out.println("Hola mundo "+uno.compareTo(BigDecimal.ZERO));

        Scrapy perro=new Scrapy();
        perro.setColor("negro");
        perro.setNombre("Scrapy dog");
        List<Object> lista=new ArrayList<Object>();

        lista.add(perro);

       // lista.get(0).get

        Producto prod=new Producto();
        List<Scrapy> lista2=new ArrayList<Scrapy>();
       // lista2.add(prod);
        Electrodomestico tele=new Electrodomestico();
        tele.setMarca("Samsung");
       // lista2.add(tele);
        lista2.add(perro);

        System.out.println("prueba: "+lista2.get(0).getClass());
        System.out.println("prueba: "+lista2.get(1).getClass());

        Scrapy ssss= (Scrapy) lista2.get(1);

        System.out.println("prueba 2: "+ssss.getColor());

        Scrapy[] array=new Scrapy[3];
        array[0]=perro;
        array[1]=perro;
        array[2]=perro;

        //scrapy el perro





    }
}
