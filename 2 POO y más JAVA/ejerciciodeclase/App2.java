public class App2
{
    public static void main(String argv[])
    {
        if(argv != null && argv.length>0)
            System.out.println("Argumento pasado:" + argv[0]);

        String version = System.getenv("VERSION");
        System.out.println(version);

        Obrero o1 = new Obrero("Jacinto");        
        System.out.println(((Object)o1).toString());

        Obrero o2 = new Obrero("Jacinto");
        //Object o = (Object)o2;
        //System.out.println(o);

        String cochefavorito = Obrero.COCHEFAVORITO;
        String modelofavorito = Obrero.getCOCHEMODELOFAVORITO("clase A");

        String booleanEnTexto = String.valueOf(true);
        String s1 = new String("hola");
        int longitud = s1.length();

        int numAlto = Math.max(13,65);

        if(o1.equals(o2))
            System.out.println("SOMOS IGUALES");
        else
            System.out.println("SOMOS DISTINTOS");




    }


}