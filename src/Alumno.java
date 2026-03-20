import java.util.ArrayList;

public class Alumno extends Personas implements Mostrar {

    protected String nombre;
    private int edad;
    private final ArrayList<Matricula> matriculas;

    /**
     *
     * @param nombre
     * @param edad
     */
    public Alumno(String nombre, int edad) {
        super(nombre,edad);
        this.matriculas = new ArrayList<>();
    }

    /**
     *
     * @param m matricular a alumno
     */

    public void matricular(Matricula m) {
        matriculas.add(m);
    }

    /**
     * metodo mostrar
     */

    @Override
    public void mostrar() {
        System.out.println("Alumno: " + nombre);

        for (Matricula m : matriculas) {
            System.out.println("Asignatura: " + m.asignatura.nombre +
                    " Profesor: " + m.profesor.nombre +
                    " Nota: " + m.nota);
        }
    }

    /**
     *
     * @return media alumno
     */

    public double calcularMedia() {
        double suma = 0;

        for (Matricula m : matriculas) {
            suma += m.nota;
        }

        if (matriculas.isEmpty()) return 0;

        return suma / matriculas.size();
    }
    @Override
    public int getEdad() {
        return edad;
    }
}
