/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Fede
 */
public class HabitacionEstandar extends Habitacion {
    private boolean limpiezaIncluida;
    private double costoLimpieza;

    public HabitacionEstandar(boolean limpiezaIncluida, double costoLimpieza, String codHabitacion, boolean ocupada, double precioPorNoche) throws CantidadCaracteresCodExcpetion {
        super(codHabitacion, ocupada, precioPorNoche);
        this.limpiezaIncluida = limpiezaIncluida;
        this.costoLimpieza = costoLimpieza;
    }

    public boolean isLimpiezaIncluida() {
        return limpiezaIncluida;
    }

    public void setLimpiezaIncluida(boolean limpiezaIncluida) {
        this.limpiezaIncluida = limpiezaIncluida;
    }

    public double getCostoLimpieza() {
        return costoLimpieza;
    }

    public void setCostoLimpieza(double costoLimpieza) {
        this.costoLimpieza = costoLimpieza;
    }

    @Override
    public String toString() {
        return "HabitacionEstandar{" + "codHabitacion=" + codHabitacion + ", ocupada=" + ocupada + ", precioPorNoche=" + precioPorNoche + "limpiezaIncluida=" + limpiezaIncluida + ", costoLimpieza=" + costoLimpieza + '}';
    }
    
    
    
    @Override
    public double calcularPrecioPorEstadia(int dias) {
        double precioEstadia = dias * this.precioPorNoche;
        if (limpiezaIncluida == true){
           precioEstadia += costoLimpieza; 
        }
        return precioEstadia;
    } 
    
    
}
