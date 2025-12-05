package es.iesjandula.reaktor.automations_school_server.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ValidacionResponseDto
{
    private Long id;
    private Integer score;
    private String resultado;
    private String motivoRechazo;
    private Long ordenId;
}
