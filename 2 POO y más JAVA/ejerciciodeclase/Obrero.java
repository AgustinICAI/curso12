import java.io.Serializable;

public class Obrero extends Persona implements Cotizable {
    
    static final String COCHEFAVORITO = "Mercedes";
    
    public static String getCOCHEMODELOFAVORITO(String modelo)
    {
        return COCHEFAVORITO + "-" + modelo;
    }



    public Obrero(String nombre) {
        super(nombre, 18);
    }

    @Override
    public int anoNacimiento() {
        System.out.println(COCHEFAVORITO);
        return 1900;
    }

    @Override
    public int calculaAportacionSS(int sueldo, int numerohijos) {
        return sueldo / numerohijos * this.getEdad();
    }
    /*
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
    */


    
    @Override
    public boolean equals(Object o)
    {
        //
        //if(o instanceof Obrero &&
        // ((Obrero)o).getNombre().equals(this.getNombre()))
        // 
        //    return true;
        //else return false;
        //

        if(o instanceof Obrero)
        {
            String nombreAComparar = ((Obrero)o).getNombre();
            if(this.getNombre().equals(nombreAComparar))
                return true;
            else return false;
        }
        else return false;
    }
    
}