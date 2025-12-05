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
public class OrdenProgramadaRequestDto
{
    private Long id;
    private Date fecha;
    private Date fechaProgramada;
    private String repeticion;
    private String frase;
}
