/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fede
 */
public class Hotel {

    private String nombreHotel;
    private List<Habitacion> inventarioHabitaciones;

    public Hotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
        this.inventarioHabitaciones = new ArrayList<Habitacion>();
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public List<Habitacion> getInventarioHabitaciones() {
        return inventarioHabitaciones;
    }

    public void setInventarioHabitaciones(List<Habitacion> inventarioHabitaciones) {
        this.inventarioHabitaciones = inventarioHabitaciones;
    }

    public void agregarHabitacion(Habitacion habitacion) throws HabitacionRepetida {
        for (Habitacion h : inventarioHabitaciones) {
            if (h.codHabitacion.equals(habitacion.getCodHabitacion())) {
                throw new HabitacionRepetida("Ya existe una habitacion con ese codigo");
            }
        }
        inventarioHabitaciones.add(habitacion);
    }

    public void reservarHabitacion(String codigoHabitacion, int dias) throws HabitacionException {
        for (Habitacion habitacion : inventarioHabitaciones) {
            if (habitacion.codHabitacion.equals(codigoHabitacion)) {
                if (habitacion.isOcupada()) {
                    throw new HabitacionException("La habitacion esta ocupada");
                } else {
                    habitacion.setOcupada(true);
                }
            }
        }

    }

    public void liberarHabitacion(String codigoHabitacion) throws HabitacionException {
        for (Habitacion habitacion : inventarioHabitaciones) {
            if (habitacion.codHabitacion.equals(codigoHabitacion)) {
                if (habitacion.isOcupada()) {
                    habitacion.setOcupada(false);
                } else {
                    throw new HabitacionException("La habitacion esta vacia");
                }
            }
        }
    }

    public void calcularCostoEstadia(String codigoHabitacion, int dias) throws HabitacionException {
        for (Habitacion habitacion : inventarioHabitaciones) {
            if (habitacion.codHabitacion.equals(codigoHabitacion)) {
                if (habitacion.isOcupada()) {
                    habitacion.calcularPrecioPorEstadia(dias);
                }else{
                    throw new HabitacionException("La habitacion no existe o esta desocupada");
                }
            }
        }
    }
}
