public class Profesor extends Personas {

    protected String nombre;
    protected int edad;
    private String especialidad;

    public Profesor(String nombre, int edad, String especialidad) {
        super(nombre,edad);
        this.especialidad = especialidad;
    }

    public void mostrar() {
        System.out.println("Profesor: " + nombre + " - " + especialidad);
    }
}
