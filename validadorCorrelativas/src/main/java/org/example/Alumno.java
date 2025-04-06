package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String nombre;
    private Integer legajo;
    private List<Materia> cursadas;

    public boolean puedeCursar(Materia materia){
        return this.cursadas.containsAll(materia.getCorrelativas());
    }

    public Alumno(Integer legajo, String nombre, List<Materia> cursadas) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.cursadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public void agregarMateriasCursadas(Materia materias){
        Collections.addAll(this.cursadas, materias);
    }
}