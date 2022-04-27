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
	 * Propiedad String marca
	 */
	private String marca;
	/**
	 * Propiedad String color
	 */
	private String color;
	/**
	 * Propiedad int puertas
	 */
	private int puertas;
	/**
	 * Propiedad double precio
	 */
	private double precio;
	
	/**
	 * Constructor con parámetros
	 * @param <i>marca</i>
	 * @param <i>color</i>
	 * @param <i>puertas</i>
	 * @param <i>precio</i>
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
	 * @param precio
	 */
	public void CalcularDto(double precio) {
		precio=precio*0.10;
	}
}
