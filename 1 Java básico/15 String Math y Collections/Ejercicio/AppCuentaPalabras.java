import java.util.Scanner; // Import the Scanner class
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class AppCuentaPalabras {
    public static void main(String argv[]) {
        File file = new File(
                "/home/b0904853/ICAI/curso12/1 Java básico/15 String Math y Collections/Ejercicio/Discursos/discurso.txt");
        try {
            Scanner sc = new Scanner(file);
            HashMap<String,Integer> hm = new HashMap<String,Integer>();
            while (sc.hasNextLine())
            {
                String linea = sc.nextLine();
                for(String palabra : linea.split("\\s|\\.|\\,"))
                {

                    palabra = palabra.trim();
                    palabra = palabra.toLowerCase();
                    if(!hm.containsKey(palabra))
                        hm.put(palabra, 0);
                    else
                    {
                        Integer count = hm.get(palabra);
                        count = count +1 ;
                        hm.put(palabra, count);
                    }
                }
                for(Map.Entry<String,Integer> m : hm.entrySet())
                {
                    if(m.getValue()>10)
                        System.out.println(m.getKey() + "->" + m.getValue());
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}