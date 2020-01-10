import java.util.Calendar;
import java.util.HashMap;

import java.util.Map;

public class Estudiante extends Persona
{
    HashMap<String,Double> asignaturaNota;
    boolean matriculaPagada;

    public Estudiante(int altura, String nombre, int edad, int peso, boolean matriculaPagada)
    {
        super(altura, nombre, edad, peso);
        asignaturaNota = new HashMap<String,Double>();
        this.matriculaPagada = matriculaPagada;
    }

    public Estudiante(int altura, String nombre, int edad, int peso)
    {
        super(altura, nombre, edad, peso);
    }

    public boolean isMatriculaPagada() {
        return matriculaPagada;
    }

    public void setMatriculaPagada(boolean matriculaPagada) {
        this.matriculaPagada = matriculaPagada;
    }

    public void anadirCalificacion(String asignatura, double nota)
    {
        this.asignaturaNota.put(asignatura, nota);
    }

    public double obtenerMedia()
    {
        double media = 0;

        for(Map.Entry<String,Double> an : asignaturaNota.entrySet())
        {
            String a = an.getKey();
            Double n1 = an.getValue();

            double n = n1.doubleValue();

            media = media + n;
        }
        media = media / this.asignaturaNota.size();

        return media;
    }
    
    @Override
    public int anoNacimiento()
    {
        return 2020 - this.getEdad();
    }


    
}