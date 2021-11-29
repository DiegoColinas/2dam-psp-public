package tiqueto;

public interface IOperacionesWeb {

	/**
	 * Realiza una compra de una sola entrada. Es decir, decrementa el n�mero de entradas disponibles.
	 * IMPORTANTE: La implementaci�n de este m�todo deber� ser marcado como synchronized.
	 * 
	 * @return true si se ha podido comprar una entrada (es decir, si todav�a estaba activa la venta y hab�a entradas disponibles)
	 * 		   false en caso contrario (es decir, no se ha podido comprar una entrada porque no haya m�s o se haya cerrado la venta)
	 */
	boolean comprarEntrada();
	
	/**
	 * Realiza una reposici�n de entradas. Es decir, incrementar� el n�mero de entradas disponibles.
	 * IMPORTANTE: La implementaci�n de este m�todo deber� ser marcado como synchronized.
	 *  
	 * @param numeroEntradas N�mero de entradas a reponer
	 * @return N�mero de entradas disponibles tras la reposici�n
	 */
	int reponerEntradas(int numeroEntradas);
	
	/**
	 * Cierra la venta de entradas. Por lo tanto, quien quiera comprar entradas no podr� hacerlo.
	 * PISTA: esto deber�a modificar una condici�n general.
	 * IMPORTANTE: La implementaci�n de este m�todo deber� ser marcado como synchronized.
	 * 
	 */
	void cerrarVenta();
	
	/**
	 * Informa si todav�a hay entradas disponibles
	 * IMPORTANTE: La implementaci�n de este m�todo deber� ser marcado como synchronized.
	 * 
	 * @return El n�mero de entradas disponibles en la web de compra de conciertos
	 */
	boolean hayEntradas();
	
	/**
	 * Informa de las entradas restantes.
	 * IMPORTANTE: La implementaci�n de este m�todo deber� ser marcado como synchronized.
	 * @return N�mero de entradas restantes en el momento de la solicitud
	 */
	int entradasRestantes();
}
