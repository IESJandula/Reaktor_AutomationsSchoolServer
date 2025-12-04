package es.iesjandula.reaktor_school_automation_server.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SensorNumericoRequestDto
{
    private String mac;
    private String estado;
    private Double valorActual;
    private Double umbralMinimo;
    private Double umbralMaximo;
    private String nombreUbicacion;
	
	
}
