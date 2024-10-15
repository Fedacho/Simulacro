/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacro_parcial;

import modelos.CantidadCaracteresCodExcpetion;
import modelos.Habitacion;
import modelos.HabitacionDeluxe;
import modelos.HabitacionEstandar;
import modelos.HabitacionException;
import modelos.HabitacionRepetida;
import modelos.Hotel;

/**
 *
 * @author Fede
 */
public class Simulacro_Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            
        Hotel habitaciones = new Hotel("Aurora");
        
        System.out.println("1-1");
        Habitacion habE1 = null;
        try {
            habE1 = new HabitacionEstandar(true, 0.0, "10001", false, 80.0);
            System.out.println(habE1);
            System.out.println("1-4");
            System.out.println(habE1.calcularPrecioPorEstadia(4));
        } catch (CantidadCaracteresCodExcpetion e) {
            System.out.println(e.getMessage());
        }

        System.out.println("1-2");
        try {
            Habitacion habE2 = new HabitacionEstandar(true, 15.0, "10002", true, 90.0);
            System.out.println(habE2);
            System.out.println("1-3");
            System.out.println(habE2.calcularPrecioPorEstadia(3));
        } catch (CantidadCaracteresCodExcpetion e) {
            System.out.println(e.getMessage());
        }

        System.out.println("2-1");
        try {
            Habitacion habD1 = new HabitacionDeluxe(false, 25.0, 2, "2001", true, 200.0);
            System.out.println(habD1);
        } catch (CantidadCaracteresCodExcpetion e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("2-2");
        try {
            Habitacion habD2 = new HabitacionDeluxe(false, 30.0, 1, "20001", true, 250.0);
            System.out.println(habD2);
        } catch (CantidadCaracteresCodExcpetion e) {
            System.out.println(e.getMessage());
        }

        System.out.println("2-3");
        try {
            Habitacion habD3 = new HabitacionDeluxe(false, 25.0, 7, "20001", true, 200.0);
            System.out.println(habD3);
            System.out.println(habD3.calcularPrecioPorEstadia(8));
        } catch (CantidadCaracteresCodExcpetion e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("2-4");
        Habitacion habD4 = null;
        try {
            habD4 = new HabitacionDeluxe(true, 25.0, 4, "20001", true, 200.0);
            System.out.println(habD4);
            System.out.println(habD4.calcularPrecioPorEstadia(5));
        } catch (CantidadCaracteresCodExcpetion e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("2-5");
        Habitacion habD5 = null;
        try {
            habD5 = new HabitacionDeluxe(false, 25.0, 7, "20001", true, 200.0);
            System.out.println(habD5);
            System.out.println(habD5.calcularPrecioPorEstadia(3));
        } catch (CantidadCaracteresCodExcpetion e) {
            System.out.println(e.getMessage());
        }
        
        try {
            habitaciones.agregarHabitacion(habE1);
        } catch (HabitacionRepetida e) {
            System.out.println(e.getMessage());
        }
        System.out.println("3-1");
        try {
            habitaciones.reservarHabitacion(habE1.getCodHabitacion(), 5);
        } catch (HabitacionException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("3-1 bis");
        try {
            habitaciones.reservarHabitacion(habE1.getCodHabitacion(), 5);
        } catch (HabitacionException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("3-1 bis2");
        try {
            habitaciones.liberarHabitacion("10001");
        } catch (HabitacionException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("2-5");
        Habitacion habD6 = null;
        try {
            habD6 = new HabitacionDeluxe(true, 25.0, 7, "20005", true, 300.0);
            System.out.println(habD6);
            System.out.println(habD6.calcularPrecioPorEstadia(5));
        } catch (CantidadCaracteresCodExcpetion e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("3-3");
        try {
            habitaciones.agregarHabitacion(habD4);
        } catch (HabitacionRepetida e) {
            System.out.println(e.getMessage());
        }
        try {
            habitaciones.agregarHabitacion(habD5);
        } catch (HabitacionRepetida e) {
            System.out.println(e.getMessage());
        }
          
        
    }

}
