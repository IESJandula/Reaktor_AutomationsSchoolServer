package es.iesjandula.reaktor.automations_school_server.utils;

public class SistemaVozException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6814665342095003705L;
	private final String codigoError;
	

    public SistemaVozException(String mensaje, String codigoError) {
        super(mensaje);
        this.codigoError = codigoError;
    }

    public String getCodigoError() {
        return codigoError;
    }
}
