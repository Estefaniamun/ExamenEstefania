package prueba1;

/**
 * <h2>Automovil</h2>
 * @author Estefan�a
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
	 * Constructor con par�metros
	 * @param marca <i>Par�metro marca </i>
	 * @param color <i>Par�metro color</i>
	 * @param puertas <i>Par�metro puertas</i>
	 * @param precio <i>Par�metro precio</i>
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
	 * M�todo p�blico que calcula el precio con descuento
	 * @param precio <i>Descuento del precio del automovil</i>
	 * @see automovil
	 */
	public void CalcularDto(double precio) {
		precio=precio*0.10;
	}
}
