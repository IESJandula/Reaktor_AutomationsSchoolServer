package es.iesjandula.reaktor.automations_school_server.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
/**
 * DTO para enviar información de un sensor booleano.
 */
public class SensorBooleanoResponseDto {
	// Dirección MAC del sensor
	private String mac;

	// Estado del sensor (ej. activado/desactivado)
	private String estado;

	// Valor actual del sensor (true/false)
	private Boolean valorActual;

	// Timestamp de la última actualización
	private Long ultimaActualizacion;

	// Nombre de la ubicación asociada
	private String nombreUbicacion;
				
	/**
	 * Constructor para inicializar un objeto de respuesta DTO (Data Transfer Object) para un sensor booleano.
	 *
	 */
	
	public SensorBooleanoResponseDto(String mac, String estado, Boolean valorActual, Date ultimaActualizacion, String nombreUbicacion) 
	{
	    // Asigna la dirección MAC proporcionada al campo correspondiente del objeto.
	    this.mac = mac;
	    // Asigna el estado del sensor (ej. activo/inactivo).
	    this.estado = estado;
	    // Asigna el valor booleano actual reportado por el sensor.
	    this.valorActual = valorActual;
	    // Convierte la fecha de última actualización a milisegundos (tipo long) para serialización.
	    // Si la fecha es nula, asigna null al campo.
	    this.ultimaActualizacion = ultimaActualizacion != null ? ultimaActualizacion.getTime() : null;
	    // Asigna el nombre de la ubicación del sensor.
	    this.nombreUbicacion = nombreUbicacion;
	}
}
