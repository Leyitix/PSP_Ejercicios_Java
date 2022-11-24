package es.florida.EJERCICIOS.ej_028_029;

public class Vehiculo {
	protected String tipo;
	protected String marca;
	protected String modelo;

	public Vehiculo() {}
	public Vehiculo(String tipo, String marca, String modelo) {
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String getInformacion() {
		String info = "Tipo: " + tipo + " // Marca: " + marca + " // Modelo: " + modelo;
		return info;
	}
	
	
}
