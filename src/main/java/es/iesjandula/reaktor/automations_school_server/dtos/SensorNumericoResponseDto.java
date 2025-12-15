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
 * DTO para enviar información de un sensor numérico.
 */
public class SensorNumericoResponseDto 
{
    // Dirección MAC del sensor
    private String mac;
    
    // Estado del sensor (ej. activo/inactivo)
    private String estado;
    
    // Valor actual del sensor
    private Double valorActual;
    
    // Umbral mínimo permitido
    private Double umbralMinimo;
    
    // Umbral máximo permitido
    private Double umbralMaximo;
    
    // Timestamp de la última actualización
    private Long ultimaActualizacion;
    
    // Nombre de la ubicación asociada
    private String nombreUbicacion;
}

