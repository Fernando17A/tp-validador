package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TestInscripciones {
    @Test
    @DisplayName("Guillermo puede cursar F2 con AM1 y F1 cursadas")
    public void sePuedeInscribir(){
        // Dos materias con sus correlativas (en este caso vacias)
        Materia f1 = new Materia("Fisica 1",new ArrayList<>());
        Materia am1 = new Materia("Analisis Matematico 1",new ArrayList<>());

        // Alumno a testear
        Alumno guillermo = new Alumno(101010,"Guillermo",new ArrayList<>());
        guillermo.agregarMateriasCursadas(f1);
        guillermo.agregarMateriasCursadas(am1);

        // Materia a la que se quiere anotar
        Materia f2 = new Materia("Fisica 2",new ArrayList<>());
        f2.agregarCorrelativas(am1);
        f2.agregarCorrelativas(f1);

        // Solicitud de inscripcion
        Inscripcion inscripcion = new Inscripcion(new ArrayList<>(),guillermo);
        inscripcion.agregarMateriasAspirantes(f2);

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    @DisplayName("Guillermo quiere cursar Diseño de Sistemas de Informacion sin cursar Paradigmas")
    public void sePuedeInscribir2(){
        // Dos materias con sus correlativas (en este caso vacias)
        Materia it1 = new Materia("Ingles Tecnico Nivel 1",new ArrayList<>());
        Materia sypn = new Materia("Sistemas y Procesos de Negocios",new ArrayList<>());
        Materia ads = new Materia("Arquitectura de Computadoras",new ArrayList<>());
        Materia ayed = new Materia("Algoritmos y Estructuras de Datos",new ArrayList<>());
        Materia pdp = new Materia("Paradigmas de Programacion",new ArrayList<>());

        // Alumno a testear
        Alumno guillermo = new Alumno(101010,"Guillermo",new ArrayList<>());
        guillermo.agregarMateriasCursadas(it1);
        guillermo.agregarMateriasCursadas(ads);
        guillermo.agregarMateriasCursadas(ayed);
        guillermo.agregarMateriasCursadas(sypn);

        // Materia a la que se quiere anotar
        Materia dsi = new Materia("Diseño de Sistemas de Informacion",new ArrayList<>());
        dsi.agregarCorrelativas(it1);
        dsi.agregarCorrelativas(ads);
        dsi.agregarCorrelativas(pdp);
        dsi.agregarCorrelativas(ayed);
        dsi.agregarCorrelativas(sypn);

        // Solicitud de inscripcion
        Inscripcion inscripcion = new Inscripcion(new ArrayList<>(),guillermo);
        inscripcion.agregarMateriasAspirantes(dsi);

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    @DisplayName("Guillermo quiere cursar Diseño de Sistemas de Informacion y cumple correlativas")
    public void sePuedeInscribir3(){
        // Dos materias con sus correlativas (en este caso vacias)
        Materia it1 = new Materia("Ingles Tecnico Nivel 1",new ArrayList<>());
        Materia sypn = new Materia("Sistemas y Procesos de Negocios",new ArrayList<>());
        Materia ads = new Materia("Arquitectura de Computadoras",new ArrayList<>());
        Materia ayed = new Materia("Algoritmos y Estructuras de Datos",new ArrayList<>());
        Materia pdp = new Materia("Paradigmas de Programacion",new ArrayList<>());

        // Alumno a testear
        Alumno guillermo = new Alumno(101010,"Guillermo",new ArrayList<>());
        guillermo.agregarMateriasCursadas(it1);
        guillermo.agregarMateriasCursadas(ads);
        guillermo.agregarMateriasCursadas(ayed);
        guillermo.agregarMateriasCursadas(sypn);
        guillermo.agregarMateriasCursadas(pdp);

        // Materia a la que se quiere anotar
        Materia dsi = new Materia("Diseño de Sistemas de Informacion",new ArrayList<>());
        dsi.agregarCorrelativas(it1);
        dsi.agregarCorrelativas(ads);
        dsi.agregarCorrelativas(pdp);
        dsi.agregarCorrelativas(ayed);
        dsi.agregarCorrelativas(sypn);

        // Solicitud de inscripcion
        Inscripcion inscripcion = new Inscripcion(new ArrayList<>(),guillermo);
        inscripcion.agregarMateriasAspirantes(dsi);

        Assertions.assertTrue(inscripcion.aprobada());
    }
}