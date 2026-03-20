public class Matricula extends GestorMatriculas implements Mostrar {

    protected Alumno alumno;
    protected Asignatura asignatura;
    protected Profesor profesor;
    protected double nota;

    public Matricula(Alumno alumno, Asignatura asignatura, Profesor profesor, double nota) {
        this.alumno = alumno;
        this.asignatura = asignatura;
        this.profesor = profesor;
        this.nota = nota;
    }
    @Override
    public void mostrar() {
        System.out.println(alumno.nombre + " - " +
                asignatura.nombre + " - " +
                profesor.nombre + " - Nota: " + nota);
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public double getNota() {
        return nota;
    }
}

