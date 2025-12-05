package es.iesjandula.reaktor.automations_school_server.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SensorBooleanoResponseDto
{
    private String mac;
    private String estado;
    private Boolean valorActual;
    private Long ultimaActualizacion;
    private String nombreUbicacion;
}
