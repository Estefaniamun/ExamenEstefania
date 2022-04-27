package prueba1;

/**
 * <h2>Automovil</h2>
 * @author Estefanía
 * @version v1
 * @see www.google.es
 *
 */
public class automovil {

	/**
	 * Atributo marca
	 */
	private String marca;
	/**
	 * Atributo color
	 */
	private String color;
	/**
	 * Atributo puertas
	 */
	private int puertas;
	/**
	 * Atributo precio
	 */
	private double precio;
	
	/**
	 * Constructor con parámetros
	 * @param marca <i>Parámetro marca </i>
	 * @param color <i>Parámetro color</i>
	 * @param puertas <i>Parámetro puertas</i>
	 * @param precio <i>Parámetro precio</i>
	 */
	public automovil(String marca, String color, int puertas, double
	precio) {
	super();
	this.marca = marca;
	this.color = color;
	this.puertas = puertas;
	this.precio = precio;
	}
	
	/**
	 * Método público que calcula el precio con descuento
	 * @param precio <i>Descuento del precio del automovil</i>
	 * @see automovil
	 */
	public void CalcularDto(double precio) {
		precio=precio*0.10;
	}
}
