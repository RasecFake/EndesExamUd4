import java.util.ArrayList;

public class Alumno extends Personas implements Mostrar {

    protected String nombre;
    private int edad;
    private final ArrayList<Matricula> matriculas;

    public Alumno(String nombre, int edad) {
        super(nombre,edad);
        this.matriculas = new ArrayList<>();
    }

    public void matricular(Matricula m) {
        matriculas.add(m);
    }

    @Override
    public void mostrar() {
        System.out.println("Alumno: " + nombre);

        for (Matricula m : matriculas) {
            System.out.println("Asignatura: " + m.asignatura.nombre +
                    " Profesor: " + m.profesor.nombre +
                    " Nota: " + m.nota);
        }
    }

    public double calcularMedia() {
        double suma = 0;

        for (Matricula m : matriculas) {
            suma += m.nota;
        }

        if (matriculas.isEmpty()) return 0;

        return suma / matriculas.size();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
