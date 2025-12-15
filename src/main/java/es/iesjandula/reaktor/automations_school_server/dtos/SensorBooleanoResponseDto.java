package es.iesjandula.reaktor.automations_school_server.dtos;

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
public class SensorBooleanoResponseDto
{
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
}
