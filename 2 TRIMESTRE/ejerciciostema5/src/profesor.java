public class profesor {
    public profesor (){}
    public void ponerNotas(Alumno alumno){
       //pongo nota a la asignatura1 del alumno
        alumno.getAsignatura1().setCalificacion(Math.ramdom()*11);
        alumno.getAsignatura2().setCalificacion(Math.ramdom()*11);
        alumno.getAsignatura3().setCalificacion(Math.ramdom()*11);
    }
    public double calcularMedia(Alumno alumno);
    return  alumno.getAsignatura1().getCalificacion()
}
