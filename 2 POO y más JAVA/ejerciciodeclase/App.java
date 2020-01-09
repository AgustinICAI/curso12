public class App
{
    public static void main (String[] argv)
    {
        Persona[] ps = new Persona[10];

        Persona p = new Estudiante(180,"Juan", 25, 75);

        System.out.println(p.getNombre());
        System.out.println(p.getAltura());

        ps[0]= p;

        ps[1] = new Obrero("Maria");

        ps[7]= new Obrero("Pablo");

        for(int i=0 ; i < ps.length; i++)
        {
            if(ps[i] != null)
            {
                Persona p1 = ps[i];

                if(p1 instanceof Estudiante)
                {
                    System.out.println(p1.getNombre() + "->" + p1.getEdad() + "->Ha pagado: " + ((Estudiante)p1).isMatriculaPagada() + "Año nacimiento " + p1.anoNacimiento());

                }
                else
                    System.out.println(p1.getNombre() + "->" + p1.getEdad() +"No se su año: "+ p1.anoNacimiento() + " su aportación es " +((Obrero)p1).calculaAportacionSS(20000, 5) + "-> NO SE MÁS" );
                
                
            
            
            
            }
        }


/*
        Estudiante e1 = new Estudiante(180,"Paco",25,81,false);

        e1.anadirCalificacion("Matematicas", 8d);
        e1.anadirCalificacion("Lengua", 5.2d);

        double media = e1.obtenerMedia();

        System.out.println("La nota media de " + e1.getNombre() + " es " + media);
*/
    }
}