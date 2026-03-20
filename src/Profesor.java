public class Profesor extends Personas implements Mostrar {

    protected String nombre;
    protected int edad;
    private final String especialidad;

    public Profesor(String nombre, int edad, String especialidad) {
        super(nombre,edad);
        this.especialidad = especialidad;
        this.edad = edad;
    }

    @Override
    public void mostrar() {
        System.out.println("Profesor: " + nombre + " - " + especialidad);
    }
}
