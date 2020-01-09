public abstract class Persona
{
    private int altura;
    private String nombre;
    private int edad;
    private int peso;

    public Persona(int altura, String nombre, int edad, int peso)
    {
        this.altura = altura;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public Persona(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre()
    {
        return nombre;
    }
    public int getAltura()
    {
        return altura;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public void setPeso(int peso)
    {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public double getIMC()
    {
        return this.peso + this.altura/2;
    }

    public abstract int anoNacimiento();

    

}