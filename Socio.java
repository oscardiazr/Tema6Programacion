/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema10.socio;

/**
 *
 * @author heladodepistacho
 */
import java.io.*;
import java.time.LocalDate;

public class Socio implements Serializable, Comparable<Socio> {
    private String dni;
    private String nombre;
    private LocalDate fechaAlta;

    public Socio(String dni, String nombre, LocalDate fechaAlta) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Socio) {
            Socio s = (Socio) o;
            return dni.equals(s.dni);
        }
        return false;
    }

    @Override
    public int compareTo(Socio s) {
        return dni.compareTo(s.dni);
    }

    public int antiguedad() {
        return LocalDate.now().getYear() - fechaAlta.getYear();
    }

    @Override
    public String toString() {
        return dni + " - " + nombre + " - " + fechaAlta;
    }
}
