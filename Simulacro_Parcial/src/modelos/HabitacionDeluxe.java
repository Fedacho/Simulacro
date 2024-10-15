/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Fede
 */
public class HabitacionDeluxe extends Habitacion {
    private boolean incluyeDesayuno;
    private double tarifaDesayuno;
    private int numerosNochesMinimas;

    public HabitacionDeluxe(boolean incluyeDesayuno, double tarifaDesayuno, int numerosNochesMinimas, String codHabitacion, boolean ocupada, double precioPorNoche) throws CantidadCaracteresCodExcpetion {
        super(codHabitacion, ocupada, precioPorNoche);
        this.incluyeDesayuno = incluyeDesayuno;
        this.tarifaDesayuno = tarifaDesayuno;
        this.numerosNochesMinimas = numerosNochesMinimas;
    }

    public boolean isIncluyeDesayuno() {
        return incluyeDesayuno;
    }

    public void setIncluyeDesayuno(boolean incluyeDesayuno) {
        this.incluyeDesayuno = incluyeDesayuno;
    }

    public double getTarifaDesayuno() {
        return tarifaDesayuno;
    }

    public void setTarifaDesayuno(double tarifaDesayuno) {
        this.tarifaDesayuno = tarifaDesayuno;
    }

    public int getNumerosNochesMinimas() {
        return numerosNochesMinimas;
    }

    public void setNumerosNochesMinimas(int numerosNochesMinimas) {
        this.numerosNochesMinimas = numerosNochesMinimas;
    }

    @Override
    public String toString() {
        return "HabitacionDeluxe{" + "codHabitacion=" + codHabitacion + ", ocupada=" + ocupada + ", precioPorNoche=" + precioPorNoche + "incluyeDesayuno=" + incluyeDesayuno + ", tarifaDesayuno=" + tarifaDesayuno + ", numerosNochesMinimas=" + numerosNochesMinimas + '}';
    }

    
    
    @Override
    public double calcularPrecioPorEstadia(int dias) {
        double precioEstadia = dias * this.precioPorNoche;
        if (dias > 7) {
            precioEstadia -= precioEstadia * 0.10;
        }
        if (dias < numerosNochesMinimas) {
            precioEstadia += precioEstadia * 0.20;
        }
        if (incluyeDesayuno == false) {
            precioEstadia += dias * tarifaDesayuno;
        }
        return precioEstadia;
    }   
    
}
