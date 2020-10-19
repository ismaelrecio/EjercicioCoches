import t1_ficherosplanos.Coche;

import java.io.*;
import java.lang.reflect.AccessibleObject;
import java.util.Scanner;

public class Entrada extends t1_ficherosplanos.Coche {
    public Entrada(String marca, String modelo, int unidades, double precio) {
        super(marca, modelo, unidades, precio);
    }
    public Entrada(String s) {
        super(s);
    }

    public static void main(String[] args) throws FileNotFoundException {
        File fichero = new File("C:\\Users\\Usuario DAM2\\IdeaProjects\\Coche.dat");
        FileOutputStream fileout = new FileOutputStream(fichero);


        //variable para pedir por teclado
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la opcion deseada");
        int opcion;
        opcion = teclado.nextInt();


        //Menu
        switch (opcion) {
            case 1:
                System.out.println("Alta");
            break;
            case 2:
                System.out.println("Baja");
                break;
            case 3:
                System.out.println("Modificacion");
                break;
        }


    }

    public void anadirCoche(Coche){
        Scanner teclado1 = new Scanner(System.in);
        System.out.println("Introduce la marca");
        String marca=teclado1.next();
        System.out.println("Introduce el modelo");
        String modelo=teclado1.next();
        System.out.println("Introduce las unidades");
        int unidades = teclado1.nextInt();
        Coche coche= new Coche(marca,modelo,unidades);

    }
}