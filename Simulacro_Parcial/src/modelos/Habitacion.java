/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Fede
 */
public abstract class Habitacion {
    
    protected String codHabitacion;
    protected boolean ocupada;
    protected double precioPorNoche;

    public Habitacion(String codHabitacion, boolean ocupada, double precioPorNoche) throws CantidadCaracteresCodExcpetion {
        this.codHabitacion = codHabitacion;
        if (this.codHabitacion.length() != 5) {
            throw new CantidadCaracteresCodExcpetion("El codigo de la habitacion es invalido");
        }
        this.ocupada = ocupada;
        this.precioPorNoche = precioPorNoche;
    }

    public String getCodHabitacion() {
        return codHabitacion;
    }

    public void setCodHabitacion(String codHabitacion) {
        this.codHabitacion = codHabitacion;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "codHabitacion=" + codHabitacion + ", ocupada=" + ocupada + ", precioPorNoche=" + precioPorNoche + '}';
    }
    
    
    
    public abstract double calcularPrecioPorEstadia(int dias);
    
    
}
