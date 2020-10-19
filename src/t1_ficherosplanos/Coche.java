package t1_ficherosplanos;

import java.io.*;

public class Coche implements Serializable {
	/**
	 * Se añade el ID de serialización para la deserialización
	 */
	private static final long serialVersionUID = 1L;
	private String marca;
	private String modelo;
	private int unidades;
	private double precio;
	
	// Definimos los constructores
	public Coche (String marca, String modelo, int unidades, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.unidades = unidades;
		this.precio = precio;
	}
	public Coche(String s) { this.marca = null; }
	// setters
	public void setMarca (String marca) { this.marca = marca; }
	public void setModelo (String modelo) { this.modelo = modelo; }
	public void setUnidades (int unidades) { this.unidades = unidades; }
	public void setPrecio (double precio) { this.precio = precio; }
	// getters
	public String getMarca() { return this.marca; }
	public String getModelo() { return this.modelo; }
	public int getUnidades() { return this.unidades; }
	public double getPrecio() { return this.precio; }
}// Fin class
