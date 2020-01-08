import java.util.ArrayList;

public class AppArrays
{
    public static void main (String argv[])
    {
        int [] arrayint = new int [5];
        arrayint[3] = 1990;
        System.out.println(arrayint);

        for(int i=0; i < arrayint.length; i++)
        {
            System.out.println(arrayint[i]);
        }

        String [] cadenas = new String [2];
        cadenas[0] = "Soy0";

        String [] cadenasNuevo = new String [10];
        cadenasNuevo[3] = "Soy3";
        cadenasNuevo[0] = cadenas[0];
        
        for(int i=0; i < cadenas.length; i ++ )
            System.out.println(cadenas[i]);

        System.out.println("Ejemplo de bucle for each");
        for(String c : cadenasNuevo)
            System.out.println(c);




        // Empezamos a explicar los ArrayList
        ArrayList<String> al = new ArrayList();

        al.add("hola");
        al.add("que");
        al.add("tal");
        al.remove("que");
        System.out.println("ITERANDO UN ARRAYLIST");
        for(String c : al)
            System.out.println(c);

        System.out.println("Cogiendo elemento concreto de un arraylist");
        System.out.println(al.get(1));

    }


}