import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner; // Import the Scanner class
import java.util.TreeMap;

public class AppCuentaPalabras {
    public static void main(String argv[]) {
        File discurso = new File("/home/b0904853/ICAI/curso12/1 Java básico/15 String Math y Collections/Ejercicio/Discursos/discurso.txt");
        File stopwords = new File("/home/b0904853/ICAI/curso12/1 Java básico/15 String Math y Collections/Ejercicio/resources/stopwords.txt");
        try {
            Scanner sc0 = new Scanner(discurso);
            HashMap<String,Integer> hm = new HashMap<String,Integer>();
            while (sc0.hasNextLine())
            {
                String linea = sc0.nextLine();
                for(String palabra : linea.split("\\s|\\.|\\,"))
                {

                    palabra = palabra.trim();
                    palabra = palabra.toLowerCase();
                    if(!palabra.isEmpty())
                        if(!hm.containsKey(palabra))
                            hm.put(palabra, 1);
                        else
                        {
                            Integer count = hm.get(palabra);
                            count = count +1 ;
                            hm.put(palabra, count);
                        }
                }
            }
            Scanner sc1 = new Scanner(stopwords);
            HashSet<String> stopWords = new HashSet<String>();
            while (sc1.hasNextLine())
            {
                String word = sc1.nextLine();
                stopWords.add(word); 

            }
            
            TreeMap<Integer, ArrayList<String>> tsPalabras = new TreeMap<Integer, ArrayList<String>>();
            int topMax, topMin;

            for(Map.Entry<String,Integer> m : hm.entrySet())
            {
                String key = m.getKey();
                int value = m.getValue();
                if(!stopWords.contains(key))
                {
                    //Hay que comprobar que arraylist exista dentro del treeSet. Si este no existe hay que inicializarlo.
                    if(!tsPalabras.containsKey(value))
                        tsPalabras.put(value,new ArrayList<String>());
                    //tsPalabras.get(value).add(key); <- Se podría hacer directamente en esta instrucción
                    ArrayList<String> palabras = tsPalabras.get(value);
                    palabras.add(key);
                }
            }

            for(Integer count : tsPalabras.descendingKeySet())
            {
                if(count > 5)
                    System.out.println(count + "--->" + tsPalabras.get(count));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}