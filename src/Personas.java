public class Personas {

    protected String nombre;
    private int edad;

    /**
     *
     * @param nombre
     * @param edad
     */

    public Personas(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     *
     * @return
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
