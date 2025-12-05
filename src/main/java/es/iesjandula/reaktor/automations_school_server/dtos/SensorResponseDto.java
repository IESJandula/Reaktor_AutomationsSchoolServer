package es.iesjandula.reaktor.automations_school_server.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SensorResponseDto
{
    private String mac;
    private String estado;
    private String ubicacionNombre;
    private String valorActual;
    private String tipoMedia;
}
