public class AppHola
{
    public static void main (String argv[])
    {
        System.out.println("Hola Mundo");
        
        int a = 5;

        int b = 6;

        int c;

        c = 7;

        double pi = 3.14d;
        float pif = 3.14f;

        char ch = 'c';

        System.out.println(a+c);

        if(a+c > 10)
            System.out.println(a+c);


        String cad = "hola";

        System.out.println(cad);
        System.out.println(cad.length());
        System.out.println(cad.length());


        String cad1 = new String("  sfdfasd    ");

        System.out.println(cad1);

        System.out.println(cad1.trim() + "<- cadena sin espacios");

        double ceil = Math.ceil(523452.4131d);

        System.out.println(ceil);

        System.out.println(Math.pow(3,4));


    }

}