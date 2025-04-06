package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private List<Materia> materias;
    private Alumno alumno;

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void agregarMateriasAspirantes(Materia ... quiereCursar){
        Collections.addAll(this.materias, quiereCursar);
    }

    public boolean aprobada(){
        return materias.stream().allMatch(materia -> alumno.puedeCursar(materia));
    }

    public Inscripcion(List<Materia> materias, Alumno alumno) {
        this.materias = new ArrayList<>();
        this.alumno = alumno;
    }
}