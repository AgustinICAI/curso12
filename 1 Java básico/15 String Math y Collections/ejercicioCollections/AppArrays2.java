import java.util.ArrayList;
import java.util.TreeSet;

public class AppArrays2
{
    public static void main (String argv[])
    {
        // Empezamos a explicar los ArrayList
        ArrayList<String> al = new ArrayList<String>();

        al.add("hola");
        al.add("que");
        al.add("tal");

        for(String c : al)
            System.out.println(c);


        String cadena = "hola que tal|me|llamo|Agustin";

        TreeSet<String> ts = new TreeSet<String>();

        for (String c : cadena.split("\\s|\\|"))
            ts.add(c);
        System.out.println("Iterando un treeset");
        for(String c : ts)
            System.out.println(c);
        
        


    }


    
}        