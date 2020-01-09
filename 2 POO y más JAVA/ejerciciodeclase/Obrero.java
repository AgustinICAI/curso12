import java.io.Serializable;

public class Obrero extends Persona implements Cotizable
{
    public Obrero(String nombre)
    {
        super(nombre, 18);
    }

    @Override
    public int anoNacimiento()
    {
        return 1900;
    }
    @Override
    public int calculaAportacionSS(int sueldo, int numerohijos)
    {
        return sueldo / numerohijos * this.getEdad();
    }

 
}